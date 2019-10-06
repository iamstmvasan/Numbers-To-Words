import java.util.*;
class Day_Calc
{
	int dd,mm,yyyy;
	void get()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter dd & mm & yyyy");
		dd = sc.nextInt();
		mm = sc.nextInt();
		yyyy = sc.nextInt();
	}
	void put()
	{
		System.out.println("Day Difference is : "+dd);
	}
	void process(Day_Calc dc1,Day_Calc dc2)
	{
		if(dc1.dd < dc2.dd)
		{
			dc1.dd = dc1.dd+30;
			dc1.mm--;
		}
		dd = dc1.dd-dc2.dd;
		if(dc1.mm < dc2.mm)
		{
			dc1.mm = dc1.mm+12;
			dc1.yyyy--;
		}
		mm = dc1.mm-dc2.mm;
		yyyy = dc1.yyyy-dc2.yyyy;
		mm+= yyyy*12;
		dd+= mm*30;

	}
}
class Testing
{
	public static void main(String[] args) {
		System.out.println("-------------First give current date-----------");
		Day_Calc dc1 = new Day_Calc();
		Day_Calc dc2 = new Day_Calc();
		Day_Calc dc3 = new Day_Calc();
		dc1.get();
		dc2.get();
		dc3.process(dc1,dc2);
		dc3.put();

	}
}