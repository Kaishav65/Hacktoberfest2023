class Solution {
    public static List<String> letterCombinations(String digits) {
        if (Objects.equals(digits, "")){
            return new ArrayList<>();
        }
        return subset("" , digits);
    }
    public static List<String> subset(String p , String u) {
        if (u.isEmpty()) {
            List<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        int[] nums = {2, 3, 4, 5, 6, 7, 8, 9};
        String word = "";
        String[] values = {"abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        for (int i = 0; i < nums.length; i++) {
            if (u.charAt(0) - '0' == nums[i]) {
                word = values[i];
                break;
            }
        }
        List<String> ans = new ArrayList<>();
        for (int i = 0; i < word.length(); i++) {
            ans.addAll(subset(p + word.charAt(i), u.substring(1)));
        }
        return ans;
}
}
