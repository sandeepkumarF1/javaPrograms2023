import java.lang.*;
import java.util.*;
class fibonacciSeries{
static int fibonacci(int n){
	int t0=0, t1=1, s=0, i;
	if(n<=1){
		return n;
	}
	else{
		for(i=2; i<=n; i++){
			s=t0 + t1;
			t0= t1;
			t1= s;
		}
	return s;
	}
}

public static void main(String args[]){
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a number: ");
	int num=sc.nextInt();
	int res=fibonacci(num);
	System.out.println("The result is: "+"0 1 "+res);
}
}