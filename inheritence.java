
class A  {
void get(){
System.out.println("hey");}
        }
class B extends C{//class A extends class B
void show(){

System.out.println("go there");}//output
}
class C extends D{//class B extends C
void display(){
System.out.println("welcome to mr muhorwa");}
}
class D{//class C extends D
void like(){
System.out.println("its location");}
}
interface E{
void printE();
}
 
 


    



/**
 * inheritence
 */
public class inheritence {

public static void main(String[] args) {
A hec = new A();
B bar = new B();
C mn = new C();
D rh = new D();


hec.get();
bar.show();
mn.display();
rh.like();
}
}