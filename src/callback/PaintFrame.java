package callback;

//实现钩子函数
public class PaintFrame {
	public static void drowFrame(MyFrame f) {
		//MyFrame f 写的是父类对象,但是可以传递子类对象
		//模板方法模式
			System.out.println("启动进程");
			System.out.println("增加循环");
			System.out.println("查看消息栈");

		//画窗口
		f.paint(); 
		
		System.out.println("启动缓存，增加效率");
	}
	public static void main(String[] args) {
		drowFrame(new GameFrame02());
	}
}

class GameFrame01 extends MyFrame{
	public void paint() {
		System.out.println("GameFrame01.paint()");
		System.out.println("画窗口");
	}
}

class GameFrame02 extends MyFrame{
	public void paint() {
		System.out.println("GameFrame02.paint()");
	}
}











