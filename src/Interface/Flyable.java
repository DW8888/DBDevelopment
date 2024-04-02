package Interface;

import Enums.AirCraftType;
import Enums.AircraftStatus;
import Enums.AircraftLocation;

public interface Flyable extends Identifiable {

    /**
     * Generates a unique aircraft ID.
     * 
     * @return The generated aircraft ID.
     */
    public static String generateAircraftID() {
        String AircraftID = "A-" + (R.nextInt(26)) + (+R.nextInt(26)) + "-" + R.nextInt(10000);
        return AircraftID;
    }

    /**
     * Generates a random aircraft location.
     * 
     * @return The generated aircraft location.
     */
    public static Enum<?> generateAircraftLocation() {
        Enum<?> A_L = AircraftLocation.values()[R.nextInt(AircraftLocation.values().length)];
        return A_L;
    }

    /**
     * Generates a random aircraft status.
     * 
     * @return The generated aircraft status.
     */
    public static Enum<?> generateAircrafStatus() {
        Enum<?> A_A = AircraftStatus.values()[R.nextInt(AircraftStatus.values().length)];
        return A_A;
    }

    /**
     * Generates a random aircraft type.
     * 
     * @return The generated aircraft type.
     */
    public static Enum<?> generateAircraftType() {
        Enum<?> A_T = AirCraftType.values()[R.nextInt(AirCraftType.values().length)];
        return A_T;
    }
}
