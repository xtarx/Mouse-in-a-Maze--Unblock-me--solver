/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ai_project1.aiodsjioasndo;

import java.util.Comparator;

/**
 *
 * @author XtarX
 */
import java.util.Comparator;

public class BoardLengthComparator implements Comparator {

    @Override
    public int compare(Object o1, Object o2) {

        Board b1 = (Board) o1;
        Board b2 = (Board) o2;
        int j1 = ((Integer) b1.heuristic);
        int j2 = ((Integer) b2.heuristic);
        //  return (j1 < j2 ? -1 : (j1 == j2 ? 0 : 1));
        return (j1 < j2 ? -1 : ((j1 == j2 && b1.time < b2.time) ? 0 : 1));

    }
}