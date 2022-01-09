public class TimeZones {
    public static void main(String[] args) {

        String city1 = "Odesa";
        int city1LocalStart = 9;
        int city1LocalFinish = 18;
        int city1UtcDiff = 2;

        String city2 = "Kyoto";
        int city2LocalStart = 9;
        int city2LocalFinish = 18;
        int city2UtcDiff = 9;

        int city1UtcStart = city1LocalStart - city1UtcDiff;
        int city1UtcFinish = city1LocalFinish - city1UtcDiff;
        int city2UtcStart = city2LocalStart - city2UtcDiff;
        int city2UtcFinish = city2LocalFinish - city2UtcDiff;

        int commonUtcStart;
        int commonUtcFinish;


        if (city1UtcDiff > city2UtcDiff && (city1UtcFinish - city2UtcStart) <= 0) {
            System.out.println("No common normal working hours");
            return;
        }

        if (city1UtcDiff < city2UtcDiff && (city2UtcFinish - city1UtcStart) <= 0) {
            System.out.println("No common normal working hours");
            return;
        }

        if (city2UtcStart > city1UtcStart) {
            commonUtcStart = city2UtcStart;
            commonUtcFinish = city1UtcFinish;
        } else {
            commonUtcStart = city1UtcStart;
            commonUtcFinish = city2UtcFinish;
        }

        int city1CommonStart = commonUtcStart + city1UtcDiff;
        int city1CommonFinish = commonUtcFinish + city1UtcDiff;

        int city2CommonStart = commonUtcStart + city2UtcDiff;
        int city2CommonFinish = commonUtcFinish + city2UtcDiff;

        System.out.println("Common working hours between " + city1 + " and " + city2 + " are:");
        System.out.println("From " + commonUtcStart + " to " + commonUtcFinish + " hours UTC");
        System.out.println("which is " + city1CommonStart + " to " + city1CommonFinish + " hours in " + city1);
        System.out.println("and " + city2CommonStart + " to " + city2CommonFinish + " hours in " + city2);

    }
}

