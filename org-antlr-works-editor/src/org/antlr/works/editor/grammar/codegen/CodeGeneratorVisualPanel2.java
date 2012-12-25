/*
 *  Copyright (c) 2012 Sam Harwell, Tunnel Vision Laboratories LLC
 *  All rights reserved.
 * 
 *  The source code of this document is proprietary work, and is not licensed for
 *  distribution. For information about licensing, contact Sam Harwell at:
 *      sam@tunnelvisionlabs.com
 */
package org.antlr.works.editor.grammar.codegen;

import javax.swing.JCheckBox;
import javax.swing.JPanel;
import javax.swing.JTextField;

public final class CodeGeneratorVisualPanel2 extends JPanel {

    /**
     * Creates new form CodeGeneratorVisualPanel2
     */
    public CodeGeneratorVisualPanel2() {
        initComponents();
    }

    public boolean isGenerateListener() {
        return chkGenerateListener.isSelected();
    }

    public void setGenerateListener(boolean value) {
        chkGenerateListener.setSelected(value);
    }

    public boolean isGenerateVisitor() {
        return chkGenerateVisitor.isSelected();
    }

    public void setGenerateVisitor(boolean value) {
        chkGenerateVisitor.setSelected(value);
    }

    public boolean isUsePackageName() {
        return chkSetPackageName.isSelected();
    }

    public String getPackageName() {
        return txtPackageName.getText();
    }

    public void setPackageName(boolean checked, String name) {
        chkSetPackageName.setSelected(checked);
        if (checked || (name != null && !name.isEmpty())) {
            txtPackageName.setText(name);
        }
    }

    public boolean isAbstractClasses() {
        return chkAbstractClasses.isSelected();
    }

    public void setAbstractClasses(boolean value) {
        chkAbstractClasses.setSelected(value);
    }

    @Override
    public String getName() {
        return "Features";
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.JPanel jPanel1 = new javax.swing.JPanel();
        chkGenerateListener = new javax.swing.JCheckBox();
        chkGenerateVisitor = new javax.swing.JCheckBox();
        javax.swing.JPanel jPanel2 = new javax.swing.JPanel();
        txtPackageName = new javax.swing.JTextField();
        chkAbstractClasses = new javax.swing.JCheckBox();
        chkSetPackageName = new javax.swing.JCheckBox();

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(org.openide.util.NbBundle.getMessage(CodeGeneratorVisualPanel2.class, "CodeGeneratorVisualPanel2.jPanel1.border.title"))); // NOI18N

        chkGenerateListener.setSelected(true);
        org.openide.awt.Mnemonics.setLocalizedText(chkGenerateListener, org.openide.util.NbBundle.getMessage(CodeGeneratorVisualPanel2.class, "CodeGeneratorVisualPanel2.chkGenerateListener.text")); // NOI18N

        org.openide.awt.Mnemonics.setLocalizedText(chkGenerateVisitor, org.openide.util.NbBundle.getMessage(CodeGeneratorVisualPanel2.class, "CodeGeneratorVisualPanel2.chkGenerateVisitor.text")); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(chkGenerateListener)
                    .addComponent(chkGenerateVisitor))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(chkGenerateListener)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(chkGenerateVisitor))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(org.openide.util.NbBundle.getMessage(CodeGeneratorVisualPanel2.class, "CodeGeneratorVisualPanel2.jPanel2.border.title"))); // NOI18N

        org.openide.awt.Mnemonics.setLocalizedText(chkAbstractClasses, org.openide.util.NbBundle.getMessage(CodeGeneratorVisualPanel2.class, "CodeGeneratorVisualPanel2.chkAbstractClasses.text")); // NOI18N
        chkAbstractClasses.setToolTipText(org.openide.util.NbBundle.getMessage(CodeGeneratorVisualPanel2.class, "CodeGeneratorVisualPanel2.chkAbstractClasses.toolTipText")); // NOI18N

        org.openide.awt.Mnemonics.setLocalizedText(chkSetPackageName, org.openide.util.NbBundle.getMessage(CodeGeneratorVisualPanel2.class, "CodeGeneratorVisualPanel2.chkSetPackageName.text")); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(chkSetPackageName)
                        .addGap(32, 32, 32)
                        .addComponent(txtPackageName))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(chkAbstractClasses)
                        .addGap(0, 131, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chkSetPackageName)
                    .addComponent(txtPackageName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(chkAbstractClasses)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(80, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox chkAbstractClasses;
    private javax.swing.JCheckBox chkGenerateListener;
    private javax.swing.JCheckBox chkGenerateVisitor;
    private javax.swing.JCheckBox chkSetPackageName;
    private javax.swing.JTextField txtPackageName;
    // End of variables declaration//GEN-END:variables
}