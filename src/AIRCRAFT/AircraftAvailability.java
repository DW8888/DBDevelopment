package AIRCRAFT;

public class AircraftAvailability extends Aircraft implements Interface.Flyable{
    private String AircraftID;
    private Enum<?> AircraftStatus;

    public AircraftAvailability() {
    }

    /**
     * @param AircraftID
     * @param AircraftStatus
     */
    public AircraftAvailability(String AircraftID, Enum<?> AircraftStatus) {

        this.AircraftID = AircraftID;
        this.AircraftStatus = AircraftStatus;

    }

    public String getAircraftID() {
        return AircraftID;
    }

    public void setAircraftID(String aircraftID) {
        AircraftID = aircraftID;
    }

    public Enum<?> getAircraftStatus() {
        return AircraftStatus;
    }

    public void setAircraftStatus(Enum<?> AircraftStatus) {
        AircraftStatus = this.AircraftStatus;
    }

    public String toString() {
        super.toString();
        return "AircraftAvailability \nAircraftID="
                + AircraftID + "\n AircraftStatus="
                + AircraftStatus + "]";
    }

    public void displayMe() {
        System.out.println(toString());
    }

}
