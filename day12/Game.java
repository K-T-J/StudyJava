 package day12;

import java.util.Scanner;

class TicTacToe {
	final int NUM_BOARD = 10;
	String [] theBoard = new String[NUM_BOARD]; //String 배열 10개 방을 만든다.
	Scanner sc;
	String playerLetter;
	String computerLetter; 
	
	public TicTacToe() { //생성자
		sc = new Scanner(System.in); //스캐너 객체생성
	}
	void boardReset() {//메서드 #4번
		//보드 세팅
		for(int i = 0; i < NUM_BOARD; i++) {//반복문 0~9까지
			theBoard[i] = " ";//10개에 방마다 공백1개로 초기값
		}
	}
	void setPlayerLetter() {//메서드 //#6
		String letter = ""; //String타입 letter은 공백
		while(!(letter.equals("X") || letter.equals("O"))) {
			//입력받은 값이 o나 x를 입력받을때 까지 계속 반복 equals문자열 비교
			System.out.print("X를 하고 싶나요, O를 하고 싶나요? >>"); //출력
			letter = sc.nextLine().toUpperCase();//입력값 받기
		}
		if(letter.equals("X")) {//만약 입력받은값이 x일때
			playerLetter = "X"; //플레이어는 x
			computerLetter = "O";//컴퓨터는 o
		}else {					//만약 입력받은값이 o일때
			playerLetter = "O";//플레이어 o
			computerLetter = "X";//컴퓨터는 x
		}
	}
	String whoGoesFirst() {//#8 리턴값이 있는 메소드
		String turn = "player"; //플레이어를 턴 
		if((int)(Math.random()*2) == 0) {//만약 랜덤값이 0일때
			turn = "computer";	//컴퓨터턴
		}
		return turn; //누가 먼저 시작할건지 랜덤값 리턴
	}
	void drawBoard() {
		System.out.println(" " + theBoard[7] + " | " + theBoard[8] + " | " + theBoard[9]);
		System.out.println("------------");
		System.out.println(" " + theBoard[4] + " | " + theBoard[5] + " | " + theBoard[6]);		
		System.out.println("------------");
		System.out.println(" " + theBoard[1] + " | " + theBoard[2] + " | " + theBoard[3]);		
	}
	boolean isSpaceFree(int move) {
		if(theBoard[move].equals(" ")) return true;
		else return false;
	}
	boolean isSpaceFree(int move, String[] board) { 
		if(board[move].equals(" ") && move != 0) return true;
		else return false;
	}
	int getPlayerMove() {
		String move = "0";
		while(!"123456789".contains(move) || !isSpaceFree(Integer.parseInt(move)) ) {
			System.out.print("어디에 마크할까요?(1-9) >>");
			move = sc.nextLine();
		}
		return Integer.parseInt(move);
	}
	String[] getBoardCopy() {
		String [] copy = new String[NUM_BOARD];
		for(int i = 0; i < NUM_BOARD; i++) {
			copy[i] = theBoard[i];
		}
		return copy;
	}
	void makeMove(int move, String letter, String[] board) {
		board[move] = letter;
	}
	int chooseRandomMoveFromList(int [] idxs) {
		for(int i = 0; i < 20; i++) {		
			int randI = (int)(Math.random()*4);
			if(isSpaceFree(idxs[randI])) return idxs[randI];
		}
		return 0;
	}
	int getComputerMove() {
		String [] copy = null;
		
		for(int i = 1; i < NUM_BOARD; i++) {
			copy = getBoardCopy();
			if(isSpaceFree(i, copy)) {
				makeMove(i, computerLetter, copy);
				if(isWinner(computerLetter, copy)) {
					return i;
				}
			}
		}
		
		for(int i = 1; i < NUM_BOARD; i++) {
			copy = getBoardCopy();
			if(isSpaceFree(i, copy)) {
				makeMove(i, playerLetter, copy);
				if(isWinner(playerLetter, copy)) {
					return i;
				}
			}
		}
		
		int move = chooseRandomMoveFromList(new int[] {1,3,7,9});
		if(move != 0) {
			return move;
		}
		
		if(isSpaceFree(5)) return 5;
		
		
		return chooseRandomMoveFromList(new int[] {2,4,6,8});
	}
	boolean isWinner(String letter, String [] bo) {
		boolean res = false;
		if((bo[7].equals(letter) && bo[8].equals(letter) && bo[9].equals(letter)) ||
			(bo[4].equals(letter) && bo[5].equals(letter) && bo[6].equals(letter)) ||
			(bo[1].equals(letter) && bo[2].equals(letter) && bo[3].equals(letter)) ||
			(bo[7].equals(letter) && bo[4].equals(letter) && bo[1].equals(letter)) ||
			(bo[8].equals(letter) && bo[5].equals(letter) && bo[2].equals(letter)) ||
			(bo[9].equals(letter) && bo[6].equals(letter) && bo[3].equals(letter)) ||
			(bo[7].equals(letter) && bo[5].equals(letter) && bo[3].equals(letter)) ||
			(bo[9].equals(letter) && bo[5].equals(letter) && bo[1].equals(letter))) { res = true; }
		return res;
	}
	boolean isBoardFull() {
		for(int i = 1; i < NUM_BOARD; i++) {
			if(isSpaceFree(i)) return false;
		}
		return true;
	}
	boolean playAgain() {
		System.out.print("게임을 다시 하시겠습니까?(y/n) ");
		String res = sc.nextLine().toLowerCase();
		if(res.equals("y")) return true;
		return false;
	}
	
	
	void run() {// 프로그램 시작!! run 메서드 #2번 
		System.out.println("틱텍토 게임!"); //게임 시작 출력
		while(true) { //반복문 true면 실행
			boardReset();//#3 //보드 세팅 방만들기
			setPlayerLetter();//#5 입력값
			String turn = whoGoesFirst();//#7 누구먼저 할지 랜덤
			System.out.println(turn + "가 먼저 시작하겠습니다.");//누가 먼저할것인지 정했다면 그사람이 시작
			boolean play = true; //#9 true
			
			while(play) {//#10 true 일경우
				int move = 0;
				if(turn.equals("player")) {
					drawBoard();
					move = getPlayerMove();
					makeMove(move, playerLetter, theBoard);
					
					if(isWinner(playerLetter, theBoard)) {
						drawBoard();
						System.out.println("이겼다!!");
						play  = false;
					}else {
						if(isBoardFull()) {
							drawBoard();
							System.out.println("비겼다...");
							break;
						}else {
							turn = "computer";
						}
					}
				}else {
					move = getComputerMove();
					makeMove(move, computerLetter, theBoard);
					
					if(isWinner(computerLetter, theBoard)) {
						drawBoard();
						System.out.println("졌다... 컴퓨터 승리...");
						play = false;
					}else {
						if(isBoardFull()) {
							drawBoard();
							System.out.println("비겼네....");
							break;
						}else {
							turn = "player";
						}
					}
				}
			}//while(play)
			if(!playAgain()) {
				System.out.println("게임종료!!");
				break;
			}
		}// while(true)
	}
}



public class Game {
	public static void main(String[] args) {
		TicTacToe game = new TicTacToe();
		game.run();//#1번
	}
}
