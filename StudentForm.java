
import javax.swing.*;
import java.awt.*;

public class StudentForm extends JFrame {
    JTextField name = new JTextField(10), roll = new JTextField(10);
    JComboBox<String> dept = new JComboBox<>(new String[]{"ICE", "CSE", "EEE", "BBA"});
    JRadioButton male = new JRadioButton("Male", true), female = new JRadioButton("Female");
    JTextArea out = new JTextArea(5, 20);

    StudentForm() {
        setTitle("Student Form");
        setLayout(new GridLayout(6, 2, 5, 5));

        ButtonGroup g = new ButtonGroup();
        g.add(male);
        g.add(female);

        JPanel p = new JPanel();
        p.add(male);
        p.add(female);

        JButton sub = new JButton("Submit");

        add(new JLabel("Name:")); add(name);
        add(new JLabel("Roll:")); add(roll);
        add(new JLabel("Department:")); add(dept);
        add(new JLabel("Gender:")); add(p);
        add(sub); add(new JLabel(""));
        add(new JLabel("Output:")); add(new JScrollPane(out));

        sub.addActionListener(e -> {
            String n = name.getText().trim();
            String r = roll.getText().trim();

            if (!n.matches("[a-zA-Z ]+"))
                JOptionPane.showMessageDialog(this, "Enter valid name!");
            else if (!r.matches("[0-9]+"))
                JOptionPane.showMessageDialog(this, "Enter valid roll!");
            else
                out.setText("Name: " + n
                    + "\nRoll: " + r
                    + "\nDept: " + dept.getSelectedItem()
                    + "\nGender: " + (male.isSelected() ? "Male" : "Female"));
        });

        setSize(350, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new StudentForm();
    }
}
