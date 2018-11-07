package Shapev2;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import TurtleGraphics.*;
import BreezySwing.*;

import java.awt.Color;
import javax.swing.JOptionPane;
public class eee extends javax.swing.JPanel {
StandardPen p;
AbstractShape s;
    
    public eee() {
        initComponents();
        SketchPadWindow w= new SketchPadWindow(400,400);
        w.setLocation(50, 275);
        p=new StandardPen(w);
        s=new Circ(0,0,0);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btncirc = new javax.swing.JButton();
        btnw = new javax.swing.JButton();
        btnrect = new javax.swing.JButton();
        btntri = new javax.swing.JButton();
        txtslct = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtData = new javax.swing.JTextArea();
        lbldata = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        btnmove = new javax.swing.JButton();
        btnre = new javax.swing.JButton();
        btnquit = new javax.swing.JButton();

        btncirc.setText("Circle");
        btncirc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncircActionPerformed(evt);
            }
        });

        btnw.setText("Wheel");
        btnw.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnwActionPerformed(evt);
            }
        });

        btnrect.setText("Rectangle");
        btnrect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnrectActionPerformed(evt);
            }
        });

        btntri.setText("Triangle");
        btntri.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btntriActionPerformed(evt);
            }
        });

        txtslct.setText("Select a shape:");

        txtData.setColumns(20);
        txtData.setRows(5);
        jScrollPane1.setViewportView(txtData);

        lbldata.setText("Shape Data");

        jLabel1.setText("Options");

        btnmove.setText("Move");
        btnmove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmoveActionPerformed(evt);
            }
        });

        btnre.setText("Resize");
        btnre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnreActionPerformed(evt);
            }
        });

        btnquit.setText("Quit");
        btnquit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnquitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtslct, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btncirc)
                        .addGap(18, 18, 18)
                        .addComponent(btnw)
                        .addGap(18, 18, 18)
                        .addComponent(btnrect)
                        .addGap(18, 18, 18)
                        .addComponent(btntri)))
                .addContainerGap(58, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnmove)
                    .addComponent(btnre)
                    .addComponent(btnquit))
                .addGap(63, 63, 63)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lbldata, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(txtslct, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btncirc)
                    .addComponent(btnw)
                    .addComponent(btnrect)
                    .addComponent(btntri))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbldata, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnmove)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnre)
                        .addGap(18, 18, 18)
                        .addComponent(btnquit))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents
private void erase(){
    p.setColor(Color.white);
    s.draw(p);
    p.setColor(Color.blue);
    
}
    private void btncircActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncircActionPerformed
      erase();
      s=new Circ(0,0,50);
      s.draw(p);
      txtData.setText(s.toString());
    }//GEN-LAST:event_btncircActionPerformed

    private void btnwActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnwActionPerformed
       erase();
       s=new Rect(0,0,50,50);
       s.draw(p);
       p.setColor(Color.blue);
    }//GEN-LAST:event_btnwActionPerformed

    private void btnrectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnrectActionPerformed
         erase();
       s=new Wheel(0,0,50,3);
       s.draw(p);
       p.setColor(Color.blue);
    }//GEN-LAST:event_btnrectActionPerformed

    private void btntriActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btntriActionPerformed
        erase();
       s=new Rect(0,0,50,50);
       s.draw(p);
       p.setColor(Color.blue);
    }//GEN-LAST:event_btntriActionPerformed

    private void btnmoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmoveActionPerformed
       double x= Double.parseDouble(JOptionPane.showInputDialog(this, "Enter new x ","0"));
         double y= Double.parseDouble(JOptionPane.showInputDialog(this, "Enter new y ","0"));
         erase();
         s.move(x, y);
         s.draw(p);
         txtData.toString();
    }//GEN-LAST:event_btnmoveActionPerformed

    private void btnreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnreActionPerformed
       double f=Double.parseDouble(JOptionPane.showInputDialog(this, "Enter the factor you want to stretchby "));
       erase();
       s.stretchby(f);
       s.draw(p);
       txtData.setText(s.toString());
    }//GEN-LAST:event_btnreActionPerformed

    private void btnquitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnquitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnquitActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btncirc;
    private javax.swing.JButton btnmove;
    private javax.swing.JButton btnquit;
    private javax.swing.JButton btnre;
    private javax.swing.JButton btnrect;
    private javax.swing.JButton btntri;
    private javax.swing.JButton btnw;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbldata;
    private javax.swing.JTextArea txtData;
    private javax.swing.JLabel txtslct;
    // End of variables declaration//GEN-END:variables
}