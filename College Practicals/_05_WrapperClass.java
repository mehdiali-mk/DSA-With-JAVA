// * 5. Write a Java program to use of Wrapper class of each primitive data types.

public class _05_WrapperClass {
    public static void main(String[] args) {

        int intValue = 10;
        double doubleValue = 3.14;
        char charValue = 'A';
        boolean booleanValue = true;

        Integer integerWrapper = Integer.valueOf(intValue);
        Double doubleWrapper = Double.valueOf(doubleValue);
        Character charWrapper = Character.valueOf(charValue);
        Boolean booleanWrapper = Boolean.valueOf(booleanValue);

        System.out.println("Integer Wrapper: " + integerWrapper);
        System.out.println("Double Wrapper: " + doubleWrapper);
        System.out.println("Character Wrapper: " + charWrapper);
        System.out.println("Boolean Wrapper: " + booleanWrapper);

        int intValueFromWrapper = integerWrapper.intValue();
        double doubleValueFromWrapper = doubleWrapper.doubleValue();
        char charValueFromWrapper = charWrapper.charValue();
        boolean booleanValueFromWrapper = booleanWrapper.booleanValue();

        System.out.println("Integer Value: " + intValueFromWrapper);
        System.out.println("Double Value: " + doubleValueFromWrapper);
        System.out.println("Character Value: " + charValueFromWrapper);
        System.out.println("Boolean Value: " + booleanValueFromWrapper);
    }
}
