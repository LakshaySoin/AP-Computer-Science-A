import java.util.*;

public class BackTrackTravel {

    public static int solutions = 0;

    public static void main(String[] args) {
        System.out.println("Enter (x, y) coordinates as two integers separated by a space: ");
        Scanner console = new Scanner(System.in);
        int x, y;
        x = console.nextInt();
        y = console.nextInt();
        ArrayList<String> path = new ArrayList<String>();
        dfs(0, 0, x, y, path);
        System.out.println("Number of paths = " + solutions);
    }

    public static void dfs(int x1, int y1, int x2, int y2, ArrayList<String> path) {
        if (x1 > x2 || y1 > y2) return;
        if (x1 == x2 && y1 == y2) {
            solutions++;
            if (x1 == 0 && y1 == 0) System.out.print("moves:");
            else System.out.print("moves: ");
            for (int i = 0; i < path.size(); i++) {
                if (i == path.size() - 1) System.out.print(path.get(i));
                else System.out.print(path.get(i) + " ");
            }
            System.out.println();
            return;
        }
        ArrayList<String> north_path = new ArrayList<String>();
        ArrayList<String> north_east_path = new ArrayList<String>();
        ArrayList<String> east_path = new ArrayList<String>();
        north_path = (ArrayList)path.clone();
        north_east_path = (ArrayList)path.clone();
        east_path = (ArrayList)path.clone();
        north_path.add("N");
        north_east_path.add("NE");
        east_path.add("E");
        dfs(x1, y1+1, x2, y2, north_path);
        dfs(x1+1, y1+1, x2, y2, north_east_path);
        dfs(x1+1, y1, x2, y2, east_path);
    }


}
