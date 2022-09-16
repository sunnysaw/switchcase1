/*
in this class we will see nested switch case i.e switch inside switch,a switch statement defines its own block,
no conflicts arise between the case constants in the inner switch and those in the outer switch.
 */
/*
Another interesting thing know about case are we have initialized value of case in inside case not outside the case
 */
public class string3 {
    public static void main(String[] args) {

        String branch = "DEVIL";
        int A = 2;
        switch (A){
            case 1:
                branch = "i'm trying string first time";
                break;
            case 2:
                // using another switch case inside a switch case.
                switch (branch){
                    case "DEVIL":
                        System.out.println("using nested switch case");
                    break;
                    case "NOTHING":
                            System.out.println("switch case is not working");
                    default:
                            System.out.println("confused little bit about switch case");

                }
        }
    }
}
