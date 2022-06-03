package GetterSetter;

public class Student2 {
		private int sum;
		static int count;
		private boolean isnegative(int a,int b) {
			if(a>0 && b>0) {
				return true;
			}
			else {
				return false;
			}
		}
		public int add(int a,int b) {
			if(isnegative(a,b)) {
				sum=a+b;
				return sum;
			}
			
			return -1;
		}
		public void increament() {
			count++;
		}
		public  int getcount() {
			return count;
		}
		public static String getyourname(String name) {
			String ans=name;
			
			return ans;
		}
		
}
