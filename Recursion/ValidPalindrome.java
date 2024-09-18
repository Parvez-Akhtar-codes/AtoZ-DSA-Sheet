public class ValidPalindrome {
    public static void main(String[] args) {
        String s="madam";
       System.out.println(StringPalindrome(0, s));
    }
    
        public static boolean StringPalindrome(int i , String s) {
            if(i>=s.length()/2) {
                return true;
            }
            if(s.charAt(i)!=s.charAt(s.length()-i-1)) {
                return false;
            }
            return StringPalindrome(i+1, s);
        }
            
      
  }

