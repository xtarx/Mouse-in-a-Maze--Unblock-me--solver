
import java.util.Stack;

public class DFS extends SearchProblem {

    Stack<Board> queue;

    public DFS(Board start) {
        queue = new Stack<>();
        queue.add(start);
    }

    @Override
    public void solve(boolean visualize) {
        System.out.println("Starting the DFS");
        long start_time = System.currentTimeMillis();

        if (queue.size() == 0) {
            System.out.println("Cant start with no Board");
            return;
        }
        Board temp = queue.pop();
        temp.previous_board = null;
        possibleMoves(temp);
        while (queue.size() != 0) {
            System.out.println("size : " + queue.size());
            if (isGoal(temp.board)) {
                if (visualize) {
                    temp.visualize();
                }
                System.out.println("gameover");
                System.out.println("Nodes Explored :" + this.explored.size());
                System.out.println("Nodes Explored- :" + this.explored_nodes);

                long total_time = System.currentTimeMillis() - start_time;
                System.out.println("Time Spent :" + total_time + " ms");
                return;
            }
            temp = queue.pop();
            possibleMoves(temp);
        }
        //queue is empty
        System.out.println("EMPTY QUEUE");
        long total_time = System.currentTimeMillis() - start_time;
        System.out.println("Time Spent :" + total_time + " ms");
//        temp.visualize();
        System.out.println("Nodes Explored :" + this.explored.size());
        System.out.println("Nodes Explored- :" + this.explored_nodes);

        if (isGoal(temp.board)) {
            if (visualize) {
                temp.visualize();
            }
            System.out.println("Game Over --Solution FOUND");
        } else {
            System.out.println("Game Over --Solution NOT found");
        }


    }

    @Override
    public void addtoQueue(Board board) {
        this.explored_nodes++;
        this.queue.add(board);
    }
}