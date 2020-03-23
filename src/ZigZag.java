// https://leetcode.com/problems/zigzag-conversion/

public class ZigZag {
    public static String convert(String s, int numRows) {
        if (numRows==1) {
            return s;
        }
        StringBuilder[] sb= new StringBuilder[numRows];
        for (int i=0; i<numRows; i++) {
            sb[i]=new StringBuilder();
        }
        int ind=0; boolean up=false;
        for (int i=0; i<s.length(); i++) {
            sb[ind].append(s.charAt(i));
            if (ind==0 || ind==numRows-1) {
                up=!up;
            }
            ind+=(up?1:-1);
        }
        String ans="";
        for (int i=0; i<numRows; i++) {
            ans+=sb[i];
        }
        return ans;
    }


    public static void main(String[] args) {
        String str="PAYPALISHIRING";
        System.out.println(convert(str, 3));
    }
}
