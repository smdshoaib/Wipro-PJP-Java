//CLASSES AND OBJECTS PROGRAM1 
class Box
{
	int length,width,depth;
	Box(int len,int wid,int dep)
	{
		this.length=len;
		this.width=wid;
		this.depth=dep;
	}
	int volume()
	{
		return length*width*depth;
	}
	public static void main(String args[])
	{
		Box b;
		b=new Box(10,20,30);
		System.out.println(b.volume());
	}
}