
public class Test {
	//114121122
	public static void main(String[] args) throws InterruptedException {
	Solution solution = new Solution();
	System.out.println(solution.isHappy(1));
		//123132
	}
}


class Solution {
    public boolean isHappy(int n) {
    	//adsfadsfasf
        boolean is = false;
    	while (n!=1) {
			int sum =0;
			for (int j = 0; j < String.valueOf(n).length(); j++) {
				sum+=Integer.parseInt(String.valueOf(String.valueOf(n).charAt(j)))*Integer.parseInt(String.valueOf(String.valueOf(n).charAt(j)));
			}
			n=sum;
			if(n==4) {
				return is;
			}
		}
    	is = true;
        return is;
    }

}

