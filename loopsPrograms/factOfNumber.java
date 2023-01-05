import java.lang.*;
import java.util.*;
class factOfNumber{
	static int fact(int n){
		int f=1,i;
		if(n==0){
			return 1;
		}
		else{
			
			for(i=1; i<=n; i++){
				f=f*i;
			}
		
		}
		return f;
		
	}
	public static void main(String args[]){
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a numbers:");
		int num=sc.nextInt();
		int res=fact(num);
		System.out.println("The result is:"+res);
	}


}