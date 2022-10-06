//import java.awt.*;
//import java.awt.Component;
//import java.awt.event.*;
//import java.awt.image.BufferedImage;
//import java.io.ByteArrayOutputStream;
//import java.io.File;
//import java.util.*;
//import javax.imageio.ImageIO;
//import javax.swing.*;
//import javax.swing.GroupLayout;
//import javax.swing.filechooser.FileNameExtensionFilter;
///*
// * Created by JFormDesigner on Tue Oct 04 11:06:01 EDT 2022
// */
//
//
//
///**
// * @author yibin
// */
//public class updatePanel extends JPanel {
//    private ImageIcon picture;
//    private Map<String, Employee> employees;
//    public updatePanel() {
//        initComponents();
//        old_firstname.setText("");
//    }
//
//    public byte[] fileToByte(File img) throws Exception {
//        ByteArrayOutputStream baos = new ByteArrayOutputStream();
//        byte[] bytes = new byte[0];
//        try {
//            BufferedImage bi;
//            bi = ImageIO.read(img);
//            ImageIO.write(bi, "jpg", baos);
//            bytes = baos.toByteArray();
//            System.err.println(bytes.length);
//        } catch (Exception e) {
//            e.printStackTrace();
//        } finally {
//            baos.close();
//        }
//        return bytes;
//    }
//    private void update(ActionEvent e) {
//        // TODO add your code here
//    }
//
//    private void uploadPhoto(ActionEvent e) {
//        // TODO add your code here
//        //Jfilechooser to show the folder list
//        JFileChooser chooser = new JFileChooser();
//        chooser.setMultiSelectionEnabled(true);
//        //check the postfix of the file
//        FileNameExtensionFilter filter = new FileNameExtensionFilter("jpg", "png");
//        chooser.setFileFilter(filter);
//        int returnVal = chooser.showOpenDialog(upload);
//        //perform the upload action when it passes the check
//        if (returnVal == JFileChooser.APPROVE_OPTION) {
//            File[] files = chooser.getSelectedFiles();
//            if (files == null || files.length == 0) {
//                return;
//            }
//            File picture = chooser.getSelectedFile();
//            String pictureName = picture.getName();
//            String prefix = pictureName.substring(pictureName.lastIndexOf(".") + 1).toLowerCase();
//            if (!(prefix.equals("jpg") || prefix.equals("png"))) {
//                JOptionPane.showMessageDialog(new JDialog(), ":the picture should be .jpg or .png");
//                return;
//            }
//            try {
//                //assign the image to the model
//                ImageIcon imageIcon = new ImageIcon(fileToByte(picture));
//                //p.setPhoto(imageIcon);
//                 = imageIcon;
//            }catch (Exception e1){
//                System.out.println(e1.getMessage());
//            }
//        }
//    }
//
//    private void submit(ActionEvent e) {
//        // TODO add your code here
//    }
//
//    private void initComponents() {
//        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
//        // Generated using JFormDesigner Evaluation license - yibin
//        ResourceBundle bundle = ResourceBundle.getBundle("form");
//        old_firstname = new JLabel();
//        fisrtname = new JTextField();
//        old_lastname = new JLabel();
//        lastname = new JTextField();
//        label3 = new JLabel();
//        old_age = new JLabel();
//        age = new JTextField();
//        old_gender = new JLabel();
//        gender = new JComboBox();
//        old_level = new JLabel();
//        level = new JTextField();
//        old_Team_info = new JLabel();
//        team_info = new JTextField();
//        old_position_title = new JLabel();
//        position_title = new JTextField();
//        label10 = new JLabel();
//        old_cell_phone_number = new JLabel();
//        cell_phone_number = new JTextField();
//        old_email_address = new JLabel();
//        email_add = new JTextField();
//        label13 = new JLabel();
//        photo = new JLabel();
//        update = new JButton();
//        upload = new JButton();
//
//        //======== this ========
//        setPreferredSize(new Dimension(900, 794));
//        setMinimumSize(new Dimension(900, 794));
//        setBorder (new javax. swing. border. CompoundBorder( new javax .swing .border .TitledBorder (new javax
//        . swing. border. EmptyBorder( 0, 0, 0, 0) , "JF\u006frmDes\u0069gner \u0045valua\u0074ion", javax. swing
//        . border. TitledBorder. CENTER, javax. swing. border. TitledBorder. BOTTOM, new java .awt .
//        Font ("D\u0069alog" ,java .awt .Font .BOLD ,12 ), java. awt. Color. red
//        ) , getBorder( )) );  addPropertyChangeListener (new java. beans. PropertyChangeListener( ){ @Override
//        public void propertyChange (java .beans .PropertyChangeEvent e) {if ("\u0062order" .equals (e .getPropertyName (
//        ) )) throw new RuntimeException( ); }} );
//
//        //---- old_firstname ----
//        old_firstname.setText(bundle.getString("updatePanel.old_firstname.text"));
//        old_firstname.setFont(old_firstname.getFont().deriveFont(old_firstname.getFont().getSize() + 5f));
//
//        //---- old_lastname ----
//        old_lastname.setText(bundle.getString("updatePanel.old_lastname.text"));
//        old_lastname.setFont(old_lastname.getFont().deriveFont(old_lastname.getFont().getSize() + 5f));
//
//        //---- label3 ----
//        label3.setText(bundle.getString("updatePanel.label3.text"));
//        label3.setHorizontalAlignment(SwingConstants.CENTER);
//        label3.setFont(label3.getFont().deriveFont(label3.getFont().getStyle() | Font.BOLD, label3.getFont().getSize() + 9f));
//
//        //---- old_age ----
//        old_age.setText(bundle.getString("updatePanel.old_age.text"));
//        old_age.setFont(old_age.getFont().deriveFont(old_age.getFont().getSize() + 5f));
//
//        //---- old_gender ----
//        old_gender.setText(bundle.getString("updatePanel.old_gender.text"));
//        old_gender.setFont(old_gender.getFont().deriveFont(old_gender.getFont().getSize() + 5f));
//
//        //---- old_level ----
//        old_level.setText(bundle.getString("updatePanel.old_level.text"));
//        old_level.setFont(old_level.getFont().deriveFont(old_level.getFont().getSize() + 5f));
//
//        //---- old_Team_info ----
//        old_Team_info.setText(bundle.getString("updatePanel.old_Team_info.text"));
//        old_Team_info.setFont(old_Team_info.getFont().deriveFont(old_Team_info.getFont().getSize() + 5f));
//
//        //---- old_position_title ----
//        old_position_title.setText(bundle.getString("updatePanel.old_position_title.text"));
//        old_position_title.setFont(old_position_title.getFont().deriveFont(old_position_title.getFont().getSize() + 5f));
//
//        //---- label10 ----
//        label10.setText(bundle.getString("updatePanel.label10.text"));
//        label10.setFont(label10.getFont().deriveFont(label10.getFont().getSize() + 5f));
//
//        //---- old_cell_phone_number ----
//        old_cell_phone_number.setText(bundle.getString("updatePanel.old_cell_phone_number.text"));
//        old_cell_phone_number.setFont(old_cell_phone_number.getFont().deriveFont(old_cell_phone_number.getFont().getSize() + 5f));
//
//        //---- old_email_address ----
//        old_email_address.setText(bundle.getString("updatePanel.old_email_address.text"));
//        old_email_address.setFont(old_email_address.getFont().deriveFont(old_email_address.getFont().getSize() + 5f));
//
//        //---- label13 ----
//        label13.setText(bundle.getString("updatePanel.label13.text"));
//
//        //---- photo ----
//        photo.setText(bundle.getString("updatePanel.photo.text"));
//        photo.setFont(photo.getFont().deriveFont(photo.getFont().getSize() + 5f));
//
//        //---- update ----
//        update.setText(bundle.getString("updatePanel.update.text"));
//        update.addActionListener(e -> submit(e));
//
//        //---- upload ----
//        upload.setText(bundle.getString("updatePanel.upload.text"));
//        upload.addActionListener(e -> uploadPhoto(e));
//
//        GroupLayout layout = new GroupLayout(this);
//        setLayout(layout);
//        layout.setHorizontalGroup(
//            layout.createParallelGroup()
//                .addGroup(layout.createSequentialGroup()
//                    .addGroup(layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
//                        .addGroup(layout.createSequentialGroup()
//                            .addGap(113, 113, 113)
//                            .addGroup(layout.createParallelGroup()
//                                .addComponent(old_lastname, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
//                                .addComponent(old_firstname, GroupLayout.DEFAULT_SIZE, 392, Short.MAX_VALUE)))
//                        .addGroup(layout.createSequentialGroup()
//                            .addContainerGap()
//                            .addGroup(layout.createParallelGroup()
//                                .addComponent(old_age, GroupLayout.PREFERRED_SIZE, 290, GroupLayout.PREFERRED_SIZE)
//                                .addComponent(old_gender, GroupLayout.PREFERRED_SIZE, 300, GroupLayout.PREFERRED_SIZE))
//                            .addGap(108, 108, 108)))
//                    .addGap(145, 145, 145)
//                    .addGroup(layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
//                        .addComponent(fisrtname, GroupLayout.PREFERRED_SIZE, 267, GroupLayout.PREFERRED_SIZE)
//                        .addComponent(lastname, GroupLayout.PREFERRED_SIZE, 267, GroupLayout.PREFERRED_SIZE))
//                    .addGap(121, 121, 121))
//                .addGroup(layout.createSequentialGroup()
//                    .addGap(104, 104, 104)
//                    .addGroup(layout.createParallelGroup()
//                        .addGroup(layout.createSequentialGroup()
//                            .addGroup(layout.createParallelGroup()
//                                .addComponent(old_level, GroupLayout.PREFERRED_SIZE, 300, GroupLayout.PREFERRED_SIZE)
//                                .addComponent(old_Team_info, GroupLayout.Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 300, GroupLayout.PREFERRED_SIZE))
//                            .addGap(28, 28, 28)
//                            .addGroup(layout.createParallelGroup()
//                                .addComponent(age, GroupLayout.PREFERRED_SIZE, 56, GroupLayout.PREFERRED_SIZE)
//                                .addComponent(level, GroupLayout.PREFERRED_SIZE, 154, GroupLayout.PREFERRED_SIZE)
//                                .addComponent(team_info, GroupLayout.PREFERRED_SIZE, 214, GroupLayout.PREFERRED_SIZE)
//                                .addComponent(gender, GroupLayout.PREFERRED_SIZE, 104, GroupLayout.PREFERRED_SIZE))
//                            .addGap(0, 279, Short.MAX_VALUE))
//                        .addGroup(layout.createSequentialGroup()
//                            .addGroup(layout.createParallelGroup()
//                                .addGroup(layout.createSequentialGroup()
//                                    .addGap(1, 1, 1)
//                                    .addComponent(label10))
//                                .addComponent(old_position_title, GroupLayout.PREFERRED_SIZE, 300, GroupLayout.PREFERRED_SIZE))
//                            .addGap(28, 28, 28)
//                            .addComponent(position_title, GroupLayout.PREFERRED_SIZE, 231, GroupLayout.PREFERRED_SIZE)
//                            .addContainerGap(262, Short.MAX_VALUE))
//                        .addGroup(layout.createSequentialGroup()
//                            .addGap(97, 97, 97)
//                            .addComponent(photo)
//                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
//                            .addComponent(upload)
//                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 351, Short.MAX_VALUE)
//                            .addComponent(label13)
//                            .addGap(195, 195, 195))))
//                .addGroup(layout.createSequentialGroup()
//                    .addGap(131, 131, 131)
//                    .addGroup(layout.createParallelGroup()
//                        .addComponent(label3, GroupLayout.PREFERRED_SIZE, 907, GroupLayout.PREFERRED_SIZE)
//                        .addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
//                            .addGroup(layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
//                                .addComponent(old_email_address, GroupLayout.DEFAULT_SIZE, 521, Short.MAX_VALUE)
//                                .addComponent(old_cell_phone_number, GroupLayout.DEFAULT_SIZE, 521, Short.MAX_VALUE))
//                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
//                            .addGroup(layout.createParallelGroup()
//                                .addComponent(cell_phone_number, GroupLayout.Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 231, GroupLayout.PREFERRED_SIZE)
//                                .addComponent(email_add, GroupLayout.Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 231, GroupLayout.PREFERRED_SIZE))
//                            .addGap(149, 149, 149))))
//                .addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
//                    .addContainerGap(646, Short.MAX_VALUE)
//                    .addComponent(update)
//                    .addGap(314, 314, 314))
//        );
//        layout.setVerticalGroup(
//            layout.createParallelGroup()
//                .addGroup(layout.createSequentialGroup()
//                    .addGap(26, 26, 26)
//                    .addComponent(label3, GroupLayout.DEFAULT_SIZE, 52, Short.MAX_VALUE)
//                    .addGap(18, 18, 18)
//                    .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
//                        .addComponent(fisrtname, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
//                        .addComponent(old_firstname, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE))
//                    .addGap(18, 18, 18)
//                    .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
//                        .addComponent(old_lastname, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
//                        .addComponent(lastname, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
//                    .addGap(77, 77, 77)
//                    .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
//                        .addComponent(age, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
//                        .addComponent(old_age, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE))
//                    .addGap(18, 18, 18)
//                    .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
//                        .addComponent(gender, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
//                        .addComponent(old_gender, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE))
//                    .addGroup(layout.createParallelGroup()
//                        .addGroup(layout.createSequentialGroup()
//                            .addGap(69, 69, 69)
//                            .addComponent(old_Team_info, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
//                            .addGap(18, 18, 18)
//                            .addComponent(old_position_title, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE))
//                        .addGroup(layout.createSequentialGroup()
//                            .addGap(24, 24, 24)
//                            .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
//                                .addComponent(level, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
//                                .addComponent(old_level, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE))
//                            .addGap(18, 18, 18)
//                            .addComponent(team_info, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
//                            .addGap(18, 18, 18)
//                            .addComponent(position_title, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
//                    .addGap(35, 35, 35)
//                    .addComponent(label10, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
//                    .addGap(18, 18, 18)
//                    .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
//                        .addComponent(old_cell_phone_number, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
//                        .addComponent(cell_phone_number, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
//                    .addGroup(layout.createParallelGroup()
//                        .addGroup(layout.createSequentialGroup()
//                            .addGap(5, 5, 5)
//                            .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
//                                .addComponent(email_add, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
//                                .addComponent(old_email_address, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE))
//                            .addGap(18, 18, 18)
//                            .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
//                                .addComponent(photo, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
//                                .addComponent(upload)))
//                        .addGroup(layout.createSequentialGroup()
//                            .addGap(48, 48, 48)
//                            .addComponent(label13)))
//                    .addGap(3, 3, 3)
//                    .addComponent(update)
//                    .addGap(25, 25, 25))
//        );
//        layout.linkSize(SwingConstants.VERTICAL, new Component[] {old_firstname, old_lastname});
//        // JFormDesigner - End of component initialization  //GEN-END:initComponents
//    }
//
//    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
//    // Generated using JFormDesigner Evaluation license - yibin
//    private JLabel old_firstname;
//    private JTextField fisrtname;
//    private JLabel old_lastname;
//    private JTextField lastname;
//    private JLabel label3;
//    private JLabel old_age;
//    private JTextField age;
//    private JLabel old_gender;
//    private JComboBox gender;
//    private JLabel old_level;
//    private JTextField level;
//    private JLabel old_Team_info;
//    private JTextField team_info;
//    private JLabel old_position_title;
//    private JTextField position_title;
//    private JLabel label10;
//    private JLabel old_cell_phone_number;
//    private JTextField cell_phone_number;
//    private JLabel old_email_address;
//    private JTextField email_add;
//    private JLabel label13;
//    private JLabel photo;
//    private JButton update;
//    private JButton upload;
//    // JFormDesigner - End of variables declaration  //GEN-END:variables
//}
