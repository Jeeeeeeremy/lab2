import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;
import javax.swing.GroupLayout;
import javax.swing.border.*;
/*
 * Created by JFormDesigner on Mon Oct 03 22:06:57 EDT 2022
 */



/**
 * @author yibin
 */
public class MainFrame extends JFrame {
    public Map<String,Employee> employees = new HashMap<>();
    public MainFrame() {
        initComponents();
        panel3.add(new addPanel(employees),"add");
        //panel3.add(new updatePanel(),"update");
    }

    private void addbutton(ActionEvent e) {
        // TODO add your code here
        CardLayout card = (CardLayout) panel3.getLayout();
        card.show(panel3,"add");
    }

    private void updatebutton(ActionEvent e) {
        // TODO add your code here
        if (!employees.containsKey(update_ID.getText())){
            JOptionPane.showMessageDialog(new JDialog(), ":no employee existed, please enter another ID");
            return;
        }
        panel3.add(new addPanel(employees.get(update_ID.getText()),employees),"update");
        CardLayout card = (CardLayout) panel3.getLayout();
        card.show(panel3,"update");
        update_ID.setText("");
    }

    private void display(ActionEvent e) {
        // TODO add your code here
        panel3.add(new displayPanel(employees),"display");
        CardLayout card = (CardLayout) panel3.getLayout();
        card.show(panel3,"display");
    }
    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - yibin
        ResourceBundle bundle = ResourceBundle.getBundle("form");
        panel3 = new JPanel();
        panel4 = new JPanel();
        button1 = new JButton();
        button2 = new JButton();
        button3 = new JButton();
        update_ID = new JTextField();
        label1 = new JLabel();

        //======== this ========
        var contentPane = getContentPane();

        //======== panel3 ========
        {
            panel3.setBorder ( new javax . swing. border .CompoundBorder ( new javax . swing. border .TitledBorder ( new javax . swing
            . border .EmptyBorder ( 0, 0 ,0 , 0) ,  "JFor\u006dDesi\u0067ner \u0045valu\u0061tion" , javax. swing .border . TitledBorder
            . CENTER ,javax . swing. border .TitledBorder . BOTTOM, new java. awt .Font ( "Dia\u006cog", java .
            awt . Font. BOLD ,12 ) ,java . awt. Color .red ) ,panel3. getBorder () ) )
            ; panel3. addPropertyChangeListener( new java. beans .PropertyChangeListener ( ){ @Override public void propertyChange (java . beans. PropertyChangeEvent e
            ) { if( "bord\u0065r" .equals ( e. getPropertyName () ) )throw new RuntimeException( ) ;} } )
            ;
            panel3.setLayout(new CardLayout());
        }

        //======== panel4 ========
        {

            //---- button1 ----
            button1.setText(bundle.getString("MainFrame.button1.text"));
            button1.addActionListener(e -> addbutton(e));

            //---- button2 ----
            button2.setText(bundle.getString("MainFrame.button2.text"));
            button2.addActionListener(e -> updatebutton(e));

            //---- button3 ----
            button3.setText(bundle.getString("MainFrame.button3.text"));
            button3.addActionListener(e -> display(e));

            //---- label1 ----
            label1.setText(bundle.getString("MainFrame.label1.text"));

            GroupLayout panel4Layout = new GroupLayout(panel4);
            panel4.setLayout(panel4Layout);
            panel4Layout.setHorizontalGroup(
                panel4Layout.createParallelGroup()
                    .addGroup(panel4Layout.createSequentialGroup()
                        .addGroup(panel4Layout.createParallelGroup()
                            .addGroup(panel4Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(label1)
                                .addGap(12, 12, 12)
                                .addComponent(update_ID, GroupLayout.PREFERRED_SIZE, 127, GroupLayout.PREFERRED_SIZE))
                            .addGroup(panel4Layout.createSequentialGroup()
                                .addGap(68, 68, 68)
                                .addGroup(panel4Layout.createParallelGroup()
                                    .addComponent(button3, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(button1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(button2, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addContainerGap(51, Short.MAX_VALUE))
            );
            panel4Layout.linkSize(SwingConstants.HORIZONTAL, new Component[] {button1, button2, button3});
            panel4Layout.setVerticalGroup(
                panel4Layout.createParallelGroup()
                    .addGroup(panel4Layout.createSequentialGroup()
                        .addGap(147, 147, 147)
                        .addComponent(button1)
                        .addGap(108, 108, 108)
                        .addComponent(button3)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 215, Short.MAX_VALUE)
                        .addComponent(button2)
                        .addGap(18, 18, 18)
                        .addGroup(panel4Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(update_ID, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                            .addComponent(label1))
                        .addGap(186, 186, 186))
            );
            panel4Layout.linkSize(SwingConstants.VERTICAL, new Component[] {button1, button2, button3});
        }

        GroupLayout contentPaneLayout = new GroupLayout(contentPane);
        contentPane.setLayout(contentPaneLayout);
        contentPaneLayout.setHorizontalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(GroupLayout.Alignment.TRAILING, contentPaneLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(panel4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(panel3, GroupLayout.PREFERRED_SIZE, 900, GroupLayout.PREFERRED_SIZE))
        );
        contentPaneLayout.setVerticalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(contentPaneLayout.createParallelGroup()
                        .addComponent(panel4, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(panel3, GroupLayout.DEFAULT_SIZE, 794, Short.MAX_VALUE)))
        );
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - yibin
    private JPanel panel3;
    private JPanel panel4;
    private JButton button1;
    private JButton button2;
    private JButton button3;
    private JTextField update_ID;
    private JLabel label1;
    // JFormDesigner - End of variables declaration  //GEN-END:variables


}
