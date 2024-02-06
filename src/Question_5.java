import java.util.HashSet;

public class Question_5 {
//    given n array elements, check if there exists a subarray with sum = 0
    public static void main(String[] args) {
        int[] array = {2, 2, 1, -3, 4, 3, 1, -2, -3, 2};
        boolean isSum0 = isSubarraySum0(array);
        System.out.println("is subarray sum 0 : "+isSum0);
    }
    static boolean isSubarraySum0(int[] array){
        int[] ps = new int[array.length];
        ps[0] = array[0];
        for(int i=1;i< array.length;i++){
            ps[i] = ps[i-1] + array[i];
        }
        HashSet<Integer> hs = new HashSet<>();
        for(int i=0;i<ps.length;i++){
            hs.add(ps[i]);
        }
        if(hs.size()<ps.length || hs.contains(0)){
            return true;
        }else{
            return false;
        }
    }
}
