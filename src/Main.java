public class Main {
    public static void main(String[] args){
        SpeedConverter.printConversion(2.0);
        MegaBytesConverter.printMegaBytesAndKiloBytes(2500);
        System.out.println(BarkingDog.shouldWakeUp(true, 8));
        System.out.println(LeapYear.isLeapYear(1924));
        System.out.println(DecimalComparator.areEqualByThreeDecimalPlaces(3.176, 3.175));
    }
}
