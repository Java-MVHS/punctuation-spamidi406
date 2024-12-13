//Suhas Pamidi
//12-12-2024
//Punctuation.java
/*
 * Purpose: This program will take some text, read it word by word, and print all of the words that have some punctuation in it.
 * Learning: This program tests our understanding of string methods and loops. Its extremly good because without understanding each method,
 * you will not be able to complete the program
 * 
 * Pseudocode:
 * 
 * Main
 * 	Create object of class and use it to call search it
 * 
 * searchIt()
 * 	Because there are no field vars, we need to create a strings to get the punctuation words and save it by setting it equal to getPunctuationWords
 * 	Then we need anther variable, which is only the punctuation words, and we get that by initalizing it to checkForPunctuation(pass on text)
 * 	Then we print the final by passing on the punctuation words to the print method and print them.
 * 
 * getPunctuationWords()
 * 	Set a string equal to the text we want to get punctuation words from and return it
 * 
 * checkForPunctuation()
 * 	declare intialize a var for j(which we will use to get substrings from the total string)
 * 	declare andinitialize another string to keep track of each word
 * 	declare and initialize antoher string to keep track of all the punctuation words(sentence)
 * 	First start by looping through the string(i = 0, i <length-1; i++)
 * 	Then check if str.charAt(i) is equal to a space.
 * 	If it is, then get substring from j to i 
 *  in the case of i being the last index of the string take substring from j to i+1(this is to avoid an indexing error because substring does not return a string including the second index you pass in)
 * 	Then set j to i, to update the start position
 * 	In another if statement, check if the string contains punctuation
 * 		logic: if (!(word.indexOf(punctuation) == -1))
 * 		if it is then add it to the sentence string
 * 	return sentence(which contains all of the punctuation words)
 * 
 * Print()
 * 	take in a string parameter( this is for sentence, which contains all of the punctuation words)
 * 	then print it.
 */
public class Punctuation//class header
{
	public static void main(String[]Args)//main 
	{
		Punctuation p = new Punctuation();//create obj
		p.searchIt();//use object to call search it
	}
	
	public String getPunctuationWords()//header
	{
		//D & I speech, a string for the whole text we want to check for punctuation words
		String speech = new String("Blood, Sweat, and Tears by Winston Churchill " +
			"May 13, 1940"
			+" Mr. Speaker:" 
			+ " On Friday evening last I received His Majesty’s commission to form a new " + "Administration. It was the evident wish and will of Parliament and the nation that this should be conceived on the broadest possible basis and that it should include all parties, both those who supported the late Government and also the parties of the Opposition." 
			+ " I have completed the most important part of this task. A War Cabinet has been formed of five Members, representing, with the Liberal Opposition, the unity of the nation. The three party Leaders have agreed to serve, either in the War Cabinet or in high executive office. The three Fighting Services have been filled. It was necessary that this should be done in one single day, on account of the extreme urgency and rigour of events. A number of other key positions were filled yesterday, and I am submitting a further list to His Majesty tonight. I hope to complete the appointment of the principal Ministers during tomorrow. The appointment of the other Ministers usually takes a little longer, but I trust that, when Parliament meets again, this part of my task will be completed, and that the Administration will be complete in all respects." 
			+ " Sir, I considered it in the public interest to suggest that the House should be summoned to meet today. Mr. Speaker agreed and took the necessary steps, in accordance with the powers conferred upon him by the Resolution of the House. At the end of the proceedings today, the Adjournment of the House will be proposed until Tuesday, the 21st May, with, of course, provision for earlier meeting, if need be. The business to be considered during that week will be notified to Members at the earliest opportunity. I now invite the House, by the Resolution which stands in my name, to record its approval of the steps taken and to declare its confidence in the new Government."
			+ " Sir, to form an Administration of this scale and complexity is a serious undertaking in itself, but it must be remembered that we are in the preliminary stage of one of the greatest battles in history, that we are in action at many points in Norway and in Holland, that we have to be prepared in the Mediterranean, that the air battle is continuous and that many preparations have to be made here at home. In this crisis I hope I may be pardoned if I do not address the House at any length today. I hope that any of my friends and colleagues, or former colleagues, who are affected by the political reconstruction, will make all allowances for any lack of ceremony with which it has been necessary to act. I would say to the House, as I said to those who’ve joined this government: \"I have nothing to offer but blood, toil, tears and sweat.\"" 
			+ " We have before us an ordeal of the most grievous kind. We have before us many, many long months of struggle and of suffering. You ask, what is our policy? I will say: It is to wage war, by sea, land and air, with all our might and with all the strength that God can give us; to wage war against a monstrous tyranny, never surpassed in the dark and lamentable catalogue of human crime. That is our policy. You ask, what is our aim? I can answer in one word: victory. Victory at all costs, victory in spite of all terror, victory, however long and hard the road may be; for without victory, there is no survival. Let that be realised; no survival for the British Empire, no survival for all that the British Empire has stood for, no survival for the urge and impulse of the ages, that mankind will move forward towards its goal. "
			+ " But I take up my task with buoyancy and hope. I feel sure that our cause will not be suffered to fail among men. At this time I feel entitled to claim the aid of all, and I say, \"Come then, let us go forward together with our united strength.\"");
			return speech;//return the speech
	}
	public String checkForPunctuation(String input)//header, take in the input, which we will get from the method: getPunctuationWords()
	{
		int j = 0;//keep track of start of words
		String word = new String("");//keep track of each word in the full text
		String sentence = new String("");//use it to have one place with all words that contain punctuation
		for (int i = 0; i < input.length(); i++)//loop through entire string
		{	
			if(input.charAt(i) == ' ' || i == input.length()-1)//if we encounter a space or we are at the last index of the string(to avoid indexing error with substring method and if case error)
			{
				word = input.substring(j, i);//get substring from j to i
				if (i == input.length()-1)//if its at the last index, we need to add 1 to i, we need to account for the fact that the text will not end with a space 
				{
					word = input.substring(j, i +1);//get substring from j to i + 1 
				}
				j = i;//update the start position to i, so we can get substring again
				//check if the word contatins punctuation
				if (!(word.indexOf('!') == -1) || !(word.indexOf('.') == -1) || !(word.indexOf('?') == -1) || !(word.indexOf(',') == -1) || !(word.indexOf('"') == -1)  || !(word.indexOf(';') == -1) || !(word.indexOf(':') == -1)|| !(word.indexOf('\'') == -1) || !(word.indexOf('(') == -1)|| !(word.indexOf('-') == -1)  )
				{
					sentence = new String(sentence + word);//if it does, then add the word to sentence
				}
			}
		}
		
		return sentence;//return the sentece
	}
	
	public void print(String strIn)//header
	{
		System.out.print(checkForPunctuation(strIn));//print all the punctiation words
	}
	
	public void searchIt()//call all three methods.
	{
		String essay = new String(getPunctuationWords());
		String answer = new String(checkForPunctuation(essay));
		System.out.println("\n\n\n" + answer + "\n\n\n");
	}
}
