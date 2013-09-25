package ai_project1.aiodsjioasndo;

import java.util.LinkedList;
import java.util.Queue;

public class IDFS extends SearchProblem {

    Queue<Board> queue;
    int depth = Integer.MAX_VALUE;
    //int depth = 1;
    Board start;

    public IDFS(Board start) {
        queue = new LinkedList<>();
        this.start = start;
        queue.add(start);
    }

    @Override
    public void solve(boolean visualize) {
        System.out.println("Starting the IDFS");
        long start_time = System.currentTimeMillis();

        if (queue.isEmpty()) {
            System.out.println("Cant start with no Board");
            return;
        }

        Board temp = queue.remove();
        temp.previous_board = null;
        possibleMoves(temp);
        int current_level = temp.currentLevel();

        // LIMITED 
        while (!queue.isEmpty()) {

            try {
                possibleMoves(temp);
                System.out.println("Current Level " + current_level);

                if (current_level > this.depth) {
                    System.out.println("Queue is Empty");
                    break;
                }

                if (isGoal(temp.board)) {
                    if (visualize) {
                        temp.visualize();
                    }
                    System.out.println("gameover");
                    System.out.println("Queue Size :" + this.queue.size());
                System.out.println("Nodes Explored :" + this.explored_nodes);
                    System.out.println("Current Level " + current_level);
                    long total_time = System.currentTimeMillis() - start_time;
                    System.out.println("Time Spent :" + total_time + " ms");
                    return;
                }

                temp = this.queue.remove();
                current_level = temp.currentLevel();

                // clearExplored();
            } catch (Exception e) {
                System.out.println("Game Over --Solution NOT found");
                System.out.println("Queue Size :" + this.queue.size());
                System.out.println("Nodes Explored :" + this.explored_nodes);

                long total_time = System.currentTimeMillis() - start_time;
                System.out.println("Time Spent :" + total_time + " ms");
            } catch (OutOfMemoryError e) {
                System.out.println("Game Over --Solution NOT found");
                System.out.println("Queue Size :" + this.queue.size());
                System.out.println("Nodes Explored :" + this.explored_nodes);

                long total_time = System.currentTimeMillis() - start_time;
                System.out.println("Time Spent :" + total_time + " ms");
                return;
            }
        }


        //queue is empty
        System.out.println("EMPTY QUEUE");
//        temp.visualize();
        long total_time = System.currentTimeMillis() - start_time;
        System.out.println("Time Spent :" + total_time + " ms");
        System.out.println("Nodes Explored :" + this.explored_nodes);
        if (isGoal(temp.board)) {
            if (visualize) {
                temp.visualize();
            }
            System.out.println("Game Over --Solution FOUND");
        } else {
            System.out.println("Game Over --Solution NOT found");
        }
        //queue is empty


    }

    @Override
    public void addtoQueue(Board board) {
        this.explored_nodes++;
        this.queue.add(board);
    }

}