package CHALLENGE;
import java.util.Objects;
public class Pair {
	protected int element;
	private int cnt;
	public Pair(int element, int cnt) {
		this.cnt = cnt;
		this.element = element;
	}
	@Override
	public boolean equals(Object o) {
		if(this == o) return true;
		if(o == null) return false; 
		if(this.getClass() != o.getClass()) return false;
		Pair pair = (Pair)o;
		return element == element && Objects.equals(cnt, pair.cnt); 
	}
	@Override
	public String toString() {
		return "[" + element + "," + cnt + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(element, cnt);
	}
}
