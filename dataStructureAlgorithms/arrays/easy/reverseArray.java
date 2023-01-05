import java.util.*;
public class reverseArray {
    public static void arrInput(int arr[]) {
        Scanner sc= new Scanner(System.in);
        for(int i=0; i<arr.length; i++){
            arr[i]= sc.nextInt();
        }
    }
    public static void arrShow(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.println("Number of index "+i+" is: "+arr[i]);
        }
    }
    public static void reverseArr(int arr[]){
        int start=0, temp;
        int end=arr.length-1;
        while(start<end){
            temp=arr[end];
            arr[end]=arr[start];
            arr[start]=temp;
            start++;
            end--;
        }
        System.out.println("The reversed array: ");
        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i]);
        }
    }
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("How many numbers? ");
        int n= sc.nextInt();
        int arr[]= new int[n];
        System.out.println("Enter "+n+" numbers: ");
        arrInput(arr);
        System.out.println("Your entered numbers: ");
        arrShow(arr);
        reverseArr(arr);

    }

}
