package array;
/**
 * 数组的基本语法
 * @author Max
 *
 */
public class test02 {
	public static void main(String[] args) {
		//声明
		int[] a;
		//int b[];  
		//创建数组对象
		a = new int[14];
		//初始化(对数组元素的初始化)
		//默认初始化;数组元素相当于对象成员变量,默认值跟成员变量的规则一样.数字0,布尔false,char\u0000
		/*a[0] = 23;
		a[1] = 45;*/
		for (int i = 0; i < a.length; i++) {
			a[i] = i*12;
			System.out.println(a[i]);
		}
		int c[] = {23,43,56,78};
		System.out.println(c[0]);
		Car[] cars = {
				new Car("奔驰"),
				new Car("比亚迪"),
				new Car("宝马")
				};
		Car c2 = new Car("奔驰");
		System.out.println(c2 == cars[0]);
		
	}
}
