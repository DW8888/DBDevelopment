package Factory;

import AIRCRAFT.Aircraft;
import AIRCRAFT.AircraftAvailability;
import Interface.*;


public class AircraftBuilder {
    Aircraft[] planes;
    Aircraft[] planeAvailibilities;
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


