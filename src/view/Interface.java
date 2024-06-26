/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import banco.ConexaoBanco;
import java.awt.Image;
import java.util.List;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import model.Telas;
import model.Usuario;

/**
 *
 * @author marina.canal
 */
public final class Interface extends javax.swing.JFrame {

    List<Telas> listaTela = new ArrayList<>();
    int posIni;
    ImageIcon imageIcon;
    String caminhoImagem;
    Usuario user;

    /**
     * Creates new form Interface
     * @throws java.sql.SQLException
     */
    public Interface() throws SQLException {
        initComponents();
        exibirLivros();
    }

     public Interface (Usuario user) throws SQLException {
        this.user = user;
        initComponents();
        exibirLivros();
    }

    
    public void exibirLivros() throws SQLException {
        ConexaoBanco BD = new ConexaoBanco();
        listaTela = new ArrayList<>();
        ResultSet rs = BD.buscarId();
       
        while (rs.next()) {
            Telas telas = new Telas();
            telas.setNome_Usuario(rs.getString("nome_usuario"));
            telas.setTitulo(rs.getString("nome_livro"));
            telas.setAutor(rs.getString("autor"));
            telas.setNmr_pg(rs.getString("nmr_pg"));
            telas.setQuant(rs.getString("quant_livro"));
            telas.setImagem(rs.getString("imagem"));
            
            listaTela.add(telas);
        }
        posIni = 0;
        jLabelNomeUs.setText(listaTela.get(posIni).getNome_Usuario());
        jLabelTit.setText(listaTela.get(posIni).getTitulo());
        jLabelAut.setText(listaTela.get(posIni).getAutor());
        jLabelPag.setText(listaTela.get(posIni).getNmr_pg());
        jLabelQuant.setText(listaTela.get(posIni).getQuant());
        caminhoImagem = listaTela.get(posIni).getImagem();
        imageIcon = new ImageIcon(caminhoImagem);
        Image image = imageIcon.getImage().getScaledInstance(246, 250, java.awt.Image.SCALE_SMOOTH);
        imageIcon = new ImageIcon(image);
        jLabelImage.setIcon(imageIcon);
    }

    @SuppressWarnings("empty-statement")
    public void exibirProximo() {
        posIni++;
        if (posIni < listaTela.size()) {
        jLabelNomeUs.setText(listaTela.get(posIni).getNome_Usuario());
        jLabelTit.setText(listaTela.get(posIni).getTitulo());
        jLabelAut.setText(listaTela.get(posIni).getAutor());
        jLabelPag.setText(listaTela.get(posIni).getNmr_pg());
        jLabelQuant.setText(listaTela.get(posIni).getQuant());
        caminhoImagem = listaTela.get(posIni).getImagem();
        imageIcon = new ImageIcon(caminhoImagem);
        Image image = imageIcon.getImage().getScaledInstance(246, 250, java.awt.Image.SCALE_SMOOTH);;
        imageIcon = new ImageIcon(image);
        jLabelImage.setIcon(imageIcon);
        } else {
            Acabo1 a1 = new Acabo1();
            a1.setVisible(true);
        }
    }

    @SuppressWarnings("empty-statement")
    public void exibirAnterior() {
        posIni--;
        if (posIni > 0) {
            jLabelNomeUs.setText(listaTela.get(posIni).getNome_Usuario());
            jLabelTit.setText(listaTela.get(posIni).getTitulo());
            jLabelAut.setText(listaTela.get(posIni).getAutor());
            jLabelPag.setText(listaTela.get(posIni).getNmr_pg());
            jLabelQuant.setText(listaTela.get(posIni).getQuant());
            caminhoImagem = listaTela.get(posIni).getImagem();
            imageIcon = new ImageIcon(caminhoImagem);
            Image image = imageIcon.getImage().getScaledInstance(246, 250, java.awt.Image.SCALE_SMOOTH);;
            imageIcon = new ImageIcon(image);
            jLabelImage.setIcon(imageIcon);
        } else {
            Acabo2 a1 = new Acabo2();
            a1.setVisible(true);
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

        jPanel1 = new javax.swing.JPanel();
        jLabelNomeUs = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jButtonPerfil = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jButtonPegar = new javax.swing.JButton();
        jButtonTrocar = new javax.swing.JButton();
        jButtonMaiss = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabelTit = new javax.swing.JLabel();
        jLabelAut = new javax.swing.JLabel();
        jLabelPag = new javax.swing.JLabel();
        jLabelQuant = new javax.swing.JLabel();
        jButtonProx = new javax.swing.JButton();
        jLabelImage = new javax.swing.JLabel();
        jButtonAnt = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 153, 255));

        jLabelNomeUs.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabelNomeUs.setForeground(new java.awt.Color(255, 255, 255));
        jLabelNomeUs.setMaximumSize(new java.awt.Dimension(834, 698));

        jPanel2.setBackground(new java.awt.Color(153, 0, 255));

        jLabel3.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Biblioteca Comunitária");
        jLabel3.setMaximumSize(new java.awt.Dimension(834, 698));

        jButtonPerfil.setBackground(new java.awt.Color(153, 0, 255));
        jButtonPerfil.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButtonPerfil.setForeground(new java.awt.Color(255, 255, 255));
        jButtonPerfil.setText("Perfil");
        jButtonPerfil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPerfilActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonPerfil)
                .addGap(15, 15, 15))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(13, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButtonPerfil, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15))
        );

        jLabel1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Título:");

        jLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Autor:");

        jLabel4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Número de páginas:");

        jLabel6.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Quantidade:");

        jButtonPegar.setBackground(new java.awt.Color(153, 102, 255));
        jButtonPegar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButtonPegar.setForeground(new java.awt.Color(51, 0, 102));
        jButtonPegar.setText("Pegar");
        jButtonPegar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPegarActionPerformed(evt);
            }
        });

        jButtonTrocar.setBackground(new java.awt.Color(153, 102, 255));
        jButtonTrocar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButtonTrocar.setForeground(new java.awt.Color(51, 0, 102));
        jButtonTrocar.setText("Trocar");
        jButtonTrocar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonTrocarActionPerformed(evt);
            }
        });

        jButtonMaiss.setBackground(new java.awt.Color(153, 0, 255));
        jButtonMaiss.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jButtonMaiss.setForeground(new java.awt.Color(255, 255, 255));
        jButtonMaiss.setText("+");
        jButtonMaiss.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMaissActionPerformed(evt);
            }
        });

        jButtonProx.setBackground(new java.awt.Color(0, 0, 0));
        jButtonProx.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jButtonProx.setForeground(new java.awt.Color(255, 255, 255));
        jButtonProx.setText(">");
        jButtonProx.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonProxActionPerformed(evt);
            }
        });

        jLabelImage.setBackground(new java.awt.Color(153, 51, 255));
        jLabelImage.setForeground(new java.awt.Color(153, 51, 255));

        jButtonAnt.setBackground(new java.awt.Color(0, 0, 0));
        jButtonAnt.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jButtonAnt.setForeground(new java.awt.Color(255, 255, 255));
        jButtonAnt.setText("<");
        jButtonAnt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAntActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jButtonAnt, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(61, 61, 61)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabelImage, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(54, 54, 54)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabelPag)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButtonProx, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabelAut))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabelTit))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabelQuant, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(jButtonPegar, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jButtonTrocar, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addGap(102, 102, 102)
                                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(0, 141, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jButtonMaiss, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(8, 8, 8)))
                        .addGap(24, 24, 24))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabelNomeUs, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(156, 156, 156)
                        .addComponent(jButtonAnt, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(97, 97, 97)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabelTit))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabelAut))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jButtonProx, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabelPag))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabelQuant, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 59, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jButtonPegar, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButtonTrocar, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(0, 29, Short.MAX_VALUE)
                                .addComponent(jLabelNomeUs, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabelImage, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addComponent(jButtonMaiss, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonAntActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAntActionPerformed
        exibirAnterior();
    }//GEN-LAST:event_jButtonAntActionPerformed

    private void jButtonProxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonProxActionPerformed
        exibirProximo();
    }//GEN-LAST:event_jButtonProxActionPerformed

    private void jButtonMaissActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMaissActionPerformed
        CadastroLivro novoLivro = new CadastroLivro(user);
        novoLivro.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButtonMaissActionPerformed

    private void jButtonTrocarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonTrocarActionPerformed
       Endereco_Troca EndTr = new Endereco_Troca(user);
       EndTr.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButtonTrocarActionPerformed

    private void jButtonPegarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPegarActionPerformed
        Endereco_Emp emp = new Endereco_Emp(user);
        emp.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButtonPegarActionPerformed

    private void jButtonPerfilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPerfilActionPerformed
        try {
            MeuPerfil mp = new MeuPerfil(user);
            mp.setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(Interface.class.getName()).log(Level.SEVERE, null, ex);
        }
        dispose();
    }//GEN-LAST:event_jButtonPerfilActionPerformed

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
            java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            try {
                new Interface().setVisible(true);
            } catch (SQLException ex) {
                Logger.getLogger(Interface.class.getName()).log(Level.SEVERE, null, ex);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAnt;
    private javax.swing.JButton jButtonMaiss;
    private javax.swing.JButton jButtonPegar;
    private javax.swing.JButton jButtonPerfil;
    private javax.swing.JButton jButtonProx;
    private javax.swing.JButton jButtonTrocar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabelAut;
    private javax.swing.JLabel jLabelImage;
    private javax.swing.JLabel jLabelNomeUs;
    private javax.swing.JLabel jLabelPag;
    private javax.swing.JLabel jLabelQuant;
    private javax.swing.JLabel jLabelTit;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables

}
