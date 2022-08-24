package org.DataStructures.GameOfTennis;
/*
* Create a tennis game that is a command line application which simulates a game of Tennis. During each round, each
* player plays and is awarded a score. When both scores are submitted to the tennisGame, the game computes an outcome.

The scoring in tennis works as follows:

Both players start at 0-0
Winning a point takes a player to 15, followed by 30, followed by 40, followed by winning (provided the other player
* is not also on 40 or advantage (see below)

If the score gets to 40-40 then to win you must be two clear points ahead, from 40-40 if you win a point you have
* 'Advantage', if you win the next point you win, if your opponent wins the next point the score returns to 40-40.
* This continues until there is a winner.*/

public class TennisGame {
    enum gameResult{IN_PROGRESS,WIN, FORTY_ALL, ADVANTAGE}

    static void getGameState(int result){
        switch (result){
            case 0:
                System.out.println(gameResult.IN_PROGRESS);
                break;
            case 1:
                System.out.println(gameResult.FORTY_ALL);
                break;
            case 10:
                System.out.println("Player 1(Server)" + gameResult.ADVANTAGE);
                break;
            case 20:
                System.out.println("Player 1(Server)" + gameResult.WIN);
                break;
            case -10:
                System.out.println("Player 2 (Receiver)" + gameResult.ADVANTAGE);
                break;
            case -20:
                System.out.println("Player 2 (Receiver)" + gameResult.WIN);
                break;
        }
    }

        // case states  0 = in progress, 1= draw, 10= advantage, -10= advantage, 20= win, -20= win
    static int getResult(Player server, Player receiver){
        int result;

        //edge case less that score 40 for both players
        if(server.score < 39 && receiver.score <39){
             result=0;
        }
        //edge case for player1.score == player2.score
        else if(server.getScore() == receiver.getScore() && server.score == 40){
            result = 1;
        } else {
             result= server.getScore() - receiver.getScore();
        }
        return  result;
    }

    public static void main(String[] args) {
        Player server = new Player(30);
        Player receiver = new Player(40);
        getGameState(getResult(server,receiver));
    }
}

