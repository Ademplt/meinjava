package tag12_stringManipulation;

public class Algorithmus {
    public int[] intArr = { 16, 23, 14, 7, 21, 20, 6, 1, 17, 13, 1};
    public int[] func1() {
        int k;
        for (int i = 0; i < intArr.length - 1; i++) {
            if (intArr[i] < intArr[i + 1]) {
                continue;
            }
            k = intArr[i];
            intArr[i] = intArr[i + 1];
            intArr[i+1] = k;
          // func1();
        }
        return intArr;
    }
    public static void main(String[] args) {
        Algorithmus a = new Algorithmus();
        int[] Arr = a.func1();
        for (int i = 0; i < Arr.length; ++i) {
            System.out.println(i + 1 + ": " + Arr[i]);
        }
    }
}
