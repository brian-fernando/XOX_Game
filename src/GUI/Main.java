/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JOptionPane;

/**
 *
 * @author kavin
 */
public class Main extends javax.swing.JFrame {

    /**
     * Creates new form Main
     */
    int turn = 2;

    int usedBtn[] = {0, 0, 0, 0, 0, 0, 0, 0, 0};

    int player1[] = {0, 0, 0, 0, 0, 0, 0, 0, 0};
    int player2[] = {0, 0, 0, 0, 0, 0, 0, 0, 0};

    int player1won() {

        if (player1[0] == 1 && player1[1] == 1 && player1[2] == 1) {
            return 1;
        }
        if (player1[3] == 1 && player1[4] == 1 && player1[5] == 1) {
            return 1;
        }
        if (player1[6] == 1 && player1[7] == 1 && player1[8] == 1) {
            return 1;
        }
        if (player1[0] == 1 && player1[3] == 1 && player1[6] == 1) {
            return 1;
        }
        if (player1[1] == 1 && player1[4] == 1 && player1[7] == 1) {
            return 1;
        }
        if (player1[2] == 1 && player1[5] == 1 && player1[8] == 1) {
            return 1;
        }
        if (player1[2] == 1 && player1[4] == 1 && player1[6] == 1) {
            return 1;
        }
        if (player1[0] == 1 && player1[4] == 1 && player1[8] == 1) {
            return 1;
        }

        return 0;
    }

    int player2won() {

        if (player2[0] == 1 && player2[1] == 1 && player2[2] == 1) {
            return 1;
        }
        if (player2[3] == 1 && player2[4] == 1 && player2[5] == 1) {
            return 1;
        }
        if (player2[6] == 1 && player2[7] == 1 && player2[8] == 1) {
            return 1;
        }
        if (player2[0] == 1 && player2[3] == 1 && player2[6] == 1) {
            return 1;
        }
        if (player2[1] == 1 && player2[4] == 1 && player2[7] == 1) {
            return 1;
        }
        if (player2[2] == 1 && player2[5] == 1 && player2[8] == 1) {
            return 1;
        }
        if (player2[2] == 1 && player2[4] == 1 && player2[6] == 1) {
            return 1;
        }
        if (player2[0] == 1 && player2[4] == 1 && player2[8] == 1) {
            return 1;
        }

        return 0;
    }

    int BtnUse() {

        int count1 = 0;
        int count0 = 0;
        for (int i = 0; i < 9; i++) {
            if (usedBtn[i] == 1) {
                count1++;
            } else {
                count0++;
            }
        }
        //System.out.println("1s" + count1);
        //System.out.println("0s" + count0);

        return count1;
    }

    void stat() {

        int result1 = player1won();
        int result2 = player2won();
        int result3 = BtnUse();

        BtnUse();

        if (result1 == 1) {
            lblHWP.setText("##** Player 1 is Winner! **##");
            JOptionPane.showMessageDialog(this, "** Player 1 is Winner! **");
            btn1.setText("");
            btn2.setText("");
            btn3.setText("");
            btn4.setText("");
            btn5.setText("");
            btn6.setText("");
            btn7.setText("");
            btn8.setText("");
            btn9.setText("");
            
            lblHWP.setText("");

            turn = 2;

            for (int i = 0; i < 9; i++) {
                usedBtn[i] = 0;
            }
            for (int i = 0; i < 9; i++) {
                player1[i] = 0;
            }
            for (int i = 0; i < 9; i++) {
                player2[i] = 0;
            }
        } else if (result2 == 1) {
            lblHWP.setText("##** Player 2 is Winner! **##");
            JOptionPane.showMessageDialog(this, "** Player 2 is Winner! **");
            btn1.setText("");
            btn2.setText("");
            btn3.setText("");
            btn4.setText("");
            btn5.setText("");
            btn6.setText("");
            btn7.setText("");
            btn8.setText("");
            btn9.setText("");
            
            lblHWP.setText("");

            turn = 2;

            for (int i = 0; i < 9; i++) {
                usedBtn[i] = 0;
            }
            for (int i = 0; i < 9; i++) {
                player1[i] = 0;
            }
            for (int i = 0; i < 9; i++) {
                player2[i] = 0;
            }
        } else if (result3 == 9) {
            lblHWP.setText("##** Game Over!! **##\n##** Game is on Tie **##");
            JOptionPane.showMessageDialog(this, "** Game Over!! **");
            btn1.setText("");
            btn2.setText("");
            btn3.setText("");
            btn4.setText("");
            btn5.setText("");
            btn6.setText("");
            btn7.setText("");
            btn8.setText("");
            btn9.setText("");
            
            lblHWP.setText("");

            turn = 2;

            for (int i = 0; i < 9; i++) {
                usedBtn[i] = 0;
            }
            for (int i = 0; i < 9; i++) {
                player1[i] = 0;
            }
            for (int i = 0; i < 9; i++) {
                player2[i] = 0;
            }
        }

    }

    public Main() {
        initComponents();

        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(dim.width / 2 - this.getSize().width / 2, dim.height / 2 - this.getSize().height / 2);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        btn1 = new javax.swing.JButton();
        btn4 = new javax.swing.JButton();
        btn2 = new javax.swing.JButton();
        btn3 = new javax.swing.JButton();
        btn5 = new javax.swing.JButton();
        btn6 = new javax.swing.JButton();
        btn9 = new javax.swing.JButton();
        btn8 = new javax.swing.JButton();
        btn7 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        lblHWP = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("XOX_GAME-by-lk_BaKy");

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        btn1.setBackground(new java.awt.Color(173, 206, 236));
        btn1.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1ActionPerformed(evt);
            }
        });

        btn4.setBackground(new java.awt.Color(255, 255, 255));
        btn4.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        btn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn4ActionPerformed(evt);
            }
        });

        btn2.setBackground(new java.awt.Color(255, 255, 255));
        btn2.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn2ActionPerformed(evt);
            }
        });

        btn3.setBackground(new java.awt.Color(173, 206, 236));
        btn3.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        btn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn3ActionPerformed(evt);
            }
        });

        btn5.setBackground(new java.awt.Color(173, 206, 236));
        btn5.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        btn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn5ActionPerformed(evt);
            }
        });

        btn6.setBackground(new java.awt.Color(255, 255, 255));
        btn6.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        btn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn6ActionPerformed(evt);
            }
        });

        btn9.setBackground(new java.awt.Color(173, 206, 236));
        btn9.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        btn9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn9ActionPerformed(evt);
            }
        });

        btn8.setBackground(new java.awt.Color(255, 255, 255));
        btn8.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        btn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn8ActionPerformed(evt);
            }
        });

        btn7.setBackground(new java.awt.Color(173, 206, 236));
        btn7.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        btn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn7ActionPerformed(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(0, 0, 0));

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/refresh.png"))); // NOI18N
        jButton1.setText("Play Again");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(255, 255, 255));
        jButton2.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/Help.png"))); // NOI18N
        jButton2.setText("How to Play?");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        lblHWP.setBackground(new java.awt.Color(0, 0, 0));
        lblHWP.setColumns(20);
        lblHWP.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        lblHWP.setForeground(new java.awt.Color(255, 255, 255));
        lblHWP.setRows(5);
        lblHWP.setBorder(null);
        lblHWP.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        lblHWP.setSelectedTextColor(new java.awt.Color(0, 0, 0));
        lblHWP.setSelectionColor(new java.awt.Color(0, 0, 0));
        jScrollPane1.setViewportView(lblHWP);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/XObg2.jpg"))); // NOI18N
        jLabel1.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 414, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton2))))
            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 438, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btn7, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn8, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn9, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(btn2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(btn3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(btn4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(btn5, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(btn6, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn5, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn6, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn9, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn8, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn7, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 6, Short.MAX_VALUE)))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn2ActionPerformed
        // TODO add your handling code here:

        if (usedBtn[1] == 0) {
            if (turn % 2 == 0) {
                turn++;
                btn2.setText("X");
                usedBtn[1] = 1;
                player1[1] = 1;

                stat();

            } else {
                turn++;
                btn2.setText("O");
                usedBtn[1] = 1;
                player2[1] = 1;

                stat();

            }
        } else {
            JOptionPane.showMessageDialog(this, "Button is Already Clicked !!");
        }

    }//GEN-LAST:event_btn2ActionPerformed

    private void btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1ActionPerformed
        // TODO add your handling code here:

        if (usedBtn[0] == 0) {
            if (turn % 2 == 0) {
                turn++;
                btn1.setText("X");
                usedBtn[0] = 1;
                player1[0] = 1;

                stat();

            } else {
                turn++;
                btn1.setText("O");
                usedBtn[0] = 1;
                player2[0] = 1;

                stat();

            }
        } else {
            JOptionPane.showMessageDialog(this, "Button is Already Clicked !!");
        }

    }//GEN-LAST:event_btn1ActionPerformed

    private void btn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn3ActionPerformed
        // TODO add your handling code here:

        if (usedBtn[2] == 0) {
            if (turn % 2 == 0) {
                turn++;
                btn3.setText("X");
                usedBtn[2] = 1;
                player1[2] = 1;

                stat();

            } else {
                turn++;
                btn3.setText("O");
                usedBtn[2] = 1;
                player2[2] = 1;

                stat();

            }
        } else {
            JOptionPane.showMessageDialog(this, "Button is Already Clicked !!");
        }

    }//GEN-LAST:event_btn3ActionPerformed

    private void btn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn4ActionPerformed
        // TODO add your handling code here:

        if (usedBtn[3] == 0) {
            if (turn % 2 == 0) {
                turn++;
                btn4.setText("X");
                usedBtn[3] = 1;
                player1[3] = 1;

                stat();

            } else {
                turn++;
                btn4.setText("O");
                usedBtn[3] = 1;
                player2[3] = 1;

                stat();

            }
        } else {
            JOptionPane.showMessageDialog(this, "Button is Already Clicked !!");
        }

    }//GEN-LAST:event_btn4ActionPerformed

    private void btn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn5ActionPerformed
        // TODO add your handling code here:

        if (usedBtn[4] == 0) {
            if (turn % 2 == 0) {
                turn++;
                btn5.setText("X");
                usedBtn[4] = 1;
                player1[4] = 1;

                stat();

            } else {
                turn++;
                btn5.setText("O");
                usedBtn[4] = 1;
                player2[4] = 1;

                stat();

            }
        } else {
            JOptionPane.showMessageDialog(this, "Button is Already Clicked !!");
        }

    }//GEN-LAST:event_btn5ActionPerformed

    private void btn6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn6ActionPerformed
        // TODO add your handling code here:

        if (usedBtn[5] == 0) {
            if (turn % 2 == 0) {
                turn++;
                btn6.setText("X");
                usedBtn[5] = 1;
                player1[5] = 1;

                stat();

            } else {
                turn++;
                btn6.setText("O");
                usedBtn[5] = 1;
                player2[5] = 1;

                stat();

            }
        } else {
            JOptionPane.showMessageDialog(this, "Button is Already Clicked !!");
        }

    }//GEN-LAST:event_btn6ActionPerformed

    private void btn7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn7ActionPerformed
        // TODO add your handling code here:

        if (usedBtn[6] == 0) {
            if (turn % 2 == 0) {
                turn++;
                btn7.setText("X");
                usedBtn[6] = 1;
                player1[6] = 1;

                stat();

            } else {
                turn++;
                btn7.setText("O");
                usedBtn[6] = 1;
                player2[6] = 1;

                stat();

            }
        } else {
            JOptionPane.showMessageDialog(this, "Button is Already Clicked !!");
        }

    }//GEN-LAST:event_btn7ActionPerformed

    private void btn8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn8ActionPerformed
        // TODO add your handling code here:

        if (usedBtn[7] == 0) {
            if (turn % 2 == 0) {
                turn++;
                btn8.setText("X");
                usedBtn[7] = 1;
                player1[7] = 1;

                stat();

            } else {
                turn++;
                btn8.setText("O");
                usedBtn[7] = 1;
                player2[7] = 1;

                stat();

            }
        } else {
            JOptionPane.showMessageDialog(this, "Button is Already Clicked !!");
        }

    }//GEN-LAST:event_btn8ActionPerformed

    private void btn9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn9ActionPerformed
        // TODO add your handling code here:

        if (usedBtn[8] == 0) {
            if (turn % 2 == 0) {
                turn++;
                btn9.setText("X");
                usedBtn[8] = 1;
                player1[8] = 1;

                stat();

            } else {
                turn++;
                btn9.setText("O");
                usedBtn[8] = 1;
                player2[8] = 1;

                stat();

            }
        } else {
            JOptionPane.showMessageDialog(this, "Button is Already Clicked !!");
        }

    }//GEN-LAST:event_btn9ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        btn1.setText("");
        btn2.setText("");
        btn3.setText("");
        btn4.setText("");
        btn5.setText("");
        btn6.setText("");
        btn7.setText("");
        btn8.setText("");
        btn9.setText("");
        
        lblHWP.setText("");

        turn = 2;

        for (int i = 0; i < 9; i++) {
            usedBtn[i] = 0;
        }
        for (int i = 0; i < 9; i++) {
            player1[i] = 0;
        }
        for (int i = 0; i < 9; i++) {
            player2[i] = 0;
        }

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        lblHWP.setText("1. The game is played on a grid that's 3 squares by 3 squares. \n2. Player 1 is X, Player 2 is O. Players take turns putting their\n   marks in empty squares. \n3. The first player to get 3 of her marks in a row\n   (up, down, across, or diagonally) is the winner. \n4. When all 9 squares are full, the game is over.\n   If no player has 3 marks in a row, the game ends in a tie.");
        //lblHWP.setText("\"\"");
        
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn1;
    private javax.swing.JButton btn2;
    private javax.swing.JButton btn3;
    private javax.swing.JButton btn4;
    private javax.swing.JButton btn5;
    private javax.swing.JButton btn6;
    private javax.swing.JButton btn7;
    private javax.swing.JButton btn8;
    private javax.swing.JButton btn9;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea lblHWP;
    // End of variables declaration//GEN-END:variables
}
