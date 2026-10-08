class AnnalynsInfiltration {
    public static boolean canFastAttack(boolean knightIsAwake) {
        /*
        if (!knightIsAwake) {
            return true;
        } 
        return false;
        */

        return !knightIsAwake;
    }

    public static boolean canSpy(boolean knightIsAwake, boolean archerIsAwake, boolean prisonerIsAwake) {
        /*
        if (knightIsAwake || archerIsAwake || prisonerIsAwake) {
            return true; 
        }
        return false;
        */

        return knightIsAwake || archerIsAwake || prisonerIsAwake; 
    }

    public static boolean canSignalPrisoner(boolean archerIsAwake, boolean prisonerIsAwake) {
        /*
        if (prisonerIsAwake && !archerIsAwake) {
            return true; 
        }
        return false; 
        */

        return prisonerIsAwake && !archerIsAwake;
    }

    public static boolean canFreePrisoner(boolean knightIsAwake, boolean archerIsAwake, boolean prisonerIsAwake, boolean petDogIsPresent) {

    if (petDogIsPresent && !archerIsAwake) {
        return true; 
    } else if (!petDogIsPresent) {
        if (prisonerIsAwake && !knightIsAwake && !archerIsAwake) {
            return true; 
        }
    } else {
        return false; 
    }

    return false; 
        
    }
}
