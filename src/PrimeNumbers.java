import java.util.Scanner;

/**
 * 
 */

/**
 * @author j.fendley
 *
 */
public class PrimeNumbers {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner userInput = new Scanner(System.in);
		
		int userNum;
		boolean prime;
		
		
		System.out.print("Please enter an integer number: ");
		userNum = userInput.nextInt();
		
		prime = isPrime(userNum);
		
		if(prime == false){
			System.out.print(userNum + " is not a prime number");
		}
		
		if(prime == true){
			System.out.print(userNum + " is a prime number");
		}
		
		userInput.close();
	}
	/**
	 * @param takes integer is prime
	 * @return returns a boolean
	 */
	
	public static boolean isPrime(int userNum){
		
		boolean prime = true;
		

		for(int i = 2; prime && i <= Math.sqrt(userNum); i++){

			if(userNum % i == 0){
				prime = false;
			}
		}
		
		return prime;
	}	
}
