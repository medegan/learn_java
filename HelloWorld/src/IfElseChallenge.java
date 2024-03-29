public class IfElseChallenge {
    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 10000;
        int levelCompleted = 8;
        int bonus = 200;
        int finalScore = score;

        if(gameOver){
            finalScore += (bonus * levelCompleted);
            System.out.println("The final score is "+finalScore);
        }
    }
}
