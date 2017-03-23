/**
 * Created by Mahima on 11/11/2016.
 */
public class FindMaze {
    int x = 0;
    int y = 0;
    int[][] input;
//    int[][] backtrackGrid = new int[50][50];

    FindMaze(int[][] input)
    {
        this.input = input;
    }
    boolean isPathExists(int[][] backtrackGrid)
    {
        this.x =0;
        this.y =0;
        System.out.print(input.length);
        if(input[0][0] != 0)
        {
            System.out.println("here");
            return false;
        }
        else
        {
            backtrackGrid[x][y] = 0;
           return findPath(x,y,backtrackGrid);
        }
        //return false;
    }
    boolean findPath(int x , int y,int[][] backtrackGrid) {

        // while(x<input.length && y<input[x].length){
boolean response = false;
        if (x >= 0 && y >= 0 && x < input.length && y < input[x].length) {

            if (x == input.length - 1 && y == input[y].length - 1) {
                return true;
            }
            if (input[x][y + 1] == 0 && backtrackGrid[x][y+1] != 1) {
                backtrackGrid[x][y+1] = 0;

                findPath(x, y + 1, backtrackGrid);
            } else {
                if (input[x + 1][y] == 0 && backtrackGrid[x][y+1] != 1) {
                    backtrackGrid[x+1][y] = 0;
                    findPath(x+1, y, backtrackGrid);
                    //   backtrackGrid(prev_x, prev_y, input);
                } else
                    backtrackGrid(x, y, backtrackGrid);

            }
        }
        return  false;
    }
    void backtrackGrid(int x , int y, int[][] backtrackGrid)
    {

        backtrackGrid[x][y] =1;
        if(y>0 && backtrackGrid[x][y-1]==0)
        {
            x=x;
            y=y-1;
            return;
        }
        else if(x>0 && backtrackGrid[x-1][y]==0)
        {
            x=x-1;
            y=y;
        }

    }
    public static void main(String args[])
    {

        int input[][] = {{0,0,0,1,1,1},
                {0,0,0,1,0,1},
                {0,1,0,0,0,1},
                {1,0,1,0,1,0},
                {0,0,1,0,0,1},
                {1,1,1,0,0,0},
                {1,1,1,0,0,0}};

        int backtrackGrid[][] = {{-1,-1,-1,-1,-1,-1},
                {-1,-1,-1,-1,-1,-1},
                {-1,-1,-1,-1,-1,-1},
                {-1,-1,-1,-1,-1,-1},
                {-1,-1,-1,-1,-1,-1},
                {-1,-1,-1,-1,-1,-1},
                {-1,-1,-1,-1,-1,-1}};

        FindMaze fm = new FindMaze(input);

        System.out.println(fm.isPathExists(backtrackGrid));
    }
}
