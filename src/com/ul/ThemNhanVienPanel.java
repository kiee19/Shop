/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.ul;

import java.util.Calendar;
import java.util.Date;
import java.util.List;

import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;

import com.DAO.NhanVienDAO;
import com.entity.NhanVien;
import com.utils.Auth;
import com.utils.Message;
import com.utils.XDate;
import javax.swing.DefaultComboBoxModel;
import javax.swing.RowFilter;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author korea
 */
public class ThemNhanVienPanel extends javax.swing.JPanel {

    /**
     * Creates new form ThemNhanVienPanel
     */
    public ThemNhanVienPanel() {
        initComponents();
        init();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btgSex = new javax.swing.ButtonGroup();
        btgVaiTro = new javax.swing.ButtonGroup();
        jPanel8 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        txtMaNV = new javax.swing.JTextField();
        txtTenNV = new javax.swing.JTextField();
        txtSDT = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        rdoNhanVien = new javax.swing.JRadioButton();
        rdoQuanLy = new javax.swing.JRadioButton();
        rdoNam = new javax.swing.JRadioButton();
        rdoNu = new javax.swing.JRadioButton();
        btnThem = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();
        btnCapNhat = new javax.swing.JButton();
        btnMoi = new javax.swing.JButton();
        dcNgaySInh = new com.toedter.calendar.JDateChooser();
        jLabel1 = new javax.swing.JLabel();
        txtMatKhau = new javax.swing.JPasswordField();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtDiaChi = new javax.swing.JTextArea();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblNhanVien = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        txtTimKiem = new javax.swing.JTextField();
        cboLoc = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        btnTimKiem = new javax.swing.JButton();

        jPanel8.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel10.setText("Mã nhân viên :");

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel11.setText("Tên nhân viên :");

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel12.setText("Giới tính :");

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel13.setText("Ngày sinh :");

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel14.setText("Địa chỉ :");

        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel15.setText("SDT :");

        jLabel16.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel16.setText("Email : ");

        jLabel17.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel17.setText("Vai trò :");

        btgVaiTro.add(rdoNhanVien);
        rdoNhanVien.setText("Nhân viên");

        btgVaiTro.add(rdoQuanLy);
        rdoQuanLy.setText("Quản lý");

        btgSex.add(rdoNam);
        rdoNam.setText("Nam");

        btgSex.add(rdoNu);
        rdoNu.setText("Nữ");

        btnThem.setText("Thêm");
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });

        btnXoa.setText("Xóa");
        btnXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaActionPerformed(evt);
            }
        });

        btnCapNhat.setText("Cập nhật");
        btnCapNhat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCapNhatActionPerformed(evt);
            }
        });

        btnMoi.setText("Mới");
        btnMoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMoiActionPerformed(evt);
            }
        });

        jLabel1.setText("Mật khẩu :");

        txtDiaChi.setColumns(20);
        txtDiaChi.setRows(5);
        jScrollPane2.setViewportView(txtDiaChi);

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel12)
                            .addComponent(jLabel13)
                            .addComponent(jLabel14)
                            .addComponent(jLabel15)
                            .addComponent(jLabel16)
                            .addComponent(jLabel17))
                        .addGap(42, 42, 42))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(18, 18, 18)))
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel8Layout.createSequentialGroup()
                        .addComponent(rdoQuanLy)
                        .addGap(18, 18, 18)
                        .addComponent(rdoNhanVien)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel8Layout.createSequentialGroup()
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(txtMatKhau, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtMaNV, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtTenNV, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtSDT, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtEmail, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 181, Short.MAX_VALUE)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel8Layout.createSequentialGroup()
                                    .addComponent(rdoNam)
                                    .addGap(38, 38, 38)
                                    .addComponent(rdoNu))
                                .addComponent(dcNgaySInh, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(18, 71, Short.MAX_VALUE)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(btnMoi, javax.swing.GroupLayout.DEFAULT_SIZE, 77, Short.MAX_VALUE)
                                    .addComponent(btnThem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addComponent(btnXoa, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btnCapNhat, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(62, 62, 62))))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(txtMaNV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtMatKhau, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtTenNV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11))
                        .addGap(15, 15, 15)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(rdoNam)
                            .addComponent(rdoNu))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel13)
                            .addComponent(dcNgaySInh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jLabel14))
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel15)
                            .addComponent(txtSDT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(19, 19, 19)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel16)
                            .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel17)
                            .addComponent(rdoQuanLy)
                            .addComponent(rdoNhanVien))
                        .addContainerGap(51, Short.MAX_VALUE))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(btnThem)
                        .addGap(18, 18, 18)
                        .addComponent(btnXoa)
                        .addGap(18, 18, 18)
                        .addComponent(btnCapNhat)
                        .addGap(18, 18, 18)
                        .addComponent(btnMoi)
                        .addGap(202, 202, 202))))
        );

        jPanel6.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        tblNhanVien.setModel(new javax.swing.table.DefaultTableModel(
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
        tblNhanVien.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblNhanVienMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblNhanVien);

        jLabel2.setText("Tìm kiếm :");

        cboLoc.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cboLoc.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cboLocItemStateChanged(evt);
            }
        });

        jLabel5.setText("Lọc nhân viên :");

        btnTimKiem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/image/icons8_search_20px.png"))); // NOI18N
        btnTimKiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTimKiemActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addContainerGap())
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(txtTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(47, 47, 47)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(cboLoc, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(16, 16, 16))
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addContainerGap(119, Short.MAX_VALUE))))))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cboLoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(20, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        // TODO add your handling code here:
        insert();
    }//GEN-LAST:event_btnThemActionPerformed

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
        // TODO add your handling code here:
        delete();
    }//GEN-LAST:event_btnXoaActionPerformed

    private void btnCapNhatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCapNhatActionPerformed
        // TODO add your handling code here:
        update();
    }//GEN-LAST:event_btnCapNhatActionPerformed

    private void btnMoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMoiActionPerformed
        // TODO add your handling code here:
        clearForm();
    }//GEN-LAST:event_btnMoiActionPerformed

    private void btnTimKiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTimKiemActionPerformed
        // TODO add your handling code here:
        String query = txtTimKiem.getText();
        find(query);
    }//GEN-LAST:event_btnTimKiemActionPerformed

    private void tblNhanVienMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblNhanVienMouseClicked
        // TODO add your handling code here:
        row = tblNhanVien.getSelectedRow();
        edit();
    }//GEN-LAST:event_tblNhanVienMouseClicked

    private void cboLocItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cboLocItemStateChanged
        // TODO add your handling code here:
        String query = cboLoc.getSelectedItem().toString();
        filterCbo(query);
    }//GEN-LAST:event_cboLocItemStateChanged


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup btgSex;
    private javax.swing.ButtonGroup btgVaiTro;
    private javax.swing.JButton btnCapNhat;
    private javax.swing.JButton btnMoi;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnTimKiem;
    private javax.swing.JButton btnXoa;
    private javax.swing.JComboBox<String> cboLoc;
    private com.toedter.calendar.JDateChooser dcNgaySInh;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JRadioButton rdoNam;
    private javax.swing.JRadioButton rdoNhanVien;
    private javax.swing.JRadioButton rdoNu;
    private javax.swing.JRadioButton rdoQuanLy;
    private javax.swing.JTable tblNhanVien;
    private javax.swing.JTextArea txtDiaChi;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtMaNV;
    private javax.swing.JPasswordField txtMatKhau;
    private javax.swing.JTextField txtSDT;
    private javax.swing.JTextField txtTenNV;
    private javax.swing.JTextField txtTimKiem;
    // End of variables declaration//GEN-END:variables

    int row = -1;
    private NhanVienDAO dao = new NhanVienDAO();

    private void init() {
        fillTable();
        updateStatus();
        // fillCBOLoc();

    }

    private void updateStatus() {
        boolean edit = (this.row >= 0);
        // Trạng thái form
        txtMaNV.setEditable(!edit);
        btnThem.setEnabled(!edit);
        btnCapNhat.setEnabled(edit);
        btnXoa.setEnabled(edit);
    }
    DefaultTableModel model;

    private void fillTable() {
        String header[] = {"Mã NV", "Họ và tên", "Giới tính", "Ngày sinh", "Vai trò"};
        model = new DefaultTableModel(header, 0);
        tblNhanVien.setModel(model);
        try {
            List<NhanVien> list = dao.selectAll();
            for (NhanVien nv : list) {
                Object[] row = {nv.getMaNV(), nv.getTen(), nv.isGioiTinh() ? "Nữ" : "Nam", XDate.toString(nv.getNgaySinh(), "dd-MM-yyyy"), (nv.getVaiTro()) ? "Quản lý" : "Nhân viên"};
                model.addRow(row);
            }

        } catch (Exception e) {
            Message.alert(this, "Lỗi truy vấn dữ liệu!");
        }
    }

    private void filterCbo(String query) {
        TableRowSorter<DefaultTableModel> tr = new TableRowSorter<DefaultTableModel>(model);
        tblNhanVien.setRowSorter(tr);

        if (query != "None") {
            tr.setRowFilter(RowFilter.regexFilter(query));
        } else {
            tblNhanVien.setRowSorter(tr);
        }

    }

    private void find(String query) {
        TableRowSorter<DefaultTableModel> tr = new TableRowSorter<DefaultTableModel>(model);
        tblNhanVien.setRowSorter(tr);

        tr.setRowFilter(RowFilter.regexFilter(query));
    }

    private void fillBoLoc() {
        String[] data = {"None", "Nam", "Nữ", "Quản lý", "Nhân viên"};
        cboLoc.setModel(new DefaultComboBoxModel<>(data));
    }

    private boolean checkNull(NhanVien nv) {
        if (nv.getMaNV().isEmpty() || nv.getPassword().isEmpty() || nv.getTen().isEmpty()) {
            return false;
        }
        return true;
    }

    private void setForm(NhanVien nv) {
        txtMaNV.setText(nv.getMaNV());
        txtMatKhau.setText((nv.getPassword()));
        txtTenNV.setText(nv.getTen());
        if (!nv.isGioiTinh()) {
            rdoNam.setSelected(true);
        } else {
            rdoNu.setSelected(true);
        }
        dcNgaySInh.setDate(nv.getNgaySinh());
        txtDiaChi.setText(nv.getDiaChi());
        txtSDT.setText(nv.getSdt());
        txtEmail.setText(nv.getEmail());
        if (nv.isVaiTro()) {
            rdoQuanLy.setSelected(true);
        } else {
            rdoNhanVien.setSelected(true);
        }
    }

    private NhanVien getForm() {
        NhanVien nv = new NhanVien();
        nv.setMaNV(txtMaNV.getText());
        nv.setPassword(txtMatKhau.getText());
        nv.setTen(txtTenNV.getText());
        if (rdoNam.isSelected()) {
            nv.setGioiTinh(false);
        } else {
            nv.setGioiTinh(true);
        }
        nv.setNgaySinh(dcNgaySInh.getDate());
        nv.setDiaChi(txtDiaChi.getText());
        nv.setSdt(txtSDT.getText());
        nv.setEmail(txtEmail.getText());
        if (rdoNhanVien.isSelected()) {
            nv.setVaiTro(false);
        } else {
            nv.setVaiTro(true);
        }
        return nv;
    }

    private void insert() {
        NhanVien model = getForm();
        try {
            if (checkNull(model) == true) {
                dao.insert(model);
                this.fillTable();
                this.clearForm();
                Message.alert(this, "Thêm mới thành công!");
            } else {
                Message.alert(this, "Bạn cần nhập đủ thông tin!");
            }
        } catch (Exception e) {
            Message.alert(this, "Thêm mới thất bại!");
            e.printStackTrace();
        }
    }

    private void delete() {
        if (!Auth.isManager()) {
            Message.alert(this, "Bạn không có quyền xóa Nhân viên!");
        } else {
            NhanVien nv = getForm();
            if (Auth.user.getMaNV().equals(nv.getMaNV())) {
                Message.alert(this, "Bạn không được xóa chính bạn!");
            }
            if (Message.confirm(this, "Bạn có muốn xóa hay không?")) {
                try {
                    dao.delete(nv.getMaNV());
                    this.fillTable();
                    this.clearForm();
                    Message.alert(this, "Xóa thành công!");
                } catch (Exception e) {
                    Message.alert(this, "Xóa thất bại!");
                    e.printStackTrace();
                }
            }
        }
    }

    private void clearForm() {
        Date currentDate = new Date();
        row = -1;
        updateStatus();
        txtMaNV.setText("");
        txtMatKhau.setText("");
        txtDiaChi.setText("");
        txtEmail.setText("");
        dcNgaySInh.setDate(currentDate);
        txtSDT.setText("");
        txtTenNV.setText("");
        rdoNam.setSelected(false);
        rdoNu.setSelected(false);
        rdoQuanLy.setSelected(false);
        rdoNhanVien.setSelected(false);
    }

    private void update() {
        NhanVien model = getForm();
        try {
            dao.update(model);
            this.fillTable();
            Message.alert(this, "Cập nhật thành công!");
        } catch (Exception e) {
            Message.alert(this, "Cập nhật thất bại!");
            e.printStackTrace();
        }
    }

    private void edit() {
        String manv = (String) tblNhanVien.getValueAt(this.row, 0);
        NhanVien cd = dao.selectByID(manv);
        this.setForm(cd);
        this.updateStatus();
    }
}
