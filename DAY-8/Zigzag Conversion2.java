class Zigzag2 {
    static String convert_mat(String s, int numRows) {
        int n = s.length();
        char mat[][] = new char[numRows][n];

        boolean down = true;
        int row=0, col=0;

        for(int i=0; i<n; i++){
            mat[row][col]=s.charAt(i);
            if(down){
                if(row==numRows-1){
                    down=false;
                    row--;
                    col++;
                }
                else row++;
            }
            else{
                if(row==0){
                    down=true;
                    row++;
                }
                else{
                    row--;
                    col++;
                }
            }
        }

        StringBuilder sb = new StringBuilder();
        for(int i=0; i<numRows; i++){
            for(int j=0; j<n; j++){
                if(mat[i][j]!='\0'){
                    sb.append(mat[i][j]);
                }
            }
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        String s = "PAYPALISHIRING";
        int numRows = 3;
        String result = convert_mat(s, numRows);
        System.out.println(result); // Output: "PAHNAPLSIIGYIR"
    }
}
