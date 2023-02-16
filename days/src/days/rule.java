package days;
class rule {
	int maxspeed =60;

}
class selto extends rule{
	int maxspeed =170;
	void disp()
	{
		System.out.println("speed is"+super.maxspeed);
	}
}
class rule{
	public static void main(String[] args) {
		selto obj = new selto();
		obj.disp();
	}
}
