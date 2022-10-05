import java.awt.*;
import java.util.Map;
import javax.swing.*;
import javax.swing.GroupLayout;
/*
 * Created by JFormDesigner on Tue Oct 04 16:13:50 EDT 2022
 */



/**
 * @author yibin
 */
public class displayPanel extends JPanel {
    private String[] colunms;
    private String[][] data;
    public displayPanel(Map<String, Employee> employees) {
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
        initComponents(colunms,data);
    }

    private void initComponents(String[] col, String[][] data) {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - yibin
        scrollPane1 = new JScrollPane();
        table1 = new JTable(data,col);

        //======== this ========
        setPreferredSize(new Dimension(900, 794));
        setMinimumSize(new Dimension(900, 794));
        setBorder ( new javax . swing. border .CompoundBorder ( new javax . swing. border .TitledBorder ( new javax
        . swing. border .EmptyBorder ( 0, 0 ,0 , 0) ,  "JF\u006frmDes\u0069gner \u0045valua\u0074ion" , javax. swing
        .border . TitledBorder. CENTER ,javax . swing. border .TitledBorder . BOTTOM, new java. awt .
        Font ( "D\u0069alog", java .awt . Font. BOLD ,12 ) ,java . awt. Color .red
        ) , getBorder () ) );  addPropertyChangeListener( new java. beans .PropertyChangeListener ( ){ @Override
        public void propertyChange (java . beans. PropertyChangeEvent e) { if( "\u0062order" .equals ( e. getPropertyName (
        ) ) )throw new RuntimeException( ) ;} } );

        //======== scrollPane1 ========
        {
            scrollPane1.setViewportView(table1);
        }

        GroupLayout layout = new GroupLayout(this);
        setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup()
                .addGroup(layout.createSequentialGroup()
                    .addGap(71, 71, 71)
                    .addComponent(scrollPane1, GroupLayout.PREFERRED_SIZE, 725, GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(104, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup()
                .addGroup(layout.createSequentialGroup()
                    .addGap(63, 63, 63)
                    .addComponent(scrollPane1, GroupLayout.PREFERRED_SIZE, 329, GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(403, Short.MAX_VALUE))
        );
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - yibin
    private JScrollPane scrollPane1;
    private JTable table1;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
