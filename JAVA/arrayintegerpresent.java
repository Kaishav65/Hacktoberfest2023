public class arrayintegerpresent {
    

    public static void main(String[] args){
        int arr [] = {1,5,7,9,2,5};
            boolean flag = false;
            int num;
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter a number to find : ");
            num = sc.nextInt();
            for(int i: arr){
                if(i == num){
                    flag = true;
                    break;
                }
            }
            if(flag){
                System.out.print("Integer is Found");
            }
            else{
                System.out.print("Integer is not Found");
            }
    }


}
