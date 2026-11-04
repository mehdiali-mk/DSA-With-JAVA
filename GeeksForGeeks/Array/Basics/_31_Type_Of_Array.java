public class _31_Type_Of_Array {
    public static int typeOfArr(int arr[]) {
        boolean isAscending = true;
        boolean isDescending = true;
        boolean isAscendingRotated = true;
        boolean isDescendingRotated = true;

        for (int i = 1; i < arr.length; i++) {

            if (isAscending) {
                if (arr[i] < arr[i - 1]) {
                    isAscending = false;

                    for (int j = i + 1; j < arr.length; j++) {
                        if (isAscendingRotated) {
                            if (arr[j] < arr[j - 1]) {
                                isAscendingRotated = false;
                                break;
                            }
                        }
                    }

                    if (isAscendingRotated && arr[arr.length - 1] > arr[0]) {
                        isAscendingRotated = false;
                    }
                }
            }

            if (isDescending) {
                if (arr[i] > arr[i - 1]) {
                    isDescending = false;

                    for (int j = i + 1; j < arr.length; j++) {
                        if (isDescendingRotated) {
                            if (arr[j] > arr[j - 1]) {
                                isDescendingRotated = false;
                                break;
                            }
                        }
                    }

                    if (isDescendingRotated && arr[arr.length - 1] < arr[0]) {
                        isDescendingRotated = false;
                    }
                }
            }
        }

        // 3. RETURN BLOCK (Unchanged)
        if (isAscending) {
            return 1;
        } else if (isDescending) {
            return 2;
        } else if (isDescendingRotated) {
            return 3;
        } else if (isAscendingRotated) {
            return 4;
        } else {
            return -1;
        }
    }

    public static void main(String args[]) {
        int myArray[] = new int[] { 3, 4, 5, 1, 2 };

        System.out.println(typeOfArr(myArray));
    }
}