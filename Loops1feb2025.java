import java.util.Scanner;

public class Loops1feb2025 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		while(true) {
			System.out.println("________Enter the choice__________");
			System.out.println("1.Even");
			System.out.println("2.Prime");
			System.out.println("3.Palindrome");
			System.out.println("4.Armstrong");
			System.out.println("5.Exit");
			int choice=input.nextInt();
			
			switch(choice) {
				
			case 1:
				System.out.println("Enter a min Number");
				int min=input.nextInt();
				
				System.out.println("Enter a max Number");
				int max=input.nextInt();
				
				for(int i=min;i<=max;i++) {
					if(i%2==0) {
						System.out.println(i);
					}
				}	
				break;	
			case 2:
				System.out.println("Enter a  Number");
				int number=input.nextInt();
				if(number<2) {
					System.out.println("Not Prime");
				}
				else {
					boolean isPrime=true;
					for(int i=2;i<=Math.sqrt(number);i++) {
						if(number %i==0) {
							isPrime=false;
							break;
						}
					}
					if(isPrime) {
						System.out.println("Prime");
					}
					else {
						System.out.println("Not Prime");
					}
				}
				
				break;
				
			case 3:
				System.out.println("Enter a Number:");
		        int number1 = input.nextInt();
		        int original=number1;
		        int reverse=0;
		        
		        while(number1!=0) {
		        	int digit=number1%10;
		        	reverse=reverse*10+digit;
		        	number1=number1/10;
		        	
		        }
		        if(original==reverse) {
		        	System.out.println("Palindrome");
		        }
		        else {
		        	System.out.println("Not Palindrome");
		        }
		       break;
		       
			case 4:
				System.out.println("Enter The number");
				int number2=input.nextInt();
				int originalnumber=number2;
				int sum=0;
				while (number2!=0) {
					int digit=number2%10;
					sum+=(digit*digit*digit);
					number2=number2/10;
					
				}
				if(sum==originalnumber) {
					System.out.println("Armstrong Number");
				}
				else {
					System.out.println("Not Armstrong number");
				}
				break;
		       
			case 5:
				System.out.println("loop terminated successfully");
				input.close();
				System.exit(0);
				break;
				
		   default:
					System.out.println("Enter The Valid Choice");
			}
		}	
	}

}
