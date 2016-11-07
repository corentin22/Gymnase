package gymnase;
import metier.*;
public class Administration extends javax.swing.JFrame {

    BDD req = new BDD();
    public Administration() {
        initComponents();
        panelSport.setVisible(false);
        panelAccueil.setVisible(false);
        panelPratiquer.setVisible(false);
        panelAssoc.setVisible(false);
        panelA.setVisible(false);
        panelS.setVisible(false);
        panelPrat.setVisible(false);
        txtSport.setVisible(false);
        btnOkS.setVisible(false);
        btnOkA.setVisible(false);
        comboRef.setVisible(false);
        comboSport.setVisible(false);
        btnOkPrat.setVisible(false);
        cbxAssoc.setVisible(false);
        cbxSport.setVisible(false);
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelAsso = new javax.swing.JPanel();
        btnSport = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnPrat = new javax.swing.JButton();
        btnAssoc = new javax.swing.JButton();
        btnAccueil = new javax.swing.JButton();
        MainPanel = new javax.swing.JLayeredPane();
        panelSport = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblSport = new javax.swing.JTable();
        panelAccueil = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblAccueil = new javax.swing.JTable();
        panelAssoc = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tblAssoc = new javax.swing.JTable();
        panelPratiquer = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblPrat = new javax.swing.JTable();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        panelPrat = new javax.swing.JPanel();
        btnAjoutP = new javax.swing.JButton();
        btnSupPrat = new javax.swing.JButton();
        cbxAssoc = new javax.swing.JComboBox<>();
        cbxSport = new javax.swing.JComboBox<>();
        btnOkPrat = new javax.swing.JButton();
        panelS = new javax.swing.JPanel();
        btnAjoutS = new javax.swing.JButton();
        txtSport = new javax.swing.JTextField();
        btnOkS = new javax.swing.JToggleButton();
        btnSupS = new javax.swing.JButton();
        panelA = new javax.swing.JPanel();
        btnAjoutA = new javax.swing.JButton();
        btnSupA = new javax.swing.JButton();
        btnOkA = new javax.swing.JButton();
        comboRef = new javax.swing.JComboBox<>();
        comboSport = new javax.swing.JComboBox<>();

        javax.swing.GroupLayout panelAssoLayout = new javax.swing.GroupLayout(panelAsso);
        panelAsso.setLayout(panelAssoLayout);
        panelAssoLayout.setHorizontalGroup(
            panelAssoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        panelAssoLayout.setVerticalGroup(
            panelAssoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnSport.setText("Sport");
        btnSport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSportActionPerformed(evt);
            }
        });

        jLabel1.setText("ADMINISTRATION");

        btnPrat.setText("Pratiquer");
        btnPrat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPratActionPerformed(evt);
            }
        });

        btnAssoc.setText("Association");
        btnAssoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAssocActionPerformed(evt);
            }
        });

        btnAccueil.setText("Accueillir");
        btnAccueil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAccueilActionPerformed(evt);
            }
        });

        MainPanel.setPreferredSize(new java.awt.Dimension(300, 200));

        panelSport.setPreferredSize(new java.awt.Dimension(450, 150));

        tblSport.setModel(new ModelSport());
        jScrollPane1.setViewportView(tblSport);

        javax.swing.GroupLayout panelSportLayout = new javax.swing.GroupLayout(panelSport);
        panelSport.setLayout(panelSportLayout);
        panelSportLayout.setHorizontalGroup(
            panelSportLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 465, Short.MAX_VALUE)
            .addGroup(panelSportLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelSportLayout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        panelSportLayout.setVerticalGroup(
            panelSportLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 161, Short.MAX_VALUE)
            .addGroup(panelSportLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelSportLayout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        panelAccueil.setPreferredSize(new java.awt.Dimension(450, 150));

        tblAccueil.setModel(new ModelAccueil());
        jScrollPane2.setViewportView(tblAccueil);

        javax.swing.GroupLayout panelAccueilLayout = new javax.swing.GroupLayout(panelAccueil);
        panelAccueil.setLayout(panelAccueilLayout);
        panelAccueilLayout.setHorizontalGroup(
            panelAccueilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 453, Short.MAX_VALUE)
            .addGroup(panelAccueilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelAccueilLayout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        panelAccueilLayout.setVerticalGroup(
            panelAccueilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 403, Short.MAX_VALUE)
            .addGroup(panelAccueilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelAccueilLayout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(259, Short.MAX_VALUE)))
        );

        tblAssoc.setModel(new ModelAssoc());
        jScrollPane4.setViewportView(tblAssoc);

        javax.swing.GroupLayout panelAssocLayout = new javax.swing.GroupLayout(panelAssoc);
        panelAssoc.setLayout(panelAssocLayout);
        panelAssocLayout.setHorizontalGroup(
            panelAssocLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 453, Short.MAX_VALUE)
            .addGroup(panelAssocLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelAssocLayout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        panelAssocLayout.setVerticalGroup(
            panelAssocLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 155, Short.MAX_VALUE)
            .addGroup(panelAssocLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelAssocLayout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        tblPrat.setModel(new ModelPrat());
        jScrollPane3.setViewportView(tblPrat);

        javax.swing.GroupLayout panelPratiquerLayout = new javax.swing.GroupLayout(panelPratiquer);
        panelPratiquer.setLayout(panelPratiquerLayout);
        panelPratiquerLayout.setHorizontalGroup(
            panelPratiquerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 453, Short.MAX_VALUE)
            .addGroup(panelPratiquerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelPratiquerLayout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        panelPratiquerLayout.setVerticalGroup(
            panelPratiquerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 157, Short.MAX_VALUE)
            .addGroup(panelPratiquerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelPratiquerLayout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        MainPanel.setLayer(panelSport, javax.swing.JLayeredPane.DEFAULT_LAYER);
        MainPanel.setLayer(panelAccueil, javax.swing.JLayeredPane.DEFAULT_LAYER);
        MainPanel.setLayer(panelAssoc, javax.swing.JLayeredPane.DEFAULT_LAYER);
        MainPanel.setLayer(panelPratiquer, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout MainPanelLayout = new javax.swing.GroupLayout(MainPanel);
        MainPanel.setLayout(MainPanelLayout);
        MainPanelLayout.setHorizontalGroup(
            MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MainPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelSport, javax.swing.GroupLayout.PREFERRED_SIZE, 465, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(49, Short.MAX_VALUE))
            .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(MainPanelLayout.createSequentialGroup()
                    .addGap(15, 15, 15)
                    .addComponent(panelAccueil, javax.swing.GroupLayout.PREFERRED_SIZE, 465, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(55, Short.MAX_VALUE)))
            .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MainPanelLayout.createSequentialGroup()
                    .addContainerGap(9, Short.MAX_VALUE)
                    .addComponent(panelAssoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(46, Short.MAX_VALUE)))
            .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MainPanelLayout.createSequentialGroup()
                    .addContainerGap(7, Short.MAX_VALUE)
                    .addComponent(panelPratiquer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(48, Short.MAX_VALUE)))
        );
        MainPanelLayout.setVerticalGroup(
            MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MainPanelLayout.createSequentialGroup()
                .addComponent(panelSport, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(MainPanelLayout.createSequentialGroup()
                    .addGap(5, 5, 5)
                    .addComponent(panelAccueil, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(15, Short.MAX_VALUE)))
            .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MainPanelLayout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelAssoc, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(20, Short.MAX_VALUE)))
            .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MainPanelLayout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelPratiquer, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(269, Short.MAX_VALUE)))
        );

        btnAjoutP.setText("Ajouter");
        btnAjoutP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAjoutPActionPerformed(evt);
            }
        });

        btnSupPrat.setText("Supprimer");
        btnSupPrat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSupPratActionPerformed(evt);
            }
        });

        btnOkPrat.setText("Ok");
        btnOkPrat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOkPratActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelPratLayout = new javax.swing.GroupLayout(panelPrat);
        panelPrat.setLayout(panelPratLayout);
        panelPratLayout.setHorizontalGroup(
            panelPratLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPratLayout.createSequentialGroup()
                .addGroup(panelPratLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelPratLayout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(btnAjoutP))
                    .addGroup(panelPratLayout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(panelPratLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbxSport, 0, 75, Short.MAX_VALUE)
                            .addComponent(cbxAssoc, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(75, 75, 75)
                .addGroup(panelPratLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnSupPrat, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnOkPrat, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(24, 24, 24))
        );
        panelPratLayout.setVerticalGroup(
            panelPratLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPratLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(panelPratLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAjoutP)
                    .addComponent(btnSupPrat))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelPratLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelPratLayout.createSequentialGroup()
                        .addComponent(cbxAssoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cbxSport, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelPratLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnOkPrat)))
                .addGap(28, 28, 28))
        );

        btnAjoutS.setText("Ajouter");
        btnAjoutS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAjoutSActionPerformed(evt);
            }
        });

        btnOkS.setText("ok");
        btnOkS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOkSActionPerformed(evt);
            }
        });

        btnSupS.setText("Supprimer");
        btnSupS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSupSActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelSLayout = new javax.swing.GroupLayout(panelS);
        panelS.setLayout(panelSLayout);
        panelSLayout.setHorizontalGroup(
            panelSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelSLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(panelSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(panelSLayout.createSequentialGroup()
                        .addComponent(btnSupS)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAjoutS, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelSLayout.createSequentialGroup()
                        .addComponent(txtSport, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnOkS, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(53, Short.MAX_VALUE))
        );
        panelSLayout.setVerticalGroup(
            panelSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelSLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(panelSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSupS)
                    .addComponent(btnAjoutS))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSport, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnOkS))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        btnAjoutA.setText("Ajouter");
        btnAjoutA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAjoutAActionPerformed(evt);
            }
        });

        btnSupA.setText("Supprimer");
        btnSupA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSupAActionPerformed(evt);
            }
        });

        btnOkA.setText("OK");
        btnOkA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOkAActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelALayout = new javax.swing.GroupLayout(panelA);
        panelA.setLayout(panelALayout);
        panelALayout.setHorizontalGroup(
            panelALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelALayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(panelALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelALayout.createSequentialGroup()
                        .addComponent(btnAjoutA, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnSupA))
                    .addGroup(panelALayout.createSequentialGroup()
                        .addGroup(panelALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(comboRef, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(comboSport, 0, 65, Short.MAX_VALUE))
                        .addGap(33, 33, 33)
                        .addComponent(btnOkA, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(55, Short.MAX_VALUE))
        );
        panelALayout.setVerticalGroup(
            panelALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelALayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAjoutA)
                    .addComponent(btnSupA))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelALayout.createSequentialGroup()
                        .addComponent(comboRef, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(comboSport, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelALayout.createSequentialGroup()
                        .addComponent(btnOkA)
                        .addGap(17, 17, 17)))
                .addContainerGap())
        );

        jLayeredPane1.setLayer(panelPrat, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(panelS, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(panelA, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jLayeredPane1Layout.createSequentialGroup()
                .addContainerGap(59, Short.MAX_VALUE)
                .addComponent(panelS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jLayeredPane1Layout.createSequentialGroup()
                    .addContainerGap(38, Short.MAX_VALUE)
                    .addComponent(panelPrat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(33, Short.MAX_VALUE)))
            .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jLayeredPane1Layout.createSequentialGroup()
                    .addGap(41, 41, 41)
                    .addComponent(panelA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(42, Short.MAX_VALUE)))
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(panelS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(29, Short.MAX_VALUE))
            .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jLayeredPane1Layout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelPrat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
            .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jLayeredPane1Layout.createSequentialGroup()
                    .addGap(14, 14, 14)
                    .addComponent(panelA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(23, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(295, 295, 295))
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(btnSport, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnAccueil, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnPrat, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnAssoc, javax.swing.GroupLayout.Alignment.LEADING))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addComponent(MainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 520, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(132, 132, 132)
                        .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(63, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnSport)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAccueil)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnPrat)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAssoc))
                    .addComponent(MainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(110, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSportActionPerformed
        panelAccueil.setVisible(false);
        panelPratiquer.setVisible(false);
        panelAsso.setVisible(false);
        panelAssoc.setVisible(false);
        panelA.setVisible(false);
        panelPrat.setVisible(false);
        panelSport.setVisible(true);
        panelS.setVisible(true);
        req.afficheSport(tblSport);
    }//GEN-LAST:event_btnSportActionPerformed

    private void btnAccueilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAccueilActionPerformed
        panelSport.setVisible(false);
        panelAsso.setVisible(false);
        panelAssoc.setVisible(false);
        panelS.setVisible(false);
        panelPrat.setVisible(false);
        panelPratiquer.setVisible(false);
        panelAccueil.setVisible(true);
        panelA.setVisible(true);
        req.afficheAccueil(tblAccueil, comboRef, comboSport);
        
    }//GEN-LAST:event_btnAccueilActionPerformed

    private void btnSupSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSupSActionPerformed
        int ligne = tblSport.getSelectedRow();
        req.supSport(tblSport, ligne);
    }//GEN-LAST:event_btnSupSActionPerformed

    private void btnAjoutSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAjoutSActionPerformed
        txtSport.setVisible(true);
        btnOkS.setVisible(true);
    }//GEN-LAST:event_btnAjoutSActionPerformed

    private void btnOkSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOkSActionPerformed
        txtSport.setVisible(false);
        btnOkS.setVisible(false);
        String sport = txtSport.getText();
        req.ajoutS(tblSport, sport);
    }//GEN-LAST:event_btnOkSActionPerformed

    private void btnPratActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPratActionPerformed
        panelSport.setVisible(false);
        panelAccueil.setVisible(false);
        panelAsso.setVisible(false);
        panelAssoc.setVisible(false);
        panelS.setVisible(false);
        panelA.setVisible(false);
        panelPratiquer.setVisible(true);
        panelPrat.setVisible(true);
        req.affichePrat(tblPrat, cbxAssoc, cbxSport);
    }//GEN-LAST:event_btnPratActionPerformed

    private void btnAssocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAssocActionPerformed
        panelSport.setVisible(false);
        panelAccueil.setVisible(false);
        panelPratiquer.setVisible(false);
        panelAssoc.setVisible(true);
        req.afficheAssoc(tblAssoc);
    }//GEN-LAST:event_btnAssocActionPerformed

    private void btnAjoutAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAjoutAActionPerformed
        panelS.setVisible(false);
        comboRef.setVisible(true);
        comboSport.setVisible(true);
        btnOkA.setVisible(true);
    }//GEN-LAST:event_btnAjoutAActionPerformed

    private void btnOkAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOkAActionPerformed
        String sport = (String) comboSport.getSelectedItem();
        String refSalle = (String) comboRef.getSelectedItem();
        req.ajoutAccueil(tblAccueil, refSalle, sport);
        comboRef.setVisible(false);
        comboSport.setVisible(false);
        btnOkA.setVisible(false);
    }//GEN-LAST:event_btnOkAActionPerformed

    private void btnSupAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSupAActionPerformed
        int ligne = tblAccueil.getSelectedRow();
        req.supAccueil(tblAccueil, ligne);
    }//GEN-LAST:event_btnSupAActionPerformed

    private void btnAjoutPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAjoutPActionPerformed
        cbxAssoc.setVisible(true);
        cbxSport.setVisible(true);
        btnOkPrat.setVisible(true);
    }//GEN-LAST:event_btnAjoutPActionPerformed

    private void btnSupPratActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSupPratActionPerformed
        int ligne = tblPrat.getSelectedRow();
        req.supPrat(tblPrat, ligne);
    }//GEN-LAST:event_btnSupPratActionPerformed

    private void btnOkPratActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOkPratActionPerformed
        String assoc = (String) cbxAssoc.getSelectedItem();
        String sport = (String) cbxSport.getSelectedItem();
        req.ajoutPrat(tblPrat, assoc, sport);
        cbxAssoc.setVisible(false);
        cbxSport.setVisible(false);
        btnOkPrat.setVisible(false);
    }//GEN-LAST:event_btnOkPratActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        Gymnase f2 = new Gymnase();
        f2.setSize(500, 600);
        f2.setVisible(true);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLayeredPane MainPanel;
    private javax.swing.JButton btnAccueil;
    private javax.swing.JButton btnAjoutA;
    private javax.swing.JButton btnAjoutP;
    private javax.swing.JButton btnAjoutS;
    private javax.swing.JButton btnAssoc;
    private javax.swing.JButton btnOkA;
    private javax.swing.JButton btnOkPrat;
    private javax.swing.JToggleButton btnOkS;
    private javax.swing.JButton btnPrat;
    private javax.swing.JButton btnSport;
    private javax.swing.JButton btnSupA;
    private javax.swing.JButton btnSupPrat;
    private javax.swing.JButton btnSupS;
    private javax.swing.JComboBox<String> cbxAssoc;
    private javax.swing.JComboBox<String> cbxSport;
    private javax.swing.JComboBox<String> comboRef;
    private javax.swing.JComboBox<String> comboSport;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JPanel panelA;
    private javax.swing.JPanel panelAccueil;
    private javax.swing.JPanel panelAsso;
    private javax.swing.JPanel panelAssoc;
    private javax.swing.JPanel panelPrat;
    private javax.swing.JPanel panelPratiquer;
    private javax.swing.JPanel panelS;
    private javax.swing.JPanel panelSport;
    private javax.swing.JTable tblAccueil;
    private javax.swing.JTable tblAssoc;
    private javax.swing.JTable tblPrat;
    private javax.swing.JTable tblSport;
    private javax.swing.JTextField txtSport;
    // End of variables declaration//GEN-END:variables
}
