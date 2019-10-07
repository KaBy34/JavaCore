package main.java.com.serg287.javacore.apps.tictactoe;

public class Field {
    int counter;
    char posn[]=new char[10];
    char player;

    public  void newBoard()
    {
        char posndef[] = {'0','1', '2', '3', '4', '5', '6', '7', '8', '9'};
        int i;
        counter = 0;
        player = 'X';
        for (i=1; i<10; i++) posn[i]=posndef[i];
        currentBoard();
    }

    public  String currentBoard()
    {
        System.out.println( "\n\n" );
        System.out.println(  "\n\n" );
        System.out.println(  "\n\n\t\t" + posn[1] + "   | " + posn[2] + "  | " + posn[3]);
        System.out.println(  " \t\t    |    |   " );
        System.out.println(  " \t\t ___|____|___ " );
        System.out.println(  "\n\n\t\t" + posn[4] + "   | " + posn[5] + "  | " + posn[6]);
        System.out.println(  " \t\t    |    |   " );
        System.out.println(  " \t\t ___|____|___ " );
        System.out.println(  "\n\n\t\t" + posn[7] + "   | " + posn[8] + "  | " + posn[9]);
        System.out.println(  " \t\t    |    |   " );
        System.out.println(  " \t\t    |    |   " );
        System.out.println(  "\n\n" );
        return "currentBoard";
    }
}
