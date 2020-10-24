import java.util.Scanner;
import java.io.Serializable;

/**
 * @author:Gurban Gurbanzade
 * Neptun code:ANLF6M
 * Date:14.10.2020
 */
public class CarHooverCleaner {
    private Boolean process = false;

    public static void main(String[] args) {
        new CarHooverCleaner();
    }

    public void CarHooverCleaner() {

        System.out.println("Please select: " + " \n1.Power " + "\n2.Speed" + "\n3.Exit");

        Scanner selectMenu = new Scanner(System.in);
        int choice = Integer.parseInt(selectMenu.nextLine());

        if (choice == 1) {
            ON_OFF();
        } else if (choice == 2) {
            speed();
        } else if (choice == 3) {
            System.out.println("Shuting down..");
        }
    }

    public void ON_OFF() {
        System.out.println("Please select \n");

        System.out.println("1.On \n" + "2.Off \n");
        Scanner select = new Scanner(System.in);
        String scr = select.nextLine();

        if (scr.equalsIgnoreCase("ON")) {
            System.out.println("On");
            process = true;
        } else {
            System.out.println("Off");
            process = false;
        }
    }

    public void speed() {
        System.out.println("1.Fast\n" + "2.Slow\n");

        Scanner choose = new Scanner(System.in);
        int choice = Integer.parseInt(choose.nextLine());

        if (choice == 1) {
            System.out.println("Your car will be clean in 5 minutes! ");
        }

        if (choice == 2) {
            System.out.println("Your car will be clean in 15 minutes \n--- PLEASE WAİT-----");
        }
    }
	
	
public class CarHooverCleaner_Options implements Serializable{
		
		int cleanerSpeed;
		int cleanerBattery;
		int cleanerAlert;
		
		CarHooverCleaner(int speed, int battery , int alert){
			this.cleanerSpeed=speed level;
			this.cleanerBattery=battery level;
			this.cleanerAlert=bib;
		}
		
		 
	  public static void main(String args[]){
        

        CarHooverCleaner object1 = new CarHooverCleaner("HIGH" , "GOOD" , "BİB" );
        CarHooverCleaner object2 = new CarHooverCleaner("LOW", "BAD" , "BANG");


        System.out.println("\n1, cleaner\n");


        System.out.println("Cleaner fan speed: " + object1.cleanerSpeed+ "\nCleaner battery level: "  + object1.cleanerBattery + "\nAlert signal: " 
        object1.cleanerAlert );

        System.out.println("\n2, hanger\n");

        System.out.println("Cleaner fan speed: " + object2.cleanerSpeed+ "\nCleaner battery level: "  + object2.cleanerBattery + "\nAlert signal: " 
        object2.cleanerAlert);

    }

    


    
}

