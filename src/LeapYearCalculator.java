import java.util.Scanner;

public class LeapYearCalculator {
    public static void main(String[] args) {
        int year ;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a year: ");
        year = scanner.nextInt();
        boolean isLeapYear = false;
        boolean isDivisibleBy4 = year % 4 == 0;

        if (isDivisibleBy4){
            boolean isDivisibleBy100 = year % 100 == 0;
            if (isDivisibleBy100){
                boolean isDivisibleBy400 = year % 400 == 0;
                if (isDivisibleBy400){
                    isLeapYear = true;
                }
            }else{
                isLeapYear = true;
            }
        }

        if (isLeapYear){
            System.out.println("is a leap year: " + year);
        } else{
            System.out.println("is not a leap year: " + year);
        }
    }
}
