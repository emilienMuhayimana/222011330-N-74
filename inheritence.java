// this program will display diffrence messages by using java inheritance
class A  {
void get(){ //this the method
System.out.println("hey");}
        }
class B extends C{//class B extends class C
void show(){ //method

System.out.println("go there");}// this is output
}
class C extends D{//class C extends D
void display(){ //method
System.out.println("welcome to mr muhorwa");} // this is the output
}
class D{
void like(){ //method
System.out.println("its location");} //this is output
}
interface E{ // this the interface
void printE();
}
 
 


    



/**
 * inheritence
 */
public class inheritence { //this is the class name or main class

public static void main(String[] args) {
A hec = new A(); // hec is object name
B bar = new B(); //bar is object name
C mn = new C(); //mn is object name
D rh = new D(); //rh is object name

// calling method
hec.get();
bar.show();
mn.display();
rh.like();
}
}
