package toworkon;

public class DailyTemp {
    public static int[] dailyTemperatures(int[] T) {
        int n=T.length;
        int[] ans=new int[n];

        if (T.length==1) {
            ans[0]=0;
            return ans;
        }

        for (int i=n-1; i>0; i--) {
            if (T[i]>T[i-1]) {
                ans[i-1]=1;
            } else {
                // tbd
            }
        }

        if (T[1]>T[0]) {
            ans[0]=1;
        } else {
            // paste tbd lol
        }

        return ans;
    }

    public static void main(String[] args) {

        int[] test={73,74,75,71,69,72,76,73};
        for (int i: dailyTemperatures(test)) {
            System.out.print(i+" ");
        }

    }
}
