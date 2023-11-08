// java program to show first daysnth using classes

class A extends B implements E{
	void printa() {
		System.out.println("monday");
	}
	public void printe() {
		 System.out.println("tuesday");
	}
}
class B extends C{
	void printb() {
		System.out.println("wensday");
	}
}
class C extends D{
	void printc() {
		System.out.println("thirsday");
	}
}
class D{
	void printd() {
		System.out.println("friday");
	}
}
interface E{
	void printe();
}


public class inheritance2 {
	public static void main(String[] args) {
        A mango = new A();
        mango.printa();
        mango.printb();
        mango.printc(); 
        mango.printd();
        mango.printe();
	}

}
/*
 * 
output

//monday
//tueaday
//wenaday
thirsday
//friday
 */
