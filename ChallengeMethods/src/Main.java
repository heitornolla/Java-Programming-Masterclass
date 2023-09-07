public class Main {
    public static void main(String[] args) {
        displayHighScorePosition("Heitor", calculateHighScorePosition(1500));
        displayHighScorePosition("Nataly", calculateHighScorePosition(1000));
        displayHighScorePosition("Victor", calculateHighScorePosition(500));
        displayHighScorePosition("Pedro", calculateHighScorePosition(100));
        displayHighScorePosition("Rian", calculateHighScorePosition(80));
    }

    public static void displayHighScorePosition(String name, int position) {
        System.out.println (name + " managed to get position " + position + " on the game!");
    }
    public static int calculateHighScorePosition(int playerScore) {
        int position = 4;

        if (playerScore >= 1000) {
            position = 1;
        }

        else if (playerScore >= 500) {
            position = 2;
        }

        else if (playerScore >= 100) {
            position = 3;
        }
        return position;
    }
}
