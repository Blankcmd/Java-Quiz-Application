import java.util.*;

public class Quiz {

    private ArrayList<Question> questions;
    private int score;


    public Quiz(ArrayList<Question> questions) {
        this.questions = questions;
        this.score = 0;
    }


    public void startQuiz() {

        Collections.shuffle(questions);

        Scanner sc = new Scanner(System.in);


        for(int i = 0; i < questions.size(); i++) {

            Question q = questions.get(i);

            System.out.println("\nQuestion " + (i+1));
            System.out.println(q.getQuestion());


            String[] options = q.getOptions();


            for(int j=0;j<options.length;j++) {
                System.out.println((j+1)+". "+options[j]);
            }


            System.out.print("Enter answer: ");

            int userAnswer = sc.nextInt();


            if(userAnswer == q.getAnswer()) {
                System.out.println("Correct!");
                score++;
            }
            else {
                System.out.println("Wrong!");
            }
        }


        showResult();

    }



    private void showResult() {

        System.out.println("\n===== RESULT =====");

        System.out.println("Score : " 
                + score + "/" + questions.size());


        double percentage =
                (score * 100.0) / questions.size();


        System.out.println("Percentage : "
                + percentage + "%");


        if(percentage >= 90)
            System.out.println("Grade : A");

        else if(percentage >=70)
            System.out.println("Grade : B");

        else if(percentage >=50)
            System.out.println("Grade : C");

        else
            System.out.println("Grade : Fail");

    }


    public int getScore(){
        return score;
    }
}
