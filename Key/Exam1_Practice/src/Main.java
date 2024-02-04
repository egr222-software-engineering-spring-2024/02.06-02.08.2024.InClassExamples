import java.awt.*;

public class Main {

    public static void main(String[] args) {
        testDigitsInARow(345696777);    // 3 digits in a row ("777")
        testDigitsInARow(0);            // 1 digit in a row
        testDigitsInARow(456);          // 1 digit in a row
        testDigitsInARow(9907);         // 2 digits in a row ("99")

        drawFootball();
    }

    private static void testDigitsInARow(int x) {
        System.out.println("\"" + x + "\" has " + digitsInARow(x) + " digits in a row");
    }

    private static int digitsInARow(int x) {
        if (x < 0) x *= -1;
        if (x < 10) return 1; // 0 - 9

        int maxCount = 1;
        int count = 1;
        while ( x > 10 ) {
            int d1 = x % 10;
            int d2 = ( x / 10 ) % 10;
            if (d1 == d2) {
                count++;
                if (maxCount < count) maxCount = count;
            }
            else {
                count = 1;
            }
            x /= 10;
        }
        return maxCount;
    }

    private static void drawFootball() {
        DrawingPanel panel = new DrawingPanel(250,250);
        Graphics g = panel.getGraphics();

        int xFootballTopLeft = 10;
        int yFootballTopLeft = 30;
        int xFootballBottomRight = 210;
        int yFootballBottomRight = 230;

//        g.drawLine(xFootballTopLeft,yFootballTopLeft,xFootballBottomRight,yFootballTopLeft); // draw top border
//        g.drawLine(xFootballTopLeft,yFootballTopLeft,xFootballTopLeft,yFootballBottomRight); // left border
//        g.drawLine(xFootballBottomRight,yFootballTopLeft,xFootballBottomRight,yFootballBottomRight); // right border
//        g.drawLine(xFootballTopLeft,yFootballBottomRight,xFootballBottomRight,yFootballBottomRight); // bottom border

        for (int i = 0 ; i < 21 ; i ++ ) {
            g.drawLine(xFootballTopLeft, yFootballBottomRight - 10 * i, xFootballTopLeft + 10 * i, yFootballTopLeft);
            g.drawLine(xFootballTopLeft + i * 10, yFootballBottomRight, xFootballBottomRight, yFootballBottomRight - i * 10);
        }
    }
}