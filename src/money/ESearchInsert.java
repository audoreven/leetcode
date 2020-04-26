package money;

public class ESearchInsert {
    public static int searchInsert(int[] nums, int target) {
        for (int i=0; i<nums.length; i++) {
            if (nums[i]>=target)  {
                return i;
            }
        }
        return nums.length;
    }

    public static void main(String[] args) {
        int[] hi={};
        System.out.println(searchInsert(hi, 2));
    }
}
