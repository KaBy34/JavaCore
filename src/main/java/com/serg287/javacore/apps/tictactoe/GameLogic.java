package main.java.com.serg287.javacore.apps.tictactoe;

// remaked TicTacToe.java

import java.util.Scanner;

public class GameLogic extends Field {

    public  void play()
    {
        int spot;
        char blank = ' ';

        System.out.println(  "Player " + getPlayer() +" will go first and be the letter 'X'" );

        do {
            currentBoard();              // display current board

            System.out.println(  "\n\n Player " + getPlayer() +" choose a posn." );

            boolean posTaken = true;
            while (posTaken) {
                // System.out.println( "position is taken, please enter a valid space");
                Scanner in =new Scanner (System.in);
                spot=in.nextInt();
                posTaken = checkPosn(spot);
                if(posTaken==false)
                    posn[spot]=getPlayer();
            }

            System.out.println(  "Nice move." );

            currentBoard();              // display current board

            nextPlayer();
        }while ( checkWinner() == blank );

    }

    public  char checkWinner()
    {
        char Winner = ' ';

        // Check if X wins
        if (posn[1] == 'X' && posn[2] == 'X' && posn[3] == 'X') Winner = 'X';
        if (posn[4] == 'X' && posn[5] == 'X' && posn[6] == 'X') Winner = 'X';
        if (posn[7] == 'X' && posn[8] == 'X' && posn[9] == 'X') Winner = 'X';
        if (posn[1] == 'X' && posn[4] == 'X' && posn[7] == 'X') Winner = 'X';
        if (posn[2] == 'X' && posn[5] == 'X' && posn[8] == 'X') Winner = 'X';
        if (posn[3] == 'X' && posn[6] == 'X' && posn[9] == 'X') Winner = 'X';
        if (posn[1] == 'X' && posn[5] == 'X' && posn[9] == 'X') Winner = 'X';
        if (posn[3] == 'X' && posn[5] == 'X' && posn[7] == 'X') Winner = 'X';
        if (Winner == 'X' )
        {System.out.println("Player1 wins the game." );
            return Winner;
        }

        // Check if O wins
        if (posn[1] == 'O' && posn[2] == 'O' && posn[3] == 'O') Winner = 'O';
        if (posn[4] == 'O' && posn[5] == 'O' && posn[6] == 'O') Winner = 'O';
        if (posn[7] == 'O' && posn[8] == 'O' && posn[9] == 'O') Winner = 'O';
        if (posn[1] == 'O' && posn[4] == 'O' && posn[7] == 'O') Winner = 'O';
        if (posn[2] == 'O' && posn[5] == 'O' && posn[8] == 'O') Winner = 'O';
        if (posn[3] == 'O' && posn[6] == 'O' && posn[9] == 'O') Winner = 'O';
        if (posn[1] == 'O' && posn[5] == 'O' && posn[9] == 'O') Winner = 'O';
        if (posn[3] == 'O' && posn[5] == 'O' && posn[7] == 'O') Winner = 'O';
        if (Winner == 'O' )
        {
            System.out.println( "Player2 wins the game." );
            return Winner; }

        // check for Tie
        for(int i=1;i<10;i++)
        {
            if(posn[i]=='X' || posn[i]=='O')
            {
                if(i==9)
                {
                    char Draw='D';
                    System.out.println(" Game is stalemate ");
                    return Draw;
                }
                continue;
            }
            else
                break;
        }
        return Winner;
    }

    public  boolean checkPosn(int spot)
    {
        if (posn[spot] == 'X' || posn[spot] == 'O')
        {
            System.out.println("That posn is already taken, please choose another");
            return true;
        }
        else {
            return false;
        }
    }


    public  void nextPlayer()
    {
        if (player == 'X')
            player = 'O';
        else player = 'X';
    }

    public String getTitle()
    {
        return "Tic Tac Toe" ;
    }

    public  char getPlayer()
    {
        return player;
    }
}
