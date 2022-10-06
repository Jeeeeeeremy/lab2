import java.awt.*;
import java.awt.event.*;
import java.util.*;
import java.util.Map;
import javax.swing.*;
import javax.swing.GroupLayout;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
/*
 * Created by JFormDesigner on Tue Oct 04 16:13:50 EDT 2022
 */



/**
 * @author yibin
 */
public class displayPanel extends JPanel {
    private String[] colunms;
    private String[][] data;
    private Map<String, Employee> employees;



    private void prepare_table(){
        colunms = new String[]{"Employee ID","Name","Team Info","Position title"};
        data = new String[employees.keySet().size()][colunms.length];
        int index = 0;
        for (String id :
                employees.keySet()) {
            Employee cur = employees.get(id);
            data[index][0] = cur.getEmployee_ID();
            data[index][1] = cur.getName();
            data[index][2] = cur.getTeam_info();
            data[index][3] = cur.getPosition_title();
            index++;
        }
        table1 = new JTable(data,colunms);

    }

    public displayPanel(Map<String, Employee> employees) {
        this.employees = employees;
        prepare_table();
        initComponents(colunms,data);
    }


    private void displayImage(Employee ep){
        int height = photo_label.getHeight();
        int width  = photo_label.getWidth();
        Image image = ep.getPhoto().getImage();
        image = image.getScaledInstance(width,height,Image.SCALE_DEFAULT);
        ImageIcon scaleimage = new ImageIcon();
        scaleimage.setImage(image);
        photo_label.setIcon(scaleimage);
    }

    private void view_details(ActionEvent e) {
        // TODO add your code here
        int selected_row = table1.getSelectedRow();
        if (selected_row<0){
            JOptionPane.showMessageDialog(new JDialog(), ":please select one row to view");
            return;
        }
        TableModel model = table1.getModel();
        String ID =(String)model.getValueAt(selected_row,0);
        Employee ep = employees.get(ID);
        displayImage(ep);
        info_label.setText("<html><body> " +
                "<br>Employee ID: " +ep.getEmployee_ID()+
                "<br>Name: " +ep.getName()+
                "<br>Age: " +ep.getAge()+
                "<br>Gender: " +ep.getGender()+
                "<br>Start date: " +ep.getStart_date()+
                "<br>Level: " +ep.getLevel()+
                "<br>Team info: " +ep.getTeam_info()+
                "<br>Position Title: " +ep.getPosition_title()+
                "<br>Cell Phone Number: " +ep.getCellphone_number()+
                "<br>Email address: " +ep.getEmail_address()+
                "<body></html>"
        );
    }

    private void delete(ActionEvent e) {
        // TODO add your code here
        info_label.setText("");
        photo_label.setIcon(null);
        int selected_row = table1.getSelectedRow();
        if (selected_row<0){
            JOptionPane.showMessageDialog(new JDialog(), ":please select one row to delete");
            return;
        }
        //TableModel model = table1.getModel();
        TableModel model = table1.getModel();
        String ID =(String)model.getValueAt(selected_row,0);
        employees.remove(ID);
        prepare_table();
        scrollPane1.setViewportView(table1);
    }




    private void initComponents(String[] col, String[][] data) {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - yibin
        ResourceBundle bundle = ResourceBundle.getBundle("form");
        scrollPane1 = new JScrollPane();
        //table1 = new JTable(data,col);
        view_details = new JButton();
        delete = new JButton();
        info_label = new JLabel();
        photo_label = new JLabel();

        //======== this ========
        setPreferredSize(new Dimension(900, 794));
        setMinimumSize(new Dimension(900, 794));
        setBorder (new javax. swing. border. CompoundBorder( new javax .swing .border .TitledBorder (new javax. swing. border.
        EmptyBorder( 0, 0, 0, 0) , "JF\u006frmDes\u0069gner \u0045valua\u0074ion", javax. swing. border. TitledBorder. CENTER, javax. swing
        . border. TitledBorder. BOTTOM, new java .awt .Font ("D\u0069alog" ,java .awt .Font .BOLD ,12 ),
        java. awt. Color. red) , getBorder( )) );  addPropertyChangeListener (new java. beans. PropertyChangeListener( )
        { @Override public void propertyChange (java .beans .PropertyChangeEvent e) {if ("\u0062order" .equals (e .getPropertyName () ))
        throw new RuntimeException( ); }} );

        //======== scrollPane1 ========
        {
            scrollPane1.setViewportView(table1);
        }

        //---- view_details ----
        view_details.setText(bundle.getString("displayPanel.view_details.text"));
        view_details.addActionListener(e -> view_details(e));

        //---- delete ----
        delete.setText(bundle.getString("displayPanel.delete.text"));
        delete.addActionListener(e -> delete(e));

        GroupLayout layout = new GroupLayout(this);
        setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup()
                .addGroup(layout.createSequentialGroup()
                    .addGap(71, 71, 71)
                    .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(info_label, GroupLayout.PREFERRED_SIZE, 228, GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(photo_label, GroupLayout.PREFERRED_SIZE, 202, GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(view_details)
                            .addGap(61, 61, 61)
                            .addComponent(delete))
                        .addComponent(scrollPane1, GroupLayout.PREFERRED_SIZE, 725, GroupLayout.PREFERRED_SIZE))
                    .addContainerGap(104, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup()
                .addGroup(layout.createSequentialGroup()
                    .addGap(63, 63, 63)
                    .addComponent(scrollPane1, GroupLayout.PREFERRED_SIZE, 329, GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, 18)
                    .addGroup(layout.createParallelGroup()
                        .addComponent(info_label, GroupLayout.DEFAULT_SIZE, 379, Short.MAX_VALUE)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup()
                                .addComponent(delete)
                                .addComponent(view_details))
                            .addGap(0, 349, Short.MAX_VALUE))
                        .addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addGap(0, 14, Short.MAX_VALUE)
                            .addComponent(photo_label, GroupLayout.PREFERRED_SIZE, 166, GroupLayout.PREFERRED_SIZE)
                            .addGap(0, 199, Short.MAX_VALUE)))
                    .addContainerGap())
        );
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - yibin
    private JScrollPane scrollPane1;
    private JTable table1;
    private JButton view_details;
    private JButton delete;
    private JLabel info_label;
    private JLabel photo_label;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
