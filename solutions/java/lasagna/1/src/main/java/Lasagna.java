public class Lasagna {
    // TODO: define the 'expectedMinutesInOven()' method
    public int expectedMinutesInOven() {
        return 40; 
    }

    // TODO: define the 'remainingMinutesInOven()' method
    public int remainingMinutesInOven(int actualTimInOven) {
        return expectedMinutesInOven() - actualTimInOven; 
    }

    // TODO: define the 'preparationTimeInMinutes()' method
    public int preparationTimeInMinutes(int numOfLayers) {
        return 2 * numOfLayers; 
    }

    // TODO: define the 'totalTimeInMinutes()' method
    public int totalTimeInMinutes(int numOfLayers, int actualTimeInOven) { 
        return preparationTimeInMinutes(numOfLayers) + actualTimeInOven; 
        
    }
}
