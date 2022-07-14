package generics;

public class PairUseClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PairClass<Integer,Integer> p = new PairClass<>();
		p.setFirstValue(10);
		System.out.println(p.getFirstValue());
		System.out.println(p.getSecondValue());
		PairClass<Integer,String> p1 = new PairClass<>();
		p1.setFirstValue(001);
		p1.setSecondValue("Syed");
		System.out.println(p1.getFirstValue());
		System.out.println(p1.getSecondValue());

	}

}
