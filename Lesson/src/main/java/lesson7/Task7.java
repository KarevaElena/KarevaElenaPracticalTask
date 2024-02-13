package lesson7;

public class Task7 {
    public static void main(String[] args) {

        String[][] arr = new String[][]{{"8", "7", "6", "15"}, {"l", "2", "3", "4"}, {"11", "22", "33", "44"}, {"1", "2", "3", "4"}};
        try {
            System.out.println(method(arr));
        } catch (MyArraySizeException e) {
            System.out.println("Размер массива превышен!");
        } catch (MyArrayDataException e) {
            System.out.println("Неправильное значение массива!");
            System.out.println("Ошибка в ячейке: [" + e.i + "][" + e.j + "] ");
        }
    }

    public static int method(String[][] arr) throws MyArraySizeException, MyArrayDataException {
        int count = 0;
        if (arr.length != 4) {
            throw new MyArraySizeException();
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].length != 4) {
                throw new MyArraySizeException();
            }
            for (int j = 0; j < arr[i].length; j++) {
                try {
                    count = count + Integer.parseInt(arr[i][j]);
                }
                catch (NumberFormatException e) {
                    throw new MyArrayDataException(i, j);
                }
            }

        }
        return count;
    }

}
