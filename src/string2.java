/*
In one class we can use multiple switch case which we will see it here.
#: we also see what happen when we don't use the break , one another thing we have to know about break i.e
if we don't initialize the value and use the break then we have to initialize the variable otherwise it will give compile error.
 */
public class string2 {
    public static void main(String[] args) {

        int A=5;
        String weekdays;
        String days;
        switch (A){
            case 1:
                days ="MONDAY";
                break;
            case 2:
                days ="TUESDAY";
                break;
            case 3:
                days ="Wednesday";
                break;
            case 4:
                days ="Thursday";
                break;
            case 5:
                days ="FRIDAY";
                break;
            case 6:
                days ="Saturday";
                break;
            case 7:
                days ="SUNDAY";
                break;
            default:
                days = "working days";
         }
        // now using the second switch case in same class.
        weekdays = switch (A) {
            case 1, 2, 3, 4 -> "leave day.";
            case 5 -> "leave day.";
            case 6, 7 -> "leave day.";
            default -> "not a leave day";
        };
        System.out.println(days + " is a "  + weekdays);
    }
}

