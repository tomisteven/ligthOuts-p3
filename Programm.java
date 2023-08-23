import javax.swing.*;

import java.awt.*;

public class Programm {
    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception e) {
            e.printStackTrace();
        }

        JFrame frame = new JFrame("JFrame");

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(494,494);
        frame.setLayout(new GridBagLayout());

		JButton element_1692759579274 = new JButton("button");
        GridBagConstraints constraints_element_1692759579274 = new GridBagConstraints();
        constraints_element_1692759579274.gridx = 5;
        constraints_element_1692759579274.gridy = 2;
        constraints_element_1692759579274.gridwidth = 2;
        constraints_element_1692759579274.gridheight = 1;
        constraints_element_1692759579274.fill = GridBagConstraints.HORIZONTAL;
        frame.add(element_1692759579274, constraints_element_1692759579274);


        frame.setVisible(true);
    }
}
