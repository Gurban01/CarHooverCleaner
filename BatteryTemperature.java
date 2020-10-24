

import java.io.Serializable;


public class Temperature implements Serializable{
		
		public void Temperature(CarHooverCleaner battery ){
			this.mBattery = battery;
		}
		
			
		public void isGivingHotBattery(){
			this.mBattery = battery.HOT;
		}
			
		public void isGivingColdBattery(){
			this.mBattery = battery.COLD;
		}
			
		public battery getBattery(){
			return mBattery;
		}

		
		

 }