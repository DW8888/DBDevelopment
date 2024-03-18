package Interface;


import java.util.Random;

import Enums.CountryState;

public interface Identifiable {
    public static String[] nyTowns = { "Sleepy Hollow", "Tarrytown", "Ossining", "Briarcliff",
            "Pleasantville", "Chappaqua", "Armonk", "White Plains", "Yonkers",
            "Mount Vernon", "New Rochelle", "Scarsdale", "Hartsdale", "Dobbs Ferry", "Irvington" };
    public static String[] njTowns = { "Hoboken", "Jersey City", "Union City", "Weehawken", "West New York",
            "Toms River", "Newark", "Paterson", "Elizabeth", "Edison", "Woodbridge", "Lakewood",
            "Trenton", "Clifton", "Camden" };
    public static String[] vtTowns = { "Burlington", "Essex", "Rutland", "Colchester", "South Burlington",
            "Bennington", "Brattleboro", "Hartford", "Milton", "Barre", "Montpelier", "Winooski", "St. Albans",
            "Newport", "Springfield" };
    public static String[] firstNames = { "Angella", "Bella", "Carmen", "Diana", "Elena", "Fiona",
            "Gina", "Hannah", "Irene", "Julia", "Kathy", "Linda", "Mona", "Nina",
            "Olivia", "Pamela", "Quinn", "Rita", "Samantha", "Tina", "Ursula",
            "Vicky", "Wendy", "Xena", "Yvonne", "Zara", "Arron", "Bobby", "Curtis", "Derek", "Ethan", "Frank", "George",
            "Henry", "Ivan", "John", "Kevin", "Liam", "Mason", "Nathan", "Oscar", "Peter", "Quinn", "Robert",
            "Steven", "Tom", "Ulysses", "Victor", "William", "Xavier", "Yan", "Zachary" };
    public static String[] lastNames = { "Smith", "Johnson", "Williams", "Jones", "Brown", "Davis", "Miller", "Wilson",
            "Moore", "Taylor", "Anderson", "Thomas", "Jackson", "White", "Harris", "Martin", "Thompson", "Garcia",
            "Martinez", "Robinson", "Clark", "Rodriguez", "Lewis", "Lee", "Walker", "Hall", "Allen", "Young",
            "Hernandez", "King", "Wright", "Lopez", "Hill", "Scott", "Green",
            "Adams", "Baker", "Gonzalez", "Sanchez", "Nieves", "Chavez", "Rivera", "Torres", "Ramirez", "Cruz", "Diaz",
            "Ortiz", "Gomez", "Mendez", "Perez", "Vasquez", "Garcia", "Martinez", "Robinson", "Clark", "Rodriguez",
            "Lewis", };
    Random R = new Random();
    String state=null;

    public static String generateFName() {
        String fName = firstNames[R.nextInt(firstNames.length)];
        return fName;
    }

    public static String generateLName() {
        String lNameName = lastNames[R.nextInt(lastNames.length)];
        return lNameName;
    }

    public static String generateState() {
        CountryState[] states = CountryState.values();
        CountryState randomState = states[new Random().nextInt(states.length)];
        String state = randomState.toString();
        switch (state) {
            case "NEW_YORK":
                state = "New York";
                break;
            case "NEW_JERSEY":
                state = "New Jersey";
                break;
            case "VERMONT":
                state = "Vermont";
                break;
            default:
                state = null;
                break;
        }
        return state;   
    }


    public static String generateZipcodeString(String state) {
        String zip = null;
        if (state== "New York") {
            zip = "10" + R.nextInt(1000);
        }
        if (state=="New Jersey")  {
            zip = "07" + R.nextInt(1000);
        }
        if (state =="Vermont") {
            zip = "05" + R.nextInt(1000);
        }
        return zip;
    }

   
    public static String chooseCity(String state) {
        String city = null;
        if (state=="New York") {
         
            city = nyTowns[R.nextInt(nyTowns.length)];
        }
        if (state=="New Jersey"){
            city = njTowns[R.nextInt(njTowns.length)];
        }
        if (state=="Vermont"){
            city = vtTowns[R.nextInt(vtTowns.length)];
        }
        return city;
    }
    public static String generatePhoneNumber() {
        String phoneNumber = "1" +"-"+ R.nextInt(10) + 
        R.nextInt(10) + R.nextInt(10) + "-" +
         R.nextInt(10) + R.nextInt(10) + R.nextInt(10) 
         + "-" + R.nextInt(10) + R.nextInt(10) 
         + R.nextInt(10) + R.nextInt(10);
        return phoneNumber;
    }
    /**
     * @return
     */
    public static String generateCID() {
        String CID = null;
        CID = generateFName().substring(0, 1) +
         generateLName().substring(0, 1) + 
         R.nextInt(100000);
        return CID;
    }

}


