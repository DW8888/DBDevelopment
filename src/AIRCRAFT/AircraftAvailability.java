package AIRCRAFT;

public class AircraftAvailability extends Aircraft {
    private String AircraftID;
    private Enum<?> AircraftStatus;
    
    /**
     * Default constructor for the AircraftAvailability class.
     */
    public AircraftAvailability() {
    }

    /**
     * Constructor for the AircraftAvailability class.
     * 
     * @param AircraftID The ID of the aircraft.
     * @param AircraftStatus The status of the aircraft.
     */
    public AircraftAvailability(String AircraftID, Enum<?> AircraftStatus) {
        this.AircraftID = AircraftID;
        this.AircraftStatus = AircraftStatus;
    }

    /**
     * Get the ID of the aircraft.
     * 
     * @return The ID of the aircraft.
     */
    public String getAircraftID() {
        return AircraftID;
    }

    /**
     * Set the ID of the aircraft.
     * 
     * @param AircraftID The ID of the aircraft.
     */
    public void setAircraftID(String AircraftID) {
        this.AircraftID = AircraftID; // corrected assignment
    }

    /**
     * Get the status of the aircraft.
     * 
     * @return The status of the aircraft.
     */
    public Enum<?> getAircraftStatus() {
        return AircraftStatus;
    }

    /**
     * Set the status of the aircraft.
     * 
     * @param AircraftStatus The status of the aircraft.
     */
    public void setAircraftStatus(Enum<?> AircraftStatus) {
        this.AircraftStatus = AircraftStatus; // corrected assignment
    }

    /**
     * Returns a string representation of the AircraftAvailability object.
     * 
     * @return A string representation of the AircraftAvailability object.
     */
    @Override
    public String toString() {
        return "***AircraftAvailability*** \nAircraftID = "
                + AircraftID + "\n AircraftStatus = "
                + AircraftStatus + 
                "\n";
    }

    /**
     * Returns an SQL statement for inserting the AircraftAvailability object into the database.
     * 
     * @return An SQL statement for inserting the AircraftAvailability object into the database.
     */
    public String toSql() {
        String sql = "INSERT INTO Aircraft_Availability" +
                     "(aircraftid, aircraftstatus)" +
                     "VALUES ('" + AircraftID + "', '" +
                     AircraftStatus + "');";
        return sql;
    }

    /**
     * Displays the AircraftAvailability object.
     */
    public void displayMe() {
        System.out.println(toString());
    }
}