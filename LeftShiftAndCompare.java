import java.util.Scanner;

public class LeftShiftAndCompare {
	public static boolean leftShift(char[] str1Char, char[] str2Char,int length1, int length2) {
		char temp =' ';
		if(length1 == length2) {
			for(int i = 0;i <= length2;i++) {
				   temp = str2Char[length2];
				for(int j = length2 ;j > 0;j--) {
				   str2Char[j] = str2Char[j-1];
				}
					str2Char[0] = temp;
			   if(String.valueOf( str1Char).equals(String.valueOf(str2Char)))
			   {
				   return true;
			   }
			  }
			}
		else
			  return false;
		return false;	
	}
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	String str1 =scan.next();
	String str2 =scan.next();
	char[] str1Char = str1.toCharArray();
	char[] str2Char = str2.toCharArray();
	int count =-1,length1,length2;
	for(char letter :str1Char) {
		count++;
	}
	length1 =count;
	count =-1;
	for(char letter :str2Char) {
		count++;
	}
	length2 =count;
 	System.out.println(leftShift(str1Char, str2Char, length1, length2));
	}
}
