import java.util.Scanner;

public class guess {

 

                public static void main(String[] args) {

                                

                                Scanner in = new Scanner (System.in);

                                

                                int user;

                                int computer;

                                                

                                                                                

                                                for ( int x = 1; x < 10; x++){

                                                                computer = 0 + (int) (Math.random()*10);

                                                                System.out.println("Choose a number 0 and 10");

                                                                

                                                                user = in.nextInt();

                                                                System.out.printf("My number is %d\n", computer);

                                                                

                                                                if (user<computer){

                                                                                System.out.println("nope");

                                                                

                                                                } 

                                                                else if (user>computer) {

                                                                                System.out.println("Your number is bigger");

                                                                }

                                                                                else {

                                                                System.out.println("Correct!!!");

                                                                

                                                }

                                                

                                                }

                                                

                }

                

}
