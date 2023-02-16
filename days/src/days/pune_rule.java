package days;

class rules1
{
	int maxxspeed=60;
}

class tata extends rules1
{
	int maxxspeed=123;
	void disp()
	{
		System.out.println("spedd is "+super.maxxspeed);
	}
}


public class pune_rule {

	public static void main(String[] args) {
		tata obj=new tata();
		obj.disp();

	}

}
