package HomeAssignments;

import java.util.Iterator;

public class PalindromePgm {

	public static void main(String[] args) {
		int num = 121;
		int temp = num;int i;
		for ( i = 0;num >0;num = num/10 ) {
			
			int rem = num %10;
			i = (i*10)+rem;
					
		}
		if (temp ==i)
			System.out.println("Palindrome");
		else
			System.out.println("Not Palindrome");
	
	}
}
