package maxIncreaseKeepingSkyline;

public class Solution {
	 public int maxIncreaseKeepingSkyline(int[][] grid) {
	        int current = 0;
	        int sum = 0;
	        int[] col_max = new int[grid.length];
	        int[] row_max = new int[grid.length];
	        
	        for (int i = 0; i < grid.length; i++) {
	            for (int j = 0; j < grid.length; j++) {
	                current = grid[i][j];
	                col_max[i] = Math.max(col_max[i], current);
	                row_max[j] = Math.max(row_max[j], current);
	            }
	        }
	        
	        for (int i = 0; i < grid.length; i++) {
	            for (int j = 0; j < grid.length; j++) {
	                sum += Math.min(col_max[i], row_max[j]) - grid[i][j];
	            }
	        }
	        return sum;  
	 }
}
