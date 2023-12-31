import javax.swing.*;
import java.awt.*;

class HungarianDraw extends JPanel {
    private int[][] dataMatrix;
    private int[][] assignment;

    public HungarianDraw(int[][] dataMatrix, int[][] assignment) {
        this.dataMatrix = dataMatrix;
        this.assignment = assignment;
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        int cellSize = 40;
        int padding = 100;

        // Draw original matrix
        drawMatrix(g, "Orijinal Graf", dataMatrix, padding, padding, cellSize);
    }

    private void drawMatrix(Graphics g, String title, int[][] matrix, int offsetX, int offsetY, int cellSize) {
        g.setColor(Color.BLACK);
        g.setFont(new Font("Arial", Font.BOLD, 16));
        g.drawString(title, offsetX, offsetY - 50);

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                g.setColor(Color.GRAY);
                g.fillRect(offsetX + j * cellSize, offsetY + i * cellSize, cellSize, cellSize);

                g.setColor(Color.BLACK);
                g.drawRect(offsetX + j * cellSize, offsetY + i * cellSize, cellSize, cellSize);

                g.setColor(Color.BLACK);
                g.drawString(Integer.toString(matrix[i][j]), offsetX + j * cellSize + cellSize / 2 - 5, offsetY + i * cellSize + cellSize / 2 + 5);

                //Eklenen kisim: Col ve Row etiketleri
                g.setColor(Color.BLUE);
                g.drawString("Col" + j, offsetX + j * cellSize + cellSize / 2 - 15, offsetY - 15);
                g.drawString("Row" + i, offsetX +170, offsetY + i * cellSize + cellSize / 2 + 5);
            }
        }
    }
}
