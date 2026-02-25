public class MethodChallenge {
    public static void main(String [] args){
        displayHighScorePosition("Tim", 2);
        calculateHighScorePosition(1500 );
    }

    public static void displayHighScorePosition(String playerName, int highScorePosition){
        System.out.println(playerName + " managed to get into position " + highScorePosition + " on the high score list" );
    }
    public static int calculateHighScorePosition(int playerScore){

        if (playerScore >= 1000) {
            System.out.println(1);
        } else if (playerScore  >= 500 && playerScore < 1000) {
            System.out.println(2);
        } else if (playerScore >= 100 &&  playerScore< 500) {
            System.out.println(3);
        }else {
            System.out.println(4);
        }
        return playerScore;
    }
}
