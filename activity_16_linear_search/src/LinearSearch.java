/*
 * CS 2050 - Computer Science II - Fall 2022
 * Instructor: Thyago Mota
 * Description: Activity 16 - LinearSearch
 */

public class LinearSearch {

    static boolean lsearch(int data[], int el) {
        for (int i = 0; i < data.length; i++)
            if (data[i] == el)
                return true;
        return false;
    }

    static boolean lsearch2(int data[], int el) {
        for (int i = 0; i < data.length; i++) {
            if (data[i] == el)
                return true;
            if (data[i] > el)
                break;
        }
        return false;
    }

    public static void main(String[] args) {
//        int data[] = { 3, 5, 1, 8, 12, 2, 7, 9 };
        int data[] = { 1, 2, 3, 5, 7, 8, 9, 12 };
        if (lsearch2(data, 8))
            System.out.println("Found!");
        else
            System.out.println("Not found!");
    }
}
