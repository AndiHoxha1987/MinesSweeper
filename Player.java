package MinesSweeper;

public class Player {
    private String playerName;
    private int gamePoints;
    private int gameWins;
    private static int automaticName=1000000;

        public Player(){ //default constructor
            this.playerName="Player"+automaticName;
            automaticName++;
        }

        public Player(String nickName){
            this.playerName=nickName;
        }

        public void setGamePoints(int x){
            gamePoints=gamePoints + x;
        }
        public int getGamePoints(){
            return gamePoints;
        }

        public void setGameWins(int x){
        gameWins=gameWins + x;
        }
        public int getGameWins(){
        return gameWins;
        }
        public String getPlayerName(){
            return playerName;
        }
}
