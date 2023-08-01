import java.util.Scanner;
class ArmStrong 
{
	public static int count(int num)
	{
		int ct=0;
		while (num!=0)
		{
			ct++;
			num/=10;
		}
		return ct;
	}
	public static int power(int base,int raise)
	{
		int pow=1;

		for (int i=0;i<raise ;i++ )
		{
			pow*=base;
		}
		return pow;
	}
	public static boolean isArmStrong(int num)
	{
		int temp=num;
		int sum=0;
		int ct=count(num);

		while (num>0)
		{
			sum+=power((num%10),ct);
				num/=10;
		}
		if (temp==sum)
		{
			return true;
		}
		return false;

	}
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number:");
		if (isArmStrong(sc.nextInt()))
		{
			System.out.println("ArmStrong Number");
		}
		else
		{
			System.out.println("Not an ArmStrong Number");
		}

	}
}
