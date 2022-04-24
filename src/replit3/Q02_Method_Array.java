package replit3;

public class Q02_Method_Array {
    public static void main(String[] args) {
        /*
        Write a java program that calculates the average value of array elements

       input[]= {1,2,3,4,5,6,7}

       Output : 4
         */
        int arr[]={1,2,3,4,5,6,7};
        int average=0;
        int summed=0;
        for (int each:arr) {
            summed+=each;
            average= summed/(arr.length);

        }
        System.out.println(average);
    }
}
