class PalindromeNumber{
    public static void main(String[] args){
	        
        System.out.println(Palindrome(121));
    }
    public static boolean Palindrome(int x){
       int dup=x;
        int revnum=0;
        while(dup!=0){
            int rem=dup%10;
            revnum = (revnum*10)+rem;
            dup=dup/10;
         
        }
       
       if(revnum==x) {
           return true;
       }
       else {
           return false;
       }
    }
}
