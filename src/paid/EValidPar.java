package paid; // https://leetcode.com/problems/valid-parentheses/

// 4/11

import java.util.*;

public class EValidPar {
    public static boolean isValid(String s) {
        if (s=="") {
            return true;
        }
        Stack<Character> q = new Stack<Character>();
        for (int i=0; i<s.length(); i++) {
            char ch=s.charAt(i);
            if (ch=='(' || ch=='{'  || ch=='[' ) {
                q.add(ch);
            }
            else if (!q.empty()) {
                if ((ch==')' && q.peek()=='(') || (ch==']' && q.peek()=='[') || (ch=='}' && q.peek()=='{')) {
                    q.pop();
                } else {
                    return false;
                }
            } else {
                return false;
            }
        }
        return q.empty();
    }

    public static void main(String[] args) {
        System.out.println(isValid("{}"));
    }

    /* OPTIMAL
    public boolean isValid(String s) {
	    Stack<Character> stack = new Stack<Character>();
	    for (char c : s.toCharArray()) {
		    if (c == '(')
		    	stack.push(')');
		    else if (c == '{')
			    stack.push('}');
		    else if (c == '[')
			    stack.push(']');
		    else if (stack.isEmpty() || stack.pop() != c)
			    return false;
	    }
	    return stack.isEmpty();
    }*/
}
