import java.util.*;
public class HotelDemo {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Welcome to the Hotel");
		int price=0;
		boolean ordering=true;
		do {
			System.out.println("-----------Hotel Item List-------------");
			System.out.println("A.Starters");
			System.out.println("B.Main");
			System.out.println("C.Deserts");
			System.out.println("D.Drinks");
			System.out.println("E.Exit");
			String choice=input.next();
			choice=choice.toUpperCase();
			switch(choice) {
			
			case "A":
				System.out.println("-------------Starters---------------");
				System.out.println("1.Masala Papad : 50");
				System.out.println("2.Chili Panner : 150");
				System.out.println("3.Bruschetta : 200");
				System.out.println("4.Mushroom Soup : 170");
				System.out.println("5.Exit");
				boolean orderingA=true;
				while(orderingA) {
					int ch=input.nextInt();
					switch(ch) {
					case 1:
						price=price+50;
						System.out.println("1.Masala Papad : 50");
						System.out.println("2.Chili Panner : 150");
						System.out.println("3.Bruschetta : 200");
						System.out.println("4.Mushroom Soup : 170");
						System.out.println("5.Exit");
						break;
					case 2:
						price=price+150;
						System.out.println("1.Masala Papad : 50");
						System.out.println("2.Chili Panner : 150");
						System.out.println("3.Bruschetta : 200");
						System.out.println("4.Mushroom Soup : 170");
						System.out.println("5.Exit");
						break;
					case 3:
						price=price+200;
						System.out.println("1.Masala Papad : 50");
						System.out.println("2.Chili Panner : 150");
						System.out.println("3.Bruschetta : 200");
						System.out.println("4.Mushroom Soup : 170");
						System.out.println("5.Exit");
						break;
					case 4:
						price=price+170;
						System.out.println("1.Masala Papad : 50");
						System.out.println("2.Chili Panner : 150");
						System.out.println("3.Bruschetta : 200");
						System.out.println("4.Mushroom Soup : 170");
						System.out.println("5.Exit");
						break;
					case 5:
						orderingA=false;
						break;
					default:
						System.out.println("Valid Choice Please");
					}
					
				}
				
			break;
			
			case "B":
				System.out.println("-------------Main---------------");
				System.out.println("1.Muttor Panner : 250");
				System.out.println("2.Dal Khichadi : 120");
				System.out.println("3.Chicken Biryani : 200");
				System.out.println("4.Panner Tikka Masala : 300");
				System.out.println("5.Exit");
				boolean orderingB=true;
				while(orderingB) {
					int ch=input.nextInt();
					switch(ch) {
					case 1:
						price=price+250;
						System.out.println("1.Muttor Panner : 250");
						System.out.println("2.Dal Khichadi : 120");
						System.out.println("3.Chicken Biryani : 200");
						System.out.println("4.Panner Tikka Masala : 300");
						System.out.println("5.Exit");
						break;
					case 2:
						price=price+120;
						System.out.println("1.Muttor Panner : 250");
						System.out.println("2.Dal Khichadi : 120");
						System.out.println("3.Chicken Biryani : 200");
						System.out.println("4.Panner Tikka Masala : 300");
						System.out.println("5.Exit");
						break;
					case 3:
						price=price+200;
						System.out.println("1.Muttor Panner : 250");
						System.out.println("2.Dal Khichadi : 120");
						System.out.println("3.Chicken Biryani : 200");
						System.out.println("4.Panner Tikka Masala : 300");
						System.out.println("5.Exit");
						break;
					case 4:
						price=price+300;
						System.out.println("1.Muttor Panner : 250");
						System.out.println("2.Dal Khichadi : 120");
						System.out.println("3.Chicken Biryani : 200");
						System.out.println("4.Panner Tikka Masala : 300");
						System.out.println("5.Exit");
						break;
					case 5:
						orderingB=false;
						break;
					default:
						System.out.println("Valid Choice Please");
					}
					
				}
			break;
			
			case "C":
				System.out.println("-------------Deserts---------------");
				System.out.println("1.Rasmalai : 70");
				System.out.println("2.Gulab Jamun : 40");
				System.out.println("3.Paneer Kheer : 60");
				System.out.println("4.Kalakand : 90");
				System.out.println("5.Exit");
				boolean orderingC=true;
				while(orderingC) {
					int ch=input.nextInt();
					switch(ch) {
					case 1:
						price=price+70;
						System.out.println("1.Rasmalai : 70");
						System.out.println("2.Gulab Jamun : 40");
						System.out.println("3.Paneer Kheer : 60");
						System.out.println("4.Kalakand : 90");
						System.out.println("5.Exit");
						break;
					case 2:
						price=price+40;
						System.out.println("1.Rasmalai : 70");
						System.out.println("2.Gulab Jamun : 40");
						System.out.println("3.Paneer Kheer : 60");
						System.out.println("4.Kalakand : 90");
						System.out.println("5.Exit");
						break;
					case 3:
						price=price+60;
						System.out.println("1.Rasmalai : 70");
						System.out.println("2.Gulab Jamun : 40");
						System.out.println("3.Paneer Kheer : 60");
						System.out.println("4.Kalakand : 90");
						System.out.println("5.Exit");
						break;
					case 4:
						price=price+90;
						System.out.println("1.Rasmalai : 70");
						System.out.println("2.Gulab Jamun : 40");
						System.out.println("3.Paneer Kheer : 60");
						System.out.println("4.Kalakand : 90");
						System.out.println("5.Exit");
						break;
					case 5:
						orderingC=false;
						break;
					default:
						System.out.println("Valid Choice Please");
					}
				}
			break;
			
			case "D":
				System.out.println("-------------Drinks---------------");
				System.out.println("1.Badam Milk : 40");
				System.out.println("2.Lassi : 30");
				System.out.println("3.Fruit Punch : 60");
				System.out.println("4.Thandai : 50");
				boolean orderingD=true;
				while(orderingD) {
					int ch=input.nextInt();
					switch(ch) {
					case 1:
						price=price+40;
						System.out.println("1.Badam Milk : 40");
						System.out.println("2.Lassi : 30");
						System.out.println("3.Fruit Punch : 60");
						System.out.println("4.Thandai : 50");
						break;
					case 2:
						price=price+30;
						System.out.println("1.Badam Milk : 40");
						System.out.println("2.Lassi : 30");
						System.out.println("3.Fruit Punch : 60");
						System.out.println("4.Thandai : 50");
						break;
					case 3:
						price=price+60;
						System.out.println("1.Badam Milk : 40");
						System.out.println("2.Lassi : 30");
						System.out.println("3.Fruit Punch : 60");
						System.out.println("4.Thandai : 50");
						break;
					case 4:
						price=price+50;
						System.out.println("1.Badam Milk : 40");
						System.out.println("2.Lassi : 30");
						System.out.println("3.Fruit Punch : 60");
						System.out.println("4.Thandai : 50");
						System.out.println("5.Exit");
						break;
					case 5:
						orderingD=false;
						break;
					default:
						System.out.println("Valid Choice Please");
					}
				}
			break;
			
			case "E":
				ordering=false;
				break;
			
			default:
				System.out.println("Enter a Valid Choice");
			}
		}
		while(ordering);
		System.out.println(price);
	}

}
