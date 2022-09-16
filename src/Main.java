/*
in this case we will see about switch case in java.
how the switch statement works.
#Some Important Rules for Switch Statements
1:There can be any number of cases just imposing condition check but remember duplicate case/s values are not allowed.
2:The value for a case must be of the same data type as the variable in the switch.
3:The value for a case must be constant or literal. Variables are not allowed.
4:The break statement is used inside the switch to terminate a statement sequence.
5:The break statement is optional. If omitted, execution will continue on into the next case.
6:The default statement is optional and can appear anywhere inside the switch block. In case, if it is not at the end,
then a break statement must be kept after the default statement to omit the execution of the next case statement.
 */
/*
#question section:
 Consider the following java program, it declares an int named day whose value represents a day(1-7),
 The code displays the name of the day, based on the value of the day, using the switch statement.
 */
public class Main {
    public static void main(String[] args) {

        int day = 5;
        String dayString = switch (day) {
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            case 4 -> "Thursday";
            case 5 -> "Friday";
            case 6 -> "Saturday";
            case 7 -> "Sunday";
            default -> "Invalid day";
        };
        System.out.println(dayString);
    }
    }
