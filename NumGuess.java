import java.util.Scanner;
public class NumGuess{

    private static int rng;
    private static boolean status;

    public NumGuess(){
	System.out.println("\nWelcome to the guessing game! Pick a number from 1 to 100.\n");
	int i = ((int)(Math.random() * 100));
	rng = i;
	status = false;
    }

    public static String isRightNumber(int i){
	if(i == rng){
	    status = true;
	    System.out.println("\nWinner, Winner, Chicken Dinner!\n");
	    System.exit(0);
	}
	if(i < rng){
	    return "\nToo low loser!\n";
	}
	return "\nToo high sucker!\n";
    }
    
    public static void main(String[] args){
	NumGuess Ned = new NumGuess();
	//System.out.println(rng);
	Scanner sc = new Scanner(System.in);
	int num0 = sc.nextInt();
	System.out.println(isRightNumber(num0));
        while(status == false){
	    int numi = sc.nextInt();
	    System.out.println(isRightNumber(numi));
	}
    }
}
