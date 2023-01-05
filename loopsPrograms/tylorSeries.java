import java.lang.*;
import java.util.*;
// import java.text.*;
class tylorSeries{
static double e(double x, double n){
	double s=1;
	if(n==0){
		return 1;
	}
	else{
		for(; n>0; n--){
			s=1+x/n*s;
		}
	return s;
	}
}
public static void main(String args[]){
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a number: ");
	double num1=sc.nextInt();
	System.out.println("Enter second number: ");
	double num2=sc.nextInt();
	double res=e(num1, num2);
	System.out.println("The result is: "+res);
}
}