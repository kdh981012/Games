import java.util.*;

class HelloWorld {
    static String[] board = {"1","2","3","4","5","6","7","8","9"};
    static boolean gameOver = true;
    
    public static void main(String[] args) {
        System.out.println("tic tac toe");
        printBoard();

        while(gameOver == true) {
            play();
        }
    }
    
    static void printBoard() {
        System.out.println("|---|---|---|");
        System.out.println("| " + board[0] + " | " + board[1] + " | " + board[2] + " |");
        System.out.println("|---+---+---|");
        System.out.println("| " + board[3] + " | " + board[4] + " | " + board[5] + " |");
        System.out.println("|---+---+---|");
        System.out.println("| " + board[6] + " | " + board[7] + " | " + board[8] + " |");
        System.out.println("|---|---|---|");
    }
    
    static void play() {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("\nEnter a slot number to place O: ");
        board[Integer.valueOf(sc.nextLine())-1] = "O";
        printBoard();
        checkWinner();
        
        
        System.out.print("\nEnter a slot number to place X: ");
        board[Integer.valueOf(sc.nextLine())-1] = "X";
        printBoard();
        checkWinner();
    }
    
    static void checkWinner() {
        if (board[0].equals(board[1]) && board[1].equals(board[2])) {
            System.out.println("\n" + board[0] + " wins");
            gameOver = false;
            System.exit(0); 
        } else if (board[3].equals(board[4]) && board[4].equals(board[5])) {
            System.out.println("\n" + board[0] + " wins");
            gameOver = false;
            System.exit(0); 
        } else if (board[6].equals(board[7]) && board[7].equals(board[8])) {
            System.out.println("\n" + board[0] + " wins");
            gameOver = false;
            System.exit(0); 
        } else if (board[0].equals(board[3]) && board[3].equals(board[6])) {
            System.out.println("\n" + board[0] + " wins");
            gameOver = false;
            System.exit(0); 
        } else if (board[1].equals(board[4]) && board[4].equals(board[7])) {
            System.out.println("\n" + board[0] + " wins");
            gameOver = false;
            System.exit(0); 
        } else if (board[2].equals(board[5]) && board[5].equals(board[8])) {
            System.out.println("\n" + board[0] + " wins");
            gameOver = false;
            System.exit(0); 
        } else if (board[0].equals(board[4]) && board[4].equals(board[8])) {
            System.out.println("\n" + board[0] + " wins");
            gameOver = false;
            System.exit(0); 
        } else if (board[2].equals(board[4]) && board[4].equals(board[6])) {
            System.out.println("\n" + board[0] + " wins");
            gameOver = false;
            System.exit(0); 
        } else {
            //System.out.println("No one wins");
        }
    }
}
