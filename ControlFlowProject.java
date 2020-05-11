import java.util.Scanner;       // import Scanner util

public class ControlFlowProject {
    public static void main(String[] args) {
        AsciiChars.printNumbers();      // call printNumbers from AsciiChars
        AsciiChars.printLowerCase();    // call printLowerCase from AsciiChars
        AsciiChars.printUpperCase();    // call printUpperCase from AsciiChars

        Scanner input = new Scanner(System.in);     // open the Scanner

        System.out.println("What is your name?");       // prompt the user for his/her name
        String name = input.nextLine();     // store the input into variable name

        System.out.println("Hello " + name + ". Do you want to continue to the interactive portion? (Enter 'y' or 'yes' or 'no')");
        String yesOrNo = input.nextLine();      // store the input into variable yesOrNo
        switch(yesOrNo) {
            case "y":
            case "yes":
                break;      // continue the program
            default:
                System.out.println("Please return later to complete the survey.");
                System.exit(0);     // exits the program
        }
       
        String playAgain;       // initialize a variable to store playAgain after the do runs
        do {        // run the code once and then run again while playAgain is 'y' or 'yes'
            System.out.println("What is the name of your favorite pet?");
            String petName = input.nextLine();      // favorite pet name input
            System.out.println("What is the age of your favorite pet?");
            int petAge = input.nextInt();       // favorite pet age input
            System.out.println("What is your lucky number?");
            int luckyNumber = input.nextInt();      // lucky number input
            input.nextLine();       // consume the \n character

            System.out.println("Do you have a favorite NFL quarterback? (yes or no)");
            String favQb = input.nextLine();        // favorite NFL quarterback
            int jerseyNum = 0;      // initialize a variable to store jersey number if needed
            switch(favQb) {
                case "yes":
                    System.out.println("What is the quarterback's jersey number?");
                    jerseyNum = input.nextInt();        // quarterback jersey number input
                    break;
                default:
                    break;
            }

            System.out.println("What is the two-digit model year of your car?");
            int carNum = input.nextInt();       // car model year input
            input.nextLine();       // consume the \n character
            System.out.println("What is the name of your favorite actor/actress?");
            String actName = input.nextLine();      // actor/actress name input
            int randNumInput =0;        // initialize randNumInput for the user's random number between 1-50
            do{     // run the code once while the number is out of the 1-50 range
                System.out.println("Enter a random number between 1 and 50.");
                randNumInput = input.nextInt();     // rand number between 1 and 50 input
                input.nextLine();       // consume the \n character
            } while(randNumInput<=1 || randNumInput>=50);

            int minRange = 1;       // initialize the min range number
            int maxRangeFive = 65;      // initialize the max range number for 5 non-magic ball numbers and 3 random numbers
            int maxRangeMagic = 75;     // initialize the max range number for magic ball number
            int randWinNum1 = (int)(Math.random() * (maxRangeFive - minRange + 1) + minRange);     // 1st random lottery winner number (1-65)
            int randWinNum2 = (int)(Math.random() * (maxRangeFive - minRange + 1) + minRange);     // 2nd random lottery winner number (1-65)
            int randWinNum3 = (int)(Math.random() * (maxRangeFive - minRange + 1) + minRange);     // 3rd random lottery winner number (1-65)
            int randWinNum4 = (int)(Math.random() * (maxRangeFive - minRange + 1) + minRange);     // 4th random lottery winner number (1-65)
            int randWinNum5 = (int)(Math.random() * (maxRangeFive - minRange + 1) + minRange);     // 5th random lottery winner number (1-65)
            int randWinMBNum = (int)(Math.random() * (maxRangeMagic - minRange + 1) + minRange);        // random magic lottery winner number (1-75)

            int randLotNum1 = (int)(Math.random() * (maxRangeFive - minRange + 1) + minRange);     // 1st randomly generated number (1-65)
            int randLotNum2 = (int)(Math.random() * (maxRangeFive - minRange + 1) + minRange);     // 2nd randomly generated number (1-65)
            // did not see a need for a 3rd randomly generated number (1-65)

            int magicBallNum = 0;       // initialize magicBallNum 
            if(favQb.equals("yes")) {      // if the user has a favorite qb, use the qb jersey number
                magicBallNum = randLotNum1 * jerseyNum;
            } else {        // if the user does not have a favorite qb, use the user's lucky number
                magicBallNum = randLotNum1 * luckyNumber;
            }
            while(magicBallNum>75) {        // subtract 75 until the magic ball number is in the range 1-75
                magicBallNum -= 75;
            }

             int userNumOne = 0;        // convert the 3rd letter of petName to its decimal value for the 1st user number
            if(petName.length()<3) {        // if the pet name has less than 3 characters, use the decimal value of the last character
                userNumOne = (int)petName.charAt(petName.length()-1);
            } else {        // else use the 3rd character value
                userNumOne = (int)petName.charAt(2);
            }
            while(userNumOne>65) {      // subtract 65 until the number is within the range 1-65
                userNumOne -= 65;
            }

            int userNumTwo = carNum + luckyNumber;      // add the two digit model year of the user's car to his/her lucky number for the 2nd user number

            int userNumThree = randNumInput - randLotNum2;      // subtract the second randomly generated number from the user's random number between 1-50 for the 3rd user number
            while(userNumThree<=0) {        // add 65 until the number is within the range 1-65
                userNumThree += 65;
            }

            int userNumFour = (int)actName.charAt(0);       // convert the 1st letter of the actName to its decimal value for the 4th user number
            while(userNumFour>65) {     // subtract 65 until the number is within the range 1-65
                userNumFour -= 65;
            }

            int userNumFive = jerseyNum + petAge + luckyNumber;     // add the favorite qb jersey number, pet age, and lucky number for the 5th user number
            while(userNumFive>65) {     // subtract 65 until the number is within the range 1-65
                userNumFive -= 65;
            }
            
            System.out.println("Lottery numbers: " + randWinNum1 + ", " + randWinNum2 + ", " + randWinNum3 + ", " + randWinNum4 + ", " + randWinNum5 + "; Magic Ball number: " + randWinMBNum + ".");       // print 6 winning numbers randomly generated
            System.out.println(name + "'s numbers: " + userNumOne + ", " + userNumTwo + ", " + userNumThree + ", " + userNumFour + ", " + userNumFive + "; Magic Ball number: " + magicBallNum + ".");       // print the user's 6 numbers

            System.out.println("Would you like to play again? (Enter 'y' or 'yes' or 'no')");       // ask if the user wants to play again
            playAgain = input.nextLine();       // play again input
        } while(playAgain.equals("yes") || playAgain.equals("y"));      // do the questionnaire while playAgain is equal to 'y' or 'yes'

        input.close();      // close the scanner

        System.out.println("Thank you for playing.");
        System.exit(0);     // exit the program
    }
}