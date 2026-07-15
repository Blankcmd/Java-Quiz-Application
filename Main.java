import java.util.*;

public class Main {


    public static void main(String args[])
    {

        Scanner sc = new Scanner(System.in);


        ArrayList<Question> list =
                new ArrayList<>();


        list.add(new Question(
        "Which language is platform independent?",
        new String[]{
        "C",
        "Java",
        "Python",
        "HTML"},
        2));


        list.add(new Question(
        "Which data structure uses FIFO?",
        new String[]{
        "Stack",
        "Queue",
        "Tree",
        "Graph"},
        2));


        list.add(new Question(
        "What is the size of int in Java?",
        new String[]{
        "2 bytes",
        "4 bytes",
        "8 bytes",
        "16 bytes"},
        2));


        list.add(new Question(
        "Which keyword creates object?",
        new String[]{
        "class",
        "new",
        "create",
        "object"},
        2));


        list.add(new Question(
        "Which company developed Java?",
        new String[]{
        "Microsoft",
        "Apple",
        "Sun Microsystems",
        "Google"},
        3));



        System.out.println("======================");
        System.out.println(" JAVA QUIZ APPLICATION");
        System.out.println("======================");


        System.out.print("Enter your name: ");
        String name=sc.nextLine();



        Quiz quiz=new Quiz(list);


        quiz.startQuiz();



        ScoreManager.saveScore(
                name,
                quiz.getScore()
        );


        System.out.println("\nScore saved successfully!");

    }
}
