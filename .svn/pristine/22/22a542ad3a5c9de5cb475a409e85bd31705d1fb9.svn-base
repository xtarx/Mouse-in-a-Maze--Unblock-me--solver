package ai_project1.aiodsjioasndo;

/**
 * @author XtarX
 */
public class MainClass {

    public static void MiM(String strategy, boolean visualize) {
        String pure_strategy = strategy.substring(0, 2);

        Board board = new Board(true);
        board.autoGenerate();
        board.display();

        if (pure_strategy.equalsIgnoreCase("BF")) {
            BFS problem = new BFS(board);
            problem.solve(visualize);
            return;
        }

        if (pure_strategy.equalsIgnoreCase("DF")) {
            DFS problem = new DFS(board);
            problem.solve(visualize);
            return;
        }


        if (pure_strategy.equalsIgnoreCase("ID")) {
            IDFS problem = new IDFS(board);
            problem.solve(visualize);
            return;
        }


        if (pure_strategy.equalsIgnoreCase("GR")) {
            int heuristic = Character.getNumericValue(strategy.charAt(2));
            Greedy problem = new Greedy(board, heuristic);
            problem.solve(visualize);
            return;
        }


        if (pure_strategy.equalsIgnoreCase("AS")) {
            int heuristic = Character.getNumericValue(strategy.charAt(2));
            Astar problem = new Astar(board, heuristic);
            problem.solve(visualize);
        }


    }

    public static void main(String[] args) {
        MiM("bf", true);


//        Board board = new Board(true);
//        board.display();
//        board.move(board.board, 2, 3, 'r');
//        board.display();
    }
}