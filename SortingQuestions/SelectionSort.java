package SortingQuestions;

import java.util.Scanner;
//Selection Sorting time complexity = 0(n2)
// select index 0 and compare it to (n-1) index then swap with minimum holding index

public class SelectionSort {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];

        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        SelectionSorting(arr , n);
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static void SelectionSorting(int[] arr , int n){
        for(int i=0;i<=n-2;i++){
            int mini = i;
            for(int j=i;j<=n-1;j++){
                if(arr[j]<arr[mini]){
                    mini = j;
                }

            }
            int temp = arr[mini];
            arr[mini] = arr[i];
            arr[i]=temp;
        }

    }
    
}
