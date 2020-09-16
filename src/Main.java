public class Main {
    public static void main(String[] args)
    {
        HandSanitizerBottle bottle1 = new HandSanitizerBottle("Great Value",
                100, "plastic",78.898765);
        HandSanitizerBottle bottle2 = new HandSanitizerBottle("JDub's Elixer",
                150, "metal",98);

        System.out.println(bottle1);
        System.out.println(bottle2);

        //trying out invalid inputs
        try{
            bottle2.setAmountInBottle(-20);
        }
        catch (IllegalArgumentException e)
        {
            System.out.printf("%nThe exception generated when trying to put -20 for " +
                    "the amount in the bottle:%n'%s'%n",e.getMessage());
        }

    }
}
