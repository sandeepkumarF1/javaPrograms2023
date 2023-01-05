import java.lang.*;
import java.util.*;
class powOfNumber{
static int powers(int m, int n){
	int i,pow=1;
	if(n==0){
		return 1;
	}
	else{
		for(i=1; i<=n; i++){
			pow=pow*m;
		}
	}
	return pow;
}
public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter two number: ");
	int num1=sc.nextInt();
	int num2=sc.nextInt();
	int res=powers(num1, num2);
	System.out.println("The result is: "+res);
}


}