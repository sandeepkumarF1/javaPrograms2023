import java.lang.*;
import java.util.*;
class sumOfNaturalNumber{
	static int sum(int n){
		int s=0,i;
		if(n==0){
			return 0;
		}
		else{
			for(i=1; i<=n; i++){
				s=s+i;
			}
		}
		return s;
	}
	public static void main(String args[]){
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a numbers:");
		int num=sc.nextInt();
		int res=sum(num);
		System.out.println("The result is:"+res);
	}


}