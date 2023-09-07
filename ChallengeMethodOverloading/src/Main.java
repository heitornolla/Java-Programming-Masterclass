public class Main {
    public static void main(String[] args) {
        System.out.println(convertToCentimeters(68));
        System.out.println(convertToCentimeters(5,8));
    }

    public static double convertToCentimeters(int heightInches) {
        double heightCentimeters = heightInches * 2.54;
        return heightCentimeters;
    }

    public static double convertToCentimeters(int heightFeet, int heightInches) {
        return convertToCentimeters((heightFeet * 12) + heightInches);
    }
}
