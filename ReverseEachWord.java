import java.util.ArrayList;
import java.util.Scanner;

public class ReverseEachWord {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	String sentence = scan.nextLine();
	ArrayList<String> eachWord = new ArrayList<>();
	int count =-1;
	int start = 0;
	char[] letters = sentence.toCharArray();
	int counter =0;
	//To calculate length of the string
	for(char l: letters) {
		count++;
	}
	int length = count;
	//To get words from the string
	for(int i =0; i <= length ; i++) {
		counter++;
		if(letters[i] == ' ' || i == length)
		{
			//To store each word in a list 
			if(i == length )
				{
					eachWord.add(String.valueOf(letters, start, counter));
				}
			else {
					eachWord.add(String.valueOf(letters, start, counter-1));
					start = i+1;
					counter=0;
	}	}	}
	//list count
	length = 0;
	for(String word:eachWord) {
		length++;
	}
	//iterate each word
	String output = "";
	for(int i =length-1; i >= 0; i--) {
		int len = -1;
		char[] eachLetter = eachWord.get(i).toCharArray();
			for(char alpha : eachLetter) {
			len++;
		}
		//Print a word in reverse order
			for(int ii = len;ii>=0;ii--) {
				output = output.concat(String.valueOf(eachLetter[ii]));
		}
		output = output.concat(" ");
	}
	System.out.println(output);
}
}
