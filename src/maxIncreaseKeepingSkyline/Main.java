package maxIncreaseKeepingSkyline;

import java.util.*;
import java.lang.*;

public class Main {
	public static void main (String[] args) {
		int[][] grid = {{3,0,8,4},{2,4,5,7},{9,2,6,3},{0,3,1,0}};
		int result = new Solution().maxIncreaseKeepingSkyline(grid);
		System.out.println(result);
		// expected is 35
		// depends on input
	}
}
