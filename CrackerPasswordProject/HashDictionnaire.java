import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

class HashDictionnary {
    public static Cracker rechHashage(String motDePasse) {
        long startTime = System.currentTimeMillis();
        String path = "/Users/littbarski/Desktop/CrackerPasswordProject/library2.txt";
        PasswordHash p2 = new PasswordHash();
        String hashPass = p2.doHashing(motDePasse);

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String line;
            while ((line = br.readLine()) != null) {
                PasswordHash p = new PasswordHash();
                String hash = p.doHashing(line);
                if (hashPass.equalsIgnoreCase(hash)) {
                    long endTime = System.currentTimeMillis();
                    long executionTime = endTime - startTime;
                    System.out.println("Mot de passe trouvé");
                    System.out.println("Running time : " + executionTime + " millisecondes");
                    return null;
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        long endTime = System.currentTimeMillis();
        long executionTime = endTime - startTime;
        System.out.println("Password not found ");
        System.out.println("Running time : " + executionTime + " millisecondes");
        return null;
    }
}
