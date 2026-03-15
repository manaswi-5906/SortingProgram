//Java Program to sort an array of integer
import java.util.Scanner;
class sorting{
    public static void main(String[] args){
       Scanner sc= new Scanner(System.in);
        System.out.println("Enter number of elements:");
        int n=sc.nextInt();
        int temp;

     System.out.println("Enter elements:");
     for(int i=0;i<n;i++){
           arr[i]=sc.nextInt();
     }
    for(int i=0;i<n;i++){
        for(int j=i+1;j<n;j++){
             if(arr[i] > arr[j]){
                  temp=arr[i];
                   arr[i]=arr[j];
                    arr[j]=temp;
             }
        }
    }
    System.out.println("Sorted array:");
        for(int i=0;i<n;i++){
            System.out.print(arr[i] + " ");
        }
    }
}
