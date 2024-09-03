
import java.util.Scanner;

class CountDigit{
    
public static int evenlyDivides(int N){
       int count = 0;
       int rem=0;
       int temp=N;
       while(temp>0){
           rem=temp%10;
           if(rem!=0 && N%rem==0){
               count++;
           }
           temp=temp/10;
          }
       return count;
    }
    public static void main(String args[]) throws Exception{
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n = sc.nextInt();
        int result = evenlyDivides(n);
        System.out.println(result);
 }
}



