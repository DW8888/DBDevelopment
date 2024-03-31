package Interface;

import Enums.AirCraftType;
import Enums.AircraftStatus;
import Enums.AircraftLocation;

public interface Flyable extends Identifiable{
    public static String generateAircraftID() {
    String AircraftID = "A-" +( R.nextInt(26))+(+ R.nextInt(26))+"-"+R.nextInt(10000);
    return AircraftID;

}

public static Enum<?> generateAircraftLocation() {
    Enum<?> A_L = AircraftLocation.values()[R.nextInt(AircraftLocation.values().length)];
    return  A_L;

}
public static Enum<?> generateAircrafStatus() {
    Enum<?> A_A = AircraftStatus.values()[R.nextInt(AircraftStatus.values().length)];
    return A_A;
}
public static Enum<?> generateAircraftType() {
    Enum<?> A_T = AirCraftType.values()[R.nextInt(AirCraftType.values().length)];
    return A_T;
}

}
