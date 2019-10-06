import java.util.*;
class Rank_Demo
{
	int first[]; 
	int second[];
	int n;
		
		 
		void get()
		{
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter number : ");
			n = sc.nextInt();
			first = new int[n];
			second = new int[n];
			for(int i=0;i<n;i++)
			{
				System.out.println("Enter "+(i+1)+" Ele : ");
				first[i] = sc.nextInt();
				second[i] = 1;
			}
		}
		void process()
		{
			for(int i=0;i<n;i++)
				for(int j=0;j<n;j++)
					if(first[i] < first[j])
						second[i]+=1;

		}
		void put()
		{
			for(int i=0;i<n;i++)
				System.out.print(first[i]+"\t");
				System.out.println("\n");
			for(int i=0;i<n;i++)
				System.out.print(second[i]+"\t");

		}
}
class Main_Demo
{
	public static void main(String[] args) {
		Rank_Demo rd = new Rank_Demo();
		rd.get();
		rd.process();
		rd.put();
	}
}