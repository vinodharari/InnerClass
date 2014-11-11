class OuterClass3{
	public void display(){
		System.out.println("Outer Class");
	}
}

class InnerClass{
	OuterClass obj = new OuterClass(){
		public void display(){
			System.out.println("Anonymous Class");
			display1();
		}
		public void display1(){
			System.out.println("Extra Class");
		}
	};
}
public class Main3 {
	public static void main(String[] args){
		InnerClass myobj = new InnerClass();
		myobj.obj.display();
	}
}
