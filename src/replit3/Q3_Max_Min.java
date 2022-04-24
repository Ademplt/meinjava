package replit3;

public class Q3_Max_Min {
    public static void main(String[] args) {
        /*
        Write a method that accepts an integer array as input and
        prints the minimum and the maximum numbers from given array

        Input : {3,2,5,4,1,6}
        Output :
        min: 1
        max: 6
         */
        int arr[]={3,2,5,4,1,6};
        int max =arr[1];
        int min =arr[0];
        for (int each:arr) {
            if (each<min){
                min = each;
            }
            if (each>max){
                max = each;
            }

        }
        System.out.println(min);
        System.out.println(max);

    }
}
