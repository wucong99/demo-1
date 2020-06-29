import java.util.HashMap;
import java.util.Map;
/**
 * 稀疏数组目标值
 * @author Administrator
 *
 */
public class Test6 {
	public static void main(String[] args) {
		Sos s = new Sos();
		String[] wStrings = new String[] {"at", "", "", "", "ball", "", "", "car", "", "","dad", "", ""};
	System.out.println(s.findString(wStrings, "bal"));
	
		
	}
}

class Sos {
    public int findString(String[] words, String s) {
    	//使用二分
    	//定义左 右 中
    	/**
    	 * 
    	 * 方法一
    	 * 
    	 */
	Map<String, Integer> map = new HashMap<String, Integer>();
    	for (int i = 0; i < words.length; i++) {
			if(map.containsKey(s)) {
				int t = map.get(s);
				return t;
			}
    		if(words[i]!="") {
				map.put(words[i], i);
			}
		}
    	int i = 0;
    	try {
    		 i = map.get(s);
    	}catch (Exception e) {
			return -1;
		}
    	return i;
    }
}
