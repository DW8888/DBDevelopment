package AIRCRAFT;

public class AircraftAvailability {
    private String AircraftID;
    private boolean Aircraft_Availability;

    public AircraftAvailability() {
    }

    /**
     * @param AircraftID
     * @param aircraft_Availability
     */
    public AircraftAvailability(String AircraftID, boolean Aircraft_Availability) {

        AircraftID = this.AircraftID;
        Aircraft_Availability = this.Aircraft_Availability;

    }

    public String getAircraftID() {
        return AircraftID;
    }

    public void setAircraftID(String aircraftID) {
        AircraftID = aircraftID;
    }

    public boolean getAircraft_Availability() {
        return Aircraft_Availability;
    }

    public void setAircraft_Availability(boolean Aircraft_Availability) {
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
