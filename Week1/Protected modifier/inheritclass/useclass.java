package inheritclass;
import protectedmodifier.firstclass; 
public class useclass extends firstclass{
	public useclass(int num) {
		super(num);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		useclass sec=new useclass(100);
		System.out.println(sec.getnumber());
		secondclass sec2=new secondclass(90);
		int nas=sec2.getnum();
		System.out.println(nas);
		

	}

}
