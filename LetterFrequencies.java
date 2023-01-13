/*
 * Activity 2.4.4
 */
public class LetterFrequencies
{
	public static void main(String[] args)
	{
		String letters = "abcdefghijklmnopqrstuvwxyz"; 
		String phrase = "This is a phrase!";

		System.out.println("The following shows the letter frequencies for the phrase");

    /* your code here */
	for (int i = 0; i < 26; i++){

		String let = letters.substring(i,i +1);
		int co = 0;
		
		for (int q = 0; q < phrase.length(); q++){
			String con = phrase.substring(q,q+1);
			
			if (let.equals(con)){
				co++;
			}
		}
	
	System.out.println(let + " appears " + co + " times.");
	}	
}
}
