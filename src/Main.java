public class Main {
    public static void main(String[] args){
        boolean gameOver = true;
        int score =  10000;
        int levelCompleted = 8;
        int bonus = 200;
        int finalScore = score;

        if (gameOver) {
            finalScore += (levelCompleted * bonus);
            System.out.println("Your final score was " + finalScore);

            // Challenge
            // Score = 10000
            // levelCompleted 8
            // bonus 200
        score = 10000;
        levelCompleted = 8;
        bonus = 200;
        finalScore = score;
            if (gameOver) {
                finalScore += (levelCompleted * bonus);
                finalScore += 1000;
                System.out.println("Your final score was : " + finalScore);
            }

        }
    }
}
