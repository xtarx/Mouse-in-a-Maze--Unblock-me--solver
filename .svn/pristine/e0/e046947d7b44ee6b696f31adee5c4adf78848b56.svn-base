/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ai_project1.aiodsjioasndo;

import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author XtarX
 */
public class SearchProblem implements SeachInterface {

    Queue<Board> explored;
    int explored_nodes = 0;

    public void clearExplored() {
        this.explored = new LinkedList<>();
    }

    public SearchProblem() {
        explored = new LinkedList<>();
    }

    @Override
    public void solve(boolean visualize) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void addtoQueue(Board board) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void possibleMoves(Board b) {
        for (int i = 0; i < b.board.length; i++) {
            for (int j = 0; j < b.board[i].length; j++) {

                //copy to TempBoard
                Board tempBoard = new Board();
                tempBoard.copy(b.board);
                //end of TempBoard

                switch (b.board[i][j]) {
                    case 1: //mouse


                    case 6:
                        try {
                            if (b.board[i][j - 1] == 0) {
                                tempBoard.board = tempBoard.move(tempBoard.board, i, j, 'l');
                                if (tempBoard.canAdd(tempBoard.board, this.explored)) {
                                    tempBoard.previous_board = b;
                                    addtoQueue(tempBoard);
                                    explored.add(tempBoard);
                                }
                            }
                        } catch (Exception e) {
                        }

                        break;
                    case 2://mouse


                    case 7:
                        try {
                            if (b.board[i][j + 1] == 0) {
                                tempBoard.board = tempBoard.move(tempBoard.board, i, j, 'r');
                                if (tempBoard.canAdd(tempBoard.board, this.explored)) {
                                    tempBoard.previous_board = b;
                                    addtoQueue(tempBoard);
                                    explored.add(tempBoard);
                                }
                            }
                        } catch (Exception e) {
                        }

                        break;

                    case 3:
                        try {
                            if (b.board[i - 1][j] == 0) {
                                tempBoard.board = tempBoard.move(tempBoard.board, i, j, 'u');
                                if (tempBoard.canAdd(tempBoard.board, this.explored)) {
                                    tempBoard.previous_board = b;
                                    addtoQueue(tempBoard);
                                    explored.add(tempBoard);
                                }
                            }
                        } catch (Exception e) {
                        }

                        break;

                    case 4:
                        try {
                            if (b.board[i + 1][j] == 0) {
                                tempBoard.board = tempBoard.move(tempBoard.board, i, j, 'd');
                                if (tempBoard.canAdd(tempBoard.board, this.explored)) {
                                    tempBoard.previous_board = b;
                                    addtoQueue(tempBoard);
                                    explored.add(tempBoard);
                                }
                            }
                        } catch (Exception e) {
                        }

                        break;

                }
            }
        }
    }

    @Override
    public boolean isGoal(int[][] board) {
        if (board[2][5] == 2) {
            return true;
        }
        return false;
    }
}