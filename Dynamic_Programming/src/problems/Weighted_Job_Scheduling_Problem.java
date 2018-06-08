package problems;

public class Weighted_Job_Scheduling_Problem {
	
	static int weightedIntervalSchedulingDP(int[][] jobs) {
		int length = jobs.length;
		int[] start = new int[length];
		int[] end = new int[length];
		int[] endCopy = new int[length];
		int[] value = new int[length];
		for (int i = 0; i < length; i++) {
			start[i] = jobs[i][0];
			end[i] = jobs[i][1];
			endCopy[i] = jobs[i][1];
			value[i] = jobs[i][2];
		}
		int[] sortedOrder = sortAccordingToEndTime(endCopy);
		int[] memo = new int[end[sortedOrder[length-1]]];
		
		int currentIndex, previousIndex = 0, previousValue = 0;
		for (int i = 0; i < length; i++) {
			int startTime = start[sortedOrder[i]];
			int endTime = end[sortedOrder[i]];
			currentIndex = endTime;
			for (int j = previousIndex; j < currentIndex; j++) memo[j] = previousValue;
			previousIndex = currentIndex;
			previousValue = memo[startTime] + value[sortedOrder[i]];
		}
		for (int i = 0; i < memo.length; i++) System.out.println(i + " " + memo[i] + " ");
		
		return 2;
	}
	
	static int[] sortAccordingToEndTime(int[] end) {
		int counter = 0;
		int[] minimumArgument = new int[end.length];
		while (counter < end.length) {
			int minimumValue = Integer.MAX_VALUE, minimumArg = -1;
			for (int i = 0; i < end.length; i++) {
				if (end[i] < minimumValue) {
					minimumValue = end[i];
					minimumArg = i;
				}
			}
			end[minimumArg] = Integer.MAX_VALUE;
			minimumArgument[counter] = minimumArg;
			counter++;
		}
		return minimumArgument;
	}
	
}
