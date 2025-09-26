package Sorting;

public class sortArrayOfString {

    public static void displayArray(String array[]) {
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            System.err.print(" " + array[i] + ", ");
            if (i == (array.length / 2) - 1) {
                System.out.println();
            }
        }
        System.out.println("]");
    }

    public static String[] mergeSort(String[] array, int startingIndex, int endingIndex) {
        if (startingIndex == endingIndex) {
            String[] newArray = { array[startingIndex] };
            return newArray;
        }

        int middleIndex = startingIndex + (endingIndex - startingIndex) / 2;
        String[] array1 = mergeSort(array, startingIndex, middleIndex);
        String[] array2 = mergeSort(array, middleIndex + 1, endingIndex);

        String[] array3 = merge(array1, array2);
        return array3;
    }

    public static String[] merge(String[] array1, String[] array2) {
        int firstArrayLength = array1.length;
        int secondArrayLength = array2.length;
        String[] array3 = new String[firstArrayLength + secondArrayLength];

        int index = 0;
        int firstIndex = 0;
        int secondIndex = 0;

        while (firstIndex < firstArrayLength && secondIndex < secondArrayLength) {
            if (isAlphabetSmaller(array1[firstIndex], array2[secondIndex])) {
                array3[index] = array1[firstIndex];
                firstIndex++;
            } else {
                array3[index] = array2[secondIndex];
                secondIndex++;
            }
            index++;
        }

        while (firstIndex < firstArrayLength) {
            array3[index++] = array1[firstIndex++];
        }

        while (secondIndex < secondArrayLength) {
            array3[index++] = array2[secondIndex++];
        }

        return array3;
    }

    public static boolean isAlphabetSmaller(String str1, String str2) {
        if (str1.compareTo(str2) < 0) {
            return true;
        }
        return false;
    }

    public static void main(String args[]) {
        String[] names = { "Mehdiali", "Het", "Rushikesh", "Mohammad", "Raj", "Shlok", "Aman" };
        String[] sortedNames = mergeSort(names, 0, names.length - 1);

        System.out.println("\n\nOriginal Names List = ");
        displayArray(names);

        System.out.println("\nSorted Names List = ");
        displayArray(sortedNames);
        System.out.println("\n\n");

    }
}