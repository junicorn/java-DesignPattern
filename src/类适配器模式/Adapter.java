package 类适配器模式;
/**
 * 有一个Source类，拥有一个方法，待适配，目标接口时Targetable，通过Adapter类，将Source的功能扩展到Targetable里
 * @author jinhang
 *
 */
public class Adapter extends Source implements Targetable{

	@Override
	public void method2() {
		 System.out.println("this is the targetable method!");  
	}

}
