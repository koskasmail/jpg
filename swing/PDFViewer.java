import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.rendering.PDFRenderer;

import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class PDFViewer extends JFrame {
    private JLabel imageLabel;

    public PDFViewer() {
        setTitle("PDF Viewer");
        setSize(800, 600);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        imageLabel = new JLabel();
        JScrollPane scrollPane = new JScrollPane(imageLabel);
        getContentPane().add(scrollPane);

        JFileChooser fileChooser = new JFileChooser();
        int option = fileChooser.showOpenDialog(this);

        if (option == JFileChooser.APPROVE_OPTION) {
            File file = fileChooser.getSelectedFile();
            try {
                PDDocument document = PDDocument.load(file);
                PDFRenderer renderer = new PDFRenderer(document);

                // Display the first page of the PDF
                BufferedImage image = renderer.renderImage(0);
                ImageIcon icon = new ImageIcon(image);
                imageLabel.setIcon(icon);

                document.close();
            } catch (IOException e) {
                JOptionPane.showMessageDialog(this, "Error reading PDF file: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            PDFViewer viewer = new PDFViewer();
            viewer.setVisible(true);
        });
    }
}
