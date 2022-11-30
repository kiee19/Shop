/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.ul;

import java.util.Date;
import java.util.List;

import javax.swing.table.DefaultTableModel;

import com.DAO.HoaDonDAO;
import com.DAO.ThongKeDAO;
import com.entity.HoaDon;
import com.utils.Message;
import com.utils.XDate;

/**
 *
 * @author korea
 */
public class TKHoaDonPanel extends javax.swing.JPanel {

    /**
     * Creates new form TKHoaDonPanel
     */
    public TKHoaDonPanel() {
        initComponents();
        init();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblHoaDon = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        dcTo = new com.toedter.calendar.JDateChooser();
        dcFrom = new com.toedter.calendar.JDateChooser();
        cboTT = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        cboPttt = new javax.swing.JComboBox<>();
        txtMaKH = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        btnXuatTK = new javax.swing.JButton();
        btnLoc = new javax.swing.JButton();

        jLabel1.setText("Danh sách hóa đơn chi tiết :");

        tblHoaDon.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tblHoaDon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblHoaDonMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblHoaDon);

        jLabel2.setText("Từ :");

        cboTT.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cboTT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboTTActionPerformed(evt);
            }
        });

        jLabel4.setText("Trạng thái :");

        jLabel3.setText("Đến :");

        jLabel5.setText("Mã khách hàng :");

        cboPttt.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cboPttt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboPtttActionPerformed(evt);
            }
        });

        txtMaKH.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtMaKHKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtMaKHKeyReleased(evt);
            }
        });

        jLabel6.setText("Phương thức thanh toán :");

        btnXuatTK.setText("Xuất TK");
        btnXuatTK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXuatTKActionPerformed(evt);
            }
        });

        btnLoc.setText("Lọc");
        btnLoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLocActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(cboPttt, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(dcFrom, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(dcTo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cboTT, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtMaKH, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(30, 30, 30)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnXuatTK)
                            .addComponent(btnLoc))
                        .addGap(31, 31, 31))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel2)
                .addGap(4, 4, 4)
                .addComponent(dcFrom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addComponent(btnLoc))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(dcTo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(btnXuatTK))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cboTT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addGap(7, 7, 7)
                .addComponent(cboPttt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtMaKH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(58, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addContainerGap(664, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(16, 16, 16))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 356, Short.MAX_VALUE))
                .addContainerGap(18, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void tblHoaDonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblHoaDonMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tblHoaDonMouseClicked

    private void btnXuatTKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXuatTKActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnXuatTKActionPerformed

    private void cboTTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboTTActionPerformed
        // TODO add your handling code here:
        fillTableHD();

    }//GEN-LAST:event_cboTTActionPerformed

    private void cboPtttActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboPtttActionPerformed
        // TODO add your handling code here:
        fillTableHD();

    }//GEN-LAST:event_cboPtttActionPerformed

    private void txtMaKHKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMaKHKeyPressed
        // TODO add your handling code here:
        fillTableHD();

    }//GEN-LAST:event_txtMaKHKeyPressed

    private void txtMaKHKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMaKHKeyReleased
        // TODO add your handling code here:
        fillTableHD();

    }//GEN-LAST:event_txtMaKHKeyReleased

    private void btnLocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLocActionPerformed
        // TODO add your handling code here:
        fillTableHDTG();

    }//GEN-LAST:event_btnLocActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLoc;
    private javax.swing.JButton btnXuatTK;
    private javax.swing.JComboBox<String> cboPttt;
    private javax.swing.JComboBox<String> cboTT;
    private com.toedter.calendar.JDateChooser dcFrom;
    private com.toedter.calendar.JDateChooser dcTo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblHoaDon;
    private javax.swing.JTextField txtMaKH;
    // End of variables declaration//GEN-END:variables
    private void init() {
        fillCBOTT();
        fillCBOPTTT();
        cboTT.setSelectedIndex(-1);
        cboPttt.setSelectedIndex(-1);
        fillTableHD();

    }

    private void fillCBOTT() {
        String list[] = { "Đã thanh toán", "Chưa thanh toán" };
        cboTT.removeAllItems();
        for (int i = 0; i < list.length; i++) {
            cboTT.addItem(list[i]);
        }
    }

    private void fillCBOPTTT() {
        String list[] = { "Tiền mặt", "Chuyển khoản" };
        cboPttt.removeAllItems();
        for (int i = 0; i < list.length; i++) {
            cboPttt.addItem(list[i]);
        }
    }

    private ThongKeDAO daoTK = new ThongKeDAO();

    private void fillTableHD() {
        try {
            String header[] = { "Mã NT", "Mã HD", "Mã KH", "Ngày tạo", "PTTT", "Trạng thái", "Tổng tiền" };
            DefaultTableModel model = new DefaultTableModel(header, 0);
            tblHoaDon.setModel(model);
            String tt = (String) cboTT.getSelectedItem();
            String pttt = (String) cboPttt.getSelectedItem();
            String maKH = txtMaKH.getText();
            List<Object[]> list = daoTK.getListHD(tt, pttt, maKH);
            for (Object []o : list) {
                model.addRow(o);
            }
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
            Message.alert(this, "Lỗi truy xuất dữ liệu!");
        }
    }
    private void fillTableHDTG() {
        try {

            String header[] = { "Mã NT", "Mã HD", "Mã KH", "Ngày tạo", "PTTT", "Trạng thái", "Tổng tiền" };
            DefaultTableModel model = new DefaultTableModel(header, 0);
            tblHoaDon.setModel(model);
            String tt = (String) cboTT.getSelectedItem();
            String pttt = (String) cboPttt.getSelectedItem();
            String maKH = txtMaKH.getText();
            Date from = dcFrom.getDate();
            Date to = dcTo.getDate();
            List<Object[]> list = daoTK.getListHDTG(from,to,tt, pttt, maKH);
            for (Object []o : list) {
                model.addRow(o);
            }
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
            Message.alert(this, "Lỗi truy xuất dữ liệu!");
        }
    }
}
