/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ai_project1.aiodsjioasndo;

/**
 *
 * @author XtarX
 */
public class ManhattanCombo extends heuristic {

    /**
     * is a combination between the blocking tiles Heuristic and the manhattan
     * distance which is the distance between the mouse and the goal.     
     */
    @Override
    public int score(int[][] board) {
        int mouse = getMousePosition_X(board);
        int distance = (5 - mouse);
        BlockingTilesHeuristic BlockingTilesHeuristic = new BlockingTilesHeuristic();
        return distance + BlockingTilesHeuristic.score(board);
    }
}
