package Logica;

import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
/*  import javax.swing.JFrame; */
import javax.swing.JPanel;


public class Tablero {
    public int x = 0;
    public int y = 0;

    public void crearTablero(int cantBotonesX, int cantBotonesY, JPanel frame) {
        int x = 0; //posicion en x
        int y = 0;  //posicion en y

        for (int row = 0; row < cantBotonesX; row++) {
            x = 0;
            y = y + 65;
            JButton btnNewButton = new JButton("Button " + (row * 3 + 1));
            btnNewButton.setBounds(51 + x, 0 + y, 50, 50);
            btnNewButton.setBackground(new Color(25, 53, 215));
            btnNewButton.setText("");
            btnNewButton.addMouseListener((MouseListener) new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    System.out.println("hola");
                }
            });
            for (int col = 0; col < cantBotonesY; col++) {
                x = x + 65;
                JButton btnNewButton2 = new JButton("Button " + (row * 3 + col + 1));
                btnNewButton2.setBounds(51 + x, 0 + y, 50, 50);
                btnNewButton2.setBackground(new Color(25, 53, 215));
                btnNewButton2.setText("");
                btnNewButton2.addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseClicked(MouseEvent e) {
                        System.out.println("hola");
                    }
                });
                frame.add(btnNewButton2);
            }
            frame.add(btnNewButton);
        }

    }
}
