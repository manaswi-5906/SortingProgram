//Java Program to sort an array of integer
class sorting{
    public static void main(String[] args){
         int arr[] = {5,2,8,1};//Array elements
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                 if(arr[i]>arr[j]){
                       int temp;
                       arr[i]=arr[j];
                       arr[j]=temp;
                 }
            }
        }
    //Display Sorting array
        System.out.println("Sorting array:");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
    }
}
