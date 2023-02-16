package days;

class rule2 {
	int maxspeed =60;

}
class sel extends rule2{
	int maxspeed =170;
	void disp()
	{
		System.out.println("speed is"+super.maxspeed);
	}
	public static class nashik_rule{
	public static void main(String[] args) {
		sel obj = new sel();
		obj.disp();
	}
}
}
