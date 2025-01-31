import java.util.*;
public class Tradecommision {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the city");
        String city = input.next();
        city = city.toLowerCase();
        System.out.println("Enter volume Sales");
        float sale = input.nextFloat();
        float rate;
        double commision;
        
        if(city.equals("sofia")) {
            if(sale >= 0 && sale <= 500) {
                rate = 5;
                commision = (rate * sale) / 100;
                System.out.println(String.format("%.2f", commision));  // Round to 2 decimal places
            }
            else if(sale > 500 && sale <= 1000) {
                rate = 7;
                commision = (rate * sale) / 100;
                System.out.println(String.format("%.2f", commision));
            }
            else if(sale > 1000 && sale <= 10000) {
                rate = 8;
                commision = (rate * sale) / 100;
                System.out.println(String.format("%.2f", commision));
            }
            else {
                rate = 12;
                commision = (rate * sale) / 100;
                System.out.println(String.format("%.2f", commision));
            }
        }
        else if(city.equals("varna")) {
            if(sale >= 0 && sale <= 500) {
                rate = (float) 4.5;
                commision = (rate * sale) / 100;
                System.out.println(String.format("%.2f", commision));
            }
            else if(sale > 500 && sale <= 1000) {
                rate = (float) 7.5;
                commision = (rate * sale) / 100;
                System.out.println(String.format("%.2f", commision));
            }
            else if(sale > 1000 && sale <= 10000) {
                rate = 10;
                commision = (rate * sale) / 100;
                System.out.println(String.format("%.2f", commision));
            }
            else {
                rate = 13;
                commision = (rate * sale) / 100;
                System.out.println(String.format("%.2f", commision));
            }
        }
        else if(city.equals("plovdiv")) {
            if(sale >= 0 && sale <= 500) {
                rate = (float) 5.5;
                commision = (rate * sale) / 100;
                System.out.println(String.format("%.2f", commision));
            }
            else if(sale > 500 && sale <= 1000) {
                rate = 8;
                commision = (rate * sale) / 100;
                System.out.println(String.format("%.2f", commision));
            }
            else if(sale > 1000 && sale <= 10000) {
                rate = 12;
                commision = (rate * sale) / 100;
                System.out.println(String.format("%.2f", commision));
            }
            else {
                rate = (float) 14.5;
                commision = (rate * sale) / 100;
                System.out.println(String.format("%.2f", commision));
            }
        }
        else {
            System.out.println("error");
        }
    }
}

