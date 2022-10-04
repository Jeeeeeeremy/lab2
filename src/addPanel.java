import java.awt.*;
import java.awt.event.*;
import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.regex.Pattern;
import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.GroupLayout;
import javax.swing.filechooser.FileNameExtensionFilter;
/*
 * Created by JFormDesigner on Mon Oct 03 22:43:52 EDT 2022
 */



/**
 * @author yibin
 */
public class addPanel extends JPanel {
    private ImageIcon photo;
    private Map<String, Employee> employees = new HashMap<>();
    public addPanel() {
        initComponents();
        gender.addItem("male");
        gender.addItem("female");
        gender.addItem("not selected");
        gender.setSelectedItem("not selected");
    }
    private boolean checker(){
        Pattern digitp = Pattern.compile("^[-\\+]?[\\d]*$");
        String  regEx1 = "[a-zA-Z0-9]+@[a-zA-Z0-9]+\\.[a-zA-Z0-9]+";
        Pattern emailcheck = Pattern.compile(regEx1);
        if ( fisrtname.getText().length()==0
                || lastname.getText().length()==0
                || employee_id.getText().length()==0
                || !digitp.matcher(employee_id.getText()).matches()
                || age.getText().length()==0
                || !digitp.matcher(age.getText()).matches()
                || gender.getSelectedItem().equals("not selected")
                || level.getText().length()==0
                || team_info.getText().length()==0
                || position_title.getText().length()==0
                || cell_phone_number.getText().length()==0
                || !digitp.matcher(cell_phone_number.getText()).matches()
                || email_add.getText().length()==0
                || !emailcheck.matcher(email_add.getText()).matches()
                || photo==null)
            return false;
        return true;
    }
    public byte[] fileToByte(File img) throws Exception {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        byte[] bytes = new byte[0];
        try {
            BufferedImage bi;
            bi = ImageIO.read(img);
            ImageIO.write(bi, "jpg", baos);
            bytes = baos.toByteArray();
            System.err.println(bytes.length);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            baos.close();
        }
        return bytes;
    }

    private void uploadPhoto(ActionEvent e) {
        // TODO add your code here
        //Jfilechooser to show the folder list
        JFileChooser chooser = new JFileChooser();
        chooser.setMultiSelectionEnabled(true);
        //check the postfix of the file
        FileNameExtensionFilter filter = new FileNameExtensionFilter("jpg", "png");
        chooser.setFileFilter(filter);
        int returnVal = chooser.showOpenDialog(upload);
        //perform the upload action when it passes the check
        if (returnVal == JFileChooser.APPROVE_OPTION) {
            File[] files = chooser.getSelectedFiles();
            if (files == null || files.length == 0) {
                return;
            }
            File picture = chooser.getSelectedFile();
            String pictureName = picture.getName();
            String prefix = pictureName.substring(pictureName.lastIndexOf(".") + 1).toLowerCase();
            if (!(prefix.equals("jpg") || prefix.equals("png"))) {
                JOptionPane.showMessageDialog(new JDialog(), ":the picture should be .jpg or .png");
                return;
            }
            try {
                //assign the image to the model
                ImageIcon imageIcon = new ImageIcon(fileToByte(picture));
                //p.setPhoto(imageIcon);
                photo = imageIcon;
            }catch (Exception e1){
                System.out.println(e1.getMessage());
            }
        }
    }

    private void clear(){
        fisrtname.setText("");
        lastname.setText("");
        age.setText("");
        employee_id.setText("");
        gender.setSelectedItem("not selected");
        level.setText("");
        team_info.setText("");
        position_title.setText("");
        cell_phone_number.setText("");
        email_add.setText("");
        photo=null;
    }

    private void submit(ActionEvent e) {
        // TODO add your code here
        if (checker()){
            SimpleDateFormat formatter= new SimpleDateFormat("dd-MM-yyyy");
            Date date = new Date(System.currentTimeMillis());
            String cur_date = formatter.format(date);
            System.out.println(cur_date);
            Employee employee = new Employee(fisrtname.getText(),lastname.getText(),
                    Integer.valueOf(age.getText()),gender.getSelectedItem().toString(),
                    cur_date,level.getText(),team_info.getText(),position_title.getText(),
                    cell_phone_number.getText(),email_add.getText(),photo);
            clear();
        }else {
            JOptionPane.showMessageDialog(this,"validation failed, please validate your information");
        }
    }


    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - yibin
        ResourceBundle bundle = ResourceBundle.getBundle("form");
        label1 = new JLabel();
        fisrtname = new JTextField();
        label2 = new JLabel();
        lastname = new JTextField();
        label3 = new JLabel();
        label4 = new JLabel();
        employee_id = new JTextField();
        label5 = new JLabel();
        age = new JTextField();
        label6 = new JLabel();
        gender = new JComboBox();
        label7 = new JLabel();
        level = new JTextField();
        label8 = new JLabel();
        team_info = new JTextField();
        label9 = new JLabel();
        position_title = new JTextField();
        label10 = new JLabel();
        label11 = new JLabel();
        cell_phone_number = new JTextField();
        label12 = new JLabel();
        email_add = new JTextField();
        label13 = new JLabel();
        label14 = new JLabel();
        submit = new JButton();
        upload = new JButton();

        //======== this ========
        setPreferredSize(new Dimension(900, 794));
        setMinimumSize(new Dimension(900, 794));
        setBorder(new javax.swing.border.CompoundBorder(new javax.swing.border.TitledBorder(new javax.
        swing.border.EmptyBorder(0,0,0,0), "JF\u006frm\u0044es\u0069gn\u0065r \u0045va\u006cua\u0074io\u006e",javax.swing.border
        .TitledBorder.CENTER,javax.swing.border.TitledBorder.BOTTOM,new java.awt.Font("D\u0069al\u006fg"
        ,java.awt.Font.BOLD,12),java.awt.Color.red), getBorder
        ())); addPropertyChangeListener(new java.beans.PropertyChangeListener(){@Override public void propertyChange(java
        .beans.PropertyChangeEvent e){if("\u0062or\u0064er".equals(e.getPropertyName()))throw new RuntimeException
        ();}});

        //---- label1 ----
        label1.setText(bundle.getString("addPanel.label1.text"));
        label1.setFont(label1.getFont().deriveFont(label1.getFont().getSize() + 5f));

        //---- label2 ----
        label2.setText(bundle.getString("addPanel.label2.text"));
        label2.setFont(label2.getFont().deriveFont(label2.getFont().getSize() + 5f));

        //---- label3 ----
        label3.setText(bundle.getString("addPanel.label3.text"));
        label3.setHorizontalAlignment(SwingConstants.CENTER);
        label3.setFont(label3.getFont().deriveFont(label3.getFont().getStyle() | Font.BOLD, label3.getFont().getSize() + 9f));

        //---- label4 ----
        label4.setText(bundle.getString("addPanel.label4.text"));
        label4.setFont(label4.getFont().deriveFont(label4.getFont().getSize() + 5f));

        //---- label5 ----
        label5.setText(bundle.getString("addPanel.label5.text"));
        label5.setFont(label5.getFont().deriveFont(label5.getFont().getSize() + 5f));

        //---- label6 ----
        label6.setText(bundle.getString("addPanel.label6.text"));
        label6.setFont(label6.getFont().deriveFont(label6.getFont().getSize() + 5f));

        //---- label7 ----
        label7.setText(bundle.getString("addPanel.label7.text"));
        label7.setFont(label7.getFont().deriveFont(label7.getFont().getSize() + 5f));

        //---- label8 ----
        label8.setText(bundle.getString("addPanel.label8.text"));
        label8.setFont(label8.getFont().deriveFont(label8.getFont().getSize() + 5f));

        //---- label9 ----
        label9.setText(bundle.getString("addPanel.label9.text"));
        label9.setFont(label9.getFont().deriveFont(label9.getFont().getSize() + 5f));

        //---- label10 ----
        label10.setText(bundle.getString("addPanel.label10.text"));
        label10.setFont(label10.getFont().deriveFont(label10.getFont().getSize() + 5f));

        //---- label11 ----
        label11.setText(bundle.getString("addPanel.label11.text"));
        label11.setFont(label11.getFont().deriveFont(label11.getFont().getSize() + 5f));

        //---- label12 ----
        label12.setText(bundle.getString("addPanel.label12.text"));
        label12.setFont(label12.getFont().deriveFont(label12.getFont().getSize() + 5f));

        //---- label13 ----
        label13.setText(bundle.getString("addPanel.label13.text"));

        //---- label14 ----
        label14.setText(bundle.getString("addPanel.label14.text"));
        label14.setFont(label14.getFont().deriveFont(label14.getFont().getSize() + 5f));

        //---- submit ----
        submit.setText(bundle.getString("addPanel.submit.text"));
        submit.addActionListener(e -> submit(e));

        //---- upload ----
        upload.setText(bundle.getString("addPanel.upload.text"));
        upload.addActionListener(e -> uploadPhoto(e));

        GroupLayout layout = new GroupLayout(this);
        setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup()
                .addGroup(layout.createSequentialGroup()
                    .addGap(201, 201, 201)
                    .addGroup(layout.createParallelGroup()
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup()
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(label2, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGap(92, 92, 92))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup()
                                        .addGroup(layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup()
                                                .addGroup(layout.createSequentialGroup()
                                                    .addComponent(label7)
                                                    .addGap(39, 39, 39))
                                                .addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                    .addComponent(label6)
                                                    .addGap(18, 18, 18)))
                                            .addGroup(layout.createParallelGroup()
                                                .addComponent(level, GroupLayout.PREFERRED_SIZE, 154, GroupLayout.PREFERRED_SIZE)
                                                .addComponent(gender)))
                                        .addGroup(layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                                .addGroup(layout.createSequentialGroup()
                                                    .addComponent(label5)
                                                    .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                                    .addComponent(age))
                                                .addComponent(label1, GroupLayout.PREFERRED_SIZE, 102, GroupLayout.PREFERRED_SIZE)
                                                .addComponent(label4))
                                            .addGap(0, 0, Short.MAX_VALUE)))
                                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(layout.createParallelGroup()
                                .addComponent(fisrtname, GroupLayout.PREFERRED_SIZE, 267, GroupLayout.PREFERRED_SIZE)
                                .addComponent(lastname, GroupLayout.PREFERRED_SIZE, 267, GroupLayout.PREFERRED_SIZE)
                                .addComponent(employee_id, GroupLayout.PREFERRED_SIZE, 267, GroupLayout.PREFERRED_SIZE))
                            .addGap(260, 260, 260))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup()
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(label9)
                                    .addGap(12, 12, 12)
                                    .addComponent(position_title, GroupLayout.PREFERRED_SIZE, 231, GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(label8)
                                    .addGap(18, 18, 18)
                                    .addComponent(team_info, GroupLayout.PREFERRED_SIZE, 214, GroupLayout.PREFERRED_SIZE)))
                            .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup()
                                .addComponent(label10)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(label14)
                                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(upload)
                                    .addGap(217, 217, 217)
                                    .addComponent(submit)))
                            .addGap(0, 0, Short.MAX_VALUE))))
                .addGroup(layout.createSequentialGroup()
                    .addGroup(layout.createParallelGroup()
                        .addGroup(layout.createSequentialGroup()
                            .addGap(282, 282, 282)
                            .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(label12)
                                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(email_add, GroupLayout.PREFERRED_SIZE, 231, GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(label11)
                                    .addGap(27, 27, 27)
                                    .addComponent(cell_phone_number, GroupLayout.PREFERRED_SIZE, 231, GroupLayout.PREFERRED_SIZE)))
                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(label13))
                        .addGroup(layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(label3, GroupLayout.PREFERRED_SIZE, 907, GroupLayout.PREFERRED_SIZE)))
                    .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup()
                .addGroup(layout.createSequentialGroup()
                    .addGap(26, 26, 26)
                    .addComponent(label3, GroupLayout.DEFAULT_SIZE, 56, Short.MAX_VALUE)
                    .addGap(18, 18, 18)
                    .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(fisrtname, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addComponent(label1, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(lastname, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addComponent(label2, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(label4, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
                        .addComponent(employee_id, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                    .addGap(26, 26, 26)
                    .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(label5, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
                        .addComponent(age, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(label6, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
                        .addComponent(gender, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(label7, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
                        .addComponent(level, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(label8, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
                        .addComponent(team_info, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addGroup(layout.createParallelGroup()
                        .addComponent(label9, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(3, 3, 3)
                            .addComponent(position_title, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
                    .addGap(36, 36, 36)
                    .addComponent(label10, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(label11, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
                        .addComponent(cell_phone_number, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                    .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(label12, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
                        .addComponent(email_add, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addComponent(label13))
                    .addGap(18, 18, 18)
                    .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(label14, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
                        .addComponent(submit)
                        .addComponent(upload))
                    .addGap(58, 58, 58))
        );
        layout.linkSize(SwingConstants.VERTICAL, new Component[] {label1, label2, label4});
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - yibin
    private JLabel label1;
    private JTextField fisrtname;
    private JLabel label2;
    private JTextField lastname;
    private JLabel label3;
    private JLabel label4;
    private JTextField employee_id;
    private JLabel label5;
    private JTextField age;
    private JLabel label6;
    private JComboBox gender;
    private JLabel label7;
    private JTextField level;
    private JLabel label8;
    private JTextField team_info;
    private JLabel label9;
    private JTextField position_title;
    private JLabel label10;
    private JLabel label11;
    private JTextField cell_phone_number;
    private JLabel label12;
    private JTextField email_add;
    private JLabel label13;
    private JLabel label14;
    private JButton submit;
    private JButton upload;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
