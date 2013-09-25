/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Comparator;

/**
 *
 * @author XtarX
 */
import java.util.Comparator;

public class BoardLengthComparator_Astar implements Comparator {

    @Override
    public int compare(Object o1, Object o2) {

        Board b1 = (Board) o1;
        Board b2 = (Board) o2;
        int j1 = ((Integer) b1.heuristic + b1.cost);
        int j2 = ((Integer) b2.heuristic + b2.cost);
        //  return (j1 < j2 ? -1 : (j1 == j2 ? 0 : 1));

        return (j1 < j2 ? -1 : ((j1 == j2 && b1.time<b2.time) ? 0 : 1));

    }
}