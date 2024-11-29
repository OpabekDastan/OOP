package task3;

public class Time {
	private int hour;
	private int minute;
	private int second;
	
	public Time(int hour, int minute, int second) {
		if (isValidTime(hour,minute,second)) {
			this.hour = hour;
			this.minute = minute;
			this.second = second;
		}else {
			System.out.println("wrong time");
		}
	}		
	private boolean isValidTime(int hour, int minute, int second) {
		return (hour>=0 && hour < 24) &&
			   (minute>=0 && minute < 60) &&
			   (second>=0 && second < 60);
				
	}
	public String universal() {
		return String.format("%02d:%02d:%02d", hour,  minute, second);
	}
	public String standard() {
	    int standardHour;
	    if (hour % 12 == 0) {
	        standardHour = 12;  // 
	    } else {
	        standardHour = hour % 12;  
	    }

	    String period;
	    if (hour < 12) {
	        period = "AM";  
	    } else {
	        period = "PM";  
	    }

	    
	    return standardHour + ":" + minute + ":" + second + " " + period;
	}


	public void add(Time other) {
		this.second += other.second;
		this.minute += this.second / 60;
		this.second %= 60;
		
		this.minute += other.minute;
		this.hour += this.minute/60;
		this.minute %=60;
		 
		this.hour += other.hour;
		this.hour %= 24;
	}
}

