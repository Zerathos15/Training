class Solution {
    public String truncateSentence(String s, int k) {
        String[] ans = new String[k];
        int i = 0;
        for (String word : s.split(" ")) {
            ans[i++] = word;
            if (i == k)
                break;
        }
        return String.join(" ", ans);
    }
}