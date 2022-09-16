/*
In this section we will learn about another switch case using enum class, how enum works with switch case.
 */
public class string4{
      public enum days {mon,tue,Wed,thu ,fri ,sat ,sun;}
       public static void main(String[] args) {
       days now = days.valueOf();
           for (now : days) {
            switch (now){
                case mon:
                    System.out.println("sunday");
                    break;
                case tue:
                    System.out.println("monday");
                    break;
                case Wed:
                    System.out.println("tuesday");
                    break;
                case thu:
                    System.out.println("Wednesday");
                    break;
                case fri:
                    System.out.println("Thursday");
                    break;
                case sat:
                    System.out.println("friday");
                    break;
                case sun:
                    System.out.println("Saturday");
                    break;
                default:
                    System.out.println("invalid day.");
             }
        }

    }
}
/*
this is a wrong code i need some help can anybody correct this code? / and explain why (days and valueof()) is showing complie error. 
*/
