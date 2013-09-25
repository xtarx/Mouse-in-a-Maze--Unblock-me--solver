/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ai_project1.aiodsjioasndo;

/**
 *
 * @author XtarX
 */
public class heuristic {

    /*
     * returns the horizontal postion of the whole mouse (2 blocks)
     */
    public int getMousePosition_X(int[][] b) {
        int mouse_position = 0;
        for (int i = 0; i < b[2].length; i++) {
            if ((b[2][i] == 1)) {
                mouse_position = i;
            }
        }
        return mouse_position + 1;
    }

    public int score(int[][] board) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}