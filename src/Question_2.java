import java.util.HashMap;

public class Question_2 {
//    find the first non-repeating element
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 1, 2, 5};
        HashMap<Integer, Integer> hm = Question_1.getFrequency(array);
        int non_repeating_ele = firstNonRepeatingEle(hm,array);
        System.out.println("first no repeating element : "+non_repeating_ele);
    }
    static int firstNonRepeatingEle(HashMap<Integer, Integer> hm, int[] array){
        for(int i=0;i< array.length;i++){
            if(hm.get(array[i])==1){
                return array[i];
            }
        }
        return -1;
    }
}
