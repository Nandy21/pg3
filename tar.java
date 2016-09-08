import java.util.Scanner;


public class tar {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		int[] a=new int[4];
		int count=0;    
		for(int i=0;i<4;i++)
		{
			a[i]=sc.nextInt();
		}
		int t=sc.nextInt();
		for(int i=0;i<4;i++)
		{
			for(int j=0;j<4;j++)
			{
				if(a[i]+a[j]==t)
				{
					count++;
					if(count==1)
						System.out.println(a[i]+" "+a[j]);
					
				}
			}
		}
		
	}

}
