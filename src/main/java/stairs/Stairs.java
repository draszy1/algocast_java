package stairs;

public class Stairs {
    public static void main(String[] args) {
        Stairs stairs = new Stairs();
        stairs.drawStairs(20);

        System.out.println("--------------------------------------------------------------------");

        stairs.drawPyramid(20);
    }

    private void drawPyramid(int limit) {
        int middle = ((limit * 2) - 1) / 2;

        for (int row = 0; row < limit; row++) {
            String stair = "";

            for (int col = 0; col < (limit * 2) - 1; col++) {
                if (middle - row <= col && middle + row >= col) {
                    stair += "#";
                } else {
                    stair += " ";
                }
            }

            System.out.println("[" + stair + "]");
        }
    }

    private void drawStairs(int limit) {
        for (int row = 0; row < limit; row++) {
            String stair = "";

            for (int col = 0; col < limit; col++) {
                if (col <= row) {
                    stair += "#";
                } else {
                    stair += " ";
                }
            }

            System.out.println("[" + stair + "]");
        }
    }
}
