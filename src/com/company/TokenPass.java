package com.company;

public class TokenPass {
    private int[] board;
    private int currentPlayer;
    public TokenPass(int playerCount)
    {
        board = new int[playerCount];
        this.currentPlayer =((int)Math.random()*playerCount) + 1;
        for (int i = 0; i < playerCount; i++)
        {
            board[i] = ((int)Math.random()*playerCount) + 1;
        }
    }
}
