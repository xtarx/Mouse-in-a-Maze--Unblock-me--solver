package ai_project1.aiodsjioasndo;

import java.util.Arrays;
import java.util.Queue;
import java.util.Stack;

public class Board {

    public int[][] board;
    public Board previous_board;
    public int cost; //cost to be used in the hurstic fucntion
    public int heuristic;
    public long time = System.currentTimeMillis();

    Board() {
        board = new int[6][6];
    }

    void display() {
        System.out.println();

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();

    }

    void autoGenerate() {
        int mousePosition = (int) (Math.random() * 4);
        board = new int[][]{{0, 0, 0, 0, 0, 0}, {0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0}, {0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0}, {0, 0, 0, 0, 0, 0}};
        board[2][mousePosition] = 1;
        board[2][mousePosition + 1] = 2;
        int counter = 0;
        for (int i = 0; i < 100000 && counter < 6; i++) {
            try {
                int row = (int) (Math.random() * 6);
                int col = (int) (Math.random() * 6);
                double orientation = Math.random();
                if (orientation <= 0.5) {
                    if (board[row][col] == 0 && board[row][col + 1] == 0) {
                        board[row][col] = 6;
                        board[row][col + 1] = 7;
                        counter++;
                    }
                } else {
                    if (orientation < 0.75) {
                        if (board[row][col] == 0 && board[row + 1][col] == 0) {
                            board[row][col] = 3;
                            board[row + 1][col] = 4;
                            counter++;
                        }
                    } else {
                        if (board[row][col] == 0 && board[row + 1][col] == 0
                                && board[row + 2][col] == 0) {
                            board[row][col] = 3;
                            board[row + 1][col] = 5;
                            board[row + 2][col] = 4;
                            counter++;
                        }
                    }
                }
            } catch (Exception e) {
                // TODO: handle exception
            }
        }
    }

    public Board(boolean x) {
        if (x == true) {
            board = new int[][]{
                //                {3, 6, 7, 6, 7, 0},
                //                {4, 0, 0, 0, 0, 0},
                //                {1, 2, 3, 0, 0, 0},
                //                {0, 0, 4, 3, 3, 0},
                //                {6, 7, 0, 5, 5, 0},
                //                {0, 0, 0, 4, 4, 0}};

                //                                {6, 8, 7, 3, 3, 3},
                //                                {3, 6, 7, 4, 5, 5},
                //                                {4, 0, 1, 2, 4, 4},
                //                                {6, 7, 3, 0, 0, 0},
                //                                {0, 3, 4, 0, 3, 4},
                //                                {0, 4, 3, 4, 3, 4}};

                //                {3, 6, 7, 6, 7, 3},
                //                {4, 0, 3, 0, 3, 5},
                //                {1, 2, 4, 3, 5, 4},
                //                {3, 3, 3, 4, 4, 3},
                //                {5, 5, 5, 3, 3, 5},
                //                {4, 4, 4, 4, 4, 4}};

                //                                                {0, 0, 0, 0, 0, 0},
                //                                                {0, 0, 0, 0, 0, 0},
                //                                                {1, 2, 0, 0, 0, 0},
                //                                                {0, 0, 0, 0, 3, 0},
                //                                                {0, 0, 0, 3, 4, 0},
                //                                                {0, 0, 0, 4, 6, 7}};

                //                {6, 7, 6, 7, 3, 3},
                //                {3, 0, 6, 7, 4, 5},
                //                {4, 3, 3, 1, 2, 4},
                //                {0, 4, 5, 6, 7, 0},
                //                {0, 0, 4, 0, 0, 0},
                //                {6, 7, 0, 0, 0, 0}};

                //                {0, 0, 6, 7, 6, 7},
                //                {0, 6, 7, 6, 7, 3},
                //                {0, 0, 1, 2, 3, 5},
                //                {6, 7, 6, 7, 4, 4},
                //                {3, 0, 0, 3, 6, 7},
                //                {4, 0, 0, 4, 6, 7}};

                //HARD
                //                                {0, 0, 6, 7, 6, 7},
                //                                {0, 6, 7, 6, 7, 3},
                //                                {0, 0, 1, 2, 3, 5},
                //                                {6, 7, 6, 7, 4, 4},
                //                                {3, 0, 0, 3, 6, 7},
                //                                {4, 0, 0, 4, 6, 7}};

                //hardest

                //                {0, 0, 6, 7, 6, 7},
                //                {0, 6, 7, 6, 7, 3},
                //                {0, 0, 1, 2, 3, 5},
                //                {6, 7, 6, 7, 4, 4},
                //                {3, 0, 0, 3, 6, 7},
                //                {4, 0, 0, 4, 6, 7}};

                //HARDEST PROBLEM EVER
                //                {6, 8, 7, 3, 3, 3},
                //                {3, 6, 7, 4, 5, 5},
                //                {4, 0, 1, 2, 4, 4},
                //                {6, 7, 3, 0, 0, 0},
                //                {0, 3, 4, 0, 6, 7},
                //                {0, 4, 6, 7, 6, 7}};

                {0, 0, 6, 7, 6, 7},
                {0, 6, 7, 6, 7, 3},
                {0, 0, 1, 2, 3, 5},
                {6, 7, 6, 7, 4, 4},
                {3, 0, 0, 3, 6, 7},
                {4, 0, 0, 4, 6, 7}};

            //shady
            //                {0, 0, 0, 0, 0, 0},
            //                {0, 0, 0, 0, 0, 0},
            //                {1, 2, 0, 0, 3, 3},
            //                {0, 0, 0, 0, 4, 4},
            //                {0, 0, 0, 0, 0, 0},
            //                {0, 0, 0, 0, 0, 0}};

            //shady
            //                                {0, 0, 0, 0, 0, 0},
            //                                {0, 0, 0, 0, 0, 0},
            //                                {1, 2, 0, 0, 0, 3},
            //                                {0, 0, 0, 0, 0, 4},
            //                                {0, 0, 0, 0, 0, 0},
            //                                {0, 0, 0, 0, 0, 0}};

            // No solution    
//                {0, 3, 0, 0, 0, 0},
//                {0, 4, 0, 6, 7, 0},
//                {1, 2, 0, 6, 7, 0},
//                {0, 6, 7, 0, 0, 3},
//                {0, 0, 0, 0, 0, 4},
//                {6, 7, 0, 0, 0, 0}};

            // 3 tiles    
//                {0, 3, 0, 0, 0, 0},
//                {0, 4, 6, 8, 7, 0},
//                {1, 2, 0, 6, 7, 0},
//                {0, 6, 7, 0, 0, 3},
//                {0, 0, 0, 0, 0, 4},
//                {6, 7, 0, 0, 0, 0}};


        }
    }
    /*
     * converts the Board object to string , for efficency purposes
     */

    public String stringify(int[][] board) {
        String final_string = "";
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                final_string += board[i][j] + " ";
            }
            final_string += "\n";
        }
        return final_string;
    }

    public void copy(int[][] board) {
        for (int i = 0; i < board.length; i++) {
            System.arraycopy(board[i], 0, this.board[i], 0, board[i].length);
        }

    }

    public int currentLevel() {
        Board b = this;
        int steps = 0;
        while (b.previous_board != null) {
            b = b.previous_board;
            steps++;
        }
        return steps;
    }

    public void visualize() {
        Board b = this;
        System.out.println("------ D I S P L A Y ----------");
        Stack<String> stack = new Stack();
        while (b.previous_board != null) {
            stack.add(stringify(b.previous_board.board));
            b = b.previous_board;
        }
        int steps = stack.size();
        while (!stack.empty()) {
            System.out.println(stack.pop());
        }
        System.out.println("------ Done in  " + steps + " steps");
    }

    /*
     * Move a specific tile in a specific direction and returns the new board
     * after that move
     */
    int[][] move(int[][] board, int i, int j, char move) {
        switch (move) {
            case 'l':
//                board[i][j - 1] = board[i][j];
//                board[i][j] = board[i][j + 1];
//                board[i][j + 1] = 0;
                board[i][j - 1] = board[i][j];
                board[i][j] = board[i][j + 1];
                if (board[i][j] == 8) {
                    board[i][j + 1] = board[i][j + 2];
                    board[i][j + 2] = 0;
                } else {
                    board[i][j + 1] = 0;
                }
                break;



            case 'r':
//                board[i][j + 1] = board[i][j];
//                board[i][j] = board[i][j - 1];
//                board[i][j - 1] = 0;

                board[i][j + 1] = board[i][j];
                board[i][j] = board[i][j - 1];
                if (board[i][j - 1] == 8) {
                    board[i][j - 1] = board[i][j - 2];
                    board[i][j - 2] = 0;
                } else {
                    board[i][j - 1] = 0;
                }

                break;


            case 'u':
                board[i - 1][j] = board[i][j];
                board[i][j] = board[i + 1][j];
                if (board[i + 1][j] == 5) {
                    board[i + 1][j] = board[i + 2][j];
                    board[i + 2][j] = 0;
                } else {
                    board[i + 1][j] = 0;
                }
                break;

            case 'd':
                board[i + 1][j] = board[i][j];
                board[i][j] = board[i - 1][j];
                if (board[i - 1][j] == 5) {
                    board[i - 1][j] = board[i - 2][j];
                    board[i - 2][j] = 0;
                } else {
                    board[i - 1][j] = 0;
                }
                break;
        }
        return board;
    }
    /*
     * Makes sure that the no explored state can be repeated , returns true in
     * case that the board configuration is unqiueq false otherwise
     */

    public boolean canAdd(int[][] board, Queue<Board> explored) {
        if (explored.isEmpty()) {
            return true;
        }
        for (Board temp : explored) {
            boolean found = Arrays.deepEquals(board, temp.board);
            if (found) {
                return false;
            }
        }
        return true;
    }
}