
public class Controller  {
	Student str  = new Student();
	
	public  void  Name(String name)
	{
	str.setName(name);
	}
	public void  Mobile(int mobil)
	{
	str.setmobile(mobil);
	}
	public void  Age(int age)
	{
	str.setage(age);
	}
	public  String GetName()
	{
	return(str.getName());
	}
	public int Getmobile()
	{
	return (str.getmobile());
	}
	public int Getage()
	{
	return (str.getage()) ;
	}
}
