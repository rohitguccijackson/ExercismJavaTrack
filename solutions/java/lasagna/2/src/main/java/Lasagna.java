public class Lasagna {

    private static final int EXPECTED_MINUTES_IN_OVEN = 40; 
    private static final int PREPERATION_TIME = 2; 
    
    public int expectedMinutesInOven() {
        return EXPECTED_MINUTES_IN_OVEN; 
    }

    
    public int remainingMinutesInOven(int actualTimInOven) {
        return EXPECTED_MINUTES_IN_OVEN - actualTimInOven; 
    }

    public int preparationTimeInMinutes(int numOfLayers) {
        return PREPERATION_TIME * numOfLayers; 
    }

    public int totalTimeInMinutes(int numOfLayers, int actualTimeInOven) { 
        return preparationTimeInMinutes(numOfLayers) + actualTimeInOven; 
        
    }
}
