import java.util.Scanner ; 
public class Main
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in) ;
		String name = sc.nextLine() ;
		System.out.print(name) ;
		
		int len = name.length() ;
		System.out.printf("\nLength of string : %d",len) ;
	}
}
