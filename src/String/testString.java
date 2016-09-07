package String;
/**
 * 测试字符不可变字符序列
 * 三个作业:
 * 1.练习String类的常用方法
 * 2.结合数组查看源码
 * 3.提高:按照老师的方法将String类中的
 * @author Max
 *
 */
public class testString {
	public static void main(String[] args) {
		String str1 = new String("abcd");
		String str2 = new String("abcd");
		System.out.println(str1.charAt(2));
		System.out.println(str2.equals(str1));
		System.out.println(str2 == str1);
		
		String str3 = "defe";  
		String str4 = "def";
		System.out.println(str3.equals(str4));
		System.out.println(str3 == str4);
		System.out.println(str3.indexOf('y'));
		//substring 从前截取留后面的字符
		//String s = str3.substring(1);
		//System.out.println(s);
		String str5 =  str3.replace('e','i');
		System.out.println(str5);
		String str6 = "abcde,rrtt,ccee";
		String[] strArray = str6.split(",");
		for (int i = 0; i < strArray.length; i++) {
			System.out.println(strArray[i]);
		}
		String str7 ="  aa  bb ";
		String str8 = str7.trim();//去除首尾空格
		System.out.println(str8 .length());
		System.out.println("ABC".equalsIgnoreCase("abc"));
		System.out.println("Abcbd".indexOf('b'));
		System.out.println("Abcbd".lastIndexOf('b'));
		System.out.println("ABC".startsWith("AB"));
		
		System.out.println("##################");
		String gh = "a";
		for (int i = 0; i < 1000; i++) {
			gh += i;
		}
		System.out.println(gh);
		//  这种方法的弊端在于使用对象太多
		//	常用StringBuilder进行优化
		System.out.println("##################");
		//数组扩容,建立新数组,然后将老数组回收掉
		StringBuilder ph = new StringBuilder("a");
		for (int i = 0; i < 1000; i++) {
			ph.append(i);
		}
		System.out.println(ph);
	}
}













