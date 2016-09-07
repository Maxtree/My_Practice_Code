package myCollection;
/**
 * 模拟实现JDK中提供的ArrayList类 
 * @author Max
 *
 */
public class MyArrayList {
	/**
     * The value is used for Object storage.
     */
   Object[] value;

    /**
     * The size is the number of characters used.
     */
    int size;
    
    public MyArrayList(){
    		value = new Object[16];
    }
    //重载构造器
    public MyArrayList(int size){
    		value = new Object[size];
    }
    public void add(Object obj){
    		value[size] = obj;
    		size++;
    }
}
















