import java.util.Random;
import java.util.Scanner;

class RandomNumber
{
	public static void main(String args[])
	{
		int i,num;
		int attempt=1;
		char c='y';
		
		
		Random rand= new Random();
		int randomnum= rand.nextInt(100)+1;
		System.out.println("\nYou have max 3 chances to guess the correct number between 1 to 100 !!\n\nStart..");
		
		while(attempt<=3)
		{	
			System.out.println("\n\nAttempt : "+attempt);
			Scanner sc= new Scanner(System.in);
			if(c=='y')
			{
				
				for(i=1;i<=3;i++)
				{
					System.out.println("\nRound "+i+" Enter number : ");
					num= sc.nextInt();
					
					if(num==randomnum)
					{
						System.out.println("Correct Number !! "+randomnum);
						System.exit(0);
					}else{
						System.out.println("Incorrect !!");
						if(num<randomnum){
							System.out.println("You have entered lesser number !");
						}else{
							System.out.println("You have entered greater number ! ");
							
						}
					}
				
				}
				System.out.println("\nDo you want to play again ? (y/n) : ");
				c = sc.next().charAt(0);
				attempt++;
			}else{
				System.exit(0);
			}
				
			
		}
		System.out.println("\nThe number was : "+randomnum);
		
	}
	
}