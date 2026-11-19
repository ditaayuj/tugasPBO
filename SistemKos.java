import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class SistemKos implements ActionListener {

    private JFrame frame;

    private JTextField txtNomorKamar;
    private JTextField txtHargaKamar;
    private JTextField txtStatusKamar;
    private JButton btnSimpanKamar;
    private JButton btnResetKamar;
    private JTextArea areaKamar;

    private JTextField txtNamaPenghuni;
    private JTextField txtNoHP;
    private JTextField txtKamarPenghuni;
    private JButton btnSimpanPenghuni;
    private JButton btnResetPenghuni;
    private JTextArea areaPenghuni;

    private JTextField txtNamaPembayar;
    private JTextField txtBulan;
    private JTextField txtJumlahBayar;
    private JButton btnSimpanPembayaran;
    private JButton btnResetPembayaran;
    private JTextArea areaPembayaran;

    public SistemKos() {

        frame = new JFrame("Sistem Informasi Kos");

        JPanel panelUtama = new JPanel();
        panelUtama.setLayout(new BorderLayout(10, 10));

        JLabel judul = new JLabel("SISTEM INFORMASI KOS", SwingConstants.CENTER);

        JTabbedPane menu = new JTabbedPane();

        JPanel panelKamar = buatPanelKamar();
        JPanel panelPenghuni = buatPanelPenghuni();
        JPanel panelPembayaran = buatPanelPembayaran();

        menu.addTab("Data Kamar", panelKamar);
        menu.addTab("Data Penghuni", panelPenghuni);
        menu.addTab("Pembayaran", panelPembayaran);

        panelUtama.add(judul, BorderLayout.NORTH);
        panelUtama.add(menu, BorderLayout.CENTER);

        frame.add(panelUtama);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(700, 500);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    private JPanel buatPanelKamar() {

        JPanel panelKamar = new JPanel();
        panelKamar.setLayout(new BorderLayout(10, 10));

        JPanel formKamar = new JPanel();
        formKamar.setLayout(new GridLayout(3, 2, 10, 10));

        JLabel lblNomorKamar = new JLabel("Nomor Kamar:");
        txtNomorKamar = new JTextField(15);

        JLabel lblHargaKamar = new JLabel("Harga per Bulan:");
        txtHargaKamar = new JTextField(15);

        JLabel lblStatusKamar = new JLabel("Status Kamar:");
        txtStatusKamar = new JTextField(15);

        formKamar.add(lblNomorKamar);
        formKamar.add(txtNomorKamar);
        formKamar.add(lblHargaKamar);
        formKamar.add(txtHargaKamar);
        formKamar.add(lblStatusKamar);
        formKamar.add(txtStatusKamar);

        btnSimpanKamar = new JButton("Simpan");
        btnResetKamar = new JButton("Reset");

        btnSimpanKamar.addActionListener(this);
        btnResetKamar.addActionListener(this);

        JPanel panelTombol = new JPanel();
        panelTombol.setLayout(new FlowLayout());

        panelTombol.add(btnSimpanKamar);
        panelTombol.add(btnResetKamar);

        JPanel bagianAtas = new JPanel();
        bagianAtas.setLayout(new BorderLayout(10, 10));

        bagianAtas.add(formKamar, BorderLayout.CENTER);
        bagianAtas.add(panelTombol, BorderLayout.SOUTH);

        areaKamar = new JTextArea(10, 40);
        areaKamar.setEditable(false);

        JScrollPane scrollKamar = new JScrollPane(areaKamar);

        panelKamar.add(bagianAtas, BorderLayout.NORTH);
        panelKamar.add(scrollKamar, BorderLayout.CENTER);

        return panelKamar;
    }

    private JPanel buatPanelPenghuni() {

        JPanel panelPenghuni = new JPanel();
        panelPenghuni.setLayout(new BorderLayout(10, 10));

        JPanel formPenghuni = new JPanel();
        formPenghuni.setLayout(new GridLayout(3, 2, 10, 10));

        JLabel lblNamaPenghuni = new JLabel("Nama Penghuni:");
        txtNamaPenghuni = new JTextField(15);

        JLabel lblNoHP = new JLabel("Nomor HP:");
        txtNoHP = new JTextField(15);

        JLabel lblKamarPenghuni = new JLabel("Nomor Kamar:");
        txtKamarPenghuni = new JTextField(15);

        formPenghuni.add(lblNamaPenghuni);
        formPenghuni.add(txtNamaPenghuni);
        formPenghuni.add(lblNoHP);
        formPenghuni.add(txtNoHP);
        formPenghuni.add(lblKamarPenghuni);
        formPenghuni.add(txtKamarPenghuni);

        btnSimpanPenghuni = new JButton("Simpan");
        btnResetPenghuni = new JButton("Reset");

        btnSimpanPenghuni.addActionListener(this);
        btnResetPenghuni.addActionListener(this);

        JPanel panelTombol = new JPanel();
        panelTombol.setLayout(new FlowLayout());

        panelTombol.add(btnSimpanPenghuni);
        panelTombol.add(btnResetPenghuni);

        JPanel bagianAtas = new JPanel();
        bagianAtas.setLayout(new BorderLayout(10, 10));

        bagianAtas.add(formPenghuni, BorderLayout.CENTER);
        bagianAtas.add(panelTombol, BorderLayout.SOUTH);

        areaPenghuni = new JTextArea(10, 40);
        areaPenghuni.setEditable(false);

        JScrollPane scrollPenghuni = new JScrollPane(areaPenghuni);

        panelPenghuni.add(bagianAtas, BorderLayout.NORTH);
        panelPenghuni.add(scrollPenghuni, BorderLayout.CENTER);

        return panelPenghuni;
    }

    private JPanel buatPanelPembayaran() {

        JPanel panelPembayaran = new JPanel();
        panelPembayaran.setLayout(new BorderLayout(10, 10));

        JPanel formPembayaran = new JPanel();
        formPembayaran.setLayout(new GridLayout(3, 2, 10, 10));

        JLabel lblNamaPembayar = new JLabel("Nama Penghuni:");
        txtNamaPembayar = new JTextField(15);

        JLabel lblBulan = new JLabel("Bulan Pembayaran:");
        txtBulan = new JTextField(15);

        JLabel lblJumlahBayar = new JLabel("Jumlah Pembayaran:");
        txtJumlahBayar = new JTextField(15);

        formPembayaran.add(lblNamaPembayar);
        formPembayaran.add(txtNamaPembayar);
        formPembayaran.add(lblBulan);
        formPembayaran.add(txtBulan);
        formPembayaran.add(lblJumlahBayar);
        formPembayaran.add(txtJumlahBayar);

        btnSimpanPembayaran = new JButton("Simpan");
        btnResetPembayaran = new JButton("Reset");

        btnSimpanPembayaran.addActionListener(this);
        btnResetPembayaran.addActionListener(this);

        JPanel panelTombol = new JPanel();
        panelTombol.setLayout(new FlowLayout());

        panelTombol.add(btnSimpanPembayaran);
        panelTombol.add(btnResetPembayaran);

        JPanel bagianAtas = new JPanel();
        bagianAtas.setLayout(new BorderLayout(10, 10));

        bagianAtas.add(formPembayaran, BorderLayout.CENTER);
        bagianAtas.add(panelTombol, BorderLayout.SOUTH);

        areaPembayaran = new JTextArea(10, 40);
        areaPembayaran.setEditable(false);

        JScrollPane scrollPembayaran = new JScrollPane(areaPembayaran);

        panelPembayaran.add(bagianAtas, BorderLayout.NORTH);
        panelPembayaran.add(scrollPembayaran, BorderLayout.CENTER);

        return panelPembayaran;
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == btnSimpanKamar) {

            String nomor = txtNomorKamar.getText().trim();
            String harga = txtHargaKamar.getText().trim();
            String status = txtStatusKamar.getText().trim();

            if (nomor.isEmpty() || harga.isEmpty() || status.isEmpty()) {
                JOptionPane.showMessageDialog(frame, "Semua data kamar harus diisi!");
            } else {
                areaKamar.append("Nomor Kamar: " + nomor + " | Harga: " + harga + " | Status: " + status + "\n");

                JOptionPane.showMessageDialog(frame, "Data kamar berhasil disimpan!");
                resetKamar();
            }
        } else if (e.getSource() == btnResetKamar) {
            resetKamar();
        } else if (e.getSource() == btnSimpanPenghuni) {
            String nama = txtNamaPenghuni.getText().trim();
            String noHP = txtNoHP.getText().trim();
            String nomorKamar = txtKamarPenghuni.getText().trim();
            if (nama.isEmpty() || noHP.isEmpty() || nomorKamar.isEmpty()) {
                JOptionPane.showMessageDialog(
                    frame,
                    "Semua data penghuni harus diisi!"
                );
            } else {
                areaPenghuni.append("Nama: " + nama + " | Nomor HP: " + noHP + " | Nomor Kamar: " + nomorKamar + "\n");

                JOptionPane.showMessageDialog(frame, "Data penghuni berhasil disimpan!");
                resetPenghuni();
            }
        } else if (e.getSource() == btnResetPenghuni) {
            resetPenghuni();
        } else if (e.getSource() == btnSimpanPembayaran) {
            String nama = txtNamaPembayar.getText().trim();
            String bulan = txtBulan.getText().trim();
            String jumlah = txtJumlahBayar.getText().trim();

            if (nama.isEmpty() || bulan.isEmpty() || jumlah.isEmpty()) {
                JOptionPane.showMessageDialog(frame, "Semua data pembayaran harus diisi!");
            } else {
                areaPembayaran.append("Nama: " + nama + " | Bulan: " + bulan + " | Jumlah: " + jumlah + "\n");

                JOptionPane.showMessageDialog(frame, "Data pembayaran berhasil disimpan!");
                resetPembayaran();
            }
        } else if (e.getSource() == btnResetPembayaran) {
            resetPembayaran();
        }
    }

    private void resetKamar() {
        txtNomorKamar.setText("");
        txtHargaKamar.setText("");
        txtStatusKamar.setText("");
    }

    private void resetPenghuni() {
        txtNamaPenghuni.setText("");
        txtNoHP.setText("");
        txtKamarPenghuni.setText("");
    }

    private void resetPembayaran() {
        txtNamaPembayar.setText("");
        txtBulan.setText("");
        txtJumlahBayar.setText("");
    }
}
