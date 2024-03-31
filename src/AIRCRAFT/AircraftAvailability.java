package AIRCRAFT;
public class AircraftAvailability extends Aircraft implements Interface.Flyable {
    private String AircraftID;
    private Enum<?> AircraftStatus;

    public AircraftAvailability() {
    }

    public AircraftAvailability(String AircraftID, Enum<?> AircraftStatus) {
        this.AircraftID = AircraftID;
        this.AircraftStatus = AircraftStatus;
    }

    public String getAircraftID() {
        return AircraftID;
    }

    public void setAircraftID(String AircraftID) {
        this.AircraftID = AircraftID; // corrected assignment
    }

    public Enum<?> getAircraftStatus() {
        return AircraftStatus;
    }

    public void setAircraftStatus(Enum<?> AircraftStatus) {
        this.AircraftStatus = AircraftStatus; // corrected assignment
    }

    @Override
    public String toString() {
        return "***AircraftAvailability*** \nAircraftID = "
                + AircraftID + "\n AircraftStatus = "
                + AircraftStatus + 
                "/*******";
    }
    public void toSql() {
        String sql = "INSERT INTO Aircraft_Availability" +
                     "(aircraft_id, aircraft_status)" +
                     "VALUES ('" + AircraftID + "', '" +
                     AircraftStatus + "');";
        System.out.println(sql);
    }
    public void displayMe() {
        System.out.println(toString());
    }
}