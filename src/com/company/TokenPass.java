package com.company;

public class TokenPass {
    private int[] board;
    private int currentPlayer;
    public TokenPass(int playerCount)
    {
        board = new int[playerCount];
        this.currentPlayer =(int)(Math.random()*(playerCount)-1);
        for (int i = 0; i < playerCount; i++)
        {
            board[i] = (int)(Math.random()*playerCount) + 1;
        }
    }
    public int[] getBoard()
    {
        return board;
    }

    public int getCurrentPlayer()
    {
        return currentPlayer;
    }

    public void distributeCurrentPlayerTokens()
    {
        int distribute = board[currentPlayer];
        board[currentPlayer] = 0;
        for(int i = 1; distribute > 0; i++)
        {
            //how do i get it to loop back to the first number?
            board[currentPlayer + i] = board[currentPlayer + i] + 1;
        }
    }
}
