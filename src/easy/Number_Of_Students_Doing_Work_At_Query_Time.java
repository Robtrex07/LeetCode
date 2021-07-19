package easy;

public class Number_Of_Students_Doing_Work_At_Query_Time {

	public static int busyStudent(int[] startTime, int[] endTime, int queryTime) {

		
		int count = 0;

		for (int i = 0; i < startTime.length; i++) {
			if (queryTime >= startTime[i] && queryTime <= endTime[i]) {
				count++;
			}

			
		}return count;

	}

	public static void main(String[] args) {

		int[] startTime = { 4 };
		int[] endTime = { 4 };
		int queryTime = 5;
		System.out.println(busyStudent(startTime, endTime, queryTime));
	}

}
