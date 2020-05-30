import java.util.Stack;

public class ValidParenthesis {
    public static void main(String[] args) {
        String str = "()()(({[]}))";
        System.out.println(validPara(str));
    }

    public static boolean validPara(String str) {
        //char[] strCharArr = str.toCharArray();
        Stack<Character> st = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            if(st.isEmpty()){
                st.push(str.charAt(i));
            }else {
                if((str.charAt(i) == ')' && st.peek() =='(') ||
                        (str.charAt(i) == '}' && st.peek() =='{') ||
                        (str.charAt(i) == ']' && st.peek() =='[')){
                    st.pop();
                }else{
                    st.push(str.charAt(i));
                }
            }
        }

        if (st.isEmpty()) {
            return true;
        } else {
            return false;
        }
    }
}
