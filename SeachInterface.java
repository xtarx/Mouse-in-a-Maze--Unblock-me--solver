/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author XtarX
 */
public interface SeachInterface {

    public void solve(boolean visualize);

    public void possibleMoves(Board board);

    public void addtoQueue(Board board);

    public boolean isGoal(int[][] board);
}
