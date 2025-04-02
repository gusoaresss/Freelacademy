package view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class MainView extends JFrame {
    private JButton btnOpenlogin;

    public MainView() {
        setTitle("Freelancer App");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Layout básico
        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());

        JLabel label = new JLabel("Bem-vindo ao Freelancer App!", SwingConstants.CENTER);
        panel.add(label, BorderLayout.CENTER);


        //botão para abrir a tela de login
        JButton btnOpenlogin = new JButton("Fazer login");
        btnOpenlogin.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new LoginView().setVisible(true);
                dispose();
            }
        });
        panel.add(btnOpenlogin, BorderLayout.SOUTH);



        setContentPane(panel);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new MainView().setVisible(true));
    }
}