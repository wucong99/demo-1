/**
 * 给定一个Excel表格中的列名称，返回其相应的列序号。
 * @author Administrator
 *
 */
public class Test5 {
	public static void main(String[] args) {
		so s = new so();
		System.out.println(s.titleToNumber("GWW"));
	}
}

class so {
    public int titleToNumber(String s) {
    	
    	/**
    	 * 根据ascll计算 26个英文字母
    	 *   A -> 1
    		B -> 2
    		C -> 3
    	 */
    	int sum = 0;  //用于存储计算的值
    	int tt = 0;
    	for (int i = 0; i < s.length(); i++) {
    		sum = s.charAt(i)-'A';
    		
			tt =tt*26+sum;  //第一个数为1次方，第二数为2次方
    	}
    	
    	
         return tt;
    }
}