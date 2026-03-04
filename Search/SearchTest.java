package Search;

public class SearchTest {
    public static void main(String[] args) {
        try {
            searchSorted();
            searchRandom();
            System.out.println("Tests passed successfully !");
        } catch (Error e) {
            System.err.println(e);
        }
    }

    private static void searchSorted() {
        Search s = new Search(1, 2, 3, 4, 5, 7);
        assert s.linearSearch(4) == true : "Error in Linear search (Sorted)";
        assert s.binarySearch(5) == true : "Error in Binary search (Sorted)";
    }

    private static void searchRandom() {
        Search s = new Search(1, 4, 3, -4, 7, 2, 11);
        assert s.linearSearch(-1) == false : "Error in linear search (Random)";
        assert s.linearSearch(-4) ==true : "Error in linear search (Random)";
        assert s.binarySearch(2) == false : "Error in binary search (Random)";
    }
}
