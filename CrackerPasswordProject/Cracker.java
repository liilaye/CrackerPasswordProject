import java.util.Scanner;

public class Cracker {
    public static void main(String[] args) {
        System.out.println("**************************########***********************\n");
        System.out.println("What type of password would you like to crack??");
        System.out.println("1. Password in clear text");
        System.out.println("2. Hashed password");
        System.out.println("\n");
         System.out.println("**************************########***********************\n");
        Scanner scanner1 = new Scanner(System.in);
        Integer choix = scanner1.nextInt();

        System.out.println("Choose your method?");
        System.out.println("1. Bruteforce");
        System.out.println("2. Dictionnaire");
        Scanner scanner2 = new Scanner(System.in);
        Integer number = scanner2.nextInt();

        System.out.println("Enter password");
        Scanner scanner3 = new Scanner(System.in);
        String password = scanner3.next();

        Cracker cracker= FabriqueCracker.getInstance(choix,number,password);
    }
}