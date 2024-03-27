package AIRCRAFT;

public class AircraftAvailability {
    private String AircraftID;
    private Enum<?> Aircraft_Availability;

    public AircraftAvailability() {
    }

    /**
     * @param AircraftID
     * @param aircraft_Availability
     */
    public AircraftAvailability(String AircraftID, Enum<?> Aircraft_Availability) {

        this.AircraftID = AircraftID;
        this.Aircraft_Availability = Aircraft_Availability;

    }

    public String getAircraftID() {
        return AircraftID;
    }

    public void setAircraftID(String aircraftID) {
        AircraftID = aircraftID;
    }

    public Enum getAircraft_Availability() {
        return Aircraft_Availability;
    }

    public void setAircraft_Availability(Enum Aircraft_Availability) {
        Aircraft_Availability = this.Aircraft_Availability;
    }

    public String toString() {
        super.toString();
        return "AircraftAvailability \nAircraftID="
                + AircraftID + "\n Aircraft_Availability="
                + Aircraft_Availability + "]";
    }

    public void displayMe() {
        System.out.println(toString());
    }

}
