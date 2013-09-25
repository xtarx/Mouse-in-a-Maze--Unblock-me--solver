
import java.util.Comparator;
import java.util.PriorityQueue;

public class Astar extends SearchProblem {

    PriorityQueue<Board> queue;
    int heuristic;

    public Astar(Board start, int heuristic) {
        this.heuristic = heuristic;
        Comparator<Board> comparator = new BoardLengthComparator_Astar();
        queue = new PriorityQueue<>(1, comparator);
        queue.add(start);
    }

    @Override
    public void solve(boolean visualize) {

        System.out.println("Starting the Astar");
        long start_time = System.currentTimeMillis();


        if (queue.size() == 0) {
            System.out.println("Cant start with no Board");
            return;
        }
        Board temp = queue.remove();
        temp.previous_board = null;
        possibleMoves(temp);
        while (queue.size() != 0) {
            System.out.println("size : " + queue.size());
            if (isGoal(temp.board)) {
                if (visualize) {
                    temp.visualize();
                }
                System.out.println("Game Over --Solution FOUND");
                System.out.println("Nodes Explored :" + this.explored.size());
                System.out.println("Nodes Explored- :" + this.explored_nodes);

                long total_time = System.currentTimeMillis() - start_time;
                System.out.println("Time Spent :" + total_time + " ms");
                return;
            }
            temp = queue.remove();
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

        switch (this.heuristic) {
            case '1':
                BlockingTilesHeuristic BlockingTilesHeuristic = new BlockingTilesHeuristic();
                board.heuristic = BlockingTilesHeuristic.score(board.board);
                board.cost = board.previous_board.cost + board.heuristic;
                break;
            case '2':
                ManhattanCombo ManhattanCombo = new ManhattanCombo();
                board.heuristic = ManhattanCombo.score(board.board);
                board.cost = board.previous_board.cost + board.heuristic;
                break;
        }
        this.explored_nodes++;
        this.queue.add(board);
    }
}