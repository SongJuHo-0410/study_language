
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
public class ComboActionEx extends JFrame {
    String [] fruits = {"apple", "banana", "mango"};
    ImageIcon [] images = { new ImageIcon("images/apple.jpg"),
            new ImageIcon("images/banana.jpg"),
            new ImageIcon("images/mango.jpg") };
    JLabel imgLabel = new JLabel(images[0]);
    ComboActionEx() {
        setTitle("콤보박스 활용 예제");
        Container c = getContentPane();
        c.setLayout(new FlowLayout());
        JComboBox combo = new JComboBox(fruits);
        c.add(combo); c.add(imgLabel);
        // 콤보박스에 Action 리스너 등록. 선택된 아이템의 이미지 출력
        combo.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    JComboBox cb = (JComboBox)e.getSource();
                    int index = cb.getSelectedIndex();
                    imgLabel.setIcon(images[index]);
                }
            });
        setSize(300,250);
        setVisible(true);
    }

    public static void main(String [] args) {
        new ComboActionEx();
    }
}
