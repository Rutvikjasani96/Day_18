import java.util.HashSet;

public class Question_4 {
//    given n array elements, check if all elements are distinct or not
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 7, 5, 6};
        boolean is_all_distinct = isAllDistinct(array);
        System.out.println("distinct : "+is_all_distinct);
    }
    static boolean isAllDistinct(int[] array){
        HashSet<Integer> hs = new HashSet<>();
        for(int i=0;i< array.length;i++){
            hs.add(array[i]);
        }
        if(hs.size() == array.length){
            return true;
        }
        return false;
    }
}
