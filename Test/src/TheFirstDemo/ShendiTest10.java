package TheFirstDemo;

import java.io.File;
import java.io.FileFilter;
import java.util.Scanner;

import org.junit.Test;

public class ShendiTest10 {
	
	public static void main(String[] args) {
		File file = new File("C:\\Users\\Administrator\\Desktop\\一季度题库");
		File[] targetFileList = file.listFiles(new FileFilter() {
			@Override
			public boolean accept(File pathname) {
				return pathname.isFile()&&pathname.getName().endsWith(".docx");
			}
		});
		if(targetFileList != null) 
			for (File targetFile : targetFileList) {
				System.out.println(targetFile.getName());
			}
	}
	@Test
	public void testhuizhi() {
		/*Scanner scan = new Scanner(System.in);
		String scanIn = scan.nextLine();*/
		
		String str = "abceeeabcddabcggggge!";
		char[] arr = str.substring(0, str.indexOf("!")).toCharArray();//转为数组存储
		int len = arr.length;//数组长度
		
		int index = 0;//最长字符串在arr中的位置
		int max = 0;//长度
		
		//最长子串的长度，下标
		int length = 1;
		int i = 0;
		int start = 0;
		
		while(i<len-1) {
			if(arr[i] == arr[i+1]) {
				i++;
				length++;
			}else {
				//如果不相等就结束了连续相同的判断，进入长度比较
				if(length > max) {
					max = length;
					index = start;
				}
				
				i++;
				start = i;
				length = 1;
			}
		}
		if(max == 1)
			System.out.println("无效字符串");
		else
			System.out.println(str.substring(index, index+max));
	}
	
	@Test
	public void testSum() {
		System.err.println( sum(100));
	}
	
	public int sum(int a) {
		if(a>1)
			return a+sum(a-1);
		else
			return a;
	}
	
	
	
}
