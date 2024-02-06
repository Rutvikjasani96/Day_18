import java.util.HashSet;

public class Question_3 {
//    given n array elements find no. of distinct elements
    public static void main(String[] args) {
        int[] array = {3, 5, 6, 5, 4};
        int distinctEle = findDistinctEle(array);
        System.out.println("distinct elements : "+distinctEle);
    }
    static int findDistinctEle(int[] array){
        HashSet<Integer> hs = new HashSet<>();
        for(int i=0;i< array.length;i++){
            hs.add(array[i]);
        }
        return hs.size();
    }
}
