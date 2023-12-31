import java.awt.GridLayout;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        int[][] dataMatrix = {
            {2, 4, 6, 10},
            {2, 12, 6, 5},
            {7, 8, 3, 9},
            {14, 5, 8, 7}
        };

        int[][] matrix_copy = new int[dataMatrix.length][dataMatrix[0].length];
        for (int i = 0; i < dataMatrix.length; i++) {
            matrix_copy[i] = dataMatrix[i].clone();
        }

        Hungarian_algorithm ha = new Hungarian_algorithm(dataMatrix);
        int[][] assignment = ha.findOptimalAssignment();

        if (assignment.length > 0) {
            SwingUtilities.invokeLater(() -> {
                JFrame frame = new JFrame("Optimal Assignment Visualization");
                frame.setSize(1200, 800);
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setLocationRelativeTo(null);

                JPanel mainPanel = new JPanel(new GridLayout(1, 2));

                AssigmentPanel originalMatrixPanel = new AssigmentPanel(dataMatrix, assignment);
                mainPanel.add(originalMatrixPanel);

                HungarianDraw assignmentPanel = new HungarianDraw(matrix_copy, assignment);
                mainPanel.add(assignmentPanel);

                frame.add(mainPanel);

                frame.setVisible(true);
            });
        } else {
            System.out.println("No assignment found!");
        }
    }
}