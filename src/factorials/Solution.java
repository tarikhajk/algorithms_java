package factorials;

public class Solution {
	 public int factorials(int n) {
		 if (n <= 1) {
			 return n;
		 }
		 return n*factorials(n-1);
	 }
}
