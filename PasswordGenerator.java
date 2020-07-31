// PROGRAM TO CREATE A RANDOM PASSWORD USING JAVA

import java.util.Random;
import java.util.Scanner;

class PasswordGenerator {
    public static void main(String[] args) {

        // CODE FOR ACCEPTING THE LENGTH OF PASSWORD
        Scanner input = new Scanner(System.in);
        System.out.print("\nEnter the Length of the Password : ");
        int length = input.nextInt();

        // CALLING THE METHOD TO GENERATE PASSWORD
        System.out.println(generatePassword(length));
        System.out.println();
        input.close();
    }
    static char[] generatePassword(int length) {
        System.out.print("\nYour Password : ");

        // DIFFERENT STRINGS FOR DIFFERENT DIFFERENT VALUES
        String capitalCharacters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String characters = "abcdefghijklmnopqrstuvwxyz";
        String numbers = "0123456789";
        String symbols = "!@#$%^&*()_+=[]{};:<>/?";

        // STRING WHICH CONTAINS ALL THE VALUES
        String passwordString = capitalCharacters + characters + numbers + symbols;

        Random random = new Random();

        // ARRAY TO STORE THE NEW PASSWORD
        char[] password = new char[length];
        int index = 0;
        for(int i=0;i<length;i++) {
            // PICKING UP A RANDOM CHARACTER FROM THE STRING AND ADDING IT IN THE ARRAY
            password[i] = passwordString.charAt(random.nextInt(passwordString.length()));
        }
        return password;
    }
}