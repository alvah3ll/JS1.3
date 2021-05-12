package HomeWorkApp8;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TextField extends JFrame {
    JTextField bigField, smallField;

    public TextField()
    {
        super("Здание для счетчика");
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        bigField = new JTextField("Число на счетчике должно быть больше 10,но меньше 15.Введите одно из чисел в нижнюю строку.",80);
        bigField.setToolTipText("Длиное поле");
        smallField = new JTextField(15);
        smallField.setToolTipText("Короткое поле");

        bigField.setFont(new Font("Arial", Font.PLAIN, 18));
        bigField.setHorizontalAlignment(JTextField.CENTER);

        smallField.addActionListener(new ActionListener() {
          @Override
           public void actionPerformed(ActionEvent e) {
              JOptionPane.showMessageDialog(TextField.this,
                      "Найденное вами число :"+smallField.getText() +"    "+" Правильный ответ: 11,12,13,14. " );
            }
        });
        JPanel contents = new JPanel(new FlowLayout(FlowLayout.CENTER));
        contents.add(bigField);
        contents.add(smallField);
        setContentPane(contents);
        setSize(900, 400);
        setVisible(true);
    }

    public static void main(String[] args) {
        new TextField();
    }
}
