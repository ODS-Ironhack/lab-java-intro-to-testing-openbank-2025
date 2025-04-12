import java.util.ArrayList;

public class OddNumbers {
    public static ArrayList<Integer> getOddNumbers(int num){
        int randomInt = 0;
        if(num == 0){
            throw new IllegalArgumentException("Debes introducir un número distinto a 0");
        } else if (num < 0){
            throw new IllegalArgumentException("Debes introducir un número superior a 0");
        }
        ArrayList<Integer> oddNumbers = new ArrayList<>();
        for (int i = 1 ;  i <= num; i++ ){
            if ( i % 2 != 0){
                oddNumbers.add(i);
            }
        }

        return oddNumbers ;
    }
}
