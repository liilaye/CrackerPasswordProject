
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
public class CrackerDictionnaire {
    public static Cracker craquageDictionnaire(String  motDePasse){
            long startTime = System.currentTimeMillis();
            String path = "/Users/littbarski/Desktop/CrackerPasswordProject/library1.txt";
            String line = "";
            int val = 0;
            try {
                BufferedReader br = new BufferedReader(new FileReader(path));
                while((line = br.readLine()) != null){
                    if(motDePasse.equalsIgnoreCase(line)){
                        val = 1;

                    }
                }
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
            catch (IOException e) {
                e.printStackTrace();
            }

           long endTime = System.currentTimeMillis();
           long executionTime = endTime - startTime;
            if(val==1) {
                System.out.println("Password successfully found");
                System.out.println("Running time : " + executionTime + " millisecondes");
                return null;

            }
            else {
                System.out.println("Password not found");
                System.out.println("Running time : " + executionTime + " millisecondes");
                return null;
            }
    }

}
