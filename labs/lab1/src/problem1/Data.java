package problem1;

public class Data {
	private double sum;
	private double max;
	private int cnt;
	
	
	public Data() {
		sum = 0;
		max = Double.NEGATIVE_INFINITY;
		cnt = 0;
	}
	public void inputValue(double value) {
		sum+=value;
		cnt++;		
		if(value>max) {
			max=value;
		}
	}	
	public double getAvg() {
		if(cnt == 0) {
			return 0;
		}
		else {
			return sum/cnt;
		}
	}
	public double getMax() {
		if (cnt == 0) {
			return 0;
		}
		return max;
	}
	
}
	
	
	
	

