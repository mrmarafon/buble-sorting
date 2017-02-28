package sorting1;

public class Sorting1 {

    public static void main(String[] args) {
        int m[] = new int[]{7, 5, 12, 0, -3, -5, 10};
        int min;
        int tmp, pos;
        for (int j = 0; j < m.length - 1; j++) {
            min = m[j];
            pos = j;
            for (int i = j + 1; i < m.length; i++) {
                //System.out.print(m[i] + " ");
                if (m[i] < min) {
                    min = m[i];
                    pos = i;
                }
            }
            System.out.println("Min= " + min);
            tmp = m[j];
            m[j] = min;
            m[pos] = tmp;
            for (int i = 0; i < m.length; i++) {
                System.out.print(m[i] + " ");
            }
            // System.out.println(m[0]+" "+tmp);
        }
    }
}
