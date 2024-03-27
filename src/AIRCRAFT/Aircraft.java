package AIRCRAFT;

public class Aircraft {
    private String AircraftID;
    private Enum<?> AircraftType;
    private Enum<?> AircraftLocation;
    private int AircraftCount;

    public Aircraft() {
        AircraftCount++;
    }

    public Aircraft(String AircraftID, Enum<?> AircraftType, Enum<?> AircraftLocation) {
        AircraftID = this.AircraftID;
        AircraftType = this.AircraftType;
        AircraftLocation = this.AircraftLocation;

    }

    public String getAircraftID() {
        return AircraftID;
    }

    public void setAircraftID(String aircraftID) {
        AircraftID = aircraftID;
    }

    public Enum<?> getAircraftType() {
        return AircraftType;
    }

    public void setAircraftType(Enum<?> AircraftType) {
        AircraftType = this.AircraftType;
    }

    public Enum<?> getAircraftLocation() {
        return AircraftLocation;
    }

    public void setAircraftLocation(Enum<?> AircraftLocation) {
        AircraftLocation = this.AircraftLocation;
    }

    public int getAircraftCount() {
        return AircraftCount;
    }

    public void setAircraftCount(int aircraftCount) {
        AircraftCount = aircraftCount;
    }

    public String toString() {
        super.toString();
        return "Aircraft \nAircraftID=" + AircraftID + 
        "\n AircraftType=" + AircraftType + 
        "\n AircraftLocation="+ AircraftLocation + "]";
    }

    public void displayMe() {
        System.out.println(toString());
    }

}
