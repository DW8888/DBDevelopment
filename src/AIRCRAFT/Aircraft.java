package AIRCRAFT;

import Interface.Flyable;

public class Aircraft implements Flyable {
    private String AircraftID;
    private Enum<?> AircraftType;
    private Enum<?> AircraftLocation;
    private int AircraftCount;

    public Aircraft() {
        AircraftCount++;
    }

    public Aircraft(String AircraftID, Enum<?> AircraftType, Enum<?> AircraftLocation) {
        this.AircraftID = AircraftID; 
        this.AircraftType = AircraftType;
        this.AircraftLocation = AircraftLocation;
        AircraftCount++; // Incrementing static variable

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

    public void setAircraftType(Enum<?> aircraftType) {
        AircraftType = aircraftType;
    }

    public Enum<?> getAircraftLocation() {
        return AircraftLocation;
    }

    public void setAircraftLocation(Enum<?> aircraftLocation) {
        AircraftLocation = aircraftLocation;
    }

    public  int getAircraftCount() { // Changed to static
        return AircraftCount;
    }

    public  void setAircraftCount(int aircraftCount) { // Changed to static
        AircraftCount = aircraftCount;
    }

    public String toString() {
        super.toString();
        return "****Aircraft**** \nAircraftID = " + AircraftID + 
        "\nAircraftType = " + AircraftType + 
        "\nAircraftLocation = "+ AircraftLocation +
        "\n";
    }
    public String  toSql() {
        String sql = "INSERT INTO Aircraft" +
                     "(aircraftid, aircrafttype, aircraftlocation)" +
                     "VALUES ('" + AircraftID + "', '" +
                     AircraftType + "', '" +
                     AircraftLocation + "');";
        return sql;
    }
    public void displayMe() {
        System.out.println(toString());
    }

}
