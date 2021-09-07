package practice.random;

import java.util.Random;
import java.util.Scanner;

public class RandomNumAndPatterns {

    //patternOne
    public void practicePatternOne() {

            for (int rows = 0; rows<= 5 ; rows++) {
            for (int j = 0; j < rows; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int rows = 4; rows >=0; rows--) {
            for (int j = 0; j < rows; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }

    public void practicePatternTwo(){

        for(int i=0; i<=5; i++){

            for(int j=5; j>i; j--){
                System.out.print(" ");
                }
            for(int k=0; k<=i; k++){
                System.out.print("*");
            }
            System.out.println();
        }


    }


    public void checkPrintCommands(){

        for(int i=0; i<=5; i++){
            System.out.println("*");
        }
        for(int i=0; i<=5; i++){
            System.out.print("*");
        }
    }
    public String givenUsingJava8_whenGeneratingRandomAlphanumericString_thenCorrect() {
        int leftLimit = 48; // numeral '0'
        int rightLimit = 122; // letter 'z'
        int targetStringLength = 20;
        Random random = new Random();

        String generatedString = random.ints(leftLimit, rightLimit + 1)
                .filter(i -> (i <= 57 || i >= 65) && (i <= 90 || i >= 97))
                .limit(targetStringLength)
                .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
                .toString();
       // System.out.println(generatedString);


        return generatedString;
    }

}
