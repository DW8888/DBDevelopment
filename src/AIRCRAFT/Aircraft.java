package AIRCRAFT;

public class Aircraft {
    private String AircraftID;
    private String AircraftType;
    private Enum AircraftLocation;
    private int AircraftCount;
    public Aircraft() {
        AircraftCount++;
    }
    public Aircraft(String AircraftID, String AircraftType, Enum AircraftLocation) {
        AircraftID = this.AircraftID;
        AircraftType = this.AircraftID;
        AircraftLocation = this.AircraftLocation;

    }
    public String getAircraftID() {
        return AircraftID;
    }
    public void setAircraftID(String aircraftID) {
        AircraftID = aircraftID;
    }
    public String getAircraftType() {
        return AircraftType;
    }
    public void setAircraftType(String aircraftType) {
        AircraftType = aircraftType;
    }
    public Enum getAircraftLocation() {
        return AircraftLocation;
    }
    public void setAircraftLocation(Enum aircraftLocation) {
        AircraftLocation = aircraftLocation;
    }
    public int getAircraftCount() {
        return AircraftCount;
    }
    public void setAircraftCount(int aircraftCount) {
        AircraftCount = aircraftCount;
    }
    public String toString() {
        super.toString();
        return "Aircraft \nAircraftID=" + AircraftID + "\n AircraftType=" + AircraftType + "\n AircraftLocation=" + AircraftLocation + "]";
    }
    public void displayMe() {
        System.out.println(toString());
    }   



}
