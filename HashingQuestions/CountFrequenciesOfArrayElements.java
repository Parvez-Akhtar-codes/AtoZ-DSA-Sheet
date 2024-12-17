package HashingQuestions;
import java.util.*;

class CountFrequenciesOfArrayElements{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        
        for(int i =0 ; i<n;i++){
            int x = arr[i];
            int count=0;

            if(x==-1) continue;

            for(int j=0;j<n;j++){
                if(x==arr[j]){
                    count++;
                    arr[j]=-1;
                }
            }
            System.out.println("Frequency of element "+x+" is :"+count);
        }
    }

}