package hexlet.code.games;



import java.util.Random;

public class Even {
    private final String yes = "yes";
    private final String no = "no";
    private int number;
    private String result;
    private final String ruleEven = "Answer 'yes' if the number is even, otherwise answer 'no'.";
    public String questionEven() {
        Random rand = new Random();
        number = rand.nextInt(100);
        return String.valueOf(number);
    }
    public String answerEven() {
        result = number % 2 == 0 ? yes : no;
        return result;
    }
    public String getRuleEven() {
        return ruleEven;
    }
}

