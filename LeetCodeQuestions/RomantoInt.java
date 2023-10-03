public class RomantoInt {
    // leetcode 13
    public static void main(String[] args) {

    }

    class Solution {
        public int romanToInt(String s) {
            int result = 0;
            int n = s.length();

            for (int i = 0; i < n; i++) {
                char currentSymbol = s.charAt(i);
                int currentValue = getRomanValue(currentSymbol);

                if (i < n - 1) {
                    char nextSymbol = s.charAt(i + 1);
                    int nextValue = getRomanValue(nextSymbol);

                    if (currentValue < nextValue) {
                        result -= currentValue;
                    } else {
                        result += currentValue;
                    }
                } else {
                    result += currentValue;
                }
            }

            return result;
        }

        private int getRomanValue(char symbol) {
            if (symbol == 'I') {
                return 1;
            } else if (symbol == 'V') {
                return 5;
            } else if (symbol == 'X') {
                return 10;
            } else if (symbol == 'L') {
                return 50;
            } else if (symbol == 'C') {
                return 100;
            } else if (symbol == 'D') {
                return 500;
            } else if (symbol == 'M') {
                return 1000;
            } else {
                return 0;
            }
        }
    }
}
