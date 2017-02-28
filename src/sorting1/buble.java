/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sorting1;

/**
 *
 * @author user
 */
public class buble {

    public static void main(String[] args) {
        int m[] = {7, 3, -2, 0, -5, 4};
        int tmp;
        for (int i = 0; i < m.length - 1; i++) {
            if (m[i] > m[i + 1]) {
                tmp = m[i];
                m[i] = m[i + 1];
                m[i + 1] = tmp;
            }
        }
        for (int i = 0; i < m.length; i++) {
            System.out.print(m[i] + " ");
        }

        System.out.println("");
    }
}
