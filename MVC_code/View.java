
public class View {

	public static void main(String args[])
	{
		//Student s = new Student();
		Service ob  = new Service();
		Controller obj = new Controller();
		ob.call( obj);
		System.out.println(obj.GetName());
		System.out.println(obj.Getmobile());
		System.out.println(obj.Getage());
	}
}
