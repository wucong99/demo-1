/**
 * 给定一个排序数组和一个目标值，在数组中找到目标值，
 * 并返回其索引。如果目标值不存在于数组中，
 * 返回它将会被按顺序插入的位置。
	你可以假设数组中无重复元素。
 * @author Administrator
 *
 */
public class Test3 {

}

class ss {
    public int searchInsert(int[] nums, int target) {
    	//定义数组
    	int[] num = new int[1];
    	boolean result = false;
    	int index = -1;
    	//变量换中
    	for (int i = 0; i < nums.length; i++) {
			if(nums[i]==target) {
				return num[0] = i;
			} 
			if(num[i]>target) {
				index = i;
				break;
			}
		}
    	
    	if(index == -1) {
			index = nums.length;
		}

    	return index-1;
    }
}