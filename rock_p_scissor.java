import java.util.*;
import java.util.random.*;
class game {
    int rounds = 0;
    int userwins = 0, compwins = 0,ties=0;
    public void game(){

        decision dc = new decision();
        System.out.println("Enter 0 for rock\nEnter 1 for paper\nEnter 2 for scissor");


        while (rounds != 3) {
            Scanner sc = new Scanner(System.in);
            int user_input = sc.nextInt();
            Random rand = new Random();
            int com = rand.nextInt(3);

            if (user_input == 0 && com == 0 || user_input == 1 && com == 1 || user_input == 2 && com == 2) {
                System.out.println("You played " + user_input);
                System.out.println("Computer played " + com);
                System.out.println("Its a tie ");
                ties+=1;
//                userwins=0;
//                compwins=0;
            } else if (user_input == 0 && com == 2 || user_input == 1 && com == 0 || user_input == 2 && com == 1) {
                System.out.println("You played " + user_input);
                System.out.println("Computer played " + com);
                System.out.println("User wins");
                userwins = userwins + 1;
                System.out.println("User wins " + userwins + " time");
            } else {
                System.out.println("You played " + user_input);
                System.out.println("Computer played " + com);
                System.out.println("Computer wins");
                compwins = compwins + 1;
                System.out.println("Computer wins " + compwins + " time");
            }
            if (userwins == 2 || userwins==1 && ties==2) {
                System.out.println("User wins the series");
            } else if (compwins == 2 || compwins==1 && ties==2) {
                System.out.println("Computer wins the series");
            }
            else if(userwins==3 || compwins==3){
                System.out.println("Whitewashed");
            }
            else if(userwins==1 && compwins==1 && ties==1){
                System.out.println("No one wins the series play again");
            }
            rounds++;
        }
    }
    }

class decision extends game{
    Scanner sc = new Scanner(System.in);
    public int decides;
    public void decide(){
        System.out.println("do you want to play again 1 for yes 0 for no");
         decides = sc.nextInt();
         if(decides==1){
             game();
         }
         else {
             System.out.println("Thank you for playing this game");
         }
    }
}
public class rock_p_scissor extends decision {
    public static void main(String[] args) {
        game g = new game();
        g.game();
        decision d = new decision();
        d.decide();
    }
}

