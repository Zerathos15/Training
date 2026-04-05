class Solution {
    public String countAndSay(int n) {
        // if (n == 0)
        //     return ("0");

        String str = "1";
        for (int i = 2; i <= n; i++) {
            String s = "";
            int count = 1;
            for (int j = 1; j < str.length(); j++) {
                char ch = str.charAt(j - 1);
                if (ch == str.charAt(j)) {
                    count++;
                } else if (ch != str.charAt(j)) {
                    s = s + Integer.toString(count) + ch;
                    count = 1;
                }
            }
            s = s + Integer.toString(count) + str.charAt(str.length() - 1);
            str = s;
        }
        return (str);
    }
}