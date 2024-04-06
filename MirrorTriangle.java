import java.util.Scanner;

public class MirrorTriangle {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n =scan.nextInt();
		int temp = n,val,count;
		for(int i =0; i< n; i++) {
			System.out.println();
			for(int j = 0 ; j <2*(n-i-1);j++) {
				System.out.print(" ");
			}
			val =i+1;
			count=1;
			for(int j = n-i-1 ; j < n;j++) {
				System.out.print(val);
				val = val + (temp -count);
				count++;
			}
			
		}
	}

}
