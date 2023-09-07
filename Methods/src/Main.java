public class Main {
    public static void main(String[] args) {
        int highScore = 0;

        highScore = calculateScore(true, 800, 100, 5);
        System.out.println("Your high score is " + highScore);

        highScore = calculateScore(true, 10000, 200, 8);
        System.out.println("Your high score is " + highScore);
    }
    public static int calculateScore(boolean gameOver, int score, int bonus, int levelCompleted) {
        int finalScore = score;

        if (gameOver) {
            finalScore += (levelCompleted * bonus);
        }

        return (finalScore);
    }
}
