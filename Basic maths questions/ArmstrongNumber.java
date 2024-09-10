public class ArmstrongNumber {
    public static void main(String[] args){
	        
        System.out.println(armstrong(371));
    }
    public static boolean armstrong(int x) {
        int dup=x;
        int sum=0;
        while(dup!=0)
        {
            int rem = dup%10;
            sum=sum+(rem*rem*rem);
            dup=dup/10;
        }
        if(x==sum) {
            return true;
        }
        else {
            return false;
        }
    }
    
}
