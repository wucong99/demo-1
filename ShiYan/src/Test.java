
public class Test {
	
	public static void main(String[] args) throws InterruptedException {
		
//		int i = 18;
//	
//		long startTime = System.currentTimeMillis();
//	
//		long endTime = System.currentTimeMillis();
//		System.out.println("时间："+(endTime - startTime));
//		
	Solution solution = new Solution();
	System.out.println(solution.isHappy(1));
//		while (i!=1) {
//			int num = i/10;
//			int t = i%10;
//			i=num*num+t*t;
//			System.out.println();
//		}
//		System.out.println(i);
		
	}
}


class Solution {
    public boolean isHappy(int n) {
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

