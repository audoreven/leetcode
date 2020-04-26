package money;

public class EMoreThanTwentyFive {
    public static int findSpecialInteger(int[] arr) {
        if (arr.length==1) {
            return arr[0];
        }
        int n=((arr.length+3)/4);
        int count=1;
        for (int i=1; i<arr.length; i++) {
            if (arr[i]==arr[i-1]) {
                count++;
                if (count>n) {
                    return arr[i];
                }
            } else {
                count=1;
            }

        }
        return 0;
    }

    public static void main(String[] args) {
        int[] test={1,2,2,6,6,6,6,7,10};
        System.out.println(findSpecialInteger(test));

    }
}
