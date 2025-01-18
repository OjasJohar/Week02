import java.util.Scanner;

//Creating palindromeChecker3 class
public class Main{
	
	public static void main(String[] args){
		//Creating Scanner object
		Scanner input =new Scanner(System.in);
		
		//taking input from the user
		System.out.println("Enter the text :");
		String text=input.nextLine();
		
		//creating an object palindromechecker
		PalindromeChecker obj=new PalindromeChecker(text);
		
		//displaying the result
		obj.displayResult();
		
		//Closing Scanner class
		input.close();
	}
}

//Creating PalindromeChecker class
class PalindromeChecker{
	//creating text attributes
	private String text;
	
	//constructor
    PalindromeChecker(String text){
		this.text=text;
	}
	
	//method to check whether text is pallindrome or not
	public boolean isPalindrome(){
		int start=0;
		int end=this.text.length()-1;
		
		while(start<=end){
			char a=this.text.charAt(start);
			char b=this.text.charAt(end);
			if(a!=b){
				return false;
			}
			start++;
			end--;
		}
		return true;
	}
	
	//method to display result
	public void displayResult(){
		System.out.print("The given Text \"" + text +"\"");
		boolean flag=isPalindrome();
		System.out.println(flag==true ? " is palindrome." : " is not palindrome.");
	}
}