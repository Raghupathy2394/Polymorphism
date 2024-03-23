
public class Load {
	void disp() {
		System.out.println("display");
	}
void disp(int a) {
	System.out.println(a);
}
void disp(int a ,double b) {
	System.out.println("a:"+a  +" b:" +b);
}
	public static void main(String[] args) {
		Load obj=new Load();
		obj.disp();
		obj.disp(9);
		obj.disp(7, 9000);
	}
}
