public class JedliksToyCar {

    private int distanceDriven;
    private int battery = 100;
    
    public static JedliksToyCar buy() {
        JedliksToyCar newCar = new JedliksToyCar();
        return newCar; 
    }

    public String distanceDisplay() {
        return "Driven " + distanceDriven + " meters";
    }

    public String batteryDisplay() {

        if (battery == 0) {
            return "Battery empty";
        }
        
        return "Battery at " + battery + "%";
    }

    public void drive() {

        if (battery == 0) {
            distanceDriven = distanceDriven; 
            battery = 0;
            return;
        }

        
        distanceDriven = distanceDriven + 20;
        battery = battery -1;
    }
}
