package homework2;

public class homework2 {

    public static void main(String[] args) {
        //Задание 1
        //Задаем массив
        int[] array1 = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        //Проверяем метод, заменяющий 0 на 1, 1 на 0
        int[] arrayResult1 = changeElementsArray(array1);
        for (int i = 0; i < arrayResult1.length; i++) {
            System.out.print(arrayResult1[i] + " ");
        }
        System.out.println("");
        //Задание 2
        //Задаем пустой целочисленный массив
        int[] array2 = new int[8];
        //Проверяем метод, заполняющий массив
        int[] arrayResult2 = fillArray(array2);
        for (int i = 0; i < arrayResult2.length; i++) {
            System.out.print(arrayResult2[i] + " | ");
        }
        System.out.println("");
        //Задание 3
        //Задаем массив
        int[] array3 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        //Проверяем метод, множающий на 2 числа меньше 6
        int[] arrayResult3 = multiply(array3);
        for (int i = 0; i < arrayResult3.length; i++) {
            System.out.print(arrayResult3[i] + " | ");
        }
        System.out.println("");
        //Задание 4
        //Задаем массив
        int[] array4 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        //Проверяем метод поиска маскимального и минимального элемента
        System.out.print(maxAndMin(array4));
        System.out.println("");
        //Задание 5. Квадратный целочисленный массив заполняем единицами по диагонали.
        int[][] array5 = new int[5][5];
        for (int i = 0; i < array5.length; i++)
        {
            //Используем дополнительную переменную int a для заполнения диагонали из правого верхнего угла в левый нижний угол.
            for (int j = 0, a = array5.length - 1; j < array5.length; j++, a--)
            {
                if (i == j || i == a)
                {
                    array5[i][j] = 1;
                }
                else {
                    array5[i][j] = 0;
                }
                System.out.print(array5[i][j]);
            }
            System.out.println();
        }
        //Задание 6
        //Задаем массив
        int[] array6 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        //Задаем переменную n
        int n = -5;
        //Проверяем, выполнилось ли смещение
        int[] arrayResult6 = displase(array6, n);
        for (int i = 0; i < arrayResult6.length; i++) {
            System.out.print(arrayResult6[i] + " | ");
        }
    }
    //Метод, заменяющий 0 на 1, 1 на 0 (задание 1)
    public static int[] changeElementsArray(int[] arrayInput1) {
        for (int i = 0; i < arrayInput1.length; i++) {
            switch (arrayInput1[i]) {
            case 1:
             arrayInput1[i] = 0;
            break;
            case 0:
              arrayInput1[i] = 1;
            break;
             }
        }
        return arrayInput1;
    }
        //Метод, заполняющий массив (задание 2)
        public static int[] fillArray(int[] arrayInput2){
             arrayInput2[0] = 1;
       for (int i = 1; i< arrayInput2.length; i++){
            arrayInput2[i] = arrayInput2[i-1] + 3;
         }
            return arrayInput2;
       }
        //Метод, умножающий числа меньше 6 на 2 (задание 3)
        public static int[] multiply(int[] arrayInput3){
            for (int i = 0; i < arrayInput3.length; i++){
                arrayInput3[i] = (arrayInput3[i] > 6) ? arrayInput3[i]*2 : arrayInput3[i];
        }
        return arrayInput3;
    }
    //Метод поиска максимального и минимального элемента (задание 4)
    public static String maxAndMin(int[] arrayInput4){
            int max = arrayInput4[0];
            int min = arrayInput4[0];
        for (int i = 0; i < arrayInput4.length; i++){
             if (arrayInput4[i] > max) {
              max = arrayInput4[i];
           }
            if (arrayInput4[i] < min) {
               min = arrayInput4[i];
            }
        }
        return "Максимальный элемент в массиве "+ max +"\nМинимальный элемент в массиве "+ min;
    }
     //Метод, смещающий элементы на n (задание 6)
     public static int[] displase(int[] arrayinput6, int n){
        for (int i = 0; i< arrayinput6.length; i++){
            arrayinput6[i]=arrayinput6[i]+n;
        }
        return arrayinput6;
     }



}
