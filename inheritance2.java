// java program to show first days in the week using inheritance classes

class A extends B implements E{
	void printa() { //function name
		System.out.println("monday");
	}
	public void printe() {//function name
		 System.out.println("tuesday");
	}
}
class B extends C{
	void printb() { //function name
		System.out.println("wensday");
	}
}
class C extends D{
	void printc() { //function name
		System.out.println("thirsday");
	}
}
class D{
	void printd() { //function mname
		System.out.println("friday");
	}
}
interface E{
	void printe();
}


public class inheritance2 { //class name or main class
	public static void main(String[] args) {
        A mango = new A(); //mango is object name
	// calling function	
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
