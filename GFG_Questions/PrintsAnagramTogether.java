import java.io.*;
import java.util.*;

class PrintsAnagramTogether {
     public static void main(String[] args) throws IOException {
          BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

          int t = Integer.parseInt(br.readLine().trim());
          while (t > 0) {
               int n = Integer.parseInt(br.readLine().trim());
               String x = br.readLine().trim();
               String string_list[] = x.split(" ", n);

               Solution ob = new Solution();

               List<List<String>> ans = ob.Anagrams(string_list);

               Collections.sort(ans, new Comparator<List<String>>() {
                    public int compare(List<String> l1, List<String> l2) {
                         String s1 = l1.get(0);
                         String s2 = l2.get(0);

                         return s1.compareTo(s2);
                    }
               });

               for (int i = 0; i < ans.size(); i++) {
                    for (int j = 0; j < ans.get(i).size(); j++) {
                         System.out.print(ans.get(i).get(j) + " ");
                    }
                    System.out.println();
               }

               t--;
          }
     }

}

class Solution {
     public List<List<String>> Anagrams(String[] string_list) {
          Map<String, ArrayList<String>> hm = new HashMap<>();
          for (String s : string_list) {
               char[] str = s.toCharArray();
               Arrays.sort(str);
               String sorted = new String(str);
               if (!hm.containsKey(sorted)) {
                    hm.put(sorted, new ArrayList<String>());
               }
               hm.get(sorted).add(s);

          }

          Collection<ArrayList<String>> values = hm.values();
          // ArrayList<ArrayList<String>> v=new ArrayList<>(values);
          return new ArrayList<List<String>>(values);

     }
}
