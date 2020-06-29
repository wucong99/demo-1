import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Test2 {
	
	public static void main(String[] args) {
		s ss = new s();
		int[] nums= {2, 7, 11, 15};
		int target = 13;
		System.out.println(Arrays.toString(ss.twoSum(nums, target))  );
		
		
	}
}

class s {
   
	 public int[] twoSum(int[] nums, int target) {

         Map<Integer, Integer> map = new HashMap<>();
         System.out.println(map.toString());
        for (int i = 0; i < nums.length; i++) {
        	 System.out.println(target - nums[i]);
            if (map.containsKey(target - nums[i])) {
                return new int[]{map.get(target - nums[i]),i};
            }

            map.put(nums[i], i);
        }

        throw new IllegalArgumentException();
	    }
}
