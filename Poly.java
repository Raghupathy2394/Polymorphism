


	
	//method overloading//
/*			void display(int a,int b) { 
		if(a>b){
			System.out.println(a);
		}
		else {
			System.out.println(b);
		}}
		void display(int a, int b,int c)
		{
			System.out.println(c);
		}
		
	Poly obj=new Poly();
	obj.display(6,5);
	obj.display(4,5,6);
}}
	*/
//method overriding
class parent{
	void show() {
		System.out.println("parent");
	}}
class Child extends parent{
	void show()
	{
		System.out.println("child");
	}}
public class Poly
{	
	public static void main(String[] args)
	{
		Child c = new Child();
		c.show();
	}}


	