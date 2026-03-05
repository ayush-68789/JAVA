public class Main
{
	public static void main (String args[])
	{
		//Strings
		String name1 = "tanu" ;
		System.out.println(name1);         // prints the string

		System.out.println(name1.length());   // prints the length of name variable

		String name2 = "ayus" ;

		String name3 = name1 + " and " + name2 ;     // concatenate two strings

		System.out.println(name3) ;
		
		System.out.println(name3.charAt(2)) ;        // prints the character present at given index  
		
		String name4 = name2.replace('s' , 'u') ;    // replace older char to new char 
		System.out.println(name4);
		
		
		System.out.println(name3.substring(5 , 9));  // [rints the substring of the main String
		
	}
}
