public class SumOfAllDivisors {
    public static void main(String[] args) {
        System.out.println(sumOfDivisors(4));
    }
    static long sumOfDivisors(int N){
        long sum=0;
       for(int i=1;i<=N;i++){
           long ans = (N/i)*i;
           sum = sum+ans;
          
           }
       return sum;
    }
    
}
