class Solution {
    public String decodeCiphertext(String encodedText, int rows) {

        if(rows==1)return encodedText;
        //column number tells how the cols and row num are used for appendment
        int cols=encodedText.length()/rows;

        StringBuilder sb =new StringBuilder();
        //a for loop for all the cols like two pointers 
        for(int c=0;c<cols;c++){
            int r=0;
            int currCol=c;
            while(r<rows && currCol<cols){
                sb.append(encodedText.charAt(r*cols +currCol));
                //this formula tells how the original text takes the char from the matrix
                r++;
                currCol++;
            }
        }
        //remove trailing zeroes...by trimming from behind
        int end=sb.length()-1;
        while(end>=0 && sb.charAt(end)==' '){
            end--;
        }
        return sb.substring(0,end+1);
    }
}