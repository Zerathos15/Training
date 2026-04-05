public class ZigZag {
    static String zigzag(String s, int numRows) {
        if(numRows == 1) return s;

        StringBuilder[] rows = new StringBuilder[numRows];

        for(int i = 0; i < numRows; i++) {
            rows[i] = new StringBuilder();
        }

        boolean flag=false;
        int row=0;
        for(int i=0; i<s.length(); i++){
            rows[row].append(s.charAt(i));

            if(row==0 || row==numRows-1) flag=!flag;

            if(flag) row++;
            else row--;
        }

        StringBuilder result = new StringBuilder();
        for(StringBuilder sb : rows) {
            result.append(sb);
        }

        return result.toString();
    }

    public static void main(String[] args) {
        String s = "PAYPALISHIRING";
        int numRows = 3;
        String result = zigzag(s, numRows);
        System.out.println(result); // Output: "PAHNAPLSIIGYIR"
    }
}
