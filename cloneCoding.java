import java.util.Collections;
import java.util.Array;
import java.util.ArrayList;

public class LottoMachine{
    public static void main(String[] args){
        ArrayList<Integer> list=new ArrayList<Integer>();
        for(int i=1;i<46;i++){
            list.add(i);
        }
        
        Collections.Shuffle(list);
        int[] arr = new int[6];
        for(int i=0;i<6;i++){
            arr[i]=list.get(i);
        }
        String result = Arrays.toString(arr);

        System.out.printf("%s\n", result);
    }
}