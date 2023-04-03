package game;

import definitions.Colors;
import definitions.Roles;

public class Piece {
    protected int x = 0;
    protected int y = 0;
    private final Roles role = Roles.PIECE;
    protected final Colors color = Colors.BRANCO;
//    Piece(){
//        color = Colors.BRANCO;
//    }
    public Roles getRole() {
        return role;
    }
    public Colors getColor(){
        return color;
    }

    public int[] getPosition() {
        return new int[]{x, y};
    }

    /*
        public int[][] walk(){
            ArrayList<int[]> walkTiles = new ArrayList<>();
            for(int i = 0; i < 2; i++){
                walkTiles.add(new int[]{x+i, y+i});
                System.out.println(Arrays.toString(walkTiles.get(i)));
            }
            return new int[][]{walkTiles.get(0)};
        }
    */
    public int[][][] walkArea() {
//        int [][] walkable = {{x+1,y},{x,y+1}, {x-1,y},{x,y-1}};
//        return new int[][] {{x+1,y}};
        int[] xy = getPosition();
        int x = xy[0];
        int y = xy[1];
        int[][][] walkable =
                {
                        {{x, y}}
                };
        return walkable;
    }

    public final boolean canWalk(int[] xy) {
        int[][][] walkable = walkArea();
        for (int[][] directions : walkable) {
            for (int[] point : directions) {
                if (point == xy/* and there is no object*/) {
                    return true;
                }
            }
        }
        return false;
    }

    public int[][][] killArea() {
//        int[][] killable = {};
//        return new int[][] {{x+1,y+1},{x-1,y+1}};
//        return new int[][] {{}};
        int[] xy = getPosition();
        int[][][] killable =
                {
                        {{xy[0], xy[1]}}
                };
        return killable;
    }

    public final boolean canKill(int[] xy) {
        int[][][] killable = killArea();
        for (int[][] directions : killable) {
            for (int[] point : directions) {
                if (point == xy/* and there is no object*/) {
                    return true;
                }
            }
        }
        return false;

    }
}