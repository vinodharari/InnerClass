class OuterClass4
{
	static int rel = 500;
	static class InnerClass
	{
		public void display(){
			System.out.println("Inner Class "+rel);
		}
	}
}
public class Main4 {
	public static void main(String[] args){
		OuterClass4.InnerClass obj=new OuterClass4.InnerClass();
		obj.display();
	}
}
