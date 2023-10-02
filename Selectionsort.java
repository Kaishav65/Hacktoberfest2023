public class Main
{

	public static void main(String[] args) {
	    int arr[]={2,3,1,4,6,5};
	        for(int i=0;i<arr.length;i++){
            int currval=arr[i];
            int j=i-1;
            while(j>=0 && arr[j]>=currval){
                arr[j+1]=arr[j];
                j=j-1;
            }
            arr[j+1]=currval;
        }
    //displaying
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" "); //output: 1 2 3 4 5 6
        }
	}
}
