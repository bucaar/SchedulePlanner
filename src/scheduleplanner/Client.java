/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scheduleplanner;

import javax.swing.JFrame;

/**
 *
 * @author Aaron
 */
public class Client extends javax.swing.JFrame {
 
    /**
     * Creates new form Client
     */
    public Client() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        bAdd = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        tName = new javax.swing.JTextField();
        tMs = new javax.swing.JTextField();
        tMe = new javax.swing.JTextField();
        tTs = new javax.swing.JTextField();
        tTe = new javax.swing.JTextField();
        tWs = new javax.swing.JTextField();
        tWe = new javax.swing.JTextField();
        tRs = new javax.swing.JTextField();
        tRe = new javax.swing.JTextField();
        tFs = new javax.swing.JTextField();
        tFe = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        tS = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        tE = new javax.swing.JTextField();
        bAdd1 = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        tName1 = new javax.swing.JTextField();
        cMon = new javax.swing.JCheckBox();
        cTue = new javax.swing.JCheckBox();
        cWed = new javax.swing.JCheckBox();
        cFri = new javax.swing.JCheckBox();
        cThu = new javax.swing.JCheckBox();
        bOptions = new javax.swing.JButton();
        bDisp = new javax.swing.JButton();
        bHelp = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Schedule Planner");
        setResizable(false);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Add Class"));

        jLabel4.setText("Start:");

        jLabel8.setText("End:");

        bAdd.setText("Add Class");
        bAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bAddActionPerformed(evt);
            }
        });

        jLabel1.setText("Class Name:");

        tMs.setText("0:00");
        tMs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tMsActionPerformed(evt);
            }
        });

        tMe.setText("0:00");
        tMe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tMeActionPerformed(evt);
            }
        });

        tTs.setText("0:00");
        tTs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tTsActionPerformed(evt);
            }
        });

        tTe.setText("0:00");
        tTe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tTeActionPerformed(evt);
            }
        });

        tWs.setText("0:00");
        tWs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tWsActionPerformed(evt);
            }
        });

        tWe.setText("0:00");
        tWe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tWeActionPerformed(evt);
            }
        });

        tRs.setText("0:00");
        tRs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tRsActionPerformed(evt);
            }
        });

        tRe.setText("0:00");
        tRe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tReActionPerformed(evt);
            }
        });

        tFs.setText("0:00");
        tFs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tFsActionPerformed(evt);
            }
        });

        tFe.setText("0:00");
        tFe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tFeActionPerformed(evt);
            }
        });

        jLabel2.setText("Mon");

        jLabel3.setText("Tue");

        jLabel6.setText("Thu");

        jLabel7.setText("Wed");

        jLabel9.setText("Fri");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel8))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tMs, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tMe, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(tTe, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(tWe, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(tRe, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(tFe, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(tTs, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel3))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel7)
                                            .addComponent(tWs, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(tRs, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel6))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel9)
                                            .addComponent(tFs, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tName)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(bAdd))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(tName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(jLabel3)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(tMs, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tTs, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tWs, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tRs, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tFs, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(tMe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tTe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tWe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tRe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tFe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(bAdd))
        );

        jTabbedPane1.addTab("Custom", jPanel1);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Add Class"));

        jLabel11.setText("Start:");

        tS.setText("0:00");
        tS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tSActionPerformed(evt);
            }
        });

        jLabel15.setText("End:");

        tE.setText("0:00");
        tE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tEActionPerformed(evt);
            }
        });

        bAdd1.setText("Add Class");
        bAdd1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bAdd1ActionPerformed(evt);
            }
        });

        jLabel16.setText("Class Name:");

        cMon.setText("Mon");

        cTue.setText("Tue");

        cWed.setText("Wed");
        cWed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cWedActionPerformed(evt);
            }
        });

        cFri.setText("Fri");

        cThu.setText("Thu");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(bAdd1))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel11)
                                    .addComponent(jLabel15))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(tS, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(cMon)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(cTue)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(cWed))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(tE, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(cThu)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(cFri)))
                                .addGap(0, 97, Short.MAX_VALUE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel16)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tName1)))
                        .addContainerGap())))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(tName1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(tS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cMon)
                    .addComponent(cTue)
                    .addComponent(cWed))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15)
                    .addComponent(cThu)
                    .addComponent(cFri))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addComponent(bAdd1))
        );

        jTabbedPane1.addTab("General", jPanel2);

        bOptions.setText("Options");
        bOptions.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bOptionsActionPerformed(evt);
            }
        });

        bDisp.setText("Display Schedules");
        bDisp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bDispActionPerformed(evt);
            }
        });

        bHelp.setText("Help");
        bHelp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bHelpActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTabbedPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(bOptions)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bHelp)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(bDisp)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bDisp)
                    .addComponent(bOptions)
                    .addComponent(bHelp))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void bDispActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bDispActionPerformed
        SchedulePlanner.closeVisulaizers();
        SchedulePlanner.fillEmpties();
        SchedulePlanner.start();
    }//GEN-LAST:event_bDispActionPerformed
    
    
    
    private void bOptionsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bOptionsActionPerformed
        // TODO add your handling code here:
        SchedulePlanner.fillEmpties();
        Editor edit = new Editor();
        edit.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        edit.setSize(550, 300);
        edit.setVisible(true);
    }//GEN-LAST:event_bOptionsActionPerformed

    private void bAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bAddActionPerformed
        // TODO add your handling code here:
        String mss = tMs.getText();
        String mes = tMe.getText();
        String tss = tTs.getText();
        String tes = tTe.getText();
        String wss = tWs.getText();
        String wes = tWe.getText();
        String rss = tRs.getText();
        String res = tRe.getText();
        String fss = tFs.getText();
        String fes = tFe.getText();
        
        if(!mss.contains(":"))mss+=":00";
        if(!mes.contains(":"))mes+=":00";
        if(!tss.contains(":"))tss+=":00";
        if(!tes.contains(":"))tes+=":00";
        if(!wss.contains(":"))wss+=":00";
        if(!wes.contains(":"))wes+=":00";
        if(!rss.contains(":"))rss+=":00";
        if(!res.contains(":"))res+=":00";
        if(!fss.contains(":"))fss+=":00";
        if(!fes.contains(":"))fes+=":00";

        double msd = Double.parseDouble(mss.split(":")[0])+Double.parseDouble(mss.split(":")[1])/60; if(msd < 8 && msd != 0) msd += 12;
        double med = Double.parseDouble(mes.split(":")[0])+Double.parseDouble(mes.split(":")[1])/60; if(med < 8 && med != 0) med += 12;
        double tsd = Double.parseDouble(tss.split(":")[0])+Double.parseDouble(tss.split(":")[1])/60; if(tsd < 8 && tsd != 0) tsd += 12;
        double ted = Double.parseDouble(tes.split(":")[0])+Double.parseDouble(tes.split(":")[1])/60; if(ted < 8 && ted != 0) ted += 12;
        double wsd = Double.parseDouble(wss.split(":")[0])+Double.parseDouble(wss.split(":")[1])/60; if(wsd < 8 && wsd != 0) wsd += 12;
        double wed = Double.parseDouble(wes.split(":")[0])+Double.parseDouble(wes.split(":")[1])/60; if(wed < 8 && wed != 0) wed += 12;
        double rsd = Double.parseDouble(rss.split(":")[0])+Double.parseDouble(rss.split(":")[1])/60; if(rsd < 8 && rsd != 0) rsd += 12;
        double red = Double.parseDouble(res.split(":")[0])+Double.parseDouble(res.split(":")[1])/60; if(red < 8 && red != 0) red += 12;
        double fsd = Double.parseDouble(fss.split(":")[0])+Double.parseDouble(fss.split(":")[1])/60; if(fsd < 8 && fsd != 0) fsd += 12;
        double fed = Double.parseDouble(fes.split(":")[0])+Double.parseDouble(fes.split(":")[1])/60; if(fed < 8 && fed != 0) fed += 12;

        double[] startTimes = new double[]{
            msd, tsd, wsd, rsd, fsd
        };
        double[] endTimes = new double[]{
            med, ted, wed, red, fed
        };

        boolean added = false;
        for(int i=0;i<names.length;i++){
            if(names[i] != null && names[i].equals(tName.getText())){
                SchedulePlanner.addClass(i, tName.getText(), startTimes, endTimes);
                added = true;
                break;
            }
        }
        if(!added){
            for(int i=0;i<names.length;i++){
                if(names[i] == null){
                    names[i] = tName.getText();
                    SchedulePlanner.addClass(i, tName.getText(), startTimes, endTimes);
                    added = true;
                    break;
                }
            }
        }
        if(!added){
            System.out.println("Problem occured.");
        }
    }//GEN-LAST:event_bAddActionPerformed

    private void tMeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tMeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tMeActionPerformed

    private void tReActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tReActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tReActionPerformed

    private void tWeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tWeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tWeActionPerformed

    private void tTeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tTeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tTeActionPerformed

    private void tRsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tRsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tRsActionPerformed

    private void tWsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tWsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tWsActionPerformed

    private void tTsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tTsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tTsActionPerformed

    private void tMsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tMsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tMsActionPerformed

    private void tSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tSActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tSActionPerformed

    private void tEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tEActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tEActionPerformed

    private void bAdd1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bAdd1ActionPerformed
        // TODO add your handling code here:
        String tSs = tS.getText();
        String tSe = tE.getText();
        
        if(!tSs.contains(":"))tSs+=":00";
        if(!tSe.contains(":"))tSe+=":00";
        
        double msd = 0;
        double med = 0;
        double tsd = 0;
        double ted = 0;
        double wsd = 0;
        double wed = 0;
        double rsd = 0;
        double red = 0;
        double fsd = 0;
        double fed = 0;
        
        if(cMon.isSelected()) msd = Double.parseDouble(tSs.split(":")[0])+Double.parseDouble(tSs.split(":")[1])/60; if(msd < 8 && msd != 0) msd += 12;
        if(cMon.isSelected()) med = Double.parseDouble(tSe.split(":")[0])+Double.parseDouble(tSe.split(":")[1])/60; if(med < 8 && med != 0) med += 12;
        if(cTue.isSelected()) tsd = Double.parseDouble(tSs.split(":")[0])+Double.parseDouble(tSs.split(":")[1])/60; if(tsd < 8 && tsd != 0) tsd += 12;
        if(cTue.isSelected()) ted = Double.parseDouble(tSe.split(":")[0])+Double.parseDouble(tSe.split(":")[1])/60; if(ted < 8 && ted != 0) ted += 12;
        if(cWed.isSelected()) wsd = Double.parseDouble(tSs.split(":")[0])+Double.parseDouble(tSs.split(":")[1])/60; if(wsd < 8 && wsd != 0) wsd += 12;
        if(cWed.isSelected()) wed = Double.parseDouble(tSe.split(":")[0])+Double.parseDouble(tSe.split(":")[1])/60; if(wed < 8 && wed != 0) wed += 12;
        if(cThu.isSelected()) rsd = Double.parseDouble(tSs.split(":")[0])+Double.parseDouble(tSs.split(":")[1])/60; if(rsd < 8 && rsd != 0) rsd += 12;
        if(cThu.isSelected()) red = Double.parseDouble(tSe.split(":")[0])+Double.parseDouble(tSe.split(":")[1])/60; if(red < 8 && red != 0) red += 12;
        if(cFri.isSelected()) fsd = Double.parseDouble(tSs.split(":")[0])+Double.parseDouble(tSs.split(":")[1])/60; if(fsd < 8 && fsd != 0) fsd += 12;
        if(cFri.isSelected()) fed = Double.parseDouble(tSe.split(":")[0])+Double.parseDouble(tSe.split(":")[1])/60; if(fed < 8 && fed != 0) fed += 12;

        double[] startTimes = new double[]{
            msd, tsd, wsd, rsd, fsd
        };
        double[] endTimes = new double[]{
            med, ted, wed, red, fed
        };

        boolean added = false;
        for(int i=0;i<names.length;i++){
            if(names[i] != null && names[i].equals(tName1.getText())){
                SchedulePlanner.addClass(i, tName1.getText(), startTimes, endTimes);
                added = true;
                break;
            }
        }
        if(!added){
            for(int i=0;i<names.length;i++){
                if(names[i] == null){
                    names[i] = tName1.getText();
                    SchedulePlanner.addClass(i, tName1.getText(), startTimes, endTimes);
                    added = true;
                    break;
                }
            }
        }
        if(!added){
            System.out.println("Problem occured.");
        }
    }//GEN-LAST:event_bAdd1ActionPerformed

    private void cWedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cWedActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cWedActionPerformed

    private void tFsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tFsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tFsActionPerformed

    private void tFeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tFeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tFeActionPerformed

    private void bHelpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bHelpActionPerformed
        // TODO add your handling code here:
        HelpDialog help = new HelpDialog();
        help.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        help.setSize(550, 300);
        help.setVisible(true);
    }//GEN-LAST:event_bHelpActionPerformed

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
            java.util.logging.Logger.getLogger(Client.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Client.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Client.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Client.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Client().setVisible(true);
            }
        });
    }

    public static String[] names = new String[10];
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bAdd;
    private javax.swing.JButton bAdd1;
    private javax.swing.JButton bDisp;
    private javax.swing.JButton bHelp;
    private javax.swing.JButton bOptions;
    private javax.swing.JCheckBox cFri;
    private javax.swing.JCheckBox cMon;
    private javax.swing.JCheckBox cThu;
    private javax.swing.JCheckBox cTue;
    private javax.swing.JCheckBox cWed;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField tE;
    private javax.swing.JTextField tFe;
    private javax.swing.JTextField tFs;
    private javax.swing.JTextField tMe;
    private javax.swing.JTextField tMs;
    private javax.swing.JTextField tName;
    private javax.swing.JTextField tName1;
    private javax.swing.JTextField tRe;
    private javax.swing.JTextField tRs;
    private javax.swing.JTextField tS;
    private javax.swing.JTextField tTe;
    private javax.swing.JTextField tTs;
    private javax.swing.JTextField tWe;
    private javax.swing.JTextField tWs;
    // End of variables declaration//GEN-END:variables
}
