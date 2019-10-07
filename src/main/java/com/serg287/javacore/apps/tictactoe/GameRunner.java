package main.java.com.serg287.javacore.apps.tictactoe;

import java.util.Scanner;

public class GameRunner {
    public static void main(String[] args) {

        String ch;
        GameLogic Toe=new GameLogic();
        do {
            Toe.newBoard();
            Toe.play();
            System.out.println ("Would you like to play again (Enter 'yes')? ");
            Scanner in =new Scanner(System.in);
            ch=in.nextLine();
            System.out.println("ch value is  "+ch);
        }
        while (ch.equals("yes"));
    }
}
