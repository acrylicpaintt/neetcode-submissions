class Solution {
    public boolean isValid(String s) {
        Stack<String> st = new Stack<>();
        for (int i = 0 ; i < s.length(); i ++) {
            String curr = s.substring(i, i+1);
            if ("({[".contains(curr)) {
                st.push(s.substring(i, i + 1 ));
            }
            else {
                if (st.empty()) {
                    return false;
                }
                if (curr.equals(")")){
                    if (st.peek().equals("(")) {
                        st.pop();
                    } else {
                        return false;
                    }
                }
                else if (curr.equals("}")){
                    if (st.peek().equals("{")) {
                        st.pop();
                    } else {
                        return false;
                    }
                }
                else if (curr.equals("]")){
                    if (st.peek().equals("[")) {
                        st.pop();
                    } else {
                        return false;
                    }
                }
            }
        }
        return st.empty();
    }
}
