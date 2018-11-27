package encodeSpreadSheet;

public class Solution {
	 public String encodeSpreadSheet(int n) {
		 if (n <= 0) {
			 return "";
		 }
		 if (n < 27) {
			 String str = Character.toString((char)(n + 'A' - 1));
			 return str;
		 }
		 String str = Character.toString((char)(n%26 + 'A' - 1));
		 return encodeSpreadSheet(n/26) + str;
	 }
}
