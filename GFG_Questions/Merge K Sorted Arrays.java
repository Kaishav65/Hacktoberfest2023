class Solution
{
    public static ArrayList<Integer> mergeKArrays(int[][] arr,int K) 
    {
        ArrayList<Integer> arrayList = new  ArrayList<Integer>();
        for(int row=0; row<arr.length; row++) {
            for(int col=0; col<arr[row].length; col++) {
                arrayList.add(arr[row][col]);
            }
        }
        Collections.sort(arrayList);
        return arrayList;
    }
}
