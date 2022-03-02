package HW2;

public class Main {
    static int a = 0;
    static String[][] arrayStr = new String[][]{{"77", "54", "56", "56"}, {"5", "2", "2", "9"}, {"1", "333", "54", "54"}, {"1", "333", "54", "54"}};
    static int[][] arrayInt = new int[6][5];

    public Main() {
    }

    public static void main(String[] args) {
        try {
            myArr(arrayStr, arrayInt, a);
        } catch (MyArrayDataException | MyArraySizeException var5) {
            var5.printStackTrace();
        } finally {
            System.out.println("Это для отладки");
        }

    }

    public static void myArr(String[][] arr, int[][] arr1, int a) throws MyArraySizeException, MyArrayDataException {
        if (arr.length != 4) {
            throw new MyArraySizeException();
        } else {
            for(int i = 0; i < arr.length; ++i) {
                if (arr[i].length != 4) {
                    throw new MyArraySizeException();
                }

                for(int j = 0; j < arr[i].length; ++j) {
                    try {
                        arr1[i][j] = Integer.parseInt(arr[i][j]);
                    } catch (NumberFormatException var6) {
                        throw new MyArrayDataException("Wrong element in array at position (" + i + "," + j + ")");
                    }

                    a += arr1[i][j];
                }
            }

            System.out.println("Результат суммирования всех элементов массива: " + a);
        }
    }
}
