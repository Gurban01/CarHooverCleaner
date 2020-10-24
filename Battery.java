import java.util.Random;
import java.io.Serializable;

public class Carcleaner {
	
	int cleanerTemperature;

	double Temperature;
	static int Battery = 100;
    
	public int PercentageofBattery() {
		return Battery;
	
	}
	
	public static void main(String[] args) {
		
		public int consume() {
	        Random random = new Random();
	        int result = random.nextInt(25 - 5) + 7;
	        Battery = Battery - result;
		}
	}
	
	
	public void Temperature(){
		
		if (this.cleanerTemperature.batteryTemperature() > 50) {
            System.out.println(this.Battery.batterTemperature() + " is so hot!. Please change  device battery! ");

        } else if (this.cleanerTemperature.batteryTemperature) == 50) {
            System.out.println(this.Battery.batterTemperature() + "is OK. Battery is fine!.");
        }

        else {
            System.out.println(this.Battery.batterTemperature() + "is so cold. ")
        }
    }
	
	 @Override
    public void notification(String message) { //from TemperatureAlert.java
        System.out.println(message);
    }


}
	
