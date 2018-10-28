package A2;
import java.util.Arrays;

public class GreedyTester {
	
	public static void main(String[] args) {
		
		//This is the typical kind of input you will be tested with. The format will always be the same
				//Each index represents a single homework. For example, homework zero has weight 23 and deadline t=3.
				int[] weights = new int[] {23, 60, 14, 25, 7}; 
				int[] deadlines = new int[] {3, 1, 2, 1, 3};
				int m = weights.length;
				
				//This is the declaration of a schedule of the appropriate size
				HW_Sched schedule =  new HW_Sched(weights, deadlines, m);
				
				//This call organizes the assignments and outputs homeworkPlan
				int[] res = schedule.SelectAssignments();
				System.out.println("Should be: \n[3, 1, 2, 0, 0]");
				System.out.println("Actually: \n" + Arrays.toString(res));
				boolean test1 = true;
				int[] result1 = new int[] {3, 1, 2, 0, 0};

				for (int i = 0; i < 5; i++) {
				if (res[i] != result1[i]) {
				test1 = false;
				}
				}
				System.out.println("Test 1:" + test1);

				int[] weights2 = new int[] {23, 5, 14, 25, 7, 10, 40, 55, 12}; 
				int[] deadlines2 = new int[] {3, 1, 2, 1, 3, 4, 5, 4, 6};
				int m2 = weights2.length;

				//This is the declaration of a schedule of the appropriate size
				HW_Sched schedule2 = new HW_Sched(weights2, deadlines2, m2);

				//This call organizes the assignments and outputs homeworkPlan
				int[] res2 = schedule2.SelectAssignments();

				boolean test2 = true;
				int[] result2 = new int[] {3, 0, 2, 1, 0, 0, 5, 4, 6};

				for (int i = 0; i < 9; i++) {
				if (res2[i] != result2[i]) {
				test2 = false;
				}
				}
				System.out.println("Test 2:" + test2);

				int[] weights3 = new int[] {23, 5, 14, 25, 7, 10, 40, 55, 12, 32, 78}; 
				int[] deadlines3 = new int[] {3, 1, 2, 5, 3, 6, 4, 1, 3, 2, 1};
				int m3 = weights3.length;

				//This is the declaration of a schedule of the appropriate size
				HW_Sched schedule3 = new HW_Sched(weights3, deadlines3, m3);

				//This call organizes the assignments and outputs homeworkPlan
				int[] res3 = schedule3.SelectAssignments();

				boolean test3 = true;
				int[] result3 = new int[] {3, 0, 0, 5, 0, 6, 4, 0, 0, 2, 1};

				for (int i = 0; i < 9; i++) {
				if (res3[i] != result3[i]) {
				test3 = false;
				}
				}
				System.out.println("Test 3:" + test3);
				
				//custom test: TEST 4
				int[] weights4 = new int[] {5, 10, 14, 80, 75, 10, 40, 55, 10, 5, 5}; 
				int[] deadlines4 = new int[] {4, 1, 2, 3, 3, 6, 4, 5, 3, 2, 1};
				int m4 = weights4.length;

				//This is the declaration of a schedule of the appropriate size
				HW_Sched schedule4 = new HW_Sched(weights4, deadlines4, m4);

				//This call organizes the assignments and outputs homeworkPlan
				int[] res4 = schedule4.SelectAssignments();

				boolean test4 = true;
				int[] result4 = new int[] {0, 0, 1, 3, 2, 6, 4, 5, 0, 0, 0};

				String curRes = "";
				for (int i = 0; i < result4.length; i++) {
					curRes += " "+res4[i];
				if (res4[i] != result4[i]) {
					
				test4 = false;
				}
				}
				System.out.println("Test 3:" + test4);
				System.out.println("Current Plan: " + curRes);
	}		
}
