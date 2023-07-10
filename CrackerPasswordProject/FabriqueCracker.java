public class FabriqueCracker {
    public static Cracker getInstance(int choix, int number, String password) {
        Cracker code = null;
        
        switch (choix) {
            case 1:
                if (number == 1) {
                    code = CrackerBruteForce.craquage(password);
                } else if (number == 2) {
                    code = CrackerDictionnaire.craquageDictionnaire(password);
                }
                break;
                
            case 2:
                if (number == 1) {
                    code = HashBruteForce.Hashcraquage(password);
                } else if (number == 2) {
                    code = HashDictionnary.rechHashage(password);
                }
                break;
                
            default:
                break;
        }
        
        return code;
    }
}

