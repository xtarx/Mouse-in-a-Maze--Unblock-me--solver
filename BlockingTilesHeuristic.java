/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ai_project1.aiodsjioasndo;

/**
 *
 * @author XtarX
 */
public class BlockingTilesHeuristic extends heuristic {

    /**
     * Guesses distance to goal based on the number of tiles between the mouse
     * and the exit
     */
    @Override
    public int score(int[][] board) {
        int numBlocking = 0;
        int mouse = getMousePosition_X(board);
        for (int i = mouse + 1; i < 6; i++) {
            if (board[2][i] != 0) {
                numBlocking++;
            }
        }
        return numBlocking;
    }
}
