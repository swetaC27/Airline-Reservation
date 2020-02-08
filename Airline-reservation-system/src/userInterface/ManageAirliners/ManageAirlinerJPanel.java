/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userInterface.ManageAirliners;

import business.AirLiner;
import business.TravelAgency;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import userInterface.TravelAgencyJPanel;

/**
 *
 * @author Sweta Chowdhury
 */
public class ManageAirlinerJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageAirliner
     */
    private CardLayout layout;
    private JPanel CardSequenceJPanel;
    private TravelAgency travelAgency;
    public ManageAirlinerJPanel(JPanel CardSequenceJPanel, TravelAgency travelAgency) {
        initComponents();
        this.CardSequenceJPanel = CardSequenceJPanel;
        layout = (CardLayout) CardSequenceJPanel.getLayout();
        this.travelAgency = travelAgency;
        populateAirLinerTable();
        jTblAirLiner.getColumnModel().getColumn(3).setMinWidth(0);
        jTblAirLiner.getColumnModel().getColumn(3).setMaxWidth(0);
        
    }

    
    public void populateAirLinerTable(){
        DefaultTableModel defaultTM = (DefaultTableModel) jTblAirLiner.getModel();
        defaultTM.setRowCount(0);
        for (AirLiner airline : travelAgency.getAirlinerCatalog()){
            Object row[] = new Object[jTblAirLiner.getColumnCount()];
            row[0] = airline.getAirLinerName();
            row[1] = airline.getManufacturer();
            row[2] = airline.getEstablishmentDate();
            row[3] = airline;
            defaultTM.addRow(row);
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

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTblAirLiner = new javax.swing.JTable();
        jBtnCreateAirliner = new javax.swing.JButton();
        jBtnViewAirliner = new javax.swing.JButton();
        jBtnDelete = new javax.swing.JButton();
        jBtnBack = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setText("Airliners");

        jTblAirLiner.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Airliner Name", "Airliner Owner", "Established On", "AirLiner"
            }
        ));
        jScrollPane1.setViewportView(jTblAirLiner);

        jBtnCreateAirliner.setText("New Airliner");
        jBtnCreateAirliner.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnCreateAirlinerActionPerformed(evt);
            }
        });

        jBtnViewAirliner.setText("View Airliner");
        jBtnViewAirliner.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnViewAirlinerActionPerformed(evt);
            }
        });

        jBtnDelete.setText("Delete Airliner");
        jBtnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnDeleteActionPerformed(evt);
            }
        });

        jBtnBack.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jBtnBack.setText("<< Back");
        jBtnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnBackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(272, 272, 272)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 379, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jBtnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 828, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(91, 91, 91)
                        .addComponent(jBtnCreateAirliner, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(90, 90, 90)
                        .addComponent(jBtnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(85, 85, 85)
                        .addComponent(jBtnViewAirliner, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(226, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(85, 85, 85)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBtnCreateAirliner)
                    .addComponent(jBtnDelete)
                    .addComponent(jBtnViewAirliner))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 110, Short.MAX_VALUE)
                .addComponent(jBtnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jBtnCreateAirlinerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnCreateAirlinerActionPerformed
        // TODO add your handling code here:
        CreateNewAirlineJPanel createAirlinerPanel = new CreateNewAirlineJPanel(CardSequenceJPanel, travelAgency);
        CardSequenceJPanel.add("CreateAirlinerPanel", createAirlinerPanel);
        layout.next(CardSequenceJPanel);   
    }//GEN-LAST:event_jBtnCreateAirlinerActionPerformed

    private void jBtnViewAirlinerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnViewAirlinerActionPerformed
        // TODO add your handling code here:
        AirLiner selectedAirLine;
        int selectedRow =  jTblAirLiner.getSelectedRow();
        
        if(selectedRow == -1){
            JOptionPane.showMessageDialog(null, "Please select an airliner");
        }
        else{
            selectedAirLine = (AirLiner) jTblAirLiner.getValueAt(jTblAirLiner.getSelectedRow(), 3);
            ViewAirlinerJPanel viewAirlinerPanel = new ViewAirlinerJPanel(CardSequenceJPanel, travelAgency, selectedAirLine);
            CardSequenceJPanel.add("ViewAirlinerJPanel", viewAirlinerPanel);
            layout.next(CardSequenceJPanel);
            
        }
        
        
    }//GEN-LAST:event_jBtnViewAirlinerActionPerformed

    private void jBtnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnDeleteActionPerformed
        // TODO add your handling code here:
        AirLiner selectedAirLine;
        int selectedRow =  jTblAirLiner.getSelectedRow();
        
        if(selectedRow == -1){
            JOptionPane.showMessageDialog(null, "Please select an airliner");
        }
        else{
            selectedAirLine = (AirLiner) jTblAirLiner.getValueAt(jTblAirLiner.getSelectedRow(), 3);
            travelAgency.deleteAirliner(selectedAirLine);
            populateAirLinerTable();
        }
    }//GEN-LAST:event_jBtnDeleteActionPerformed

    private void jBtnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnBackActionPerformed
        // TODO add your handling code here:
        CardSequenceJPanel.remove(this);
        layout.previous(CardSequenceJPanel);

        Component components[] = CardSequenceJPanel.getComponents();
        for(Component component: components){
            if (component instanceof TravelAgencyJPanel){
                TravelAgencyJPanel tPanel = (TravelAgencyJPanel)component;
                tPanel.populateJPanel();
            }

        }

    }//GEN-LAST:event_jBtnBackActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtnBack;
    private javax.swing.JButton jBtnCreateAirliner;
    private javax.swing.JButton jBtnDelete;
    private javax.swing.JButton jBtnViewAirliner;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTblAirLiner;
    // End of variables declaration//GEN-END:variables
}
