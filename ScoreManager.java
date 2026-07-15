import java.io.*;

public class ScoreManager {


    public static void saveScore(String name, int score)
    {

        try{

            FileWriter fw =
            new FileWriter("data/scores.txt",true);


            fw.write(name+" : "+score+"\n");


            fw.close();

        }
        catch(Exception e)
        {
            System.out.println("Error saving score");
        }

    }



    public static void viewScores()
    {

        try{

            BufferedReader br =
            new BufferedReader(
            new FileReader("data/scores.txt"));


            String line;


            System.out.println("\nPrevious Scores");


            while((line=br.readLine())!=null)
            {
                System.out.println(line);
            }


            br.close();

        }
        catch(Exception e)
        {
            System.out.println("No scores found");
        }

    }
}
