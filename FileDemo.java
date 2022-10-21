import java.io.File;
import java.util.ArrayDeque;
import java.util.Deque;

public class FileDemo {
    public static void main(String[] args) {


        /**
         *
         *  Examples: Depth-First Search (DFS) and Breadth-first search (BFS)
         *
         *  */


        /**
         *
         * first example, use BFS...
         *
         * */
        System.out.println("-------Start BFS-------");

        String fullFileName = "C:\\Users\\hp\\OneDrive\\Картини\\Екранни снимки\\testJava";
        File root = new File(fullFileName);

        Deque<File> dirs = new ArrayDeque<>();
        dirs.offer(root);

        int count = 0;

        while (!dirs.isEmpty()) {
            File currentFile = dirs.poll();
            File[] nestedFiles = currentFile.listFiles();
            for (File nestedFile : nestedFiles) {
                if (nestedFile.isDirectory()) {
                    dirs.offer(nestedFile);
                }
                count++;
                System.out.println(nestedFile.getName());
            }
        }

        System.out.println("-------End BFS-------");

        /**
         *
         * second example, use DFS...
         *
         * */
        System.out.println("-------Start DFS-------");

        String fullFileName2 = "C:\\Users\\hp\\OneDrive\\Картини\\Екранни снимки\\testJava";
        File root2 = new File(fullFileName);

        dfs(root2);

        System.out.println("-------End DFS-------");


    }

    private static void dfs(File file) {

        File[] files = file.listFiles();

        for (File f : files) {
            if (f.isDirectory()) {
                dfs(f);
            } else {
                System.out.println(f.getName());
            }
        }

        System.out.println(file.getName());
    }
}
