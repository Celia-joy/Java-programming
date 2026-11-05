enum Days {
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY,
    SUNDAY
}

public class Main14{
    public static void main (String [] args){
        
        for (Days day : Days.values()){
            System.out.println(day);
        }

        Days today = Days.valueOf("MONDAY");
        System.out.println(today);

        Days today1 = Days.FRIDAY;
        System.out.println(today1.name());

        System.out.println(Days.MONDAY.ordinal());
        System.out.println(Days.FRIDAY.ordinal());

        Days today2 = Days.SUNDAY;

        switch (today2){
            case MONDAY:
                System.out.println("Start of the weel")
        }
    }
}
