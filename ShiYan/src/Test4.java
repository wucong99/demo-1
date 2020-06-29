import java.util.Random;

/**
 * 给定两个字符串 s 和 t，它们只包含小写字母。

字符串 t 由字符串 s 随机重排，然后在随机位置添加一个字母。

请找出在 t 中被添加的字母。
 * @author Administrator
 *
 */
public class Test4 {

	public static void main(String[] args) {
		sss s=new sss();
		System.out.println(s.findTheDifference("abc", "abcd"));
	}
}

class sss {
    public char findTheDifference(String s, String t) {
    	//将s字符串转换为字符数组
    	 char[] ss = s.toCharArray();
//    	char[] tt = t.toCharArray();
//    	char c = 'a';
//		    if(s.equals("")) {
//		    	return t.charAt(0);
//		    }
		    
		   
		    
		    for (int i = 0; i < ss.length; i++) {
		    	// t = t.replace(,"" ) ;
		    	 t = t.replaceFirst(String.valueOf(ss[i]), "");
			}
		    //System.out.println(t);
    	
    	return t.charAt(0);
    }
}
