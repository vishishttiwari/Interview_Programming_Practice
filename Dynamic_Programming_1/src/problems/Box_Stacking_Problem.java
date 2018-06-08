package problems;
/*
 * What I did not realize in this question was that there are multiple instances of the same box. 
 * Then it was pretty easy. Otherwise it would have been very hard if only one box of each type was available.
 * 
 * 
 * 
 * Dynamic Programming | Set 22 (Box Stacking Problem)
 * You are given a set of n types of rectangular 3-D boxes, where the i^th box has height h(i), width w(i) and depth d(i) (all real numbers). 
 * You want to create a stack of boxes which is as tall as possible, but you can only stack a box on top of another box if the dimensions of the 
 * 2-D base of the lower box are each strictly larger than those of the 2-D base of the higher box. Of course, you can rotate a box so that any 
 * side functions as its base. It is also allowable to use multiple instances of the same type of box.
 */

public class Box_Stacking_Problem {
	
	static int stackedBoxes(int[] arr) {
		int[][] boxes = new int[arr.length/3][3];
		for (int i = 0; i < arr.length/3; i++) {
			for (int j = 0; j < 3; j++) {
				boxes[i][j] = arr[i * 3 + j];
			}
		}
		int[][] permeutations = getAllPermeutation(boxes);
		
		int[] memo = new int[permeutations.length];
		int maximum = 0;
		memo[0] = permeutations[0][0];
		for (int i = 1; i < memo.length; i++) {
			for (int j = 0; j < i; j++) {
				if (((permeutations[i][1] < permeutations[j][1]) && (permeutations[i][2] < permeutations[j][2])) || 
						((permeutations[i][1] < permeutations[j][2]) && (permeutations[i][2] < permeutations[j][1		]))) {
					memo[i] = Math.max(memo[i], memo[j] + permeutations[i][0]);
					maximum = Math.max(maximum, memo[i]);
				}
			}
		}
		return maximum;
	}
	
	static int[][] getAllPermeutation(int[][] boxes) {
		int[][] permeutations = new int[boxes.length * 3][3];
		for (int i = 0; i < boxes.length; i++) {
			permeutations[i * 3 + 0][0] = boxes[i][0];
			permeutations[i * 3 + 0][1] = boxes[i][1];
			permeutations[i * 3 + 0][2] = boxes[i][2];
			
			permeutations[i * 3 + 1][0] = boxes[i][2];
			permeutations[i * 3 + 1][1] = boxes[i][0];
			permeutations[i * 3 + 1][2] = boxes[i][1];
			
			permeutations[i * 3 + 2][0] = boxes[i][1];
			permeutations[i * 3 + 2][1] = boxes[i][2];
			permeutations[i * 3 + 2][2] = boxes[i][0];
		}
		for (int i = 0; i < permeutations.length; i++) {
			for (int j = 0; j < permeutations.length - 1; j++) {
				if (permeutations[j][1] * permeutations[j][2] < permeutations[j + 1][1] * permeutations[j + 1][2]) {
					int[] temp = permeutations[j];
					permeutations[j] = permeutations[j+1];
					permeutations[j+1] = temp;
				}
			}
		}
		return permeutations;
	}
}
