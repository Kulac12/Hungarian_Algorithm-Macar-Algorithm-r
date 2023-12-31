import javax.swing.*;
import java.awt.*;

class AssigmentPanel extends JPanel {
    private int[][] dataMatrix;
    private int[][] assignment;

    public AssigmentPanel(int[][] dataMatrix, int[][] assignment) {
        this.dataMatrix = dataMatrix;
        this.assignment = assignment;
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        int cellSize = 40;
        int padding = 100;

        // Draw original matrix
        drawMatrix(g, "Sonuç Graf", dataMatrix, padding, padding, cellSize);
        

        // Draw rows as red dots with initial weights
        g.setColor(Color.RED);
        for (int i = 0; i < dataMatrix.length; i++) {
            int x = padding + (dataMatrix[i].length + 1) * cellSize;
            int y = padding + i * cellSize;

            g.fillOval(x, y, 10, 10); // Red dot representing row
            g.drawString("Row " + i , x + 15, y + 10);
        }

        // Draw columns as black dots with initial weights
        g.setColor(Color.BLACK);
        for (int j = 0; j < dataMatrix[0].length; j++) {
            int x = padding + j * cellSize;
            int y = padding - 20;

            g.fillOval(x, y, 10, 10); // Black dot representing column
            g.drawString("Col " + j , x + 0, y - 10);
        }

        // Draw connections based on the optimal assignment with weights
        g.setColor(Color.RED);
        for (int[] pair : assignment) {
            int col = pair[0];
            int row = pair[1];

            int x1 = padding + (dataMatrix[row].length + 1) * cellSize + 5;
            int y1 = padding + row * cellSize + 5;

            int x2 = padding + col * cellSize + 5;
            int y2 = padding - 20 + 5;

            g.drawLine(x1, y1, x2, y2);
            g.drawString(String.valueOf(dataMatrix[row][col]), (x1 + x2) / 2, (y1 + y2) / 2);
        }
    }

  
    

    private void drawMatrix(Graphics g, String title, int[][] matrix, int offsetX, int offsetY, int cellSize) {
        g.setColor(Color.BLACK);
        g.setFont(new Font("Arial", Font.BOLD, 16));
        g.drawString(title, offsetX, offsetY - 50);

  
    }
}