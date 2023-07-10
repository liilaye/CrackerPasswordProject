public class HashBruteForce {
    public static Cracker Hashcraquage(String  motDePasse){
        long startTime = System.currentTimeMillis();
        String attempt ="";
        char[] caracter ={ 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's',
                't', 'u', 'v', 'w', 'x', 'y', 'z', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N',
                'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z','0', '1', '2', '3', '4', '5', '6', '7', '8',
                '9' };
        boolean cracked = false;
        for (char c1 : caracter) {
            for (char c2 : caracter) {
                for (char c3 : caracter) {

                            attempt = "" + c1 + c2 + c3;
                            String attempt1 = "" + c1 + c2 + c3;
                            PasswordHash p3 = new PasswordHash();
                            String hashPass = p3.doHashing(attempt1);
                            if (hashPass.equalsIgnoreCase(motDePasse)) {
                                cracked = true;
                                break;
                            }
                        }
                        if (cracked) break;
                    }
                    if (cracked) break;
        }
        long endTime = System.currentTimeMillis();
        long executionTime = endTime - startTime;

        if (cracked) {
            System.out.println("Password successfully found");
            System.out.println("Il s'agit de " + attempt);
            System.out.println("Running time : " + executionTime + " millisecondes");
            return null;
        }else {
            System.out.println("Password not found ");
            System.out.println("Running time : " + executionTime + " millisecondes");
            return null;
        }
    }

}
