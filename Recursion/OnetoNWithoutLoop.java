class OnetoNWithoutLoop{
    public static void main(String[] args) {
        printNos(10);
    }
    static int count;
    public static void printNos(int N)
      {
          
          count++;
          System.out.print(count+" ");
          if(count==N)
          {
              return;
          }
          
          printNos(N);
      }
}