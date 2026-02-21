public class Main {
    public static void main(String[] args){
        calculateScore(true, 800,  5, 100);
        calculateScore(true, 10000, 8, 200);
    }
    // Making a Method to reuse the code and avoid the repeat.
    public static void calculateScore(boolean gameOver, int score, int levelCompleted, int bonus){
        int finalScore = score;
        if (gameOver) {
            finalScore += (levelCompleted * bonus);
            finalScore += 1000;
            System.out.println("Your final score was : " + finalScore);
        }
    }
}
