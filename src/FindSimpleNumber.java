
class FindSimpleNumber
{
    public static void main(String args [ ])
    {
        int countSimpleNumber = 0;

        for(int i = 2; i < 1000; ++i){

            int count = 0;
            for(int j = 2; j <=i && count < 2;++j){ // для j от 2 и пока количество делителей меньше 2
                if(i%j==0){ //если число делится без остатка, смотрим сколько делителей есть у данного числа
                    ++count;
                }
            }

            if(count<2) { //если делителей меньше 2, то выводим данное число
                ++countSimpleNumber; //увеличиваем количество простых чисел
                System.out.println(i);
            }


            if (countSimpleNumber == 100){ //если количество простых чисел равно 100, прерываем цикл
               // System.out.println(countSimpleNumber);
                break;
            }

        }
    }
}