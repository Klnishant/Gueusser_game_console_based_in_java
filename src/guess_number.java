import java.util.Scanner;

 class guesser{
    int guess_num;
    public int guessingNumber(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        guess_num = sc.nextInt();

        return guess_num;

    }
}
class player{

     int guess_num;

     public int guessingNumber(){
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter the number");
         guess_num = sc.nextInt();
         return guess_num;
     }
}

class umpire{
     int numFromGuesser;
     int numFromPlayerp1;
     int numFromPlayerp2;
     int numFromPlayerp3;

     public void collectNumFromGuesser()
     {
         guesser g = new guesser();
         numFromGuesser =g.guessingNumber();
     }

     public void collectNumFromPlayer()
     {
         player p1 = new player();
         numFromPlayerp1 = p1.guessingNumber();
         player p2 = new player();
         numFromPlayerp2 = p2.guessingNumber();
         player p3 = new player();
         numFromPlayerp3 = p3.guessingNumber();
     }

     void compare()
     {
        if (numFromGuesser == numFromPlayerp1)
        {
            if (numFromPlayerp1 == numFromPlayerp2 && numFromPlayerp1 == numFromPlayerp3){
                System.out.println("All of you won!!!");
            }
            else if (numFromPlayerp1 == numFromPlayerp2) {
                System.out.println("Player 1 and Player 2 won the game!!");
            }
            else if (numFromPlayerp1 == numFromPlayerp3) {
                System.out.println("Player 1 and Player 3 are won The game!!");
            }
            else
                System.out.println("Player 1 won the game!!");
        }
         if (numFromGuesser == numFromPlayerp2)
         {
             if (numFromPlayerp2 == numFromPlayerp3)
             {
                 System.out.println("Player 2 and Player 3 won the game!!");
             }
             else
                 System.out.println("Player 2 won the game!!");
         }
         if (numFromGuesser == numFromPlayerp3)
         {
             System.out.println("Player 3 won the game!!");
         }
     }
}
public class guess_number {
    public static void main(String[] args) {

        umpire u = new umpire();
        u.collectNumFromGuesser();
        u.collectNumFromPlayer();
        u.compare();

    }
}
