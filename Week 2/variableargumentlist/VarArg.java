package variableargumentlist;

public class VarArg {
	public static int sum(int... number) {
		int sum=0;
		for(int i=0;i<number.length;i++) {
			sum+=number[i];
		}
		return sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(sum(1));
		System.out.println(sum(1,2,3));
		System.out.println(sum(1,2,3,4));
		System.out.println(sum(1,3,5,6,8));
		System.out.println(sum(100,200,300,400,500,600,700,800));

	}

}
