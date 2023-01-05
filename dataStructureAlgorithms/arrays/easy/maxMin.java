import java.util.*;
public class maxMin {
    public static void arrInput(int arr[]) {
        Scanner sc= new Scanner(System.in);
        for(int i=0; i<arr.length; i++){
            arr[i]= sc.nextInt();
        }
    }
    public static void arrShow(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.println("Index "+i+" number: "+arr[i]);
        }
    }
    public static void arrMaxMin(int arr[]){
        int largest= Integer.MIN_VALUE;
        int smallest= Integer.MAX_VALUE;
        for(int i=0; i<arr.length; i++){
            if(largest<arr[i]){
                largest=arr[i];
            }
            if(smallest>arr[i]){
                smallest=arr[i];
            }
        }
        System.out.println("The largest number is: "+largest);
        System.out.println("The smallest number is: "+smallest);
    }
    public static void main(String args[]) {
        Scanner sc= new Scanner(System.in);
        System.out.println("how many numbers you want to enter: ");
        int n= sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter "+n+" numbers: ");
        arrInput(arr);
        System.out.println("Your entered numbers: ");
        arrShow(arr);
        arrMaxMin(arr);
    }
    
}