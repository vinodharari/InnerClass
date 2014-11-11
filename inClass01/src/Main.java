class OuterClass {
	private int x=200;
	
	class InnerClass{
		private int ans;

		public void getValue(){
			display();
			System.out.println("Outer Class Value : " +x);
		}
		public void display(){
			System.out.println("Inner Class Display");
		}
	}
	
	public void display(){
		OuterClass.this.display();
		System.out.println("Outer Class Display");
	}
	
	public void accessInner(){
		InnerClass obj = new InnerClass();
		obj.ans=500;
		System.out.println("Inner Class Value : "+obj.ans);
	}
}

public class Main
{
	public static void main(String[] args){
		OuterClass outobj = new OuterClass();
		OuterClass.InnerClass inobj = outobj.new InnerClass();
		inobj.getValue();
	}
}


