/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MyMDI;

import EduSys_View.Chao;
import EduSys_View.Login;
import Helper.Auth;
import Helper.MsgBox;
import Helper.XImage;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.Timer;

/**
 *
 * @author Admin
 */
public class MainMDI extends javax.swing.JFrame {

    DoiMatKhau doiPass;
    QuanLyNhanVien qlnv;
    ChuyenDeJInternalFrame chuyenDe;
    KhoaHocJInternalFrame khoaHoc;
    NguoiHocJInternalFrame nguoiHoc;
    HocVienJInternalFrame hocVien;
    ThongKeJInternalFrame thongKe;
    public MainMDI() {
        initComponents();
        setLocationRelativeTo(null);
        setExtendedState(getExtendedState() | JFrame.MAXIMIZED_BOTH);
        this.setIconImage(XImage.getAppIcon());
        this.time();
        new Chao(this, true).setVisible(true);
        new Login(this, true).setVisible(true);
        this.chucVu();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane = new javax.swing.JDesktopPane();
        jLabel1 = new javax.swing.JLabel();
        jToolBar1 = new javax.swing.JToolBar();
        btnDangxuat = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JToolBar.Separator();
        btnKetthuc = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JToolBar.Separator();
        btnChuyende = new javax.swing.JButton();
        jSeparator3 = new javax.swing.JToolBar.Separator();
        btnNguoihoc = new javax.swing.JButton();
        jSeparator4 = new javax.swing.JToolBar.Separator();
        btnKhoahoc = new javax.swing.JButton();
        jSeparator5 = new javax.swing.JToolBar.Separator();
        btnHocvien = new javax.swing.JButton();
        jSeparator6 = new javax.swing.JToolBar.Separator();
        btnHuongdan = new javax.swing.JButton();
        jSeparator7 = new javax.swing.JToolBar.Separator();
        lblChucVu = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lblHoTen = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lblTime = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        mnuHethong = new javax.swing.JMenu();
        mniDangNhap = new javax.swing.JMenuItem();
        mniDangxuat = new javax.swing.JMenuItem();
        jSeparator8 = new javax.swing.JPopupMenu.Separator();
        mniDoiMK = new javax.swing.JMenuItem();
        mniKetThuc = new javax.swing.JMenuItem();
        mnuQuanly = new javax.swing.JMenu();
        mniChuyende = new javax.swing.JMenuItem();
        mniKhoaHoc = new javax.swing.JMenuItem();
        mniNguoihoc = new javax.swing.JMenuItem();
        mniHocvien = new javax.swing.JMenuItem();
        jSeparator9 = new javax.swing.JPopupMenu.Separator();
        mniNhanVien = new javax.swing.JMenuItem();
        mnuThongke = new javax.swing.JMenu();
        mniBangdiem = new javax.swing.JMenuItem();
        jSeparator10 = new javax.swing.JPopupMenu.Separator();
        mniLuongnguoi = new javax.swing.JMenuItem();
        mniDiemchuyende = new javax.swing.JMenuItem();
        mniDoanhthu = new javax.swing.JMenuItem();
        mnuTrogiup = new javax.swing.JMenu();
        mniHDSD = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 153, 102));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jDesktopPane.setBackground(new java.awt.Color(153, 204, 255));
        jDesktopPane.setForeground(new java.awt.Color(255, 153, 51));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/logo.png"))); // NOI18N
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jDesktopPane.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPaneLayout = new javax.swing.GroupLayout(jDesktopPane);
        jDesktopPane.setLayout(jDesktopPaneLayout);
        jDesktopPaneLayout.setHorizontalGroup(
            jDesktopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 668, Short.MAX_VALUE)
        );
        jDesktopPaneLayout.setVerticalGroup(
            jDesktopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 406, Short.MAX_VALUE)
        );

        jToolBar1.setRollover(true);

        btnDangxuat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Exit.png"))); // NOI18N
        btnDangxuat.setText("Đăng Xuất");
        btnDangxuat.setFocusable(false);
        btnDangxuat.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnDangxuat.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnDangxuat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniDangxuatActionPerformed(evt);
            }
        });
        jToolBar1.add(btnDangxuat);
        jToolBar1.add(jSeparator1);

        btnKetthuc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Stop.png"))); // NOI18N
        btnKetthuc.setText("Kết Thúc");
        btnKetthuc.setFocusable(false);
        btnKetthuc.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnKetthuc.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnKetthuc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKetthucActionPerformed(evt);
            }
        });
        jToolBar1.add(btnKetthuc);
        jToolBar1.add(jSeparator2);

        btnChuyende.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/List.png"))); // NOI18N
        btnChuyende.setText("Chuyên Đề");
        btnChuyende.setFocusable(false);
        btnChuyende.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnChuyende.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnChuyende.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniChuyendeActionPerformed(evt);
            }
        });
        jToolBar1.add(btnChuyende);
        jToolBar1.add(jSeparator3);

        btnNguoihoc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Conference.png"))); // NOI18N
        btnNguoihoc.setText("Người Học");
        btnNguoihoc.setFocusable(false);
        btnNguoihoc.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnNguoihoc.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnNguoihoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniNguoihocActionPerformed(evt);
            }
        });
        jToolBar1.add(btnNguoihoc);
        jToolBar1.add(jSeparator4);

        btnKhoahoc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Certificate.png"))); // NOI18N
        btnKhoahoc.setText("Khóa Học");
        btnKhoahoc.setFocusable(false);
        btnKhoahoc.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnKhoahoc.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnKhoahoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniKhoaHocActionPerformed(evt);
            }
        });
        jToolBar1.add(btnKhoahoc);
        jToolBar1.add(jSeparator5);

        btnHocvien.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/10207-man-student-light-skin-tone-icon-24.png"))); // NOI18N
        btnHocvien.setText("Học Viên");
        btnHocvien.setFocusable(false);
        btnHocvien.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnHocvien.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnHocvien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniHocvienActionPerformed(evt);
            }
        });
        jToolBar1.add(btnHocvien);
        jToolBar1.add(jSeparator6);

        btnHuongdan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Globe.png"))); // NOI18N
        btnHuongdan.setText("Hướng Dẫn");
        btnHuongdan.setFocusable(false);
        btnHuongdan.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnHuongdan.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(btnHuongdan);
        jToolBar1.add(jSeparator7);

        lblChucVu.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblChucVu.setText("Chức Vụ");
        jToolBar1.add(lblChucVu);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setText(" : ");
        jToolBar1.add(jLabel4);

        lblHoTen.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblHoTen.setText("Họ Tên");
        jToolBar1.add(lblHoTen);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Actions-help-about-icon-16.png"))); // NOI18N
        jLabel2.setText("Hệ Quản Lý Đào Tạo");

        lblTime.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblTime.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Alarm.png"))); // NOI18N
        lblTime.setText("00 : 00 : 00 AM");

        mnuHethong.setText("Hệ thống");

        mniDangNhap.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Key.png"))); // NOI18N
        mniDangNhap.setText("Đăng Nhập");
        mniDangNhap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniDangNhapActionPerformed(evt);
            }
        });
        mnuHethong.add(mniDangNhap);

        mniDangxuat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Log out.png"))); // NOI18N
        mniDangxuat.setText("Đăng Xuất");
        mniDangxuat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniDangxuatActionPerformed(evt);
            }
        });
        mnuHethong.add(mniDangxuat);
        mnuHethong.add(jSeparator8);

        mniDoiMK.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Refresh.png"))); // NOI18N
        mniDoiMK.setText("Đổi Mật Khẩu");
        mniDoiMK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniDoiMKActionPerformed(evt);
            }
        });
        mnuHethong.add(mniDoiMK);

        mniKetThuc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Stop.png"))); // NOI18N
        mniKetThuc.setText("Kết Thúc");
        mniKetThuc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniKetThucActionPerformed(evt);
            }
        });
        mnuHethong.add(mniKetThuc);

        jMenuBar1.add(mnuHethong);

        mnuQuanly.setText("Quản Lý");

        mniChuyende.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/List.png"))); // NOI18N
        mniChuyende.setText("Chuyên Đề");
        mniChuyende.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniChuyendeActionPerformed(evt);
            }
        });
        mnuQuanly.add(mniChuyende);

        mniKhoaHoc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Certificate.png"))); // NOI18N
        mniKhoaHoc.setText("Khóa Học");
        mniKhoaHoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniKhoaHocActionPerformed(evt);
            }
        });
        mnuQuanly.add(mniKhoaHoc);

        mniNguoihoc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Conference.png"))); // NOI18N
        mniNguoihoc.setText("Người Học");
        mniNguoihoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniNguoihocActionPerformed(evt);
            }
        });
        mnuQuanly.add(mniNguoihoc);

        mniHocvien.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/10207-man-student-light-skin-tone-icon-24.png"))); // NOI18N
        mniHocvien.setText("Học Viên");
        mniHocvien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniHocvienActionPerformed(evt);
            }
        });
        mnuQuanly.add(mniHocvien);
        mnuQuanly.add(jSeparator9);

        mniNhanVien.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/User group.png"))); // NOI18N
        mniNhanVien.setText("Nhân Viên");
        mniNhanVien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniNhanVienActionPerformed(evt);
            }
        });
        mnuQuanly.add(mniNhanVien);

        jMenuBar1.add(mnuQuanly);

        mnuThongke.setText("Thống Kê");

        mniBangdiem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Card file.png"))); // NOI18N
        mniBangdiem.setText("Bảng Điểm");
        mniBangdiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniBangdiemActionPerformed(evt);
            }
        });
        mnuThongke.add(mniBangdiem);
        mnuThongke.add(jSeparator10);

        mniLuongnguoi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Clien list.png"))); // NOI18N
        mniLuongnguoi.setText("Lượng Người Học");
        mniLuongnguoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniLuongnguoiActionPerformed(evt);
            }
        });
        mnuThongke.add(mniLuongnguoi);

        mniDiemchuyende.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Bar chart.png"))); // NOI18N
        mniDiemchuyende.setText("Điểm Chuyên Đề");
        mniDiemchuyende.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniDiemchuyendeActionPerformed(evt);
            }
        });
        mnuThongke.add(mniDiemchuyende);

        mniDoanhthu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Dollar.png"))); // NOI18N
        mniDoanhthu.setText("Doanh Thu");
        mniDoanhthu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniDoanhthuActionPerformed(evt);
            }
        });
        mnuThongke.add(mniDoanhthu);

        jMenuBar1.add(mnuThongke);

        mnuTrogiup.setText("Trợ Giúp");

        mniHDSD.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F1, 0));
        mniHDSD.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Globe.png"))); // NOI18N
        mniHDSD.setText("Hướng dẫn sử dụng");
        mnuTrogiup.add(mniHDSD);

        jMenuItem2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Brick house.png"))); // NOI18N
        jMenuItem2.setText("Giới thiệu sản phẩm");
        mnuTrogiup.add(jMenuItem2);

        jMenuBar1.add(mnuTrogiup);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane)
            .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblTime)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jDesktopPane)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(lblTime)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mniDangNhapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniDangNhapActionPerformed
        new Login(this, true).setVisible(true);
        this.loginSuccess();
        this.chucVu();
    }//GEN-LAST:event_mniDangNhapActionPerformed

    private void mniDangxuatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniDangxuatActionPerformed
        Auth.user = null;
        new Login(this, true).setVisible(true);
        this.loginSuccess();
        this.chucVu();
    }//GEN-LAST:event_mniDangxuatActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        this.loginSuccess();
    }//GEN-LAST:event_formWindowOpened

    private void mniDoiMKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniDoiMKActionPerformed
        if (Auth.user == null) {
            JOptionPane.showMessageDialog(this, "Cần đăng nhập");
            return;
        }
        if (doiPass == null || doiPass.isClosed()) {
            doiPass = new DoiMatKhau();
            jDesktopPane.add(doiPass);
            doiPass.setVisible(true);
        } else {
            doiPass.setLocation(this.getWidth() / 2 - doiPass.getWidth() / 2, this.getHeight() / 2 - doiPass.getHeight() / 2
            );
            doiPass.setVisible(true);
        }
    }//GEN-LAST:event_mniDoiMKActionPerformed

    private void mniKetThucActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniKetThucActionPerformed
        if (JOptionPane.showConfirmDialog(this, "Bạn có muốn thoát không?", "Thoát", JOptionPane.YES_NO_OPTION) != JOptionPane.YES_OPTION) {
            return;
        }
        System.exit(0);
    }//GEN-LAST:event_mniKetThucActionPerformed

    private void mniNhanVienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniNhanVienActionPerformed
        if (qlnv == null || qlnv.isClosed()) {
            qlnv = new QuanLyNhanVien();
            jDesktopPane.add(qlnv);
            qlnv.setVisible(true);
        } else {
            qlnv.setLocation(this.getWidth() / 2 - qlnv.getWidth() / 2, this.getHeight() / 2 - qlnv.getHeight() / 2
            );
            qlnv.setVisible(true);
        }
    }//GEN-LAST:event_mniNhanVienActionPerformed

    private void mniChuyendeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniChuyendeActionPerformed
        if (chuyenDe == null || chuyenDe.isClosed()) {
            chuyenDe = new ChuyenDeJInternalFrame();
            jDesktopPane.add(chuyenDe);
            chuyenDe.setVisible(true);
        } else {
            chuyenDe.setLocation(this.getWidth() / 2 - chuyenDe.getWidth() / 2, this.getHeight() / 2 - chuyenDe.getHeight() / 2
            );
            chuyenDe.setVisible(true);
        }
    }//GEN-LAST:event_mniChuyendeActionPerformed

    private void mniKhoaHocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniKhoaHocActionPerformed
        if (khoaHoc == null || khoaHoc.isClosed()) {
            khoaHoc = new KhoaHocJInternalFrame();
            jDesktopPane.add(khoaHoc);
            khoaHoc.setVisible(true);
        } else {
            khoaHoc.setLocation(this.getWidth() / 2 - khoaHoc.getWidth() / 2, this.getHeight() / 2 - khoaHoc.getHeight() / 2
            );
            khoaHoc.setVisible(true);
        }
    }//GEN-LAST:event_mniKhoaHocActionPerformed

    private void mniNguoihocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniNguoihocActionPerformed
        if (nguoiHoc == null || nguoiHoc.isClosed()) {
            nguoiHoc = new NguoiHocJInternalFrame();
            jDesktopPane.add(nguoiHoc);
            nguoiHoc.setVisible(true);
        } else {
            nguoiHoc.setLocation(this.getWidth() / 2 - nguoiHoc.getWidth() / 2, this.getHeight() / 2 - nguoiHoc.getHeight() / 2
            );
            nguoiHoc.setVisible(true);
        }
    }//GEN-LAST:event_mniNguoihocActionPerformed

    private void mniHocvienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniHocvienActionPerformed
        if (hocVien == null || hocVien.isClosed()) {
            hocVien = new HocVienJInternalFrame();
            jDesktopPane.add(hocVien);
            hocVien.setVisible(true);
        } else {
            hocVien.setLocation(this.getWidth() / 2 - hocVien.getWidth() / 2, this.getHeight() / 2 - hocVien.getHeight() / 2
            );
            hocVien.setVisible(true);
        }
    }//GEN-LAST:event_mniHocvienActionPerformed

    private void btnKetthucActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKetthucActionPerformed
        if(MsgBox.confirm(this, "Bạn có muốn thoát không?")){
            System.exit(0);
        }
    }//GEN-LAST:event_btnKetthucActionPerformed

    private void mniBangdiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniBangdiemActionPerformed
        if (thongKe == null || thongKe.isClosed()) {
            thongKe = new ThongKeJInternalFrame(0);
            jDesktopPane.add(thongKe);
            thongKe.setVisible(true);
            
        } else {
            thongKe.setLocation(this.getWidth() / 2 - thongKe.getWidth() / 2, this.getHeight() / 2 - thongKe.getHeight() / 2
            );
            thongKe.setVisible(true);
        }
    }//GEN-LAST:event_mniBangdiemActionPerformed

    private void mniLuongnguoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniLuongnguoiActionPerformed
       if (thongKe == null || thongKe.isClosed()) {
            thongKe = new ThongKeJInternalFrame(1);
            jDesktopPane.add(thongKe);
            thongKe.setVisible(true);
            
        } else {
            thongKe.setLocation(this.getWidth() / 2 - thongKe.getWidth() / 2, this.getHeight() / 2 - thongKe.getHeight() / 2
            );
            thongKe.setVisible(true);
        }
    }//GEN-LAST:event_mniLuongnguoiActionPerformed

    private void mniDiemchuyendeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniDiemchuyendeActionPerformed
        if (thongKe == null || thongKe.isClosed()) {
            thongKe = new ThongKeJInternalFrame(2);
            jDesktopPane.add(thongKe);
            thongKe.setVisible(true);
            
        } else {
            thongKe.setLocation(this.getWidth() / 2 - thongKe.getWidth() / 2, this.getHeight() / 2 - thongKe.getHeight() / 2
            );
            thongKe.setVisible(true);
        }
    }//GEN-LAST:event_mniDiemchuyendeActionPerformed

    private void mniDoanhthuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniDoanhthuActionPerformed
        if (thongKe == null || thongKe.isClosed()) {
            thongKe = new ThongKeJInternalFrame(3);
            jDesktopPane.add(thongKe);
            thongKe.setVisible(true);
            
        } else {
            thongKe.setLocation(this.getWidth() / 2 - thongKe.getWidth() / 2, this.getHeight() / 2 - thongKe.getHeight() / 2
            );
            thongKe.setVisible(true);
        }
    }//GEN-LAST:event_mniDoanhthuActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainMDI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainMDI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainMDI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainMDI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainMDI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnChuyende;
    private javax.swing.JButton btnDangxuat;
    private javax.swing.JButton btnHocvien;
    private javax.swing.JButton btnHuongdan;
    private javax.swing.JButton btnKetthuc;
    private javax.swing.JButton btnKhoahoc;
    private javax.swing.JButton btnNguoihoc;
    private javax.swing.JDesktopPane jDesktopPane;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JToolBar.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator10;
    private javax.swing.JToolBar.Separator jSeparator2;
    private javax.swing.JToolBar.Separator jSeparator3;
    private javax.swing.JToolBar.Separator jSeparator4;
    private javax.swing.JToolBar.Separator jSeparator5;
    private javax.swing.JToolBar.Separator jSeparator6;
    private javax.swing.JToolBar.Separator jSeparator7;
    private javax.swing.JPopupMenu.Separator jSeparator8;
    private javax.swing.JPopupMenu.Separator jSeparator9;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JLabel lblChucVu;
    private javax.swing.JLabel lblHoTen;
    private javax.swing.JLabel lblTime;
    private javax.swing.JMenuItem mniBangdiem;
    private javax.swing.JMenuItem mniChuyende;
    private javax.swing.JMenuItem mniDangNhap;
    private javax.swing.JMenuItem mniDangxuat;
    private javax.swing.JMenuItem mniDiemchuyende;
    private javax.swing.JMenuItem mniDoanhthu;
    private javax.swing.JMenuItem mniDoiMK;
    private javax.swing.JMenuItem mniHDSD;
    private javax.swing.JMenuItem mniHocvien;
    private javax.swing.JMenuItem mniKetThuc;
    private javax.swing.JMenuItem mniKhoaHoc;
    private javax.swing.JMenuItem mniLuongnguoi;
    private javax.swing.JMenuItem mniNguoihoc;
    private javax.swing.JMenuItem mniNhanVien;
    private javax.swing.JMenu mnuHethong;
    private javax.swing.JMenu mnuQuanly;
    private javax.swing.JMenu mnuThongke;
    private javax.swing.JMenu mnuTrogiup;
    // End of variables declaration//GEN-END:variables

    public void time() {
        new Timer(1000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Date date = new Date();
                SimpleDateFormat formater = new SimpleDateFormat("hh:mm:ss aa");
                String time = formater.format(date);
                lblTime.setText(time);
            }
        }).start();
    }

    public void loginSuccess() {
        if (!Auth.isLogin()) {
            this.btnChuyende.setEnabled(false);
            this.btnDangxuat.setEnabled(false);
            this.btnKhoahoc.setEnabled(false);
            this.btnNguoihoc.setEnabled(false);
            this.mnuThongke.setEnabled(false);
            this.mnuQuanly.setEnabled(false);
        } else {
            this.btnChuyende.setEnabled(true);
            this.btnDangxuat.setEnabled(true);
            this.btnKhoahoc.setEnabled(true);
            this.btnNguoihoc.setEnabled(true);
            this.mnuThongke.setEnabled(true);
            this.mnuQuanly.setEnabled(true);
        }

    }

    private void chucVu() {
        if (Auth.user == null) {
            lblChucVu.setText("Chức Vụ");
            lblHoTen.setText("Họ Tên");
        }else{
        String cv = Auth.user.getVaiTro() ? "Trưởng Phòng" : "Nhân Viên";
        String hoTen = Auth.user.getHoTen();
        lblChucVu.setText(cv);
        lblHoTen.setText(hoTen);
        }
    }
}
