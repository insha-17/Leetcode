class Solution {
    public boolean validDigit(int n, int x) {
        char ch= (char)(x+'0');
        String num=String.valueOf(n);
        if((num.charAt(0)!=ch) && num.contains(String.valueOf(ch)))return true;
        else return false;
    }
}