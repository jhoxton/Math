import java.util.ArrayList;
import java.util.*;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class maths {

    public static void main(String[] args) {
   
		System.out.print("Welcome to Jake's shitty maths quiz app!\n\n");
		
		user testUser = new user(null, 0);
		testUser.setName("Test");
		testUser.setScore(0);
		
		String jake = "Jake";
		testUser.setName(jake);				
		user[] userList = new user[0];	
		runTest(testUser);
		
		
		
	}
	
	public static void runTest(user testUser) {
	 		
		Scanner input = new Scanner(System.in);
		System.out.println("1)Subtraction \n2)Addition\n3)Multiplication\n4)Divison\n5)Exponent\nChoose an area:");
		
//		testUser.printUser();
		
		int choice = input.nextInt();
		
			if (choice ==1) {				
				subtraction(testUser);
				
			} else if (choice == 2) {
				addition(testUser);
				
			}  if (choice ==3) {
				multiplication(testUser);
				
			} if (choice == 4){
				division(testUser);	
				
			} if (choice ==5){ 
				exponent(testUser);
			}
			else 
				System.out.println("Please enter 1 - 4\n");
			runTest(testUser);
		
	}
	
	public static void subtraction(user testUser){
		System.out.println("Subtraction");
		
		System.out.println("How many questions would you like?");		
		Scanner input = new Scanner(System.in);
		long startTime = System.currentTimeMillis();

		int questions = input.nextInt();
		int right = 0;
		int wrong = 0;
		int count = 0;
		
		while(count < questions){
			
			int number1 = (int) (Math.random()* 10);
			int number2 = (int) (Math.random()* 10);

			if (number1 < number2) {
				int temp = number1;
				number1 = number2;
				number2 = temp;
			}
			
			System.out.println("What is " + number1 + " - " + number2 +  "? ");
			int answer = input.nextInt();
			
			if (number1 - number2 == answer){
				right ++;
				System.out.println("You are correct");
				questions --;
			}
			else {
				while (number1 - number2  != answer) {
				wrong ++;
				System.out.print("\nYour answer is incorrect, try again! \n");
				System.out.print("What is " + number1 + " - " + number2 + " + " + "? ");
				answer = input.nextInt();
				}
			}
			
		}
		long endTime = System.currentTimeMillis();
		long testTime = endTime - startTime;
		System.out.println("Done! " + "You got " + right + " right" + " and " + wrong + " inncorrect and took " + testTime + " seconds\n");
//		testUser.changeScore(right);
		runTest(testUser);
	}		
	public static void changeScore(){
		
	}
	public static void addition(user testUser){
		System.out.println("Addition");

		System.out.println("How many questions would you like?");		
		Scanner input = new Scanner(System.in);
		long startTime = System.currentTimeMillis();

		int questions = input.nextInt();
		int right = 0;
		int wrong = 0;
		int count = 0;
		
		while(count < questions){
			
			int number1 = (int) (Math.random()* 10);
			int number2 = (int) (Math.random()* 10);

			if (number1 < number2) {
				int temp = number1;
				number1 = number2;
				number2 = temp;
			}
			
			System.out.println("What is " + number1 + " + " + number2 +  "? ");
			int answer = input.nextInt();
			
			if (number1 + number2 == answer){
				right ++;
				System.out.println("You are correct");
				questions --;
			}
			
			else {
				while (number1 + number2  != answer) {
				wrong ++;
				System.out.print("\nYour answer is incorrect, try again! \n");
				System.out.print("What is " + number1 + " + " + number2 +  "? ");
				answer = input.nextInt();
				}
			}
			
		}
		long endTime = System.currentTimeMillis();
		long testTime = endTime - startTime;
		System.out.println("Done! " + "You got " + right + " right" + " and " + wrong + " inncorrect and took " + testTime + " seconds\n");
		runTest(testUser);
		
	}

	public static void multiplication(user testUser){
		System.out.println("Multiplication");
		
		System.out.println("How many questions would you like?");		
		Scanner input = new Scanner(System.in);
		long startTime = System.currentTimeMillis();

		int questions = input.nextInt();
		int right = 0;
		int wrong = 0;
		int count = 0;
		
		while(count < questions){
			
			
			int number1 = (int) (Math.random()* 10);
			int number2 = (int) (Math.random()* 10);
			
			

			if (number1 < number2) {
				int temp = number1;
				number1 = number2;
				number2 = temp;
			}
			
			System.out.println("What is " + number1 + " * " + number2 +  "? ");
			int answer = input.nextInt();
			
			if (number1 * number2 == answer){
				right ++;
				System.out.println("You are correct");
				questions --;
			}
			
			else {
				while (number1 + number2  != answer) {
				wrong ++;
				System.out.print("\nYour answer is incorrect, try again! \n");
				System.out.print("What is " + number1 + " * " + number2 +  "? ");
				answer = input.nextInt();
				}
			}
			
		}
		long endTime = System.currentTimeMillis();
		long testTime = endTime - startTime;
		System.out.println("Done! " + "You got " + right + " right" + " and " + wrong + " inncorrect and took " + testTime + " seconds\n");
		runTest(testUser);

	}
	
	public static void division(user testUser){
		System.out.println("Division");
		System.out.println("How many questions would you like?");		
		
		Scanner input = new Scanner(System.in);
		long startTime = System.currentTimeMillis();

		int questions = input.nextInt();
		
		int right = 0;
		int wrong = 0;
		int count = 0;

		while(count < questions) {		
			
			int number1 = 0;
			int number2 = 0;
			
			number1 = getEven(number1);			
//			System.out.println("number1 is" + number1);    //CHECKS RETURN
			
			number2 = getEven(number2);
//			System.out.println("number2 is" + number2);   //CHECKS RETURN
					
				if (number1 < number2) {
					int temp = number1;
					number1 = number2;
					number2 = temp;
				}
				
				
				System.out.println("What is " + number1 + " / " + number2 +  "? ");					
				int answer = input.nextInt();
					
				if (number1 / number2 == answer){
					right ++;
					System.out.println("You are correct");
					questions --;
					} else {
						while (number1 + number2  != answer) {
							wrong ++;
							System.out.print("\nYour answer is incorrect, try again! \n");
							System.out.print("What is " + number1 + " / " + number2 + "? ");
							answer = input.nextInt();
						}
					}
						
				
		}
		
		long endTime = System.currentTimeMillis();
		long testTime = endTime - startTime;
		System.out.println("Done! " + "You got " + right + " right" + " and " + wrong + " inncorrect and took " + testTime + " seconds\n");
		runTest(testUser);	
	}
	
	public static void exponent(user testUser) {
		
	}

	public static int getEven(int evenNum) {
			Random random = new Random();
			int number = random.nextInt(9) +1 ;
			
			if (number == 0) {
				while (number == 0) {
					number = random.nextInt(9) +1 ;
				}				
			}
			
			
			if (number % 2 != 0) {
				while (number % 2 != 0) {
					number = random.nextInt(9) +1 ;
				}				
			}
					
		
		return number;
		
	}

}