package at.hallermayr.aud.ex01palindrome;

/**
 * Hello Ex01Palindrome!
 *
 */
public class Ex01Palindrome
{
	public boolean checkPalindrome(char[] word) {
		int first = 0; 
		int last = word.length-1; 
		while(first<last){
			if(word[first]!=word[last]){
				return false; 
			}
			first++;
			last--; 
		}
		return true;
	}
	
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    }
}
