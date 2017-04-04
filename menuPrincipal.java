package ip;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.lang.Math;
import javax.swing.JOptionPane;

/**
 *
 * @author Adrian Bustamante Zarate
 */
public class menuPrincipal extends javax.swing.JFrame {

    public menuPrincipal() {
        initComponents();
        txtIP1ro.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent e) {
                char caracter = e.getKeyChar();
                if (((caracter < '0')
                        || (caracter > '9'))
                        && (caracter != '\b' /*corresponde a BACK_SPACE*/)) {
                    e.consume();  // ignorar el evento de teclado
                }
            }
        });
        txtIP2do.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent e) {
                char caracter = e.getKeyChar();

                // Verificar si la tecla pulsada no es un digito
                if (((caracter < '0')
                        || (caracter > '9'))
                        && (caracter != '\b' /*corresponde a BACK_SPACE*/)) {
                    e.consume();  // ignorar el evento de teclado
                }
            }
        });
        txtIP3ro.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent e) {
                char caracter = e.getKeyChar();

                // Verificar si la tecla pulsada no es un digito
                if (((caracter < '0')
                        || (caracter > '9'))
                        && (caracter != '\b' /*corresponde a BACK_SPACE*/)) {
                    e.consume();  // ignorar el evento de teclado
                }
            }
        });
        txtIP4to.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent e) {
                char caracter = e.getKeyChar();

                // Verificar si la tecla pulsada no es un digito
                if (((caracter < '0')
                        || (caracter > '9'))
                        && (caracter != '\b' /*corresponde a BACK_SPACE*/)) {
                    e.consume();  // ignorar el evento de teclado
                }
            }
        });
    }

    public void cargarPrefijo() {
        int prefijo = 8 + comboMascara2do.getSelectedIndex()
                + comboMascara3ro.getSelectedIndex()
                + comboMascaar4to.getSelectedIndex();
        labelPrefijo.setText(String.valueOf(prefijo));
    }

    public int[] rellenarArreglo() {
        int a[] = new int[8];
        for (int i = 0; i < 8; i++) {
            a[i] = 0;
        }

        return a;
    }

    public int[] rellenarArregloBinario(int n) {
        int a[] = rellenarArreglo();
        int resultados[] = new int[8];
        int resultado = 0, c = 0, c2;

        for (int i = 0; i < 8; i++) {
            resultado = resultado + (int) Math.pow(2, i);
            c++;
            if (resultado >= n) {
                resultados[i] = (int) Math.pow(2, i);
                break;
            } else {
                resultados[i] = (int) Math.pow(2, i);
            }
        }
        if (resultado == n) {
            for (int i = 7; i > 7 - c; i--) {
                a[i] = 1;
            }
        } else {
            c2 = c - 1;
            for (int i = 0; i < c; i++) {
                if (n >= resultados[c2]) {
                    n = n - resultados[c2];
                    c2--;
                    a[8 - c + i] = 1;
                } else {
                    c2--;
                }
            }
        }
        return a;
    }

    public int[] revertirArreglo(int a[]) {
        int b[] = new int[8];
        for (int i = 0; i < 8; i++) {
            if (a[i] == 1) {
                b[i] = 0;
            } else {
                b[i] = 1;
            }
        }
        return b;
    }

    public int[] calcularRed(int ip[], int mascara[]) {
        int c[] = new int[8];
        for (int i = 0; i < 8; i++) {
            if (ip[i] == mascara[i] && ip[i] == 1) {
                c[i] = 1;
            }
        }
        return c;
    }

    public int[] calcularBroadCast(int ip[], int mascara[]) {
        mascara = revertirArreglo(mascara);
        int c[] = new int[8];
        for (int i = 0; i < 8; i++) {
            if (ip[i] == 1 || mascara[i] == 1) {
                c[i] = 1;
            }
        }
        return c;
    }

    public int calcularBinADecimal(int a[]) {
        int result = 0;
        for (int i = 0; i < 8; i++) {
            if (a[7 - i] == 1) {
                result = result + (int) Math.pow(2, i);
            }
        }

        return result;
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        txtIP1ro = new javax.swing.JTextField();
        txtIP2do = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtIP3ro = new javax.swing.JTextField();
        txtIP4to = new javax.swing.JTextField();
        btnIP4to = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        labelRed = new javax.swing.JLabel();
        labelBroadcast = new javax.swing.JLabel();
        labelRangoHost = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        comboMascara2do = new javax.swing.JComboBox<>();
        comboMascara3ro = new javax.swing.JComboBox<>();
        comboMascaar4to = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        labelPrefijo = new javax.swing.JLabel();

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Caculadora IP");
        setResizable(false);

        txtIP1ro.setText("0");

        txtIP2do.setText("0");

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 20)); // NOI18N
        jLabel2.setText(".");

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 20)); // NOI18N
        jLabel3.setText(".");

        txtIP3ro.setText("0");

        txtIP4to.setText("0");

        btnIP4to.setText("Calcular");
        btnIP4to.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIP4toActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 20)); // NOI18N
        jLabel4.setText(".");

        jLabel5.setText("255");

        jLabel6.setText("Broadcast");

        jLabel7.setText("Rango de host");

        labelRed.setText("//");

        labelBroadcast.setText("//");

        labelRangoHost.setText("//");

        jLabel11.setText("IP");

        jLabel13.setFont(new java.awt.Font("Dialog", 1, 20)); // NOI18N
        jLabel13.setText(".");

        jLabel14.setFont(new java.awt.Font("Dialog", 1, 20)); // NOI18N
        jLabel14.setText(".");

        jLabel15.setFont(new java.awt.Font("Dialog", 1, 20)); // NOI18N
        jLabel15.setText(".");

        jLabel16.setText("Mascara de red");

        jLabel17.setText("Red");

        jButton2.setText("Cerrar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        comboMascara2do.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "128", "192", "224", "240", "248", "252", "254", "255" }));
        comboMascara2do.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboMascara2doActionPerformed(evt);
            }
        });

        comboMascara3ro.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "128", "192", "224", "240", "248", "252", "254", "255" }));
        comboMascara3ro.setEnabled(false);
        comboMascara3ro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboMascara3roActionPerformed(evt);
            }
        });

        comboMascaar4to.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "128", "192", "224", "240", "248", "252" }));
        comboMascaar4to.setEnabled(false);

        jLabel1.setText("/");

        labelPrefijo.setText("?");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(200, 200, 200)
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(txtIP1ro, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(7, 7, 7)
                        .addComponent(jLabel2)
                        .addGap(4, 4, 4)
                        .addComponent(txtIP2do, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(jLabel3)
                        .addGap(4, 4, 4)
                        .addComponent(txtIP3ro, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(jLabel4)
                        .addGap(4, 4, 4)
                        .addComponent(txtIP4to, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addComponent(jLabel17)
                        .addGap(168, 168, 168)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(70, 70, 70)
                                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(0, 0, 0)
                                            .addComponent(jLabel13)
                                            .addGap(4, 4, 4)
                                            .addComponent(comboMascara2do, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(10, 10, 10)
                                            .addComponent(jLabel14)
                                            .addGap(4, 4, 4)
                                            .addComponent(comboMascara3ro, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(10, 10, 10)
                                            .addComponent(jLabel15))
                                        .addComponent(labelRed)))
                                .addGap(4, 4, 4)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(labelBroadcast)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(comboMascaar4to, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(labelPrefijo)))))))
                .addContainerGap(88, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(btnIP4to)
                .addGap(37, 37, 37)
                .addComponent(labelRangoHost, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addGap(34, 34, 34))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLabel11)
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtIP1ro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtIP2do, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtIP3ro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtIP4to, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addComponent(jLabel16)
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboMascara2do, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboMascara3ro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(comboMascaar4to, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel1)
                        .addComponent(labelPrefijo)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel17)
                    .addComponent(jLabel6))
                .addGap(4, 4, 4)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelRed)
                    .addComponent(labelBroadcast))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnIP4to)
                    .addComponent(labelRangoHost, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2))
                .addContainerGap(32, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnIP4toActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIP4toActionPerformed
        cargarPrefijo();
        int ip[], mascara[];
        String ipcaden, mask;

        if ("0".equals(txtIP1ro.getText())) {
            JOptionPane.showMessageDialog(this, "IP no valida, intente con otra");
        } else if(Integer.parseInt(txtIP1ro.getText())>255||Integer.parseInt(txtIP2do.getText())>255||Integer.parseInt(txtIP3ro.getText())>255||Integer.parseInt(txtIP4to.getText())>255){
            JOptionPane.showMessageDialog(this, "IP no valida, intente con otra");
        }
        else{
            if (comboMascara2do.getSelectedIndex() == 0) {
                mascara = rellenarArregloBinario(255);
                ip = rellenarArregloBinario(Integer.parseInt(txtIP1ro.getText()));
                ipcaden = String.valueOf(calcularBinADecimal(calcularRed(ip, mascara)));
                labelRed.setText(ipcaden + "." + "0" + "." + "0" + "." + "0");
                mask = String.valueOf(calcularBinADecimal(calcularBroadCast(ip, mascara)));
                labelBroadcast.setText(mask + "." + "255" + "." + "255" + "." + "255");
                labelRangoHost.setText(ipcaden + "." + "0" + "." + "0" + "." + "1" + " - " + mask + "." + "255" + "." + "255" + "." + "254");
            }
            if (comboMascara2do.getSelectedIndex() != 0 && comboMascara3ro.getSelectedIndex() == 0) {
                mascara = rellenarArregloBinario(Integer.parseInt(comboMascara2do.getItemAt(comboMascara2do.getSelectedIndex())));
                ip = rellenarArregloBinario(Integer.parseInt(txtIP2do.getText()));
                ipcaden = txtIP1ro.getText() + "." + String.valueOf(calcularBinADecimal(calcularRed(ip, mascara)));
                labelRed.setText(ipcaden + "." + "0" + "." + "0");
                mask = txtIP1ro.getText() + "." + String.valueOf(calcularBinADecimal(calcularBroadCast(ip, mascara)));
                labelBroadcast.setText(mask + "." + "255" + "." + "255");
                labelRangoHost.setText(ipcaden + "." + "0" + "." + "1" + " - " + mask + "." + "255" + "." + "254");
            } else if (comboMascara3ro.getSelectedIndex() != 0 && comboMascaar4to.getSelectedIndex() == 0) {
                mascara = rellenarArregloBinario(Integer.parseInt(comboMascara3ro.getItemAt(comboMascara3ro.getSelectedIndex())));
                ip = rellenarArregloBinario(Integer.parseInt(txtIP3ro.getText()));
                ipcaden = txtIP1ro.getText() + "." + txtIP2do.getText() + "." + String.valueOf(calcularBinADecimal(calcularRed(ip, mascara)));
                labelRed.setText(ipcaden + "." + "0");
                mask = txtIP1ro.getText() + "." + txtIP2do.getText() + "." + String.valueOf(calcularBinADecimal(calcularBroadCast(ip, mascara)));
                labelBroadcast.setText(mask + "." + "255");
                labelRangoHost.setText(ipcaden + "." + "1" + " - " + mask + "." + "254");
            } else if (comboMascaar4to.getSelectedIndex() != 0) {
                mascara = rellenarArregloBinario(Integer.parseInt(comboMascaar4to.getItemAt(comboMascaar4to.getSelectedIndex())));
                ip = rellenarArregloBinario(Integer.parseInt(txtIP4to.getText()));
                ipcaden = txtIP1ro.getText() + "." + txtIP2do.getText() + "." + txtIP3ro.getText() + "." + String.valueOf(calcularBinADecimal(calcularRed(ip, mascara)));
                labelRed.setText(ipcaden);
                mask = txtIP1ro.getText() + "." + txtIP2do.getText() + "." + txtIP3ro.getText() + "." + String.valueOf(calcularBinADecimal(calcularBroadCast(ip, mascara)));
                labelBroadcast.setText(mask);
                ipcaden = txtIP1ro.getText() + "." + txtIP2do.getText() + "." + txtIP3ro.getText() + "." + String.valueOf(calcularBinADecimal(calcularRed(ip, mascara)) + 1);
                mask = txtIP1ro.getText() + "." + txtIP2do.getText() + "." + txtIP3ro.getText() + "." + String.valueOf(calcularBinADecimal(calcularBroadCast(ip, mascara)) - 1);
                labelRangoHost.setText(ipcaden + " - " + mask);
            }
        }
    }//GEN-LAST:event_btnIP4toActionPerformed

    private void comboMascara2doActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboMascara2doActionPerformed
        if (comboMascara2do.getSelectedIndex() == 8) {
            comboMascara3ro.setEnabled(true);
        } else {
            comboMascaar4to.setEnabled(false);
            comboMascara3ro.setEnabled(false);
            comboMascaar4to.setSelectedIndex(0);
            comboMascara3ro.setSelectedIndex(0);
        }

    }//GEN-LAST:event_comboMascara2doActionPerformed

    private void comboMascara3roActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboMascara3roActionPerformed
        if (comboMascara3ro.getSelectedIndex() == 8) {
            comboMascaar4to.setEnabled(true);
        } else {
            comboMascaar4to.setEnabled(false);
            comboMascaar4to.setSelectedIndex(0);
        }
    }//GEN-LAST:event_comboMascara3roActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    public static void main(String args[]) {
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
            java.util.logging.Logger.getLogger(menuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(menuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(menuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(menuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new menuPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnIP4to;
    private javax.swing.JComboBox<String> comboMascaar4to;
    private javax.swing.JComboBox<String> comboMascara2do;
    private javax.swing.JComboBox<String> comboMascara3ro;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JLabel labelBroadcast;
    private javax.swing.JLabel labelPrefijo;
    private javax.swing.JLabel labelRangoHost;
    private javax.swing.JLabel labelRed;
    private javax.swing.JTextField txtIP1ro;
    private javax.swing.JTextField txtIP2do;
    private javax.swing.JTextField txtIP3ro;
    private javax.swing.JTextField txtIP4to;
    // End of variables declaration//GEN-END:variables
}
