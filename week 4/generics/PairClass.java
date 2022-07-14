package generics;

public class PairClass <T,S>{
	private T first;
	private S second;
	public void setFirstValue(T first) {
		this.first=first;
	}
	public T getFirstValue() {
		return first;
	}
	public void setSecondValue(S second) {
		this.second=second;
	}
	public S getSecondValue() {
		return second;
	}
	

}
