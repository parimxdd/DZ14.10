public class puziriki {
    public static void main(String[] args) {
        int[] moimassiv = {12, 22, 99, 5, 24, 18, 25, 0};// создание массива с типом данных инт;
        int vremenno;//создаем переменную для хранения
        boolean sortic = false;//создали переменную логического типа boolean для того чтобы было удобно работать с выражениями ложными или истинными. При помощи этой переменной мы можем определитьнужно ли нам повторять цикл
        while (!sortic){
            sortic=true;//запускаем цикл, он будет работать до тех пор пока переменная не примет значение тру

            for (int i=0; i<moimassiv.length-1; i++){
                if (moimassiv[i]>moimassiv[i+1]){
                    vremenno=moimassiv[i];
                    moimassiv[i]=moimassiv[i+1];
                    moimassiv[i+1]=vremenno;
                    sortic=false;//переменную нужно вернуть в false чтобы цикл повторился еще раз

                }

            }
        }
        System.out.println(moimassiv.length);//узнаю размер массива

        
        for (int i:moimassiv){
            System.out.println(i);
        }

    }

}




