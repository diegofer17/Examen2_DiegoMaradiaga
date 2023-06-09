/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package examen2_diegomaradiaga;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;

/**
 *
 * @author df346
 */
public class MAINE extends javax.swing.JFrame {
    ArrayList <Deporte> listasD = new ArrayList();
    ArrayList <Torneo> listasT = new ArrayList();
    ArrayList <Equipo> listasE = new ArrayList();
    /**
     * Creates new form MAINE
     */
    public MAINE() {
        initComponents();
        this.setLocationRelativeTo(null);
        actualizarCB();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpm_menu1 = new javax.swing.JPopupMenu();
        AddDeporte = new javax.swing.JMenuItem();
        jpm_menu2 = new javax.swing.JPopupMenu();
        AddEquipo = new javax.swing.JMenuItem();
        ListParticip = new javax.swing.JMenuItem();
        MostrarTab = new javax.swing.JMenuItem();
        jpm_menu3 = new javax.swing.JPopupMenu();
        AddTorneo = new javax.swing.JMenuItem();
        jD_simulacion = new javax.swing.JDialog();
        jPanel2 = new javax.swing.JPanel();
        jCB_team1 = new javax.swing.JComboBox<>();
        jCB_team2 = new javax.swing.JComboBox<>();
        jSp_team1 = new javax.swing.JSpinner();
        jSp_team2 = new javax.swing.JSpinner();
        jbtn_partido = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jD_Listar = new javax.swing.JDialog();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jListTeams = new javax.swing.JList<>();
        jbtn_salir = new javax.swing.JButton();
        jLabelEtiqueta = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTreeTorneo = new javax.swing.JTree();
        jLabel1 = new javax.swing.JLabel();
        jbtn_partidoSim = new javax.swing.JButton();
        jbtn_cargar = new javax.swing.JButton();
        jbtn_guardar = new javax.swing.JButton();
        jCB1 = new javax.swing.JComboBox<>();

        AddDeporte.setText("Agregar deporte");
        AddDeporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddDeporteActionPerformed(evt);
            }
        });
        jpm_menu1.add(AddDeporte);

        AddEquipo.setText("Agregar equipo");
        AddEquipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddEquipoActionPerformed(evt);
            }
        });
        jpm_menu2.add(AddEquipo);

        ListParticip.setText("Listar equipos participantes");
        ListParticip.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ListParticipActionPerformed(evt);
            }
        });
        jpm_menu2.add(ListParticip);

        MostrarTab.setText("Mostrar tabla de posiciones");
        jpm_menu2.add(MostrarTab);

        AddTorneo.setText("Añadir torneo");
        AddTorneo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddTorneoActionPerformed(evt);
            }
        });
        jpm_menu3.add(AddTorneo);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jSp_team1.setModel(new javax.swing.SpinnerNumberModel(1, null, 8, 1));

        jSp_team2.setModel(new javax.swing.SpinnerNumberModel(1, null, 10, 1));

        jbtn_partido.setText("Registrar");
        jbtn_partido.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jbtn_partidoMouseClicked(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel2.setText("Simulación de partido");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jSp_team1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCB_team1, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 165, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jCB_team2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSp_team2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(108, 108, 108))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(187, 187, 187)
                        .addComponent(jbtn_partido, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(158, 158, 158)
                        .addComponent(jLabel2)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCB_team1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCB_team2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(69, 69, 69)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jSp_team1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSp_team2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(49, 49, 49)
                .addComponent(jbtn_partido, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47))
        );

        javax.swing.GroupLayout jD_simulacionLayout = new javax.swing.GroupLayout(jD_simulacion.getContentPane());
        jD_simulacion.getContentPane().setLayout(jD_simulacionLayout);
        jD_simulacionLayout.setHorizontalGroup(
            jD_simulacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jD_simulacionLayout.setVerticalGroup(
            jD_simulacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jListTeams.setBackground(new java.awt.Color(255, 255, 0));
        jListTeams.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jListTeams.setForeground(new java.awt.Color(0, 0, 0));
        jListTeams.setModel(new DefaultListModel());
        jScrollPane3.setViewportView(jListTeams);

        jbtn_salir.setText("Salir");
        jbtn_salir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jbtn_salirMouseClicked(evt);
            }
        });

        jLabelEtiqueta.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabelEtiqueta.setForeground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(488, 488, 488)
                        .addComponent(jbtn_salir, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 586, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelEtiqueta, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(53, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabelEtiqueta, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 336, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(jbtn_salir, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jD_ListarLayout = new javax.swing.GroupLayout(jD_Listar.getContentPane());
        jD_Listar.getContentPane().setLayout(jD_ListarLayout);
        jD_ListarLayout.setHorizontalGroup(
            jD_ListarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jD_ListarLayout.setVerticalGroup(
            jD_ListarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setForeground(new java.awt.Color(0, 0, 0));

        jTreeTorneo.setBackground(new java.awt.Color(255, 255, 0));
        jTreeTorneo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTreeTorneo.setForeground(new java.awt.Color(255, 255, 0));
        javax.swing.tree.DefaultMutableTreeNode treeNode1 = new javax.swing.tree.DefaultMutableTreeNode("Torneos");
        javax.swing.tree.DefaultMutableTreeNode treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("Q1");
        treeNode1.add(treeNode2);
        treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("Q2");
        treeNode1.add(treeNode2);
        treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("Q4");
        treeNode1.add(treeNode2);
        treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("Q5");
        treeNode1.add(treeNode2);
        jTreeTorneo.setModel(new javax.swing.tree.DefaultTreeModel(treeNode1));
        jTreeTorneo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTreeTorneoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTreeTorneo);

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Deportes UNITEC");

        jbtn_partidoSim.setText("Partida");
        jbtn_partidoSim.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jbtn_partidoSimMouseClicked(evt);
            }
        });

        jbtn_cargar.setText("Cargar");
        jbtn_cargar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jbtn_cargarMouseClicked(evt);
            }
        });
        jbtn_cargar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn_cargarActionPerformed(evt);
            }
        });

        jbtn_guardar.setText("Guardar");
        jbtn_guardar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jbtn_guardarMouseClicked(evt);
            }
        });

        jCB1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(105, 105, 105)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jbtn_cargar, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 77, Short.MAX_VALUE)
                                .addComponent(jbtn_guardar, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(70, 70, 70)
                                .addComponent(jbtn_partidoSim, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jCB1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(98, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(36, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 475, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addComponent(jCB1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jbtn_partidoSim, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbtn_cargar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbtn_guardar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(52, 52, 52))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTreeTorneoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTreeTorneoMouseClicked
        if (evt.isMetaDown()) {
            int row = jTreeTorneo.getClosestRowForLocation(evt.getX(), evt.getY());
            jTreeTorneo.setSelectionRow(row);
            Object v1 = jTreeTorneo.getSelectionPath().getLastPathComponent();
            nodo_seleccionado = (DefaultMutableTreeNode) v1;
            
            if (nodo_seleccionado.getUserObject().equals("Q1")){ 
            jpm_menu1.show(evt.getComponent(), evt.getX(), evt.getY());
            }if (nodo_seleccionado.getUserObject().equals("Q2")){ 
            jpm_menu1.show(evt.getComponent(), evt.getX(), evt.getY());
            }if (nodo_seleccionado.getUserObject().equals("Q4")){ 
            jpm_menu1.show(evt.getComponent(), evt.getX(), evt.getY());
            }if (nodo_seleccionado.getUserObject().equals("Q5")){ 
            jpm_menu1.show(evt.getComponent(), evt.getX(), evt.getY());
            }else if (nodo_seleccionado.getUserObject() instanceof Deporte) {
                jpm_menu3.show(evt.getComponent(), evt.getX(), evt.getY());
            } else if (nodo_seleccionado.getUserObject() instanceof Torneo){
                jpm_menu2.show(evt.getComponent(), evt.getX(), evt.getY());
            }      
        }
    }//GEN-LAST:event_jTreeTorneoMouseClicked

    private void AddDeporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddDeporteActionPerformed
        String name = JOptionPane.showInputDialog(jTreeTorneo, "Ingrese el deporte: ");
        
        Deporte d = new Deporte(name);
        listasD.add(d);
        
        DefaultTreeModel m = (DefaultTreeModel) jTreeTorneo.getModel();
        DefaultMutableTreeNode raiz  = (DefaultMutableTreeNode) m.getRoot();
        DefaultMutableTreeNode nodonuevo  = new DefaultMutableTreeNode (d);
        
        DefaultMutableTreeNode nodo1  = new DefaultMutableTreeNode (d);
        DefaultMutableTreeNode nodo2  = new DefaultMutableTreeNode (d);
        DefaultMutableTreeNode nodo3  = new DefaultMutableTreeNode (d);
        DefaultMutableTreeNode nodo4  = new DefaultMutableTreeNode (d);
        
        ((DefaultMutableTreeNode)raiz.getChildAt(0)).add(nodo1);
        ((DefaultMutableTreeNode)raiz.getChildAt(1)).add(nodo2);
        ((DefaultMutableTreeNode)raiz.getChildAt(2)).add(nodo3);
        ((DefaultMutableTreeNode)raiz.getChildAt(3)).add(nodo4);
        m.reload();
        
    }//GEN-LAST:event_AddDeporteActionPerformed

    private void AddTorneoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddTorneoActionPerformed
        String name = JOptionPane.showInputDialog(jTreeTorneo, "Ingrese el torneo: ");
        
        Torneo t = new Torneo(name,"Q#");
        listasT.add(t);
        ((Deporte) nodo_seleccionado.getUserObject()).getListaTroneos().add(t);
        DefaultTreeModel m = (DefaultTreeModel) jTreeTorneo.getModel();
        DefaultMutableTreeNode raiz  = (DefaultMutableTreeNode) m.getRoot();
        DefaultMutableTreeNode nodonuevo  = new DefaultMutableTreeNode (t);
        
        if(nodo_seleccionado!=null){
            m.insertNodeInto(nodonuevo, nodo_seleccionado, nodo_seleccionado.getChildCount());
        }
    }//GEN-LAST:event_AddTorneoActionPerformed

    private void AddEquipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddEquipoActionPerformed
        String name = JOptionPane.showInputDialog(jTreeTorneo, "Ingrese el equipo: ");
        Equipo e = new Equipo(name);
        listasE.add(e);
        jCB_team1.addItem(e.getNombre());
        jCB_team2.addItem(e.getNombre());
        DefaultTreeModel m = (DefaultTreeModel) jTreeTorneo.getModel();
        DefaultMutableTreeNode raiz  = (DefaultMutableTreeNode) m.getRoot();
        DefaultMutableTreeNode nodonuevo  = new DefaultMutableTreeNode (e);
        
        if(nodo_seleccionado!=null){
            m.insertNodeInto(nodonuevo, nodo_seleccionado, nodo_seleccionado.getChildCount());
        }
    }//GEN-LAST:event_AddEquipoActionPerformed

    private void jbtn_partidoSimMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtn_partidoSimMouseClicked
        if(!listasE.isEmpty()){
        jD_simulacion.setModal(true);
        jD_simulacion.pack();
        jD_simulacion.setLocationRelativeTo(this);
        jD_simulacion.setVisible(true);
        }
    }//GEN-LAST:event_jbtn_partidoSimMouseClicked

    private void jbtn_partidoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtn_partidoMouseClicked
        int goles1 = (int)jSp_team1.getValue();
        int goles2 = (int)jSp_team2.getValue();
        if (goles1>goles2){
            int index = jCB_team1.getSelectedIndex();
            listasE.get(index).setPuntos(+3);
        }else{
            int index = jCB_team2.getSelectedIndex();
            listasE.get(index).setPuntos(+3);
        }
        jD_simulacion.dispose();
    }//GEN-LAST:event_jbtn_partidoMouseClicked

    private void ListParticipActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ListParticipActionPerformed
        DefaultListModel m = (DefaultListModel) jListTeams.getModel();
        m.removeAllElements();
        
        for (Equipo e : ((Torneo) nodo_seleccionado.getUserObject()).getListaEquipos()) {
            m.addElement(e);
        }
        
        jD_Listar.pack();
        jD_Listar.setLocationRelativeTo(null);
        jD_Listar.setVisible(true);
    }//GEN-LAST:event_ListParticipActionPerformed

    private void jbtn_salirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtn_salirMouseClicked
        jD_Listar.dispose();
    }//GEN-LAST:event_jbtn_salirMouseClicked

    private void jbtn_cargarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtn_cargarMouseClicked
        JFileChooser jfc = new JFileChooser();
        int op = jfc.showSaveDialog(jbtn_cargar);
        if (op == JFileChooser.APPROVE_OPTION) {
            try {
                File f = jfc.getSelectedFile();
                if (f.exists()) {
                    String[] path = f.getPath().split("\\.");
                    if (path[path.length - 1].equals("dmp")) {
                        FileInputStream in = new FileInputStream(f);
                        ObjectInputStream input = new ObjectInputStream(in);
                        try {
                            Deporte dep = (Deporte) input.readObject();
                            listasD.add(dep);
                        } catch (EOFException ex) {

                        }
                        in.close();
                        input.close();

                    } else {
                        JOptionPane.showMessageDialog(this, "File Not Supported");
                    }

                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        actualizarCB();
    }//GEN-LAST:event_jbtn_cargarMouseClicked

    private void jbtn_guardarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtn_guardarMouseClicked
        JFileChooser jfc = new JFileChooser();
        int op = jfc.showSaveDialog(jbtn_guardar);
        if (op == JFileChooser.APPROVE_OPTION) {
            try {
                File f = jfc.getSelectedFile();
                if (!f.exists()) {
                    f = new File(f.getPath() + ".dmp");
                } 
                    String[] path = f.getPath().split("\\.");
                    if (path[path.length - 1].equals("dmp")) {
                        FileOutputStream out = new FileOutputStream(f, false);
                        ObjectOutputStream output = new ObjectOutputStream(out);
                        output.writeObject(((Deporte) jCB1.getSelectedItem()));
                        out.close();
                        output.close();
                    }else{
                        JOptionPane.showMessageDialog(jfc, "Archivo no valido");
                    }
                
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_jbtn_guardarMouseClicked

    private void jbtn_cargarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn_cargarActionPerformed
        
    }//GEN-LAST:event_jbtn_cargarActionPerformed

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
            java.util.logging.Logger.getLogger(MAINE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MAINE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MAINE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MAINE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MAINE().setVisible(true);
            }
        });
    }
    
    public void actualizarCB() {
        DefaultComboBoxModel m = (DefaultComboBoxModel) jCB1.getModel();
        m.removeAllElements();
        for (Deporte d : listasD) {
            m.addElement(d);
        }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem AddDeporte;
    private javax.swing.JMenuItem AddEquipo;
    private javax.swing.JMenuItem AddTorneo;
    private javax.swing.JMenuItem ListParticip;
    private javax.swing.JMenuItem MostrarTab;
    private javax.swing.JComboBox<String> jCB1;
    private javax.swing.JComboBox<String> jCB_team1;
    private javax.swing.JComboBox<String> jCB_team2;
    private javax.swing.JDialog jD_Listar;
    private javax.swing.JDialog jD_simulacion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabelEtiqueta;
    private javax.swing.JList<String> jListTeams;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSpinner jSp_team1;
    private javax.swing.JSpinner jSp_team2;
    private javax.swing.JTree jTreeTorneo;
    private javax.swing.JButton jbtn_cargar;
    private javax.swing.JButton jbtn_guardar;
    private javax.swing.JButton jbtn_partido;
    private javax.swing.JButton jbtn_partidoSim;
    private javax.swing.JButton jbtn_salir;
    private javax.swing.JPopupMenu jpm_menu1;
    private javax.swing.JPopupMenu jpm_menu2;
    private javax.swing.JPopupMenu jpm_menu3;
    // End of variables declaration//GEN-END:variables
    DefaultMutableTreeNode nodo_seleccionado;
}
