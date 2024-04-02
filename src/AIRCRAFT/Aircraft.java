package AIRCRAFT;

import Interface.Flyable;

/**
 * The Aircraft class represents an aircraft object.
 * It implements the Flyable interface.
 */
public class Aircraft implements Flyable {
    private String AircraftID;
    private Enum<?> AircraftType;
    private Enum<?> AircraftLocation;
    private static int AircraftCount;

    /**
     * Default constructor for the Aircraft class.
     * It increments the AircraftCount static variable.
     */
    public Aircraft() {
        AircraftCount++;
    }

    /**
     * Parameterized constructor for the Aircraft class.
     * It sets the AircraftID, AircraftType, and AircraftLocation properties.
     * It also increments the AircraftCount static variable.
     * 
     * @param AircraftID The ID of the aircraft.
     * @param AircraftType The type of the aircraft.
     * @param AircraftLocation The location of the aircraft.
     */
    public Aircraft(String AircraftID, Enum<?> AircraftType, Enum<?> AircraftLocation) {
        this.AircraftID = AircraftID; 
        this.AircraftType = AircraftType;
        this.AircraftLocation = AircraftLocation;
        AircraftCount++;
    }

    /**
     * Gets the AircraftID property.
     * 
     * @return The ID of the aircraft.
     */
    public String getAircraftID() {
        return AircraftID;
    }

    /**
     * Sets the AircraftID property.
     * 
     * @param aircraftID The ID of the aircraft.
     */
    public void setAircraftID(String aircraftID) {
        AircraftID = aircraftID;
    }

    /**
     * Gets the AircraftType property.
     * 
     * @return The type of the aircraft.
     */
    public Enum<?> getAircraftType() {
        return AircraftType;
    }

    /**
     * Sets the AircraftType property.
     * 
     * @param aircraftType The type of the aircraft.
     */
    public void setAircraftType(Enum<?> aircraftType) {
        AircraftType = aircraftType;
    }

    /**
     * Gets the AircraftLocation property.
     * 
     * @return The location of the aircraft.
     */
    public Enum<?> getAircraftLocation() {
        return AircraftLocation;
    }

    /**
     * Sets the AircraftLocation property.
     * 
     * @param aircraftLocation The location of the aircraft.
     */
    public void setAircraftLocation(Enum<?> aircraftLocation) {
        AircraftLocation = aircraftLocation;
    }

    /**
     * Gets the AircraftCount static variable.
     * 
     * @return The count of the aircrafts.
     */
    public static int getAircraftCount() {
        return AircraftCount;
    }

    /**
     * Sets the AircraftCount static variable.
     * 
     * @param aircraftCount The count of the aircrafts.
     */
    public static void setAircraftCount(int aircraftCount) {
        AircraftCount = aircraftCount;
    }

    /**
     * Returns a string representation of the Aircraft object.
     * 
     * @return A string representation of the Aircraft object.
     */
    public String toString() {
        super.toString();
        return "****Aircraft**** \nAircraftID = " + AircraftID + 
        "\nAircraftType = " + AircraftType + 
        "\nAircraftLocation = "+ AircraftLocation +
        "\n";
    }

    /**
     * Returns an SQL statement for inserting the Aircraft object into a database.
     * 
     * @return An SQL statement for inserting the Aircraft object into a database.
     */
    public String toSql() {
        String sql = "INSERT INTO Aircraft" +
                     "(aircraftid, aircrafttype, aircraftlocation)" +
                     "VALUES ('" + AircraftID + "', '" +
                     AircraftType + "', '" +
                     AircraftLocation + "');";
        return sql;
    }

    /**
     * Displays the string representation of the Aircraft object.
     */
    public void displayMe() {
        System.out.println(toString());
    }
}
