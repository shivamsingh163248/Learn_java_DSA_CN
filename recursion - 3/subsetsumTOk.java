
public class subsetsumTOk {

	public static int[][] subsetsSumKHelper(int[] input, int beginIndex, int k) {
		if (beginIndex == input.length) {
			if (k == 0) {
				return new int[1][0];
			} else {
				return new int[0][0];
			}
		}
		int[][] smallOutput1 = subsetsSumKHelper(input, beginIndex + 1, k);
		int[][] smallOutput2 = subsetsSumKHelper(input, beginIndex + 1, k - input[beginIndex]);
		int[][] output = new int[smallOutput1.length + smallOutput2.length][];
		int index = 0;
		for (int i = 0; i < smallOutput1.length; i++) {
			output[index++] = smallOutput1[i];
		}
		for (int i = 0; i < smallOutput2.length; i++) {
			output[index] = new int[smallOutput2[i].length + 1];
			output[index][0] = input[beginIndex];
			for (int j = 0; j < smallOutput2[i].length; j++) {
				output[index][j + 1] = smallOutput2[i][j];
			}
			index++;
		}
		return output;
	}

	public static int[][] subsetsSumK(int input[], int k) {
		return subsetsSumKHelper(input, 0, k);
	}

	
		public static int[][] subsetsHelper(int[] input, int startIndex) {
			if (startIndex == input.length) {
				int[][] output = new int[1][0];
				return output;
			}
			int[][] smallerOutput = subsetsHelper(input, startIndex + 1);
			int[][] output = new int[2 * smallerOutput.length][];
			int k = 0;
			for (int i = 0; i < smallerOutput.length; i++) {
				output[k] = new int[smallerOutput[i].length];
				for (int j = 0; j < smallerOutput[i].length; j++) {
					output[k][j] = smallerOutput[i][j];
				}
				k++;
			}
			for (int i = 0; i < smallerOutput.length; i++) {
				output[k] = new int[smallerOutput[i].length + 1];
				output[k][0] = input[startIndex];
				for (int j = 1; j <= smallerOutput[i].length; j++) {
					output[k][j] = smallerOutput[i][j - 1];
				}
				k++;
			}
			return output;
		}

		public static int[][] subsets(int input[]) {
			return subsetsHelper(input, 0);
		}
	}

