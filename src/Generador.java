import java.util.ArrayList;
import java.util.List;

public class Generador {
    public static int[] generate(int size){
        int[] array = new int[size];
        for(int i = 0;  i < size ; i ++){
            array[i]=(int)(Math.random() * size);
        }
        return array;
    }
}
