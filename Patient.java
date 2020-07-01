//CLASSES AND OBJECTS PROGRAM3
class Patient
{
	String patientName;
	double weight,height;
	Patient(String name,double w,double h)
	{
		this.patientName=name;
		this.weight=w;
		this.height=h;
	}
	double computeBMI()
	{
		double res=weight/(height*height);
		return res;
	}
	public static void main(String args[])
	{	
		Patient obj=new Patient("rahul",72.57,1.78);
		System.out.println(obj.computeBMI());
	}
}