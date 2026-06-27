import java.util.Scanner;

public class QuizApplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] questions = {
                "Q1. What is the full form of JVM?",
                "Q2. Which keyword is used to create a class in Java?",
                "Q3. What does 'OOP' stand for?",
                "Q4. Which data type stores true/false?",
                "Q5. What symbol is used for single-line comment in Java?"
        };
        String[][] options = {
                {"A. Java Variable Machine", "B. Java Virtual Machine", "C. Java Verified Module", "D. Java Visual Mode"},
                {"A. object",               "B. define",               "C. class",                "D. struct"},
                {"A. Object Oriented Programming", "B. Operational Output Processing", "C. Open Object Protocol", "D. None"},
                {"A. int",  "B. char",  "C. boolean",  "D. float"},
                {"A. //",  "B. ##",    "C. **",        "D. %%"}
        };
        char[] correctAnswers = {'B', 'C', 'A', 'C', 'A'};
        int scoreEarned = 0;

        System.out.println("======= Java Quiz Application =======");
        for (int q = 0; q < questions.length; q++) {
            System.out.println("\n" + questions[q]);
            for (String opt : options[q]) System.out.println("  " + opt);
            System.out.print("Your answer (A/B/C/D): ");
            char response = sc.next().toUpperCase().charAt(0);
            if (response == correctAnswers[q]) {
                System.out.println("Correct!");
                scoreEarned++;
            } else {
                System.out.println("Wrong! Correct answer: " + correctAnswers[q]);
            }
        }
        System.out.println("\n===== Quiz Completed =====");
        System.out.println("Your score: " + scoreEarned + "/" + questions.length);
        if (scoreEarned == questions.length) System.out.println("Excellent! Perfect score!");
        else if (scoreEarned >= 3) System.out.println("Good job! Keep practicing.");
        else System.out.println("Needs improvement. Review your Java basics.");
        sc.close();
    }
}

