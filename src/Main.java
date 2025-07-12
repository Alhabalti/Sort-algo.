
public class Main {
    public static void main(String[] args) {
    int[] a ={1,5,3,5,7,97,6};

//    Sort(a);
//        for (int i = 0; i < a.length; i++) {
//            System.out.print(a[i] + " ");
//        }
//
    SortBubble3(a);
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
}
    public static void Sort(int[] a) {
    for ( int i = 0; i < a.length; i++ ) {
        int j= i;
        int t = a[j];
        while(j>0 && a[j-1]>t) {
            a[j] = a[j-1];
            j--;
        }
        a[j] = t;
    }
    }

    public static void SortBubble3(int[] a) {
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = 0; j < a.length - 1 -i; j++) {
                if (a[j] > a[j + 1]) {
                    int t = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = t;
                }
            }
        }
    }

    public static void SortBubble(int[] a) {
        for ( int i = 0; i < a.length ; i++ ) {
            int j= i;
            int t = a[j];
            while(j >=0 && a[j+1]<t && j< a.length) {
                a[j] = a[j+1];
                j++;
            }
            a[j] = t;
        }
    }

    public static void SortBubble2(int[] a) {
        for ( int i = 0; i < a.length ; i++ ) {
            for (int j = i; j < a.length; j++) {
                if (a[j] < a[j-1]) {
                    a[j] = a[j-1];
                    j++;
                }

            }
        }
    }
}
