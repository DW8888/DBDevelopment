package Factory;

import AIRCRAFT.Aircraft;
import AIRCRAFT.AircraftAvailability;
import Interface.*;


/**
 * The AircraftBuilder class is responsible for building aircraft objects and their availabilities.
 */
public class AircraftBuilder {
    Aircraft[] planes;
    Aircraft[] planeAvailibilities;
   
   /**
    * Builds an array of Aircraft objects.
    * 
    * @param n The number of aircraft to build.
    * @return An array of Aircraft objects.
    */
   public static Aircraft[] buildAircraft(int n) {
        Aircraft[] planes = new Aircraft[n];

        for (int i = 0; i < n; i++) {
            planes[i] = new Aircraft(
              Flyable.generateAircraftID(),
              Flyable.generateAircraftType(),
              Flyable.generateAircraftLocation()
            );
        }

        return planes;
    }
    
    /**
     * Builds an array of AircraftAvailability objects based on the given array of Aircraft objects.
     * 
     * @param planes An array of Aircraft objects.
     * @return An array of AircraftAvailability objects.
     */
    public static AircraftAvailability[] buildAircraftAvailabilities(Aircraft[] planes) {
        AircraftAvailability[] planeAvailibilities = new AircraftAvailability[planes.length];
        for (int i = 0; i < planes.length; i++) {
            planeAvailibilities[i] = new AircraftAvailability(
                planes[i].getAircraftID(),
                Flyable.generateAircrafStatus()
            );
        }
        return planeAvailibilities;
    }
    
}


