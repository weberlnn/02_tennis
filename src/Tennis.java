/**
 * Created by lin on 2016/9/11.
 */
public class Tennis {
    public static String judge(int leftScores, int rightScores) {
        if (leftScores == 0 && rightScores == 0) {
            return "Love ALL";
        }
        if (leftScores == 15 && rightScores == 0) {
            return "Fifteen Love";
        }
        if (leftScores == 0 && rightScores == 15) {
            return "Love Fifteen";
        }
        if (leftScores == 15 && rightScores == 15) {
            return "Fifteen ALL";
        }
        if (leftScores == 30 && rightScores == 0) {
            return "Thirty Love";
        }
        if (leftScores == 0 && rightScores == 30) {
            return "Love Thirty";
        }
        if (leftScores == 15 && rightScores == 30) {
            return "Fifteen Thirty";
        }
        if (leftScores == 30 && rightScores == 15) {
            return "Thirty Fifteen";
        }
        if (leftScores == 30 && rightScores == 30) {
            return "Thirty ALL";
        }
        if (leftScores == 40 && rightScores == 0) {
            return "Forty Love";
        }
        if (leftScores == 0 && rightScores == 40) {
            return "Love Forty";
        }
        if (leftScores == 15 && rightScores == 40) {
            return "Fifteen Forty";
        }
        if (leftScores == 40 && rightScores == 15) {
            return "Forty Fifteen";
        }
        if (leftScores == 30 && rightScores == 40) {
            return "Thirty Forty";
        }
        if (leftScores == 40 && rightScores == 30) {
            return "Forty Thirty";
        }
        if (leftScores == 40 && rightScores == 40) {
            return "Deuces";
        }
        else {
            return " ";
        }
    }
}
