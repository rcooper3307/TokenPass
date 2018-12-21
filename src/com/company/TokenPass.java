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
        int playerTokens = board[currentPlayer]; //number of tokens
        int Player = currentPlayer + 1; //start distributing tokens to this player
        board[currentPlayer] = 0; //take away the tokens from currentPlayer
        for(int i = playerTokens; i > 0; i--) { //starts with the number of tokens, runs until you run out //of tokens
            if(Player >= board.length) { //if c is out of the board go to 0
                Player = 0;
            }
            board[Player] = board[Player] + 1;
            Player++; //go to next player
        }
    }
}
