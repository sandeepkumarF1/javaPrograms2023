import java.util.Scanner;
class linearSearch{

    public static int linearSrch(int arr[], int key){
        for(int index=0; index<arr.length; index++){
            if(arr[index]==key){
                return index;
            }
        }
        return -1;
    }

    public static void arrShow(int arr[]){
        for(int index=0; index<arr.length; index++){
            System.out.println("Index "+index+" element is: "+arr[index]);
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter total numbers? ");
        int num= sc.nextInt();
        int arr[]= new int[num];
        System.out.println("Enter your numbers: ");
        for(int index=0; index<arr.length; index++){
            arr[index]=sc.nextInt();
        }
        System.out.println("Your numbers are: ");
        arrShow(arr);
        System.out.println("Enter key to search: ");
        int key= sc.nextInt();
        int result= linearSrch(arr, key);
        if(result==-1){
            System.out.println("Number is not present: ");
        }
        else{
            System.out.println("The number is present at: "+result);
        }


    }
}