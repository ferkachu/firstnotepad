
import java.awt.Color;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lab803
 */
public class Janela extends javax.swing.JFrame {

    Editor e = new Editor();

    /**
     * Creates new form Janela
     */
    public Janela() {
        initComponents();
        e.setArea(areaTexto);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        GrupoFonte = new javax.swing.ButtonGroup();
        GrupoCor = new javax.swing.ButtonGroup();
        grupoTamanho = new javax.swing.ButtonGroup();
        frameArquivo = new javax.swing.JInternalFrame();
        jScrollPane1 = new javax.swing.JScrollPane();
        areaTexto = new javax.swing.JTextArea();
        jMenuBar1 = new javax.swing.JMenuBar();
        menuArquivo = new javax.swing.JMenu();
        itemNovo = new javax.swing.JMenuItem();
        itemAbrir = new javax.swing.JMenuItem();
        itemSalvar = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        itemSair = new javax.swing.JMenuItem();
        menuEditar = new javax.swing.JMenu();
        itemCopiar = new javax.swing.JMenuItem();
        itemRecortar = new javax.swing.JMenuItem();
        itemColar = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        itemSelecionar = new javax.swing.JMenuItem();
        menuFormatar = new javax.swing.JMenu();
        itemFonte = new javax.swing.JMenu();
        itemArial = new javax.swing.JRadioButtonMenuItem();
        itemTimes = new javax.swing.JRadioButtonMenuItem();
        itemGeorgia = new javax.swing.JRadioButtonMenuItem();
        itemVerdana = new javax.swing.JRadioButtonMenuItem();
        itemComicSansMS = new javax.swing.JRadioButtonMenuItem();
        itemTrebuchetMS = new javax.swing.JRadioButtonMenuItem();
        itemGT = new javax.swing.JRadioButtonMenuItem();
        jSeparator3 = new javax.swing.JPopupMenu.Separator();
        itemCor = new javax.swing.JMenu();
        itemPreto = new javax.swing.JRadioButtonMenuItem();
        itemAzul = new javax.swing.JRadioButtonMenuItem();
        itemRosa = new javax.swing.JRadioButtonMenuItem();
        itemVerde = new javax.swing.JRadioButtonMenuItem();
        itemVermelho = new javax.swing.JRadioButtonMenuItem();
        itemCinza = new javax.swing.JRadioButtonMenuItem();
        jSeparator4 = new javax.swing.JPopupMenu.Separator();
        itemTamanho = new javax.swing.JMenu();
        itemDoze = new javax.swing.JRadioButtonMenuItem();
        itemCatorze = new javax.swing.JRadioButtonMenuItem();
        itemDezesseis = new javax.swing.JRadioButtonMenuItem();
        itemDezoito = new javax.swing.JRadioButtonMenuItem();
        itemVinte = new javax.swing.JRadioButtonMenuItem();
        itemVinteeSeis = new javax.swing.JRadioButtonMenuItem();
        itemTrinta = new javax.swing.JRadioButtonMenuItem();
        menuAjuda = new javax.swing.JMenu();
        itemSobre = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Super editor de texto da Nanda!");

        frameArquivo.setIconifiable(true);
        frameArquivo.setMaximizable(true);
        frameArquivo.setResizable(true);
        frameArquivo.setTitle("EditJava");
        frameArquivo.setFont(new java.awt.Font("Georgia", 0, 11)); // NOI18N
        frameArquivo.setVisible(true);

        areaTexto.setColumns(20);
        areaTexto.setRows(5);
        areaTexto.setSelectionColor(new java.awt.Color(255, 204, 204));
        jScrollPane1.setViewportView(areaTexto);

        frameArquivo.getContentPane().add(jScrollPane1, java.awt.BorderLayout.CENTER);

        getContentPane().add(frameArquivo, java.awt.BorderLayout.CENTER);

        menuArquivo.setMnemonic('A');
        menuArquivo.setText("Arquivo");
        menuArquivo.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N

        itemNovo.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_MASK));
        itemNovo.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        itemNovo.setText("Novo");
        itemNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemNovoActionPerformed(evt);
            }
        });
        menuArquivo.add(itemNovo);

        itemAbrir.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.CTRL_MASK));
        itemAbrir.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        itemAbrir.setText("Abrir");
        itemAbrir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemAbrirActionPerformed(evt);
            }
        });
        menuArquivo.add(itemAbrir);

        itemSalvar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        itemSalvar.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        itemSalvar.setText("Salvar");
        itemSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemSalvarActionPerformed(evt);
            }
        });
        menuArquivo.add(itemSalvar);
        menuArquivo.add(jSeparator2);

        itemSair.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.CTRL_MASK));
        itemSair.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        itemSair.setText("Sair");
        itemSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemSairActionPerformed(evt);
            }
        });
        menuArquivo.add(itemSair);

        jMenuBar1.add(menuArquivo);

        menuEditar.setMnemonic('E');
        menuEditar.setText("Editar");
        menuEditar.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N

        itemCopiar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_MASK));
        itemCopiar.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        itemCopiar.setText("Copiar");
        itemCopiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemCopiarActionPerformed(evt);
            }
        });
        menuEditar.add(itemCopiar);

        itemRecortar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_X, java.awt.event.InputEvent.CTRL_MASK));
        itemRecortar.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        itemRecortar.setText("Recortar");
        itemRecortar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemRecortarActionPerformed(evt);
            }
        });
        menuEditar.add(itemRecortar);

        itemColar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_V, java.awt.event.InputEvent.CTRL_MASK));
        itemColar.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        itemColar.setText("Colar");
        itemColar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemColarActionPerformed(evt);
            }
        });
        menuEditar.add(itemColar);
        menuEditar.add(jSeparator1);

        itemSelecionar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.CTRL_MASK));
        itemSelecionar.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        itemSelecionar.setText("Selecionar Tudo");
        itemSelecionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemSelecionarActionPerformed(evt);
            }
        });
        menuEditar.add(itemSelecionar);

        jMenuBar1.add(menuEditar);

        menuFormatar.setMnemonic('F');
        menuFormatar.setText("Formatar");
        menuFormatar.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N

        itemFonte.setText("Fonte");
        itemFonte.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N

        GrupoFonte.add(itemArial);
        itemArial.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        itemArial.setSelected(true);
        itemArial.setText("Arial");
        itemArial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemArialActionPerformed(evt);
            }
        });
        itemFonte.add(itemArial);

        GrupoFonte.add(itemTimes);
        itemTimes.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        itemTimes.setText("Times");
        itemTimes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemTimesActionPerformed(evt);
            }
        });
        itemFonte.add(itemTimes);

        GrupoFonte.add(itemGeorgia);
        itemGeorgia.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        itemGeorgia.setText("Georgia");
        itemGeorgia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemGeorgiaActionPerformed(evt);
            }
        });
        itemFonte.add(itemGeorgia);

        GrupoFonte.add(itemVerdana);
        itemVerdana.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        itemVerdana.setText("Verdana");
        itemVerdana.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemVerdanaActionPerformed(evt);
            }
        });
        itemFonte.add(itemVerdana);

        GrupoFonte.add(itemComicSansMS);
        itemComicSansMS.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        itemComicSansMS.setText("Comic Sans MS");
        itemComicSansMS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemComicSansMSActionPerformed(evt);
            }
        });
        itemFonte.add(itemComicSansMS);

        GrupoFonte.add(itemTrebuchetMS);
        itemTrebuchetMS.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        itemTrebuchetMS.setText("Trebuchet MS");
        itemTrebuchetMS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemTrebuchetMSActionPerformed(evt);
            }
        });
        itemFonte.add(itemTrebuchetMS);

        GrupoFonte.add(itemGT);
        itemGT.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        itemGT.setForeground(new java.awt.Color(0, 153, 0));
        itemGT.setText(">greentext");
        itemGT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemGTActionPerformed(evt);
            }
        });
        itemFonte.add(itemGT);

        menuFormatar.add(itemFonte);
        menuFormatar.add(jSeparator3);

        itemCor.setText("Cor");
        itemCor.setToolTipText("");
        itemCor.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N

        GrupoCor.add(itemPreto);
        itemPreto.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        itemPreto.setSelected(true);
        itemPreto.setText("Preto");
        itemPreto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemPretoActionPerformed(evt);
            }
        });
        itemCor.add(itemPreto);

        GrupoCor.add(itemAzul);
        itemAzul.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        itemAzul.setText("Azul");
        itemAzul.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemAzulActionPerformed(evt);
            }
        });
        itemCor.add(itemAzul);

        GrupoCor.add(itemRosa);
        itemRosa.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        itemRosa.setText("Rosa");
        itemRosa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemRosaActionPerformed(evt);
            }
        });
        itemCor.add(itemRosa);

        GrupoCor.add(itemVerde);
        itemVerde.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        itemVerde.setText("Verde");
        itemVerde.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemVerdeActionPerformed(evt);
            }
        });
        itemCor.add(itemVerde);

        GrupoCor.add(itemVermelho);
        itemVermelho.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        itemVermelho.setText("Vermelho");
        itemVermelho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemVermelhoActionPerformed(evt);
            }
        });
        itemCor.add(itemVermelho);

        GrupoCor.add(itemCinza);
        itemCinza.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        itemCinza.setText("Cinza");
        itemCinza.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemCinzaActionPerformed(evt);
            }
        });
        itemCor.add(itemCinza);

        menuFormatar.add(itemCor);
        menuFormatar.add(jSeparator4);

        itemTamanho.setText("Tamanho");
        itemTamanho.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N

        grupoTamanho.add(itemDoze);
        itemDoze.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        itemDoze.setSelected(true);
        itemDoze.setText("12");
        itemDoze.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemDozeActionPerformed(evt);
            }
        });
        itemTamanho.add(itemDoze);

        grupoTamanho.add(itemCatorze);
        itemCatorze.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        itemCatorze.setText("14");
        itemCatorze.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemCatorzeActionPerformed(evt);
            }
        });
        itemTamanho.add(itemCatorze);

        grupoTamanho.add(itemDezesseis);
        itemDezesseis.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        itemDezesseis.setText("16");
        itemDezesseis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemDezesseisActionPerformed(evt);
            }
        });
        itemTamanho.add(itemDezesseis);

        grupoTamanho.add(itemDezoito);
        itemDezoito.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        itemDezoito.setText("18");
        itemDezoito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemDezoitoActionPerformed(evt);
            }
        });
        itemTamanho.add(itemDezoito);

        grupoTamanho.add(itemVinte);
        itemVinte.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        itemVinte.setText("20");
        itemVinte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemVinteActionPerformed(evt);
            }
        });
        itemTamanho.add(itemVinte);

        grupoTamanho.add(itemVinteeSeis);
        itemVinteeSeis.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        itemVinteeSeis.setText("26");
        itemVinteeSeis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemVinteeSeisActionPerformed(evt);
            }
        });
        itemTamanho.add(itemVinteeSeis);

        grupoTamanho.add(itemTrinta);
        itemTrinta.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        itemTrinta.setText("30");
        itemTrinta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemTrintaActionPerformed(evt);
            }
        });
        itemTamanho.add(itemTrinta);

        menuFormatar.add(itemTamanho);

        jMenuBar1.add(menuFormatar);

        menuAjuda.setMnemonic('H');
        menuAjuda.setText("Ajuda");
        menuAjuda.setToolTipText("");
        menuAjuda.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N

        itemSobre.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_H, java.awt.event.InputEvent.CTRL_MASK));
        itemSobre.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        itemSobre.setText("Sobre");
        itemSobre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemSobreActionPerformed(evt);
            }
        });
        menuAjuda.add(itemSobre);

        jMenuBar1.add(menuAjuda);

        setJMenuBar(jMenuBar1);

        setBounds(0, 0, 678, 540);
    }// </editor-fold>//GEN-END:initComponents

    private void itemNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemNovoActionPerformed
        e.novo(frameArquivo);
    }//GEN-LAST:event_itemNovoActionPerformed

    private void itemAbrirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemAbrirActionPerformed
        e.abrir(this, frameArquivo);
    }//GEN-LAST:event_itemAbrirActionPerformed

    private void itemSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemSalvarActionPerformed
        e.salvar(this, frameArquivo);
    }//GEN-LAST:event_itemSalvarActionPerformed

    private void itemSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemSairActionPerformed
        e.sair();
    }//GEN-LAST:event_itemSairActionPerformed

    private void itemCopiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemCopiarActionPerformed
        e.copiar();
    }//GEN-LAST:event_itemCopiarActionPerformed

    private void itemRecortarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemRecortarActionPerformed
        e.recortar();
    }//GEN-LAST:event_itemRecortarActionPerformed

    private void itemColarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemColarActionPerformed
        e.colar();
    }//GEN-LAST:event_itemColarActionPerformed

    private void itemSelecionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemSelecionarActionPerformed
        e.selecionar();
    }//GEN-LAST:event_itemSelecionarActionPerformed

    private void itemArialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemArialActionPerformed
        e.configurarFonte("Arial");
    }//GEN-LAST:event_itemArialActionPerformed

    private void itemTimesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemTimesActionPerformed
        e.configurarFonte("Times New Roman");
    }//GEN-LAST:event_itemTimesActionPerformed

    private void itemPretoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemPretoActionPerformed
        e.configurarCor(Color.black);
    }//GEN-LAST:event_itemPretoActionPerformed

    private void itemAzulActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemAzulActionPerformed
        e.configurarCor(Color.blue);
    }//GEN-LAST:event_itemAzulActionPerformed

    private void itemRosaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemRosaActionPerformed
        e.configurarCor(Color.pink);
    }//GEN-LAST:event_itemRosaActionPerformed

    private void itemSobreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemSobreActionPerformed
        e.sobre(this);
    }//GEN-LAST:event_itemSobreActionPerformed

    private void itemDozeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemDozeActionPerformed
        e.configurarTamanho(12);
    }//GEN-LAST:event_itemDozeActionPerformed

    private void itemDezesseisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemDezesseisActionPerformed
        e.configurarTamanho(16);
    }//GEN-LAST:event_itemDezesseisActionPerformed

    private void itemCatorzeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemCatorzeActionPerformed
        e.configurarTamanho(14);
    }//GEN-LAST:event_itemCatorzeActionPerformed

    private void itemGeorgiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemGeorgiaActionPerformed
        e.configurarFonte("Georgia");
    }//GEN-LAST:event_itemGeorgiaActionPerformed

    private void itemVerdanaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemVerdanaActionPerformed
        e.configurarFonte("Verdana");
    }//GEN-LAST:event_itemVerdanaActionPerformed

    private void itemComicSansMSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemComicSansMSActionPerformed
        e.configurarFonte("Comic Sans MS");
    }//GEN-LAST:event_itemComicSansMSActionPerformed

    private void itemVerdeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemVerdeActionPerformed
        e.configurarCor(Color.green);
    }//GEN-LAST:event_itemVerdeActionPerformed

    private void itemVermelhoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemVermelhoActionPerformed
        e.configurarCor(Color.red);
    }//GEN-LAST:event_itemVermelhoActionPerformed

    private void itemCinzaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemCinzaActionPerformed
        e.configurarCor(Color.gray);
    }//GEN-LAST:event_itemCinzaActionPerformed

    private void itemGTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemGTActionPerformed
        e.configurarFonte("Consolas");
        areaTexto.setBackground(new Color(255,235,207));
    }//GEN-LAST:event_itemGTActionPerformed

    private void itemDezoitoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemDezoitoActionPerformed
        e.configurarTamanho(18);
    }//GEN-LAST:event_itemDezoitoActionPerformed

    private void itemVinteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemVinteActionPerformed
        e.configurarTamanho(20);
    }//GEN-LAST:event_itemVinteActionPerformed

    private void itemVinteeSeisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemVinteeSeisActionPerformed
        e.configurarTamanho(26);
    }//GEN-LAST:event_itemVinteeSeisActionPerformed

    private void itemTrintaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemTrintaActionPerformed
        e.configurarTamanho(30);
    }//GEN-LAST:event_itemTrintaActionPerformed

    private void itemTrebuchetMSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemTrebuchetMSActionPerformed
        e.configurarFonte("Trebuchet MS");
    }//GEN-LAST:event_itemTrebuchetMSActionPerformed

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
            java.util.logging.Logger.getLogger(Janela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Janela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Janela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Janela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Janela().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup GrupoCor;
    private javax.swing.ButtonGroup GrupoFonte;
    private javax.swing.JTextArea areaTexto;
    private javax.swing.JInternalFrame frameArquivo;
    private javax.swing.ButtonGroup grupoTamanho;
    private javax.swing.JMenuItem itemAbrir;
    private javax.swing.JRadioButtonMenuItem itemArial;
    private javax.swing.JRadioButtonMenuItem itemAzul;
    private javax.swing.JRadioButtonMenuItem itemCatorze;
    private javax.swing.JRadioButtonMenuItem itemCinza;
    private javax.swing.JMenuItem itemColar;
    private javax.swing.JRadioButtonMenuItem itemComicSansMS;
    private javax.swing.JMenuItem itemCopiar;
    private javax.swing.JMenu itemCor;
    private javax.swing.JRadioButtonMenuItem itemDezesseis;
    private javax.swing.JRadioButtonMenuItem itemDezoito;
    private javax.swing.JRadioButtonMenuItem itemDoze;
    private javax.swing.JMenu itemFonte;
    private javax.swing.JRadioButtonMenuItem itemGT;
    private javax.swing.JRadioButtonMenuItem itemGeorgia;
    private javax.swing.JMenuItem itemNovo;
    private javax.swing.JRadioButtonMenuItem itemPreto;
    private javax.swing.JMenuItem itemRecortar;
    private javax.swing.JRadioButtonMenuItem itemRosa;
    private javax.swing.JMenuItem itemSair;
    private javax.swing.JMenuItem itemSalvar;
    private javax.swing.JMenuItem itemSelecionar;
    private javax.swing.JMenuItem itemSobre;
    private javax.swing.JMenu itemTamanho;
    private javax.swing.JRadioButtonMenuItem itemTimes;
    private javax.swing.JRadioButtonMenuItem itemTrebuchetMS;
    private javax.swing.JRadioButtonMenuItem itemTrinta;
    private javax.swing.JRadioButtonMenuItem itemVerdana;
    private javax.swing.JRadioButtonMenuItem itemVerde;
    private javax.swing.JRadioButtonMenuItem itemVermelho;
    private javax.swing.JRadioButtonMenuItem itemVinte;
    private javax.swing.JRadioButtonMenuItem itemVinteeSeis;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JPopupMenu.Separator jSeparator3;
    private javax.swing.JPopupMenu.Separator jSeparator4;
    private javax.swing.JMenu menuAjuda;
    private javax.swing.JMenu menuArquivo;
    private javax.swing.JMenu menuEditar;
    private javax.swing.JMenu menuFormatar;
    // End of variables declaration//GEN-END:variables
}
