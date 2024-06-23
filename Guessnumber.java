package sample;
import java.util.Scanner;

class Computer {
	int number;
	
	public void guess() {
		number =(int)(Math.random()*10);
		System.out.println("The generated number is: "+number);
	}
}
class Human extends Computer{
	void StartGame(int target) {
		
		
		
		while(true) {
			
			int guess=number;
			if(target==guess) {
			System.out.println("You are win");
			break;
			}
			else {
				System.out.println("Try again");
				guess();
			}
		}
	}
}

public class GuessGame {
	

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int target=sc.nextInt();

		
		
		Human human=new Human();
		
		human.guess();
		human.StartGame(target);
		

	}

}

