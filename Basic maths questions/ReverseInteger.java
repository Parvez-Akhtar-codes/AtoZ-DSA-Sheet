class ReverseInteger{
    public static void main(String[] args){
        int reverse_number = revesre(-123);
        System.out.println(reverse_number);
    }
    public static int revesre(int x){
        boolean neg = false;
        if(x<0){
            neg=true;
            x=-x;
        }
        long revnum=0;
        while(x!=0){
            int rem=x%10;
            revnum = (revnum*10)+rem;
            x=x/10;
         
        }

        if(neg){
            revnum=-revnum;
        }
        if(revnum>Integer.MAX_VALUE || revnum<Integer.MIN_VALUE){
            return 0;
        }
       
        return (int)revnum;
    }
}