package tudelft.numfinder;

public class NumFinderMain {

    public static void main (String[] args) {
        NumFinder nf = new NumFinder();

        // this works
        // nf.find(new int[] {4, 25, 7, 9});

        // this crashes
        nf.find(new int[] {4, 3, 123, 2, 1, -1});

        System.out.println("Greatest number: " + nf.getLargest());
        System.out.println("Smallest number: " + nf.getSmallest());
    }
}
