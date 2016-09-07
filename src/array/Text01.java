package array;
/*
 * 1.数组是相同数据类型(数据类型可以是任意类型)的有序集合
 * 2.数组也是对象.数组元素相当于对象的成员变量(详情请见内存图)
 * 3 .数组长度是确定的.如果越界,则报ArrayIndexOutOfBoundException
 */
public class Text01 {
	public static void main(String[] args) {
		int[] a = new int[3];
		a[0] = 23;
		a[1] = 28;
		a[2] = 44;
//		a[4] = 22;
		Car[] cars = new Car[10];
		cars	[0] = new Car("奔驰"); 
		cars[1] = new Car("比亚迪");
		System.out.println(cars[0].name);
		System.out.println(cars[1].name);
		System.out.println(a.length);
		System.out.println(cars.length);
		//length多用于循环遍历打印数组
	}
}













