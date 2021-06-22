import java.util.Scanner;
import java.util.Random;
public class UC1{
	public static void main(String[] argv){
		int sum=0;
		//int snake1=30;
		//int snake2=31;
		//int snake3=32;
		//int snake4=33;
		//int snake5=34;
		//int ladder1=25;
		// int ladder2=50;
		//int ladder3=60;
		int i,j;
		int Snake[],Ladder[];

		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to snake and ladder");
				System.out.println("Enter snake position");
				int Snake1 = sc.nextInt();
				System.out.println("Enter snake position");
                                int Snake2 = sc.nextInt();
				System.out.println("Enter snake position");
                                int Snake3 = sc.nextInt();
				System.out.println("Enter snake position");
                                int Snake4 = sc.nextInt();
				System.out.println("Enter ladder position");
                                int Ladder1 = sc.nextInt();
				System.out.println("Enter ladder position");
                                int Ladder2 = sc.nextInt();
				System.out.println("Enter ladder position");
                                int Ladder3 = sc.nextInt();
				System.out.println("Enter ladder position");
                                int Ladder4 = sc.nextInt();
		int ranNum=0;
		while (sum <= 100)
		{
		Random raum = new Random();
		int num = raum.nextInt(6)+1;
		System.out.println("Dice:: " +num);
			if (sum==Snake1)
				{
				sum =sum-10;
				}
			 if (sum==Snake2)
                                {
                                sum =sum-15;
                                }
			if (sum==Snake3)
                                {
                                sum =sum-20;
                                }
			if (sum==Snake4)
                                {
                                sum =sum-10;
                                }
			if (sum==Ladder1)
                                {
                                sum =sum+5;
                                }
			if (sum==Ladder2)
                                {
                                sum =sum+5;
                                }
			if (sum==Ladder3)
                                {
                                sum = sum+5;
                                }
			if (sum==Ladder4)
                                {
                                sum =sum+5;
                                }
			sum = sum+num;
			System.out.println(sum); 
		}
}
}
