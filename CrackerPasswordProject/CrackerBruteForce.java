public class CrackerBruteForce {
    public static Cracker craquage(String  motDePasse){
        long startTime = System.currentTimeMillis();
        char[] caracter ={ 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's',
                't', 'u', 'v', 'w', 'x', 'y', 'z', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N',
                'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z','0', '1', '2', '3', '4', '5', '6', '7', '8',
                '9' };
        boolean cracked = false;
        for (char c1 : caracter) {
            for (char c2 : caracter) {
                for (char c3 : caracter) {
                    for (char c4 : caracter) {
                        for (char c5 : caracter) {
                            String attempt = "" + c1 + c2 + c3 + c4 + c5;
                            if (attempt.equals(motDePasse)) {
                                cracked = true;
                                break;
                            }
                        }
                        if (cracked) break;
                    }
                    if (cracked) break;
                }
                if (cracked) break;
            }
            if (cracked) break;
        }
        long endTime = System.currentTimeMillis();
        long executionTime = endTime - startTime;
        if (cracked) {
            System.out.println(" Password successfully found");
            System.out.println("LRunning time : : " + executionTime + " millisecondes");
            return null;
        }else {
            System.out.println("Password not found ");
            System.out.println("Running time : " + executionTime + " millisecondes");
            return null;
        }
    }
}
