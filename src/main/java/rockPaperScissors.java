
import java.util.Random;
import java.util.Scanner;

public class rockPaperScissors {

    public static void main(String[] args) {

        String[] items = {"Rock", "Paper", "Scissors"};
        int numberOfUserWin = 0;
        int numberOfTies = 0;
        int numberOfComputerWin = 0;
        Scanner sc = new Scanner(System.in);

        do {


            print(" How many rounds do you wants to play?");
            int numberOfRounds = sc.nextInt();
            if (0 > numberOfRounds | numberOfRounds > 10) {
                print("please enter the valid number between 1 and 10.");
                numberOfRounds = sc.nextInt();
            }


            for (int y = 1; y <= numberOfRounds; y++) {

                print("please enter 1 for Rock, 2 for Paper or 3 for Scissors ");
                int i = sc.nextInt() - 1;
                print("you select: " + items[i]);


                Random random = new Random();
                int j = random.nextInt(2);
                System.out.println("computer select: " + items[j]);


                if (i == j) {
                    print("the round is a tie!!!");
                    numberOfTies++;
                } else if ((i == 0 && j == 2) | (i == 1 && j == 0) | (i == 2 && j == 1)) {
                    print("you win!!");
                    numberOfUserWin++;
                } else {
                    print("you lose!!");
                    numberOfComputerWin++;
                }

            }
            print("your total win is: " + numberOfUserWin);
            print("total ties is: " + numberOfTies);
            print("your total lose is:" + numberOfComputerWin);

            if (numberOfUserWin > (numberOfRounds - numberOfTies) / 2) {
                print("you are the final winner!");
            } else {
                print("you lose the game!!!");
            }


            print("do you want to play again?");
        } while (sc.next().equals("Yes"));
            print("Thanks for playing!");

        }


        public static void print(String prompt){
            System.out.println(prompt);
        }
    }

