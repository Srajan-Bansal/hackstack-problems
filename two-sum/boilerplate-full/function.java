
  import java.util.*;
  
  class Main {
      public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int size = scanner.nextInt();
scanner.nextLine(); // consume newline
        int[] nums = Arrays.stream(scanner.nextLine().trim().split("\\s+"))
                    .mapToInt(Integer::parseInt)
                    .toArray();
        int target = scanner.nextInt();
scanner.nextLine(); // consume newline
		Main m = new Main(); 
		Solution solution = m.new Solution();
		int[] result = solution.twoSum(size, nums, target);
		System.out.println(Arrays.toString(result));
		scanner.close();
      }

	  ##USER_CODE_HERE##
  }
      