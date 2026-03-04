package Search;
import java.util.ArrayList;

public class Search {
    ArrayList<Integer> arr;

    /**
     * Create a search object for integer array searching
     * 
     * @param arr : Integer array input
     * 
     **/
    public Search(int... arr) {
        this.arr = new ArrayList<Integer>();
        for (int i : arr) {
            this.arr.add(i);
        }
    }

    public boolean linearSearch(int target) {
        for (int i : arr) {
            if (i == target) {
                return true;
            }
        }
        return false;
    }

    /**
     * Binary searches the array if sorted
     * 
     * @param target
     * @return true if element is found, otherwise false
     */
    public boolean binarySearch(int target) {
        boolean rev=false;
        // Sorting pass check
        if (arr.get(0) > arr.get(1)){
            rev = true;
        }
        for (int i = 1; i < arr.size(); i++) {
            if(rev){
                if(arr.get(i) <= arr.get(i-1)){
                    continue;
                }
                else{
                    System.err.println("Unsorted array ! Index:"+i +", Rev");
                    return false;
                }
            }
            else{
                if(arr.get(i) >= arr.get(i-1)){
                    continue;
                }
                else{
                    System.err.println("Unsorted array ! Index:"+i);
                    return false;
                }
            }
        }
        return true;
    }
}