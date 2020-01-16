import java.util.Scanner;



public class IntervalBoundaries {
    public static void main(String[] args) {

        int [] arr = new int[12]; //заводим массив из 12 элементов

        Scanner in = new Scanner(System.in); //для того, чтобы мы могли считывать с клавиатуры
        for (int i=0; i<12; i++) { //для i от 0 до 12
            System.out.print("arr[" + i +"]= ");
            arr[i] = in.nextInt(); //заполняем массив полученными числами
        }
        in.close();

        int maxNumber=arr[0]; //максимальным числом ставим 1 элемент массива
        int minNumber = maxNumber; //минимальным числом ставим 1 элемент массива


        for (int i = 0; i < arr.length; i++) { //для i от 0 до 12

            if(maxNumber <= arr[i]){ //если элемент массива больше или равен maxNumber
                maxNumber = arr[i]; //присваиваем значение элемента массива maxNumber
            }
            if (minNumber >= arr[i]){ //если элемент массива меньше или равен minNumber
                minNumber = arr[i]; //присваиваем значение элемента массива minNumber
            }
        }

        System.out.println("Минимальный элемент: " + minNumber);
        System.out.println("Максимальный элемент: " + maxNumber);
    }
}

