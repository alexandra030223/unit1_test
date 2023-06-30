package Homeworks.L4HW_Java_Classes_Fagurel_Alexandra;
import java.util.Scanner;
public class TicTacToe {
    private char[] board;
    private char currentPlayer;

    public TicTacToe(){
        board = new char[9];
        currentPlayer = 'X';
        initializeBoard();
    }
    public void initializeBoard(){
        for (int i = 0; i<board.length; i++){
            board[i] = ' ';
        }
    }
    public void displayBoard(){
        System.out.println("--------------");
        for (int i = 0; i<9; i+=3){
            System.out.println("| " + board[i] + "| " + board[i+1] + " | " + board[i+2] + " |");
        System.out.println("--------------");
        }
    }
    public void playGame(){
        Scanner scanner = new Scanner(System.in);
        int move;

        while(!isGameOver()){
            System.out.println("Player " + currentPlayer + "'s turn");
            System.out.println("Enter your move(1-9):");
            move = scanner.nextInt()-1;

            if (isValidMove(move)) {
                makeMove(move);
                displayBoard();

                if(currentPlayerWins()){
                    System.out.println("Player " + currentPlayer + " wins!");
                    return;
                }
                currentPlayer = (currentPlayer == 'X') ? '0': 'X';
            }else{
                System.out.println("Invalid move.Try again");            }
            }
        System.out.println("It is a tie");
        }
private boolean isValidMove(int move){
    return move >= 0 && move < 9 && board[move] == ' ';
}
private void makeMove(int move){
    board[move] = currentPlayer;
}
private boolean currentPlayerWins() {
    for (int i = 0; i < 9; i += 3) {
        if (board[i] == currentPlayer && board[i + 1] == currentPlayer && board[i + 2] == currentPlayer) {
            return true;
        }
    }
    for (int i = 0; i < 3; i++) {
        if (board[i] == currentPlayer && board[i + 3] == currentPlayer && board[i + 6] == currentPlayer) {
            return true;
        }
    }
    if ((board[0] == currentPlayer && board[4] == currentPlayer && board[8] == currentPlayer) ||
            (board[2] == currentPlayer && board[4] == currentPlayer && board[6] == currentPlayer)) {
        return true;
    }
    return false;
}
private boolean isGameOver(){
    for( char cell: board){
        if(cell == ' ') return true;
        } return false;
}
public static void main(String[]args){
        TicTacToe game = new TicTacToe();
        game.displayBoard();
        game.playGame();
        }
}


