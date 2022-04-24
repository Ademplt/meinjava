package replit3;

public class Q04_ArrSumme {
    public static void main(String[] args) {
        /*
        Write a method that accepts an array as parameter and returns sum off
        all elements in the array Then print the result in the main method.

      Eg :

      input : {1,2,3,4,5,6,7,8};

      output: 36
         */
        int arr[]= {1,2,3,4,5,6,7,8};
        int arrSummed = 0;
        elemanlariTopla(arr,arrSummed);

    }

   public static void elemanlariTopla(int[] arr, int arrSummed) {

       for (int j : arr) {
           arrSummed += j;

       }

   }
}
