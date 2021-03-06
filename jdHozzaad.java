/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loimgui;

import model.Kerdesek;

/**
 *
 * @author Bodnár Tamás <tms.bodnar@gmail.com> | www.kalandlabor.hu
 */
public class jdHozzaad extends javax.swing.JDialog {
    private Kerdesek kerdes;
    private boolean mentes;

    public Kerdesek getKerdes() {
        return kerdes;
    }

    public void setKerdes(Kerdesek kerdes) {
        this.kerdes = kerdes;
    }

    public boolean isMentes() {
        return mentes;
    }

    public void setMentes(boolean mentes) {
        this.mentes = mentes;
    }
    
    /**
     * Creates new form jdHozzaad
     */
    public jdHozzaad(java.awt.Frame parent, boolean modal, Kerdesek kerdes) {
        super(parent, modal);
        initComponents();
        this.kerdes = kerdes;
        this.mentes = mentes;
        setLocationRelativeTo(null);
        if (kerdes == null){
            setTitle("Új kérdés bevitele.");
            }
        setTitle("Kérdés szerkesztése.");
        tfKerdes.setText(kerdes.getKerdes());
        tfValasz0.setText(kerdes.getValasz0());
        tfValasz1.setText(kerdes.getValasz1());
        tfValasz2.setText(kerdes.getValasz2());
        tfValasz3.setText(kerdes.getValasz3());
        int helyes = kerdes.getHelyesvalasz();
        switch (helyes){
            case 0: rbtn0.setSelected(true);break;
            case 1: rbtn1.setSelected(true);break;
            case 2: rbtn2.setSelected(true);break;
            case 3: rbtn3.setSelected(true);break;
        }
        
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        tfKerdes = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        tfValasz0 = new javax.swing.JTextField();
        tfValasz1 = new javax.swing.JTextField();
        tfValasz2 = new javax.swing.JTextField();
        tfValasz3 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        rbtn0 = new javax.swing.JRadioButton();
        rbtn2 = new javax.swing.JRadioButton();
        rbtn1 = new javax.swing.JRadioButton();
        rbtn3 = new javax.swing.JRadioButton();
        btnOK = new javax.swing.JButton();
        btnMegsem = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("A kérdés:");

        jLabel2.setText("1.válasz:");

        jLabel3.setText("2. válasz");

        jLabel4.setText("3. válasz");

        jLabel5.setText("4. válasz");

        jLabel7.setText("Helyes?");

        buttonGroup1.add(rbtn0);

        buttonGroup1.add(rbtn2);

        buttonGroup1.add(rbtn1);

        buttonGroup1.add(rbtn3);

        btnOK.setText("OK");
        btnOK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOKActionPerformed(evt);
            }
        });

        btnMegsem.setText("Mégsem");
        btnMegsem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMegsemActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(18, 18, 18)
                                .addComponent(tfValasz3))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(18, 18, 18)
                                .addComponent(tfValasz2))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addComponent(tfValasz1))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(tfValasz0))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(tfKerdes, javax.swing.GroupLayout.PREFERRED_SIZE, 586, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rbtn2)
                            .addComponent(rbtn3)
                            .addComponent(rbtn1)
                            .addComponent(rbtn0)
                            .addComponent(jLabel7)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnMegsem)
                        .addGap(16, 16, 16)))
                .addContainerGap(17, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnOK)
                .addGap(138, 138, 138))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnMegsem, btnOK});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(tfKerdes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(tfValasz0, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rbtn0))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfValasz1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(rbtn1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfValasz2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(rbtn2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(tfValasz3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(rbtn3)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnOK)
                    .addComponent(btnMegsem))
                .addContainerGap(29, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnOKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOKActionPerformed
        mentes = true;
        if(kerdes == null){
            kerdes = new Kerdesek();
        }
            
            kerdes.setKerdes(tfKerdes.getText());        
            kerdes.setValasz0(tfValasz0.getText());        
            kerdes.setValasz1(tfValasz1.getText());        
            kerdes.setValasz2(tfValasz2.getText());        
            kerdes.setValasz3(tfValasz3.getText());       
                    if(rbtn0.isSelected()){
                        kerdes.setHelyesvalasz(0);
                    }else if(rbtn1.isSelected()){
                        kerdes.setHelyesvalasz(1);
                    }else if(rbtn2.isSelected()){
                        kerdes.setHelyesvalasz(2);
                    }else if(rbtn3.isSelected()){
                        kerdes.setHelyesvalasz(3);
                    }
        
        setVisible(false);
    }//GEN-LAST:event_btnOKActionPerformed

    private void btnMegsemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMegsemActionPerformed
        
        setVisible(false);
    }//GEN-LAST:event_btnMegsemActionPerformed

    /**
     * @param args the command line arguments
     */


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnMegsem;
    private javax.swing.JButton btnOK;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JRadioButton rbtn0;
    private javax.swing.JRadioButton rbtn1;
    private javax.swing.JRadioButton rbtn2;
    private javax.swing.JRadioButton rbtn3;
    private javax.swing.JTextField tfKerdes;
    private javax.swing.JTextField tfValasz0;
    private javax.swing.JTextField tfValasz1;
    private javax.swing.JTextField tfValasz2;
    private javax.swing.JTextField tfValasz3;
    // End of variables declaration//GEN-END:variables
}
