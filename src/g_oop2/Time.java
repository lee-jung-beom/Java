package g_oop2;

public class Time {
	
	private int hour;
	private int minute;
	private int second;
	
	public int getHour() {
		return hour;
	}

	public void setHour(int hour) {
//		if(0 <= hour && hour < 24){
//			this.hour = hour;
//		}
		if(hour < 0){
			this.hour = 0;
		}else if(23 < hour){
			this.hour = hour % 24;
		}else{
			this.hour = hour;
		}
		
	}

	public int getMinute() {
		return minute;
	}

	public void setMinute(int minute) {		
//		if(0 <= minute && minute <= 60){
//			this.minute = minute;
//		}
		if(minute < 0){
			this.minute = 0;
		}else if(59 < minute){
			this.minute = minute % 60;
			setHour(this.hour = minute / 60);
		}else{
			this.minute = minute;
		}
	}

	public int getSecond() {
		return second;
	}

	public void setSecond(int second) {
//		if(0 <= second && second <= 59){
//			this.second = second;
//		}	
		if(second < 0){
			this.second = 0;
		}else if(59 < second){
			this.second = second % 60;
			setMinute(this.minute + second / 60);
		}else{
			this.second = second;
		}
	}

	String getTime(){
		return hour + ":" + minute + ":" + second;
	}
	
	
	void clock(){
		while(true){
			System.out.println(getTime());
			stop(1000);
			setSecond(second + 1);
//			if(second == 60){
//				second = 0;
//				setMinute(minute + 1);
//				if(minute == 60){
//					minute = 0;
//					setHour(hour + 1);
//					if(hour == 24){
//						hour = 0;
//					}
//				}
//			}
			
		}
	}
	
	private void stop(int interval){
		try {
			Thread.sleep(interval);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
}
