package academy.learnprogramming;

public class Main {
    public static void main(String[] args) throws Exception {
        int value = 1;
        if(value == 1) {
            System.out.println("Value was 1");
        } else if(value ==2) {
            System.out.println("Value was 2");
        } else {
            System.out.println("Value was not 1 or 2");
        }
        
        int switchValue = 3;

        switch(switchValue) {
            case 1:
            System.out.println("Value was 1");
            break;

            case 2:
            System.out.println("Value was 2");
            break;

            case 3:
            case 4:
            case 5:
            System.out.println("Value was 3, 4, or 5");
            break;

            default:
            System.out.println("Value was not 1-5");
        }

        // Create a new switch statement using char instead of int
        // create a new char variable
        // create a switch statement testing for 
        // A, B, C, D or E
        // display a message if any of these are found and the break
        // Add a default which displays a message saying not found.

        char letter = 'A';

        switch(letter) {
            case 'A':
            case 'B':
            case 'C':
            case 'D':
            case 'E':
            System.out.println(letter + " was found");
            break;
            default:
            System.out.println("Not found");
        }

        String month = "JanUary";

        switch(month.toLowerCase()) {
            case "january":
            System.out.println("Jan");
            break;
            default:
            System.out.println("Not Jan");
        }

    }
}