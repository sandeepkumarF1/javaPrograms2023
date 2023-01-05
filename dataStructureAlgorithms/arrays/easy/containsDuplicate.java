import java.util.*;
public class containsDuplicate {
    public static void arrInput(int arr[]) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter numbers:");
        for (int index = 0; index <= arr.length-1; index++) {
            arr[index]=sc.nextInt();
        }
    }
    public static boolean duplicate(int arr[]){
        for(int i=0; i<arr.length-1; i++){
            for(int j=i+1; j<arr.length; j++){
                if(arr[i]==arr[j]){
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("How many numbers? ");
        int n=sc.nextInt();
        int arr[]= new int[n];
        arrInput(arr);
        boolean b=duplicate(arr);
        if(b){System.out.println("true");}
        else{System.out.println("false");}
    }
    
}