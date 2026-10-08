public class CarsAssemble {

    public static final int perHour = 221; 
    
    public double productionRatePerHour(int speed) {

        if (speed <= 0) {
            return 0; 
        } else if (speed >=1 && speed <=4 ) {
            return speed * perHour; 
        } else if (speed >= 5 && speed <= 8) {
            return speed * perHour * 0.9; 
        } else if (speed == 9) {
            return speed * perHour * 0.8; 
        } else {
            return speed * perHour * 0.77; 
        }
    }
    
 
        


    public int workingItemsPerMinute(int speed) {
        return (int) productionRatePerHour(speed)/60; 
    }
}
