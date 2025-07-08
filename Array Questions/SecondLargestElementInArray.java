import java.util.Scanner;

public class SecondLargestElementInArray {
    public static int SecondlargestElement(int[] arr){
        int largest = arr[0];
        int slargest = -1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>largest){
                slargest = largest;
                largest=arr[i];
            }
            else if(arr[i]<largest && arr[i]>slargest){
                slargest = arr[i];
            }
        }
        return slargest;

    }
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        int[] arr = new int[6];
        System.out.println("Vaues for array : ");
        for (int i = 0; i < arr.length; i++) {
            
            arr[i] = sc.nextInt();
        }
    
       int slargestElement = SecondlargestElement(arr);
        System.out.println("Second Largest element in this array is : ");
        System.out.println(slargestElement);
    
}
}
