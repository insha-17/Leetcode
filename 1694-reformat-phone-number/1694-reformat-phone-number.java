class Solution {
    public String reformatNumber(String number) {
      StringBuilder digits = new StringBuilder();
        for (char ch : number.toCharArray()) {
            if (Character.isDigit(ch)) {
                digits.append(ch);
            }
        }

        StringBuilder res = new StringBuilder();
        int i = 0;
        int n = digits.length();

        // Step 2: grouping
        while (n - i > 4) {
            res.append(digits.substring(i, i + 3)).append("-");
            i += 3;
        }

        // Step 3: last cases
        if (n - i == 4) {
            res.append(digits.substring(i, i + 2)).append("-");
            res.append(digits.substring(i + 2, i + 4));
        } else {
            res.append(digits.substring(i));
        }

        return res.toString();  
    }
}