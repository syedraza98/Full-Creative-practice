package protectedmodifier;

public class protecteduse {
	private int num;
	protecteduse(int num){
		this.num=num;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method
		firstclass f=new firstclass(9);
		
		f.number=8;

		System.out.println(f.getnumber());
		protecteduse p=new protecteduse(9);
		System.out.println(p.num);
		secondclass1 sec=new secondclass1(90);
		sec.getnumber();

	}

}
