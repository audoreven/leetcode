// https://leetcode.com/problems/median-of-two-sorted-arrays/
public class Median {
    public static void main(String[] args) {
        int[] nums1={1,2};
        int[] nums2={3,4};
        double ret=0;
        int tot=nums1.length+nums2.length;
        double[] merg=new double[tot];
        int p=0; int q=0;
        for (int i=0; i<tot; i++) {
            if (q<nums2.length && p<nums1.length) {
                merg[i]=Math.min(nums2[q], nums1[p]);
                if (nums2[q]<nums1[p]) {
                    q++;
                }else {
                    p++;
                }
            } else if (p==nums1.length) {
                merg[i]=nums2[q];
                q++;
            } else {
                merg[i]=nums1[p];
                p++;
            }
        }
        if (tot%2==0) {
            System.out.println(merg[tot/2]);
            System.out.println(merg[(tot-1)/2]);
            ret=(merg[tot/2]+merg[(tot-1)/2])/2;
        }else {
            ret=merg[(tot)/2];
        }
        for (int i=0; i<tot; i++) {
            System.out.print(merg[i]+" ");
        }
        System.out.println();
        System.out.println(ret);
    }
}
