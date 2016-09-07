package stringbuilder;
/**
 * 测试可变字符序列.StringBuilder(线程不安全,效率高),StringBuffer(线程安全,效率低)
 * 一般使用前一个
 * String:不可变字符序列
 * 面试官如果问:String不可变数组,而StringBuilder是可变数组.则可展开内存分析加动态数组扩容.
 * @author Max
 *
 */
public class test01 {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("abcdefghijklmnopqrstuvwxyz");// 字符初始长度是16
//		StringBuilder sb2 = new StringBuilder(32);// 字符初始长度是32
//		StringBuilder sb3 = new StringBuilder("abcd");// 字符初始长度是32,value[]={'a','b','c','d',\u0000,\u0000,......}
//		sb3.append("efg");//append添加的意思,是stringbuilder最常用的方法
//		System.out.println(sb3);
//		sb2.append("true" + sb3).append(123).append("你好");//通过retune this实现方法链
//		System.out.println(sb2);
		sb.delete(3, 5).delete(3, 5).delete(3, 5).delete(3, 5).insert(0, 3333).reverse();
		System.out.println(sb);
	}  
}


















