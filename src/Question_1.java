import java.util.HashMap;
import java.util.Scanner;

public class Question_1 {
//    find frequency of numbers.
//    given n array elements & q queries, for each query find frequency of each element in array.
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        int[] array = {2, 6, 3, 8, 2, 8, 2, 3, 8, 10};
        int q = 4;
        HashMap<Integer, Integer> hm = getFrequency(array);
        for(int i=0;i<q;i++){
            System.out.println("enter value : ");
            int query = x.nextInt();
            if(hm.containsKey(query)){
                System.out.println("frequency : "+hm.get(query));
            }else{
                System.out.println("frequency : 0");
            }
        }
    }
    static HashMap<Integer, Integer> getFrequency(int[] array){
        HashMap<Integer, Integer> hm = new HashMap<>();
        for(int i=0;i< array.length;i++){
            if(hm.containsKey(array[i])){
                hm.put(array[i], hm.get(array[i])+1);
            }else{
                hm.put(array[i], 1);
            }
        }
        return hm;
    }
}
