import java.util.Scanner;

public class MySolution {
    private long Number;
    private String Words = "";

    public void input(){
        System.out.println("Enter Number : ");
        Scanner sc = new Scanner(System.in);
        Number = sc.nextLong();
        if(String.valueOf(Number).length() >= 15 || Number < 0) {
            System.out.println("Don't give number greater than 14 digit (or) Don't give negative numbers");
            System.out.println("Are you try again (Yes - 1 || No - 2) : ");
            int choice = sc.nextInt();
            if(choice == 1)
                input();
            else if(choice == 2)
                System.out.println("Program end...");
            else
                System.out.println("Invalid Choice, Program end");

        }
    }

    public void output(){
        System.out.println("-------------------------------------------------------------------------------------------------");
        System.out.println(Words);
        System.out.println("-------------------------------------------------------------------------------------------------");
    }

    public void process(){
        NumbersToWords numbersToWords = new NumbersToWords();
        if(Number == 0)
            Words = "Zero";
        if(String.valueOf(Number).length() >= 8){
            long crore = Number / 10000000;
            Number = Number % 10000000;
            Words += numbersToWords.covert(crore)+"Crore ,";
        }
        if(Number != 0)
            Words += numbersToWords.covert(Number);
    }

}
