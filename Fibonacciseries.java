package HomeAssignments;

public class Fibonacciseries {
public static void main(String[] args) {
	int num1=0,num2=1;
	System.out.println(num1+" "+num2);
	for (int i = 2; i < 10; i++) {
		int num3 = num1+num2;
		num1= num2;
		num2 = num3;
		System.out.println(num3);
	}
}
}
