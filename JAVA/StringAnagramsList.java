public class StringAnagramsList {

    public static void main(String[] args) {
        String str = "cat tac atc dog god";
        String[] arr = str.trim().split(" ");

        HashMap<String, List<String>> hashMap = new HashMap<>();
        for (String item : arr) {
            String key = getSortedItem(item);
            List<String> listItems = hashMap.get(key);
            if (listItems == null) {
                listItems = new ArrayList<>();
            }
            listItems.add(item);
            hashMap.put(key, listItems);
        }
        System.out.println(new ArrayList<>(hashMap.values()));
    }

    private static String getSortedItem(String item) {
        char[] charArr = item.toLowerCase().toCharArray();
        char temp;
        for (int i = 0; i < charArr.length; i++) {
            for (int j = i + 1; j < charArr.length; j++) {
                if (charArr[j] < charArr[i]) {
                    temp = charArr[j];
                    charArr[j] = charArr[i];
                    charArr[i] = temp;
                }
            }
        }
        return String.valueOf(charArr);
    }
}
