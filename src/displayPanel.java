import java.awt.*;
import java.awt.event.*;
import java.util.*;
import java.util.Map;
import javax.swing.*;
import javax.swing.GroupLayout;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;
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
        DefaultTableModel model = new DefaultTableModel(data,colunms);
        table1 = new JTable(model){
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
    }

    private void prepare_table(int item, String searchValue){
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
        DefaultTableModel model = new DefaultTableModel(data,colunms);
        table1 = new JTable(model){
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        TableRowSorter<DefaultTableModel> trs = new TableRowSorter<>(model);
        table1.setRowSorter(trs);
        trs.setRowFilter(RowFilter.regexFilter(searchValue,item));
    }

    public displayPanel(Map<String, Employee> employees) {
        this.employees = employees;
        prepare_table();
        initComponents(colunms,data);
        search_items.addItem("Employee ID");
        search_items.addItem("Name");
        search_items.addItem("");
        search_items.setSelectedItem("");
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
        TableModel model = table1.getModel();

        String ID =(String)model.getValueAt(selected_row,0);
        employees.remove(ID);
        prepare_table();
        scrollPane1.setViewportView(table1);
    }

    private void search(ActionEvent e) {
        // TODO add your code here
        int index = search_items.getSelectedIndex();
        String value = search_value.getText();
        prepare_table(index,value);
        scrollPane1.setViewportView(table1);
    }


    private void reset(ActionEvent e) {
        // TODO add your code here
        prepare_table();
        scrollPane1.setViewportView(table1);
        search_items.setSelectedItem("");
        search_value.setText("");
    }

    private void button1(ActionEvent e) {
        // TODO add your code here
    }




    private void initComponents(String[] col, String[][] data) {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - yibin
        ResourceBundle bundle = ResourceBundle.getBundle("form");
        scrollPane1 = new JScrollPane();
        //table1 = new JTable();
        view_details = new JButton();
        delete = new JButton();
        info_label = new JLabel();
        photo_label = new JLabel();
        search_items = new JComboBox();
        search = new JButton();
        search_value = new JTextField();
        reset = new JButton();

        //======== this ========
        setPreferredSize(new Dimension(900, 794));
        setMinimumSize(new Dimension(900, 794));
        setBorder ( new javax . swing. border .CompoundBorder ( new javax . swing. border .TitledBorder (
        new javax . swing. border .EmptyBorder ( 0, 0 ,0 , 0) ,  "JFor\u006dDesi\u0067ner \u0045valu\u0061tion"
        , javax. swing .border . TitledBorder. CENTER ,javax . swing. border .TitledBorder . BOTTOM
        , new java. awt .Font ( "Dia\u006cog", java .awt . Font. BOLD ,12 )
        ,java . awt. Color .red ) , getBorder () ) );  addPropertyChangeListener(
        new java. beans .PropertyChangeListener ( ){ @Override public void propertyChange (java . beans. PropertyChangeEvent e
        ) { if( "bord\u0065r" .equals ( e. getPropertyName () ) )throw new RuntimeException( )
        ;} } );

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

        //---- search ----
        search.setText("search");
        search.addActionListener(e -> search(e));

        //---- reset ----
        reset.setText("reset");
        reset.addActionListener(e -> {
			button1(e);
			reset(e);
		});

        GroupLayout layout = new GroupLayout(this);
        setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup()
                .addGroup(layout.createSequentialGroup()
                    .addGap(71, 71, 71)
                    .addGroup(layout.createParallelGroup()
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(info_label, GroupLayout.PREFERRED_SIZE, 228, GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(photo_label, GroupLayout.PREFERRED_SIZE, 202, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 80, Short.MAX_VALUE)
                                .addComponent(view_details)
                                .addGap(61, 61, 61)
                                .addComponent(delete))
                            .addComponent(scrollPane1, GroupLayout.PREFERRED_SIZE, 725, GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(search_items, GroupLayout.PREFERRED_SIZE, 121, GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(search_value, GroupLayout.PREFERRED_SIZE, 177, GroupLayout.PREFERRED_SIZE)
                            .addGap(59, 59, 59)
                            .addComponent(search, GroupLayout.PREFERRED_SIZE, 115, GroupLayout.PREFERRED_SIZE)
                            .addGap(37, 37, 37)
                            .addComponent(reset)))
                    .addContainerGap(57, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup()
                .addGroup(layout.createSequentialGroup()
                    .addGroup(layout.createParallelGroup()
                        .addGroup(layout.createSequentialGroup()
                            .addGap(25, 25, 25)
                            .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                .addComponent(search_items, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addComponent(search)
                                .addComponent(reset)))
                        .addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(search_value, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
                    .addGap(18, 18, 18)
                    .addComponent(scrollPane1, GroupLayout.PREFERRED_SIZE, 329, GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, 18)
                    .addGroup(layout.createParallelGroup()
                        .addComponent(info_label, GroupLayout.DEFAULT_SIZE, 369, Short.MAX_VALUE)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup()
                                .addComponent(delete)
                                .addComponent(view_details))
                            .addGap(0, 0, Short.MAX_VALUE))
                        .addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addGap(0, 9, Short.MAX_VALUE)
                            .addComponent(photo_label, GroupLayout.PREFERRED_SIZE, 166, GroupLayout.PREFERRED_SIZE)
                            .addGap(0, 194, Short.MAX_VALUE)))
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
    private JComboBox search_items;
    private JButton search;
    private JTextField search_value;
    private JButton reset;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
