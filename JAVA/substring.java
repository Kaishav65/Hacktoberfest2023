package bitManipulation;

public class substring {

	public static void substring(String str) {
		for (int i = 0; i < str.length(); i++) {
			for (int j = i + 1; j <= str.length(); j++) {
				String temp = str.substring(i, j) + "";
				System.out.print(temp + ",");

			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "abbc";
		substring(str);
	}

}
