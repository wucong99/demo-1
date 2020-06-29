import java.util.Arrays;

/**
 * 魔术索引
 * @author Administrator
 *
 */
public class Test7 {
	public static void main(String[] args) {
		Sn sn = new Sn();
		System.out.println(sn.findMagicIndex(new int[] {1,2,3,3}));
	}
}

class Sn {
	 public int findMagicIndex(int[] nums) {
	        return recursive(0, nums.length-1, nums);
	    }
	    /**
	     * 解题思路：
	     * 1、二分法查找下标等于对应下标值的数据，时间复杂度理论上是O(logn)
	     * @param left 左
	     * @param right 右
	     * @param nums 数组
	     * @return mid
	     */
	    private static int recursive(int left, int right, int[] nums){
	        if(left <= right){

	            int mid = (left + right) >> 1;

	            int l = recursive(left, mid - 1, nums);
	           
	            if(l > -1){
	                return l;
	            }
	            if(mid == nums[mid]){
	                return mid;
	            }
	            int r = recursive(mid + 1, right, nums);
	            if(r > -1){
	                return r;
	            }
	        }
	        System.out.println("sdf");
	        return -1;
	    }

}