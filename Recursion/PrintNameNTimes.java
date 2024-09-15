public class PrintNameNTimes {
    public static void main(String[] args) {
        printGfg(10);
    }
    static int count;
    static void printGfg(int N) {
        count++;
        System.out.print("GFG ");
        if(count==N){
            return;
        }
        printGfg(N);
    }
    
}
