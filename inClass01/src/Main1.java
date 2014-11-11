class OuterClass1
{
	private int x=200;
	public void InnerClassMtd()
	{
		int rel=500;
		class InnerClass{
			private int ans;
			public void getValue(){
				System.out.println("Outer Class Value : "+x);
			}
		}
		new InnerClass().getValue();
	}
	public void display(){
		
	} 
}

public class Main1 {
	public static void main(String[] args){
		OuterClass1 obj=new OuterClass1();
		obj.InnerClassMtd();
	}

}
