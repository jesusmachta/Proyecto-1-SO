/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Interfaces;

import Clases.Compañia;
import Clases.GraphManager;
import java.io.File;
import java.io.PrintWriter;
import javax.swing.JLabel;
import javax.swing.JOptionPane;


/**
 *
 * @author jesusmachta
 */
public class MainInterface extends javax.swing.JFrame {
    
    static Compañia apple;
    static Compañia dell;

    /**
     * Creates new form PruebaTabbed
     * @param apple
     * @param dell
     */
    public MainInterface(Compañia apple, Compañia dell, int[] cantidadesInicialesApple, int []cantidadesInicialesDell) {
        initComponents();
        
        this.apple = apple;
        this.dell = dell;
        
        JLabel[] qttSavedPartsLabelsApple = {qttyPlacasSavedApple, qttyCPUSavedApple, qttyRAMSavedApple, qttyFuentesSavedApple, qttyTGraficasSavedApple, qttyStandardComputadorasReadyApple, qttyTGComputadorasReadyApple, gananciasLabel};
        apple.getAlmacen().setLabels(qttSavedPartsLabelsApple);
        System.out.println("NO SE1");

        JLabel[] qttSavedPartsLabelsDell = {qttyPlacasSavedDell, qttyCPUSavedDell, qttyRAMSavedDell, qttyFuentesSavedDell, qttyTGraficasSavedDell, qttyStandardComputadorasReadyDell, qttyTGComputadorasReadyDell, gananciasLabelDell};
        dell.getAlmacen().setLabels(qttSavedPartsLabelsDell);
        System.out.println("NO SE2");
        
        JLabel[] projectmanagerLabelsApple = {pmStatus, costosLabel, utilidadesLabel, fechaTopeLabel, diasTotalesLabelApple, diasTotalesLabelApple};
        apple.getProjectManager().setLabels(projectmanagerLabelsApple);
        System.out.println("NO SE3");

        JLabel[] projectmanagerLabelsDell = {pmStatusDell, costosLabelDell, utilidadesLabelDell, fechaTopeLabelDell, diasTotalesLabelDell, daysPassedLabelGrafico};
        dell.getProjectManager().setLabels(projectmanagerLabelsDell);
        System.out.println("NO SE4");

        JLabel[] directorLabelsApple = {directorStatus, fechaTopeLabel, faultsLabel, discountedLabel};
        apple.getDirector().setLabels(directorLabelsApple);
        System.out.println("NO SE5");

        JLabel[] directorLabelsDell = {directorStatusDell, fechaTopeLabelDell, faultsLabelDell, discountedLabelDell};
        dell.getDirector().setLabels(directorLabelsDell);
        System.out.println("NO SE6");
        
        GraphManager grafico = new GraphManager(Grafico, apple, dell);
        System.out.println("NO SE7");
        apple.getProjectManager().setGrafico(grafico);
        dell.getProjectManager().setGrafico(grafico);
        System.out.println("NO SE8");

        apple.startEmpleados();
        System.out.println("NO SE9");
        dell.startEmpleados();
        System.out.println("NO SE10");

        this.qttyPlacasBaseApple.setText(String.valueOf(cantidadesInicialesApple[0]));
        System.out.println("NO SE11");
        this.qttyCPUApple.setText(String.valueOf(cantidadesInicialesApple[1]));
        System.out.println("NO SE12");
        this.qttyRAMApple.setText(String.valueOf(cantidadesInicialesApple[2]));
        System.out.println("NO SE13");
        this.qttyFuentesApple.setText(String.valueOf(cantidadesInicialesApple[3]));
        System.out.println("NO SE14");
        this.qttyTGraficaApple.setText(String.valueOf(cantidadesInicialesApple[4]));
        System.out.println("NO SE15");
        this.qttyEnsambladoresApple.setText(String.valueOf(cantidadesInicialesApple[5]));
        System.out.println("NO SE16");

        this.PlacasApple.setText(String.valueOf(cantidadesInicialesApple[0]));
        System.out.println("NO SE17");
        this.CPUApple.setText(String.valueOf(cantidadesInicialesApple[1]));
        System.out.println("NO SE18");
        this.RAMApple.setText(String.valueOf(cantidadesInicialesApple[2]));
        System.out.println("NO SE19");
        this.FuentesApple.setText(String.valueOf(cantidadesInicialesApple[3]));
        System.out.println("NO SE20");
        this.TGraficasApple.setText(String.valueOf(cantidadesInicialesApple[4]));
        System.out.println("NO SE21");
        this.EnsambladoresApple.setText(String.valueOf(cantidadesInicialesApple[5]));
        System.out.println("NO SE22");

        this.qttyPlacasDell.setText(String.valueOf(cantidadesInicialesDell[0]));
        
        this.qttyCPUDell.setText(String.valueOf(cantidadesInicialesDell[1]));
        System.out.println("NO SE23");
        this.qttyRAMDell.setText(String.valueOf(cantidadesInicialesDell[2]));
        System.out.println("NO SE24");
        this.qttyFuentesDell.setText(String.valueOf(cantidadesInicialesDell[3]));
        System.out.println("NO SE25");
        this.qttyTGraficasDell.setText(String.valueOf(cantidadesInicialesDell[4]));
        System.out.println("NO SE26");
        this.qttyEnsambladoresDell.setText(String.valueOf(cantidadesInicialesDell[5]));
        System.out.println("NO SE27");
        
        this.PlacasDell.setText(String.valueOf(cantidadesInicialesDell[0]));
        System.out.println("NO SE28");
        this.CPUDell.setText(String.valueOf(cantidadesInicialesDell[1]));
        System.out.println("NO SE29");
        this.RAMDell.setText(String.valueOf(cantidadesInicialesDell[2]));
        System.out.println("NO SE30");
        this.FuentesDell.setText(String.valueOf(cantidadesInicialesDell[3]));
        System.out.println("NO SE31");
        this.TGraficaDell.setText(String.valueOf(cantidadesInicialesDell[4]));
        System.out.println("NO SE32");
        this.EnsambladoresDell.setText(String.valueOf(cantidadesInicialesDell[5]));
        System.out.println("NO SE33");

        this.ammount.setText(Integer.toString(apple.getFechaTope()));
        System.out.println("NO SE34");
        this.dia.setText(Integer.toString(apple.getDiaDuracion()));
        System.out.println("NO SE35");
        this.fechaTopeLabel.setText(Integer.toString(apple.getFechaTope()));
        System.out.println("NO SE36");
        this.fechaTopeLabelDell.setText(Integer.toString(dell.getFechaTope()));
        System.out.println("NO SE37");
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
        ConfigurationDashboard = new javax.swing.JPanel();
        placasLabel1 = new javax.swing.JLabel();
        escenariosLabel1 = new javax.swing.JLabel();
        ramLabel1 = new javax.swing.JLabel();
        fuenteLabel1 = new javax.swing.JLabel();
        tGraficaLabel1 = new javax.swing.JLabel();
        ensambladorLabel1 = new javax.swing.JLabel();
        txt = new javax.swing.JButton();
        placasLabel2 = new javax.swing.JLabel();
        removeCPU2 = new javax.swing.JButton();
        cpuLabel2 = new javax.swing.JLabel();
        ramLabel2 = new javax.swing.JLabel();
        removeRAM2 = new javax.swing.JButton();
        fuenteLabel2 = new javax.swing.JLabel();
        removeFuente2 = new javax.swing.JButton();
        removeTGrafica2 = new javax.swing.JButton();
        TGraficaLabel2 = new javax.swing.JLabel();
        ensambladorLabel2 = new javax.swing.JLabel();
        removeEnsamblador2 = new javax.swing.JButton();
        jPanel9 = new javax.swing.JPanel();
        removeRAM1 = new javax.swing.JButton();
        removeEnsamblador1 = new javax.swing.JButton();
        removeFuente1 = new javax.swing.JButton();
        removePlacas2 = new javax.swing.JButton();
        removeCPU1 = new javax.swing.JButton();
        removeTGrafica1 = new javax.swing.JButton();
        CPUApple = new javax.swing.JLabel();
        RAMApple = new javax.swing.JLabel();
        FuentesApple = new javax.swing.JLabel();
        TGraficasApple = new javax.swing.JLabel();
        EnsambladoresApple = new javax.swing.JLabel();
        PlacasApple = new javax.swing.JLabel();
        addPlacas2 = new javax.swing.JButton();
        addCPU1 = new javax.swing.JButton();
        addRAM1 = new javax.swing.JButton();
        addFuente1 = new javax.swing.JButton();
        addTGrafica1 = new javax.swing.JButton();
        addEnsamblador1 = new javax.swing.JButton();
        jPanel10 = new javax.swing.JPanel();
        diaDuracion = new javax.swing.JLabel();
        removeDia = new javax.swing.JButton();
        dia = new javax.swing.JLabel();
        addDia = new javax.swing.JButton();
        fechaTope = new javax.swing.JLabel();
        removeAmmount = new javax.swing.JButton();
        addAmmount = new javax.swing.JButton();
        ammount = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        addEnsamblador2 = new javax.swing.JButton();
        addTGrafica2 = new javax.swing.JButton();
        addFuente2 = new javax.swing.JButton();
        addRAM2 = new javax.swing.JButton();
        addCPU2 = new javax.swing.JButton();
        addPlaca3 = new javax.swing.JButton();
        removePlaca3 = new javax.swing.JButton();
        PlacasDell = new javax.swing.JLabel();
        CPUDell = new javax.swing.JLabel();
        RAMDell = new javax.swing.JLabel();
        FuentesDell = new javax.swing.JLabel();
        TGraficaDell = new javax.swing.JLabel();
        EnsambladoresDell = new javax.swing.JLabel();
        jPanel19 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel27 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel28 = new javax.swing.JLabel();
        AppleDash = new javax.swing.JPanel();
        jLabel25 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        faultsLabelText = new javax.swing.JLabel();
        faultsLabel = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        qttyProjectsManagersApple = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        qttyDirectoresApple = new javax.swing.JLabel();
        pmStatusLabel = new javax.swing.JLabel();
        pmStatus = new javax.swing.JLabel();
        directorStatusLabel = new javax.swing.JLabel();
        directorStatus = new javax.swing.JLabel();
        ensambladorLabel = new javax.swing.JLabel();
        placasLabel = new javax.swing.JLabel();
        cpuLabel = new javax.swing.JLabel();
        RAMLabel = new javax.swing.JLabel();
        fuenteLabel = new javax.swing.JLabel();
        TGraficaLabel = new javax.swing.JLabel();
        removeEnsamblador = new javax.swing.JButton();
        removeTGrafica = new javax.swing.JButton();
        removeFuente = new javax.swing.JButton();
        removeRAM = new javax.swing.JButton();
        removeCPU = new javax.swing.JButton();
        removePlaca = new javax.swing.JButton();
        qttyPlacasBaseApple = new javax.swing.JLabel();
        addPlaca = new javax.swing.JButton();
        addCPU = new javax.swing.JButton();
        qttyCPUApple = new javax.swing.JLabel();
        qttyRAMApple = new javax.swing.JLabel();
        qttyFuentesApple = new javax.swing.JLabel();
        qttyTGraficaApple = new javax.swing.JLabel();
        qttyEnsambladoresApple = new javax.swing.JLabel();
        addEnsamblador = new javax.swing.JButton();
        addTGrafica = new javax.swing.JButton();
        addFuente = new javax.swing.JButton();
        addRAM = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        computadorasReadyLabel = new javax.swing.JLabel();
        qttyStandardComputadorasReadyApple = new javax.swing.JLabel();
        qttyTGComputadorasReadyApple = new javax.swing.JLabel();
        computadorasTGReadyLabel = new javax.swing.JLabel();
        qttyPlacasSavedApple = new javax.swing.JLabel();
        qttyFuentesSavedApple = new javax.swing.JLabel();
        PlacasSavedLabel = new javax.swing.JLabel();
        fuentesSavedLabel3 = new javax.swing.JLabel();
        PlacasMaxLabel = new javax.swing.JLabel();
        qttyPlacasMaxApple = new javax.swing.JLabel();
        CPUSavedLabel = new javax.swing.JLabel();
        qttyCPUSavedApple = new javax.swing.JLabel();
        CPUMaxLabel = new javax.swing.JLabel();
        qttyCPUMaxApple = new javax.swing.JLabel();
        RAMSavedLabel = new javax.swing.JLabel();
        qttyRAMSavedApple = new javax.swing.JLabel();
        RAMMaxLabel2 = new javax.swing.JLabel();
        qttyRAMMaxApple = new javax.swing.JLabel();
        fuentesMaxLabel3 = new javax.swing.JLabel();
        qttyFuentesMaxApple = new javax.swing.JLabel();
        TGraficasMaxLabel4 = new javax.swing.JLabel();
        qttyTGraficasMaxApple = new javax.swing.JLabel();
        TGraficasSavedLabel4 = new javax.swing.JLabel();
        qttyTGraficasSavedApple = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        discountedLabelText = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        fechaTopeLabelText = new javax.swing.JLabel();
        costosLabelText1 = new javax.swing.JLabel();
        costosLabelText = new javax.swing.JLabel();
        gananciaLabelText = new javax.swing.JLabel();
        gananciasLabel = new javax.swing.JLabel();
        costosLabel = new javax.swing.JLabel();
        utilidadesLabel = new javax.swing.JLabel();
        fechaTopeLabel = new javax.swing.JLabel();
        diasTotalesLabelApple = new javax.swing.JLabel();
        discountedLabel = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        DellDash = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        jPanel17 = new javax.swing.JPanel();
        gananciaLabelText1 = new javax.swing.JLabel();
        costosLabelText2 = new javax.swing.JLabel();
        costosLabelText3 = new javax.swing.JLabel();
        gananciasLabelDell = new javax.swing.JLabel();
        costosLabelDell = new javax.swing.JLabel();
        utilidadesLabelDell = new javax.swing.JLabel();
        fechaTopeLabelText1 = new javax.swing.JLabel();
        fechaTopeLabelDell = new javax.swing.JLabel();
        discountedLabelText1 = new javax.swing.JLabel();
        discountedLabelDell = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        diasTotalesLabelDell = new javax.swing.JLabel();
        jPanel18 = new javax.swing.JPanel();
        jLabel23 = new javax.swing.JLabel();
        jPanel15 = new javax.swing.JPanel();
        qttyTGraficasMaxApple1 = new javax.swing.JLabel();
        computadorasTGReadyLabel1 = new javax.swing.JLabel();
        computadorasReadyLabel1 = new javax.swing.JLabel();
        qttyStandardComputadorasReadyDell = new javax.swing.JLabel();
        qttyTGComputadorasReadyDell = new javax.swing.JLabel();
        PlacasSavedLabelDell = new javax.swing.JLabel();
        qttyPlacasSavedDell = new javax.swing.JLabel();
        PlacasMaxLabelDell = new javax.swing.JLabel();
        qttyPlacasMaxApple1 = new javax.swing.JLabel();
        CPUSavedLabelDell = new javax.swing.JLabel();
        qttyCPUSavedDell = new javax.swing.JLabel();
        CPUMaxLabelDell = new javax.swing.JLabel();
        qttyCPUMaxApple1 = new javax.swing.JLabel();
        RAMSavedLabelDell = new javax.swing.JLabel();
        qttyRAMSavedDell = new javax.swing.JLabel();
        RAMMaxLabelDell = new javax.swing.JLabel();
        qttyRAMMaxApple1 = new javax.swing.JLabel();
        fuentesSavedLabelDell = new javax.swing.JLabel();
        qttyFuentesSavedDell = new javax.swing.JLabel();
        fuentesMaxLabelDell = new javax.swing.JLabel();
        qttyFuentesMaxApple1 = new javax.swing.JLabel();
        TGraficasSavedLabelDell = new javax.swing.JLabel();
        qttyTGraficasSavedDell = new javax.swing.JLabel();
        TGraficasMaxLabelDell = new javax.swing.JLabel();
        jPanel16 = new javax.swing.JPanel();
        jLabel22 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jPanel13 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        qttyProjectsManagersApple1 = new javax.swing.JLabel();
        pmStatusLabelDelll = new javax.swing.JLabel();
        directorStatusLabelDell = new javax.swing.JLabel();
        qttyDirectoresApple1 = new javax.swing.JLabel();
        pmStatusDell = new javax.swing.JLabel();
        directorStatusDell = new javax.swing.JLabel();
        faultsLabelText1 = new javax.swing.JLabel();
        faultsLabelDell = new javax.swing.JLabel();
        placasLabelDell = new javax.swing.JLabel();
        cpuLabelDell = new javax.swing.JLabel();
        RAMLabelDell = new javax.swing.JLabel();
        fuenteLabelDell = new javax.swing.JLabel();
        TGraficaLabelDell = new javax.swing.JLabel();
        ensambladorLabelDell = new javax.swing.JLabel();
        qttyPlacasDell = new javax.swing.JLabel();
        qttyCPUDell = new javax.swing.JLabel();
        qttyRAMDell = new javax.swing.JLabel();
        qttyFuentesDell = new javax.swing.JLabel();
        qttyTGraficasDell = new javax.swing.JLabel();
        qttyEnsambladoresDell = new javax.swing.JLabel();
        removePlacasDell = new javax.swing.JButton();
        addPlacaDell = new javax.swing.JButton();
        removeCPUDell = new javax.swing.JButton();
        addCPUDell = new javax.swing.JButton();
        removeRAMDell = new javax.swing.JButton();
        addRAMDell = new javax.swing.JButton();
        removeFuenteDell = new javax.swing.JButton();
        addFuenteDell = new javax.swing.JButton();
        removeTGraficaDell = new javax.swing.JButton();
        addTGraficaDell = new javax.swing.JButton();
        removeEnsambladorDell = new javax.swing.JButton();
        addEnsambladorDell = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jPanel14 = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        AppleVSDell = new javax.swing.JPanel();
        Grafico = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        daysPassedLabelGrafico = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        ConfigurationDashboard.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        placasLabel1.setForeground(new java.awt.Color(204, 204, 204));
        placasLabel1.setText("Placas Base");
        ConfigurationDashboard.add(placasLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, -1, -1));

        escenariosLabel1.setForeground(new java.awt.Color(204, 204, 204));
        escenariosLabel1.setText("CPU's");
        ConfigurationDashboard.add(escenariosLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, -1, -1));

        ramLabel1.setForeground(new java.awt.Color(204, 204, 204));
        ramLabel1.setText("Memoria RAM");
        ConfigurationDashboard.add(ramLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, -1, -1));

        fuenteLabel1.setForeground(new java.awt.Color(204, 204, 204));
        fuenteLabel1.setText("F. Alimentación");
        ConfigurationDashboard.add(fuenteLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, -1, -1));

        tGraficaLabel1.setForeground(new java.awt.Color(204, 204, 204));
        tGraficaLabel1.setText("T. Graficas");
        ConfigurationDashboard.add(tGraficaLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 370, -1, -1));

        ensambladorLabel1.setForeground(new java.awt.Color(204, 204, 204));
        ensambladorLabel1.setText("Ensambladores:");
        ConfigurationDashboard.add(ensambladorLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 420, -1, -1));

        txt.setBackground(new java.awt.Color(51, 51, 51));
        txt.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        txt.setForeground(new java.awt.Color(204, 204, 204));
        txt.setText("Guardar");
        txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtActionPerformed(evt);
            }
        });
        ConfigurationDashboard.add(txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 460, -1, -1));

        placasLabel2.setForeground(new java.awt.Color(204, 204, 204));
        placasLabel2.setText("Placas Base");
        ConfigurationDashboard.add(placasLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 170, -1, -1));

        removeCPU2.setText("-");
        removeCPU2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeCPU2ActionPerformed(evt);
            }
        });
        ConfigurationDashboard.add(removeCPU2, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 210, -1, -1));

        cpuLabel2.setForeground(new java.awt.Color(204, 204, 204));
        cpuLabel2.setText("CPU's");
        ConfigurationDashboard.add(cpuLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 220, -1, -1));

        ramLabel2.setForeground(new java.awt.Color(204, 204, 204));
        ramLabel2.setText("Memoria RAM");
        ConfigurationDashboard.add(ramLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 270, -1, -1));

        removeRAM2.setText("-");
        removeRAM2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeRAM2ActionPerformed(evt);
            }
        });
        ConfigurationDashboard.add(removeRAM2, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 260, -1, -1));

        fuenteLabel2.setForeground(new java.awt.Color(204, 204, 204));
        fuenteLabel2.setText("F. Alimentación");
        ConfigurationDashboard.add(fuenteLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 320, -1, -1));

        removeFuente2.setText("-");
        removeFuente2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeFuente2ActionPerformed(evt);
            }
        });
        ConfigurationDashboard.add(removeFuente2, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 310, -1, -1));

        removeTGrafica2.setText("-");
        removeTGrafica2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeTGrafica2ActionPerformed(evt);
            }
        });
        ConfigurationDashboard.add(removeTGrafica2, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 360, -1, -1));

        TGraficaLabel2.setForeground(new java.awt.Color(204, 204, 204));
        TGraficaLabel2.setText("T. Graficas");
        ConfigurationDashboard.add(TGraficaLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 370, -1, -1));

        ensambladorLabel2.setForeground(new java.awt.Color(204, 204, 204));
        ensambladorLabel2.setText("Ensambladores:");
        ConfigurationDashboard.add(ensambladorLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 410, -1, -1));

        removeEnsamblador2.setText("-");
        removeEnsamblador2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeEnsamblador2ActionPerformed(evt);
            }
        });
        ConfigurationDashboard.add(removeEnsamblador2, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 410, -1, -1));

        jPanel9.setBackground(new java.awt.Color(51, 51, 51));

        removeRAM1.setText("-");
        removeRAM1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeRAM1ActionPerformed(evt);
            }
        });

        removeEnsamblador1.setText("-");
        removeEnsamblador1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeEnsamblador1ActionPerformed(evt);
            }
        });

        removeFuente1.setText("-");
        removeFuente1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeFuente1ActionPerformed(evt);
            }
        });

        removePlacas2.setText("-");
        removePlacas2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removePlacas2ActionPerformed(evt);
            }
        });

        removeCPU1.setText("-");
        removeCPU1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeCPU1ActionPerformed(evt);
            }
        });

        removeTGrafica1.setText("-");
        removeTGrafica1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeTGrafica1ActionPerformed(evt);
            }
        });

        CPUApple.setForeground(new java.awt.Color(255, 255, 255));
        CPUApple.setText("0");

        RAMApple.setForeground(new java.awt.Color(255, 255, 255));
        RAMApple.setText("0");

        FuentesApple.setForeground(new java.awt.Color(255, 255, 255));
        FuentesApple.setText("0");

        TGraficasApple.setForeground(new java.awt.Color(255, 255, 255));
        TGraficasApple.setText("0");

        EnsambladoresApple.setForeground(new java.awt.Color(255, 255, 255));
        EnsambladoresApple.setText("0");

        PlacasApple.setForeground(new java.awt.Color(255, 255, 255));
        PlacasApple.setText("0");

        addPlacas2.setText("+");
        addPlacas2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addPlacas2ActionPerformed(evt);
            }
        });

        addCPU1.setText("+");
        addCPU1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addCPU1ActionPerformed(evt);
            }
        });

        addRAM1.setText("+");
        addRAM1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addRAM1ActionPerformed(evt);
            }
        });

        addFuente1.setText("+");
        addFuente1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addFuente1ActionPerformed(evt);
            }
        });

        addTGrafica1.setText("+");
        addTGrafica1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addTGrafica1ActionPerformed(evt);
            }
        });

        addEnsamblador1.setText("+");
        addEnsamblador1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addEnsamblador1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(140, 140, 140)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(removePlacas2)
                    .addComponent(removeCPU1)
                    .addComponent(removeRAM1)
                    .addComponent(removeFuente1)
                    .addComponent(removeTGrafica1)
                    .addComponent(removeEnsamblador1))
                .addGap(18, 18, 18)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(PlacasApple)
                    .addComponent(CPUApple)
                    .addComponent(RAMApple)
                    .addComponent(FuentesApple)
                    .addComponent(TGraficasApple)
                    .addComponent(EnsambladoresApple))
                .addGap(29, 29, 29)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(addPlacas2)
                    .addComponent(addCPU1)
                    .addComponent(addRAM1)
                    .addComponent(addFuente1)
                    .addComponent(addTGrafica1)
                    .addComponent(addEnsamblador1))
                .addContainerGap(110, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                        .addComponent(removePlacas2)
                        .addGap(27, 27, 27))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(PlacasApple)
                            .addComponent(addPlacas2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(removeCPU1)
                    .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(CPUApple)
                        .addComponent(addCPU1)))
                .addGap(24, 24, 24)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(removeRAM1)
                    .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(RAMApple)
                        .addComponent(addRAM1)))
                .addGap(24, 24, 24)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(removeFuente1)
                    .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(FuentesApple)
                        .addComponent(addFuente1)))
                .addGap(24, 24, 24)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(removeTGrafica1)
                    .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(TGraficasApple)
                        .addComponent(addTGrafica1)))
                .addGap(24, 24, 24)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(EnsambladoresApple)
                        .addComponent(addEnsamblador1))
                    .addComponent(removeEnsamblador1))
                .addContainerGap(77, Short.MAX_VALUE))
        );

        ConfigurationDashboard.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 350, 360));

        jPanel10.setBackground(new java.awt.Color(51, 51, 51));

        diaDuracion.setForeground(new java.awt.Color(204, 204, 204));
        diaDuracion.setText("Duracion de un dia");

        removeDia.setText("-");
        removeDia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeDiaActionPerformed(evt);
            }
        });

        dia.setForeground(new java.awt.Color(255, 255, 255));
        dia.setText("0");

        addDia.setText("+");
        addDia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addDiaActionPerformed(evt);
            }
        });

        fechaTope.setForeground(new java.awt.Color(204, 204, 204));
        fechaTope.setText("Fecha Tope");

        removeAmmount.setText("-");
        removeAmmount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeAmmountActionPerformed(evt);
            }
        });

        addAmmount.setText("+");
        addAmmount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addAmmountActionPerformed(evt);
            }
        });

        ammount.setForeground(new java.awt.Color(255, 255, 255));
        ammount.setText("0");

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addComponent(removeDia)
                        .addGap(50, 50, 50)
                        .addComponent(dia)
                        .addGap(45, 45, 45)
                        .addComponent(addDia))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addComponent(removeAmmount)
                        .addGap(51, 51, 51)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel10Layout.createSequentialGroup()
                                .addComponent(fechaTope)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel10Layout.createSequentialGroup()
                                .addComponent(ammount)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(addAmmount)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addComponent(diaDuracion)
                .addContainerGap(114, Short.MAX_VALUE))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(diaDuracion)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(removeDia)
                    .addComponent(dia)
                    .addComponent(addDia))
                .addGap(18, 18, 18)
                .addComponent(fechaTope)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(removeAmmount)
                    .addComponent(addAmmount)
                    .addComponent(ammount))
                .addGap(14, 14, 14))
        );

        ConfigurationDashboard.add(jPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 240, 290, 130));

        jPanel11.setBackground(new java.awt.Color(51, 51, 51));

        addEnsamblador2.setText("+");
        addEnsamblador2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addEnsamblador2ActionPerformed(evt);
            }
        });

        addTGrafica2.setText("+");
        addTGrafica2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addTGrafica2ActionPerformed(evt);
            }
        });

        addFuente2.setText("+");
        addFuente2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addFuente2ActionPerformed(evt);
            }
        });

        addRAM2.setText("+");
        addRAM2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addRAM2ActionPerformed(evt);
            }
        });

        addCPU2.setText("+");
        addCPU2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addCPU2ActionPerformed(evt);
            }
        });

        addPlaca3.setText("+");
        addPlaca3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addPlaca3ActionPerformed(evt);
            }
        });

        removePlaca3.setText("-");
        removePlaca3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removePlaca3ActionPerformed(evt);
            }
        });

        PlacasDell.setForeground(new java.awt.Color(255, 255, 255));
        PlacasDell.setText("0");

        CPUDell.setForeground(new java.awt.Color(255, 255, 255));
        CPUDell.setText("0");

        RAMDell.setForeground(new java.awt.Color(255, 255, 255));
        RAMDell.setText("0");

        FuentesDell.setForeground(new java.awt.Color(255, 255, 255));
        FuentesDell.setText("0");

        TGraficaDell.setForeground(new java.awt.Color(255, 255, 255));
        TGraficaDell.setText("0");

        EnsambladoresDell.setForeground(new java.awt.Color(255, 255, 255));
        EnsambladoresDell.setText("0");

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                .addGap(169, 169, 169)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addComponent(removePlaca3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(50, 50, 50)
                        .addComponent(PlacasDell))
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(EnsambladoresDell)
                            .addComponent(TGraficaDell)
                            .addComponent(FuentesDell)
                            .addComponent(RAMDell)
                            .addComponent(CPUDell))))
                .addGap(44, 44, 44)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(addPlaca3, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(addCPU2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(addRAM2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(addFuente2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(addTGrafica2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(addEnsamblador2, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(144, 144, 144))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(addPlaca3)
                            .addComponent(removePlaca3))
                        .addGap(18, 18, 18))
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(PlacasDell)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addCPU2)
                    .addComponent(CPUDell))
                .addGap(27, 27, 27)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addRAM2)
                    .addComponent(RAMDell))
                .addGap(26, 26, 26)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addFuente2)
                    .addComponent(FuentesDell))
                .addGap(31, 31, 31)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addTGrafica2)
                    .addComponent(TGraficaDell))
                .addGap(29, 29, 29)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addEnsamblador2)
                    .addComponent(EnsambladoresDell))
                .addGap(107, 107, 107))
        );

        ConfigurationDashboard.add(jPanel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 140, 470, 340));

        jPanel19.setBackground(new java.awt.Color(51, 51, 51));

        jLabel18.setBackground(new java.awt.Color(0, 0, 0));
        jLabel18.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(204, 204, 204));
        jLabel18.setText("Apple vs Dell");

        javax.swing.GroupLayout jPanel19Layout = new javax.swing.GroupLayout(jPanel19);
        jPanel19.setLayout(jPanel19Layout);
        jPanel19Layout.setHorizontalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel19Layout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addComponent(jLabel18)
                .addContainerGap(69, Short.MAX_VALUE))
        );
        jPanel19Layout.setVerticalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel19Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel18)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        ConfigurationDashboard.add(jPanel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 30, 340, 60));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Configuracion.png"))); // NOI18N
        jLabel2.setText("jLabel2");
        ConfigurationDashboard.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1300, 600));

        jLabel17.setText("jLabel17");
        ConfigurationDashboard.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jLabel26.setText("jLabel26");
        ConfigurationDashboard.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jButton1.setText("jButton1");
        ConfigurationDashboard.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jLabel27.setText("jLabel27");
        ConfigurationDashboard.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        ConfigurationDashboard.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jLabel28.setText("jLabel28");
        ConfigurationDashboard.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 170, 90));

        jTabbedPane1.addTab("Dashboard", ConfigurationDashboard);

        AppleDash.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel25.setToolTipText("");
        AppleDash.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 490, -1, -1));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        faultsLabelText.setText("Faltas del Project Manager:");
        jPanel1.add(faultsLabelText, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 510, -1, -1));

        faultsLabel.setText("0");
        jPanel1.add(faultsLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 510, -1, -1));

        jLabel3.setText("Projects Managers:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 400, -1, -1));

        qttyProjectsManagersApple.setText("1");
        jPanel1.add(qttyProjectsManagersApple, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 400, -1, -1));

        jLabel4.setText("Directores Ejecutivos:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 400, -1, -1));

        qttyDirectoresApple.setText("1");
        jPanel1.add(qttyDirectoresApple, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 400, -1, -1));

        pmStatusLabel.setText("Project Manager Status:");
        jPanel1.add(pmStatusLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 440, -1, -1));

        pmStatus.setText("...");
        jPanel1.add(pmStatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 440, -1, -1));

        directorStatusLabel.setText("Director Status:");
        jPanel1.add(directorStatusLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 480, -1, -1));

        directorStatus.setText("...");
        jPanel1.add(directorStatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 480, -1, -1));

        ensambladorLabel.setText("Ensambladores:");
        jPanel1.add(ensambladorLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 330, -1, -1));

        placasLabel.setText("Placas Base");
        jPanel1.add(placasLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, -1, -1));

        cpuLabel.setText("CPU's");
        jPanel1.add(cpuLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, -1, -1));

        RAMLabel.setText("Memoria RAM");
        jPanel1.add(RAMLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, -1, -1));

        fuenteLabel.setText("F. Alimentación");
        jPanel1.add(fuenteLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, -1, -1));

        TGraficaLabel.setText("T. Grafica");
        jPanel1.add(TGraficaLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 280, -1, -1));

        removeEnsamblador.setText("-");
        removeEnsamblador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeEnsambladorActionPerformed(evt);
            }
        });
        jPanel1.add(removeEnsamblador, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 330, -1, -1));

        removeTGrafica.setText("-");
        removeTGrafica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeTGraficaActionPerformed(evt);
            }
        });
        jPanel1.add(removeTGrafica, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 280, -1, -1));

        removeFuente.setText("-");
        removeFuente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeFuenteActionPerformed(evt);
            }
        });
        jPanel1.add(removeFuente, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 230, -1, -1));

        removeRAM.setText("-");
        removeRAM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeRAMActionPerformed(evt);
            }
        });
        jPanel1.add(removeRAM, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 180, -1, -1));

        removeCPU.setText("-");
        removeCPU.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeCPUActionPerformed(evt);
            }
        });
        jPanel1.add(removeCPU, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 130, -1, -1));

        removePlaca.setText("-");
        removePlaca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removePlacaActionPerformed(evt);
            }
        });
        jPanel1.add(removePlaca, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 80, -1, -1));

        qttyPlacasBaseApple.setText("0");
        jPanel1.add(qttyPlacasBaseApple, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 80, -1, -1));

        addPlaca.setText("+");
        addPlaca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addPlacaActionPerformed(evt);
            }
        });
        jPanel1.add(addPlaca, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 80, -1, -1));

        addCPU.setText("+");
        addCPU.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addCPUActionPerformed(evt);
            }
        });
        jPanel1.add(addCPU, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 120, -1, -1));

        qttyCPUApple.setText("0");
        jPanel1.add(qttyCPUApple, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 130, -1, -1));

        qttyRAMApple.setText("0");
        jPanel1.add(qttyRAMApple, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 180, -1, -1));

        qttyFuentesApple.setText("0");
        jPanel1.add(qttyFuentesApple, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 230, -1, -1));

        qttyTGraficaApple.setText("0");
        jPanel1.add(qttyTGraficaApple, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 280, -1, -1));

        qttyEnsambladoresApple.setText("0");
        jPanel1.add(qttyEnsambladoresApple, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 330, -1, -1));

        addEnsamblador.setText("+");
        addEnsamblador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addEnsambladorActionPerformed(evt);
            }
        });
        jPanel1.add(addEnsamblador, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 330, -1, -1));

        addTGrafica.setText("+");
        addTGrafica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addTGraficaActionPerformed(evt);
            }
        });
        jPanel1.add(addTGrafica, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 280, -1, -1));

        addFuente.setText("+");
        addFuente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addFuenteActionPerformed(evt);
            }
        });
        jPanel1.add(addFuente, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 230, -1, -1));

        addRAM.setText("+");
        addRAM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addRAMActionPerformed(evt);
            }
        });
        jPanel1.add(addRAM, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 180, -1, -1));

        jPanel5.setBackground(new java.awt.Color(232, 114, 0));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 330, -1));

        jPanel7.setBackground(new java.awt.Color(19, 139, 30));

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, -1, -1));

        jPanel8.setBackground(new java.awt.Color(0, 0, 0));

        jLabel14.setBackground(new java.awt.Color(255, 255, 255));
        jLabel14.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("TRABAJADORES");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addContainerGap(90, Short.MAX_VALUE)
                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(81, 81, 81))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel14)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 380, 50));

        AppleDash.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 380, 540));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBackground(new java.awt.Color(0, 0, 0));

        jLabel13.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("ALMACEN");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(116, Short.MAX_VALUE)
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(78, 78, 78))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel13)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        jPanel2.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 330, 50));

        computadorasReadyLabel.setText("Computadoras Standar Listas");
        jPanel2.add(computadorasReadyLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, -1, -1));

        qttyStandardComputadorasReadyApple.setText("0");
        jPanel2.add(qttyStandardComputadorasReadyApple, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 260, -1, -1));

        qttyTGComputadorasReadyApple.setText("0");
        jPanel2.add(qttyTGComputadorasReadyApple, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 300, 10, -1));

        computadorasTGReadyLabel.setText("Computadoras TG Listas");
        jPanel2.add(computadorasTGReadyLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 300, -1, -1));

        qttyPlacasSavedApple.setText("0");
        jPanel2.add(qttyPlacasSavedApple, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 60, -1, -1));

        qttyFuentesSavedApple.setText("0");
        jPanel2.add(qttyFuentesSavedApple, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 170, -1, -1));

        PlacasSavedLabel.setText("Placas en el almacen");
        jPanel2.add(PlacasSavedLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, -1, -1));

        fuentesSavedLabel3.setText("Fuentes en el almacen");
        jPanel2.add(fuentesSavedLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, -1, -1));

        PlacasMaxLabel.setText("Capacidad Máx:");
        jPanel2.add(PlacasMaxLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 60, -1, -1));

        qttyPlacasMaxApple.setText("25");
        jPanel2.add(qttyPlacasMaxApple, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 60, -1, -1));

        CPUSavedLabel.setText("CPU en el almacen");
        jPanel2.add(CPUSavedLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, -1, -1));

        qttyCPUSavedApple.setText("0");
        jPanel2.add(qttyCPUSavedApple, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 90, -1, -1));

        CPUMaxLabel.setText("Capacidad Máx:");
        jPanel2.add(CPUMaxLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 90, -1, -1));

        qttyCPUMaxApple.setText("20");
        jPanel2.add(qttyCPUMaxApple, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 90, -1, -1));

        RAMSavedLabel.setText("RAM en el almacen");
        jPanel2.add(RAMSavedLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, -1, -1));

        qttyRAMSavedApple.setText("0");
        jPanel2.add(qttyRAMSavedApple, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 120, -1, -1));

        RAMMaxLabel2.setText("Capacidad Máx:");
        jPanel2.add(RAMMaxLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 120, -1, -1));

        qttyRAMMaxApple.setText("55");
        jPanel2.add(qttyRAMMaxApple, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 120, -1, -1));

        fuentesMaxLabel3.setText("Capacidad Máx:");
        jPanel2.add(fuentesMaxLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 170, -1, -1));

        qttyFuentesMaxApple.setText("35");
        jPanel2.add(qttyFuentesMaxApple, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 170, -1, -1));

        TGraficasMaxLabel4.setText("Capacidad Máx:");
        jPanel2.add(TGraficasMaxLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 210, -1, -1));

        qttyTGraficasMaxApple.setText("10");
        jPanel2.add(qttyTGraficasMaxApple, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 210, -1, -1));

        TGraficasSavedLabel4.setText("TG en el almacen");
        jPanel2.add(TGraficasSavedLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, -1, -1));

        qttyTGraficasSavedApple.setText("0");
        jPanel2.add(qttyTGraficasSavedApple, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 210, -1, -1));

        AppleDash.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 30, 330, 400));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        discountedLabelText.setText("Dinero Descontado al PM:");
        jPanel3.add(discountedLabelText, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, -1, -1));

        jLabel1.setText("Dias totales transcurridos:");
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, -1, -1));

        fechaTopeLabelText.setText("Fecha Tope");
        jPanel3.add(fechaTopeLabelText, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, -1, -1));

        costosLabelText1.setText("Utilidad Total:");
        jPanel3.add(costosLabelText1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, -1, -1));

        costosLabelText.setText("Costos Totales:");
        jPanel3.add(costosLabelText, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, -1, -1));

        gananciaLabelText.setText("Ganancias Totales:");
        jPanel3.add(gananciaLabelText, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, -1, -1));

        gananciasLabel.setText("0");
        jPanel3.add(gananciasLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 70, -1, -1));

        costosLabel.setText("0");
        jPanel3.add(costosLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 100, -1, -1));

        utilidadesLabel.setText("0");
        jPanel3.add(utilidadesLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 130, -1, -1));

        fechaTopeLabel.setText("0");
        jPanel3.add(fechaTopeLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 170, -1, -1));

        diasTotalesLabelApple.setText("0");
        jPanel3.add(diasTotalesLabelApple, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 220, -1, -1));

        discountedLabel.setText("0");
        jPanel3.add(discountedLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 270, -1, -1));

        jPanel6.setBackground(new java.awt.Color(0, 0, 0));

        jLabel15.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("ESTADISTICAS");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(36, Short.MAX_VALUE)
                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel15)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        jPanel3.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 260, -1));

        AppleDash.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 30, 260, 300));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Fondo Apple.png"))); // NOI18N
        jLabel10.setText("jLabel10");
        AppleDash.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -50, 1190, 740));

        jTabbedPane1.addTab("Apple", AppleDash);

        DellDash.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        DellDash.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, -50, -1, -1));

        jPanel17.setBackground(new java.awt.Color(0, 51, 153));
        jPanel17.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        gananciaLabelText1.setBackground(new java.awt.Color(255, 255, 255));
        gananciaLabelText1.setForeground(new java.awt.Color(255, 255, 255));
        gananciaLabelText1.setText("Ganancias Totales:");
        jPanel17.add(gananciaLabelText1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, -1, -1));

        costosLabelText2.setBackground(new java.awt.Color(255, 255, 255));
        costosLabelText2.setForeground(new java.awt.Color(255, 255, 255));
        costosLabelText2.setText("Costos Totales:");
        jPanel17.add(costosLabelText2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, -1, -1));

        costosLabelText3.setBackground(new java.awt.Color(255, 255, 255));
        costosLabelText3.setForeground(new java.awt.Color(255, 255, 255));
        costosLabelText3.setText("Utilidad Total:");
        jPanel17.add(costosLabelText3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, -1, -1));

        gananciasLabelDell.setBackground(new java.awt.Color(255, 255, 255));
        gananciasLabelDell.setForeground(new java.awt.Color(255, 255, 255));
        gananciasLabelDell.setText("0");
        jPanel17.add(gananciasLabelDell, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 80, -1, -1));

        costosLabelDell.setBackground(new java.awt.Color(255, 255, 255));
        costosLabelDell.setForeground(new java.awt.Color(255, 255, 255));
        costosLabelDell.setText("0");
        jPanel17.add(costosLabelDell, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 110, -1, -1));

        utilidadesLabelDell.setBackground(new java.awt.Color(255, 255, 255));
        utilidadesLabelDell.setForeground(new java.awt.Color(255, 255, 255));
        utilidadesLabelDell.setText("0");
        jPanel17.add(utilidadesLabelDell, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 150, -1, -1));

        fechaTopeLabelText1.setBackground(new java.awt.Color(255, 255, 255));
        fechaTopeLabelText1.setForeground(new java.awt.Color(255, 255, 255));
        fechaTopeLabelText1.setText("Fecha Tope");
        jPanel17.add(fechaTopeLabelText1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, -1, -1));

        fechaTopeLabelDell.setBackground(new java.awt.Color(255, 255, 255));
        fechaTopeLabelDell.setForeground(new java.awt.Color(255, 255, 255));
        fechaTopeLabelDell.setText("0");
        jPanel17.add(fechaTopeLabelDell, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 210, -1, -1));

        discountedLabelText1.setBackground(new java.awt.Color(255, 255, 255));
        discountedLabelText1.setForeground(new java.awt.Color(255, 255, 255));
        discountedLabelText1.setText("Dinero Descontado al PM:");
        jPanel17.add(discountedLabelText1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, -1, -1));

        discountedLabelDell.setBackground(new java.awt.Color(255, 255, 255));
        discountedLabelDell.setForeground(new java.awt.Color(255, 255, 255));
        discountedLabelDell.setText("0");
        jPanel17.add(discountedLabelDell, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 270, -1, -1));

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Dias totales transcurridos:");
        jPanel17.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, -1, -1));

        diasTotalesLabelDell.setBackground(new java.awt.Color(255, 255, 255));
        diasTotalesLabelDell.setForeground(new java.awt.Color(255, 255, 255));
        diasTotalesLabelDell.setText("0");
        jPanel17.add(diasTotalesLabelDell, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 240, -1, -1));

        jPanel18.setBackground(new java.awt.Color(255, 255, 255));

        jLabel23.setBackground(new java.awt.Color(185, 219, 253));
        jLabel23.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel23.setText("ESTADISTICAS");

        javax.swing.GroupLayout jPanel18Layout = new javax.swing.GroupLayout(jPanel18);
        jPanel18.setLayout(jPanel18Layout);
        jPanel18Layout.setHorizontalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel23, javax.swing.GroupLayout.DEFAULT_SIZE, 184, Short.MAX_VALUE)
                .addGap(16, 16, 16))
        );
        jPanel18Layout.setVerticalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel23)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel17.add(jPanel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(-2, 0, 220, 40));

        DellDash.add(jPanel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 30, 220, 300));

        jPanel15.setBackground(new java.awt.Color(0, 51, 153));
        jPanel15.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        qttyTGraficasMaxApple1.setBackground(new java.awt.Color(255, 255, 255));
        qttyTGraficasMaxApple1.setForeground(new java.awt.Color(255, 255, 255));
        qttyTGraficasMaxApple1.setText("10");
        jPanel15.add(qttyTGraficasMaxApple1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 240, -1, -1));

        computadorasTGReadyLabel1.setBackground(new java.awt.Color(255, 255, 255));
        computadorasTGReadyLabel1.setForeground(new java.awt.Color(255, 255, 255));
        computadorasTGReadyLabel1.setText("Computadoras TG Listas");
        jPanel15.add(computadorasTGReadyLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 380, -1, -1));

        computadorasReadyLabel1.setBackground(new java.awt.Color(255, 255, 255));
        computadorasReadyLabel1.setForeground(new java.awt.Color(255, 255, 255));
        computadorasReadyLabel1.setText("Computadoras Standar Listas");
        jPanel15.add(computadorasReadyLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 340, -1, -1));

        qttyStandardComputadorasReadyDell.setBackground(new java.awt.Color(255, 255, 255));
        qttyStandardComputadorasReadyDell.setForeground(new java.awt.Color(255, 255, 255));
        qttyStandardComputadorasReadyDell.setText("0");
        jPanel15.add(qttyStandardComputadorasReadyDell, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 340, -1, -1));

        qttyTGComputadorasReadyDell.setBackground(new java.awt.Color(255, 255, 255));
        qttyTGComputadorasReadyDell.setForeground(new java.awt.Color(255, 255, 255));
        qttyTGComputadorasReadyDell.setText("0");
        jPanel15.add(qttyTGComputadorasReadyDell, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 380, -1, -1));

        PlacasSavedLabelDell.setBackground(new java.awt.Color(255, 255, 255));
        PlacasSavedLabelDell.setForeground(new java.awt.Color(255, 255, 255));
        PlacasSavedLabelDell.setText("Placas en el almacen");
        jPanel15.add(PlacasSavedLabelDell, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, -1, -1));

        qttyPlacasSavedDell.setBackground(new java.awt.Color(255, 255, 255));
        qttyPlacasSavedDell.setForeground(new java.awt.Color(255, 255, 255));
        qttyPlacasSavedDell.setText("0");
        jPanel15.add(qttyPlacasSavedDell, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 70, -1, -1));

        PlacasMaxLabelDell.setBackground(new java.awt.Color(255, 255, 255));
        PlacasMaxLabelDell.setForeground(new java.awt.Color(255, 255, 255));
        PlacasMaxLabelDell.setText("Capacidad Máx:");
        jPanel15.add(PlacasMaxLabelDell, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 70, -1, -1));

        qttyPlacasMaxApple1.setBackground(new java.awt.Color(255, 255, 255));
        qttyPlacasMaxApple1.setForeground(new java.awt.Color(255, 255, 255));
        qttyPlacasMaxApple1.setText("25");
        jPanel15.add(qttyPlacasMaxApple1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 70, -1, -1));

        CPUSavedLabelDell.setBackground(new java.awt.Color(255, 255, 255));
        CPUSavedLabelDell.setForeground(new java.awt.Color(255, 255, 255));
        CPUSavedLabelDell.setText("CPU en el almacen");
        jPanel15.add(CPUSavedLabelDell, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, -1, -1));

        qttyCPUSavedDell.setBackground(new java.awt.Color(255, 255, 255));
        qttyCPUSavedDell.setForeground(new java.awt.Color(255, 255, 255));
        qttyCPUSavedDell.setText("0");
        jPanel15.add(qttyCPUSavedDell, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 110, -1, -1));

        CPUMaxLabelDell.setBackground(new java.awt.Color(255, 255, 255));
        CPUMaxLabelDell.setForeground(new java.awt.Color(255, 255, 255));
        CPUMaxLabelDell.setText("Capacidad Máx:");
        jPanel15.add(CPUMaxLabelDell, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 110, -1, -1));

        qttyCPUMaxApple1.setBackground(new java.awt.Color(255, 255, 255));
        qttyCPUMaxApple1.setForeground(new java.awt.Color(255, 255, 255));
        qttyCPUMaxApple1.setText("20");
        jPanel15.add(qttyCPUMaxApple1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 110, -1, -1));

        RAMSavedLabelDell.setBackground(new java.awt.Color(255, 255, 255));
        RAMSavedLabelDell.setForeground(new java.awt.Color(255, 255, 255));
        RAMSavedLabelDell.setText("RAM en el almacen");
        jPanel15.add(RAMSavedLabelDell, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, -1, -1));

        qttyRAMSavedDell.setBackground(new java.awt.Color(255, 255, 255));
        qttyRAMSavedDell.setForeground(new java.awt.Color(255, 255, 255));
        qttyRAMSavedDell.setText("0");
        jPanel15.add(qttyRAMSavedDell, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 150, -1, -1));

        RAMMaxLabelDell.setBackground(new java.awt.Color(255, 255, 255));
        RAMMaxLabelDell.setForeground(new java.awt.Color(255, 255, 255));
        RAMMaxLabelDell.setText("Capacidad Máx:");
        jPanel15.add(RAMMaxLabelDell, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 150, -1, -1));

        qttyRAMMaxApple1.setBackground(new java.awt.Color(255, 255, 255));
        qttyRAMMaxApple1.setForeground(new java.awt.Color(255, 255, 255));
        qttyRAMMaxApple1.setText("55");
        jPanel15.add(qttyRAMMaxApple1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 150, -1, -1));

        fuentesSavedLabelDell.setBackground(new java.awt.Color(255, 255, 255));
        fuentesSavedLabelDell.setForeground(new java.awt.Color(255, 255, 255));
        fuentesSavedLabelDell.setText("Fuentes en el almacen");
        jPanel15.add(fuentesSavedLabelDell, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, -1, -1));

        qttyFuentesSavedDell.setBackground(new java.awt.Color(255, 255, 255));
        qttyFuentesSavedDell.setForeground(new java.awt.Color(255, 255, 255));
        qttyFuentesSavedDell.setText("0");
        jPanel15.add(qttyFuentesSavedDell, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 190, -1, -1));

        fuentesMaxLabelDell.setBackground(new java.awt.Color(255, 255, 255));
        fuentesMaxLabelDell.setForeground(new java.awt.Color(255, 255, 255));
        fuentesMaxLabelDell.setText("Capacidad Máx:");
        jPanel15.add(fuentesMaxLabelDell, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 190, -1, -1));

        qttyFuentesMaxApple1.setBackground(new java.awt.Color(255, 255, 255));
        qttyFuentesMaxApple1.setForeground(new java.awt.Color(255, 255, 255));
        qttyFuentesMaxApple1.setText("35");
        jPanel15.add(qttyFuentesMaxApple1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 190, -1, -1));

        TGraficasSavedLabelDell.setBackground(new java.awt.Color(255, 255, 255));
        TGraficasSavedLabelDell.setForeground(new java.awt.Color(255, 255, 255));
        TGraficasSavedLabelDell.setText("TGraficas en el almacen");
        jPanel15.add(TGraficasSavedLabelDell, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, -1, -1));

        qttyTGraficasSavedDell.setBackground(new java.awt.Color(255, 255, 255));
        qttyTGraficasSavedDell.setForeground(new java.awt.Color(255, 255, 255));
        qttyTGraficasSavedDell.setText("0");
        jPanel15.add(qttyTGraficasSavedDell, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 240, -1, -1));

        TGraficasMaxLabelDell.setBackground(new java.awt.Color(255, 255, 255));
        TGraficasMaxLabelDell.setForeground(new java.awt.Color(255, 255, 255));
        TGraficasMaxLabelDell.setText("Capacidad Máx:");
        jPanel15.add(TGraficasMaxLabelDell, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 240, -1, -1));

        jPanel16.setBackground(new java.awt.Color(255, 255, 255));

        jLabel22.setBackground(new java.awt.Color(153, 0, 255));
        jLabel22.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel22.setText("ALMACEN");

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel16Layout.createSequentialGroup()
                .addContainerGap(123, Short.MAX_VALUE)
                .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(118, 118, 118))
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel22)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        jPanel15.add(jPanel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 370, 50));
        jPanel15.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 310, -1, -1));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/DellDash.png"))); // NOI18N
        jLabel11.setText("jLabel11");
        jPanel15.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(-630, 520, 2740, 1080));

        DellDash.add(jPanel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 30, 370, 420));

        jPanel13.setBackground(new java.awt.Color(0, 51, 153));
        jPanel13.setForeground(new java.awt.Color(153, 204, 255));

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Directores Ejecutivos:");

        qttyProjectsManagersApple1.setBackground(new java.awt.Color(255, 255, 255));
        qttyProjectsManagersApple1.setForeground(new java.awt.Color(255, 255, 255));
        qttyProjectsManagersApple1.setText("1");

        pmStatusLabelDelll.setBackground(new java.awt.Color(255, 255, 255));
        pmStatusLabelDelll.setForeground(new java.awt.Color(255, 255, 255));
        pmStatusLabelDelll.setText("Project Manager Status:");

        directorStatusLabelDell.setBackground(new java.awt.Color(255, 255, 255));
        directorStatusLabelDell.setForeground(new java.awt.Color(255, 255, 255));
        directorStatusLabelDell.setText("Director Status:");

        qttyDirectoresApple1.setBackground(new java.awt.Color(255, 255, 255));
        qttyDirectoresApple1.setForeground(new java.awt.Color(255, 255, 255));
        qttyDirectoresApple1.setText("1");

        pmStatusDell.setBackground(new java.awt.Color(255, 255, 255));
        pmStatusDell.setForeground(new java.awt.Color(255, 255, 255));
        pmStatusDell.setText("...");

        directorStatusDell.setBackground(new java.awt.Color(255, 255, 255));
        directorStatusDell.setForeground(new java.awt.Color(255, 255, 255));
        directorStatusDell.setText("...");

        faultsLabelText1.setBackground(new java.awt.Color(255, 255, 255));
        faultsLabelText1.setForeground(new java.awt.Color(255, 255, 255));
        faultsLabelText1.setText("Faltas del Project Manager:");

        faultsLabelDell.setBackground(new java.awt.Color(255, 255, 255));
        faultsLabelDell.setForeground(new java.awt.Color(255, 255, 255));
        faultsLabelDell.setText("0");

        placasLabelDell.setBackground(new java.awt.Color(255, 255, 255));
        placasLabelDell.setForeground(new java.awt.Color(255, 255, 255));
        placasLabelDell.setText("Placas Base");

        cpuLabelDell.setBackground(new java.awt.Color(255, 255, 255));
        cpuLabelDell.setForeground(new java.awt.Color(255, 255, 255));
        cpuLabelDell.setText("CPU's");

        RAMLabelDell.setBackground(new java.awt.Color(255, 255, 255));
        RAMLabelDell.setForeground(new java.awt.Color(255, 255, 255));
        RAMLabelDell.setText("Memoria RAM");

        fuenteLabelDell.setBackground(new java.awt.Color(255, 255, 255));
        fuenteLabelDell.setForeground(new java.awt.Color(255, 255, 255));
        fuenteLabelDell.setText("F. Alimentacion");

        TGraficaLabelDell.setBackground(new java.awt.Color(255, 255, 255));
        TGraficaLabelDell.setForeground(new java.awt.Color(255, 255, 255));
        TGraficaLabelDell.setText("T. Graficas");

        ensambladorLabelDell.setBackground(new java.awt.Color(255, 255, 255));
        ensambladorLabelDell.setForeground(new java.awt.Color(255, 255, 255));
        ensambladorLabelDell.setText("Ensambladores:");

        qttyPlacasDell.setBackground(new java.awt.Color(255, 255, 255));
        qttyPlacasDell.setForeground(new java.awt.Color(255, 255, 255));
        qttyPlacasDell.setText("0");

        qttyCPUDell.setBackground(new java.awt.Color(255, 255, 255));
        qttyCPUDell.setForeground(new java.awt.Color(255, 255, 255));
        qttyCPUDell.setText("0");

        qttyRAMDell.setBackground(new java.awt.Color(255, 255, 255));
        qttyRAMDell.setForeground(new java.awt.Color(255, 255, 255));
        qttyRAMDell.setText("0");

        qttyFuentesDell.setBackground(new java.awt.Color(255, 255, 255));
        qttyFuentesDell.setForeground(new java.awt.Color(255, 255, 255));
        qttyFuentesDell.setText("0");

        qttyTGraficasDell.setBackground(new java.awt.Color(255, 255, 255));
        qttyTGraficasDell.setForeground(new java.awt.Color(255, 255, 255));
        qttyTGraficasDell.setText("0");

        qttyEnsambladoresDell.setBackground(new java.awt.Color(255, 255, 255));
        qttyEnsambladoresDell.setForeground(new java.awt.Color(255, 255, 255));
        qttyEnsambladoresDell.setText("0");

        removePlacasDell.setText("-");
        removePlacasDell.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removePlacasDellActionPerformed(evt);
            }
        });

        addPlacaDell.setText("+");
        addPlacaDell.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addPlacaDellActionPerformed(evt);
            }
        });

        removeCPUDell.setText("-");
        removeCPUDell.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeCPUDellActionPerformed(evt);
            }
        });

        addCPUDell.setText("+");
        addCPUDell.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addCPUDellActionPerformed(evt);
            }
        });

        removeRAMDell.setText("-");
        removeRAMDell.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeRAMDellActionPerformed(evt);
            }
        });

        addRAMDell.setText("+");
        addRAMDell.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addRAMDellActionPerformed(evt);
            }
        });

        removeFuenteDell.setText("-");
        removeFuenteDell.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeFuenteDellActionPerformed(evt);
            }
        });

        addFuenteDell.setText("+");
        addFuenteDell.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addFuenteDellActionPerformed(evt);
            }
        });

        removeTGraficaDell.setText("-");
        removeTGraficaDell.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeTGraficaDellActionPerformed(evt);
            }
        });

        addTGraficaDell.setText("+");
        addTGraficaDell.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addTGraficaDellActionPerformed(evt);
            }
        });

        removeEnsambladorDell.setText("-");
        removeEnsambladorDell.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeEnsambladorDellActionPerformed(evt);
            }
        });

        addEnsambladorDell.setText("+");
        addEnsambladorDell.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addEnsambladorDellActionPerformed(evt);
            }
        });

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Projects Managers:");

        jPanel14.setBackground(new java.awt.Color(255, 255, 255));

        jLabel20.setBackground(new java.awt.Color(255, 255, 255));
        jLabel20.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel20.setText("TRABAJADORES");

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel14Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(80, 80, 80))
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel20)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(8, 8, 8)
                        .addComponent(qttyProjectsManagersApple1)
                        .addGap(13, 13, 13)
                        .addComponent(jLabel5)
                        .addGap(13, 13, 13)
                        .addComponent(qttyDirectoresApple1))
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addComponent(pmStatusLabelDelll)
                        .addGap(11, 11, 11)
                        .addComponent(pmStatusDell))
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addComponent(directorStatusLabelDell)
                        .addGap(60, 60, 60)
                        .addComponent(directorStatusDell))
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addComponent(faultsLabelText1)
                        .addGap(11, 11, 11)
                        .addComponent(faultsLabelDell))
                    .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel13Layout.createSequentialGroup()
                            .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanel13Layout.createSequentialGroup()
                                    .addComponent(cpuLabelDell)
                                    .addGap(183, 183, 183)
                                    .addComponent(qttyCPUDell))
                                .addGroup(jPanel13Layout.createSequentialGroup()
                                    .addComponent(RAMLabelDell)
                                    .addGap(138, 138, 138)
                                    .addComponent(qttyRAMDell))
                                .addGroup(jPanel13Layout.createSequentialGroup()
                                    .addComponent(fuenteLabelDell)
                                    .addGap(131, 131, 131)
                                    .addComponent(qttyFuentesDell))
                                .addGroup(jPanel13Layout.createSequentialGroup()
                                    .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(jPanel13Layout.createSequentialGroup()
                                            .addComponent(ensambladorLabelDell)
                                            .addGap(59, 59, 59))
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel13Layout.createSequentialGroup()
                                            .addComponent(TGraficaLabelDell)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                    .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(qttyEnsambladoresDell, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel13Layout.createSequentialGroup()
                                            .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(removeFuenteDell)
                                                .addComponent(removeTGraficaDell)
                                                .addComponent(removeRAMDell)
                                                .addComponent(removeCPUDell))
                                            .addGap(43, 43, 43)
                                            .addComponent(qttyTGraficasDell)))))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(addEnsambladorDell, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(addTGraficaDell, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(addFuenteDell, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(addRAMDell, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(addCPUDell, javax.swing.GroupLayout.Alignment.TRAILING)))
                        .addGroup(jPanel13Layout.createSequentialGroup()
                            .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(removeEnsambladorDell)
                                .addGroup(jPanel13Layout.createSequentialGroup()
                                    .addComponent(placasLabelDell)
                                    .addGap(94, 94, 94)
                                    .addComponent(removePlacasDell)))
                            .addGap(37, 37, 37)
                            .addComponent(qttyPlacasDell)
                            .addGap(23, 23, 23)
                            .addComponent(addPlacaDell))))
                .addContainerGap(92, Short.MAX_VALUE))
            .addComponent(jPanel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(placasLabelDell))
                    .addComponent(removePlacasDell)
                    .addComponent(qttyPlacasDell)
                    .addComponent(addPlacaDell))
                .addGap(25, 25, 25)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cpuLabelDell)
                    .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(qttyCPUDell)
                        .addComponent(addCPUDell)
                        .addComponent(removeCPUDell)))
                .addGap(27, 27, 27)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(RAMLabelDell))
                    .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(qttyRAMDell)
                        .addComponent(addRAMDell)
                        .addComponent(removeRAMDell)))
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(addFuenteDell)
                            .addComponent(qttyFuentesDell)
                            .addComponent(removeFuenteDell))
                        .addGap(30, 30, 30)
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(qttyTGraficasDell)
                            .addComponent(addTGraficaDell)
                            .addComponent(removeTGraficaDell)
                            .addComponent(TGraficaLabelDell))
                        .addGap(34, 34, 34)
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(qttyEnsambladoresDell)
                            .addComponent(addEnsambladorDell)
                            .addComponent(removeEnsambladorDell)))
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(fuenteLabelDell)
                        .addGap(83, 83, 83)
                        .addComponent(ensambladorLabelDell)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(qttyProjectsManagersApple1)
                    .addComponent(jLabel5)
                    .addComponent(qttyDirectoresApple1))
                .addGap(13, 13, 13)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pmStatusLabelDelll)
                    .addComponent(pmStatusDell))
                .addGap(13, 13, 13)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(directorStatusLabelDell)
                    .addComponent(directorStatusDell))
                .addGap(13, 13, 13)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(faultsLabelText1)
                    .addComponent(faultsLabelDell))
                .addGap(24, 24, 24))
        );

        DellDash.add(jPanel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 400, 540));
        DellDash.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 100, -1, -1));

        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/DellDash.png"))); // NOI18N
        jLabel19.setText("jLabel19");
        DellDash.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(-417, -150, 2010, 1200));

        jTabbedPane1.addTab("Dell", DellDash);

        AppleVSDell.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Grafico.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout GraficoLayout = new javax.swing.GroupLayout(Grafico);
        Grafico.setLayout(GraficoLayout);
        GraficoLayout.setHorizontalGroup(
            GraficoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        GraficoLayout.setVerticalGroup(
            GraficoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        AppleVSDell.add(Grafico, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 70, 970, 520));

        jLabel9.setBackground(new java.awt.Color(0, 0, 0));
        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Dias totales:");
        AppleVSDell.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 40, -1, -1));

        daysPassedLabelGrafico.setBackground(new java.awt.Color(0, 0, 0));
        daysPassedLabelGrafico.setForeground(new java.awt.Color(255, 255, 255));
        daysPassedLabelGrafico.setText("0");
        AppleVSDell.add(daysPassedLabelGrafico, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 40, -1, -1));
        AppleVSDell.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, -1, -1));

        jLabel24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Fondo Apple.png"))); // NOI18N
        AppleVSDell.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, 1160, 600));

        jTabbedPane1.addTab("Grafico", AppleVSDell);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1147, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void removePlacas2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removePlacas2ActionPerformed
        if (Integer.parseInt(PlacasApple.getText()) == 1){
            JOptionPane.showMessageDialog(null, "NO SE PUEDE DEJAR UN DEPARTAMENTO SIN TRABAJADORES");
        } else{
            int nuevo = Integer.parseInt(PlacasApple.getText())-1;
            PlacasApple.setText(String.valueOf(nuevo));
        }
    }//GEN-LAST:event_removePlacas2ActionPerformed

    private void addPlacas2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addPlacas2ActionPerformed
        if (calculateQuantityA() == 15){
            JOptionPane.showMessageDialog(null, "SE HA SUPERADO LA CANTIDAD LIMITE DE TRABAJADORES!");
        } else {
            int nuevo = Integer.parseInt(PlacasApple.getText())+1;
            PlacasApple.setText(String.valueOf(nuevo));
        }
    }//GEN-LAST:event_addPlacas2ActionPerformed

    private void removeCPU1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeCPU1ActionPerformed
        if (Integer.parseInt(CPUApple.getText()) == 1){
            JOptionPane.showMessageDialog(null, "NO SE PUEDE DEJAR UN DEPARTAMENTO SIN TRABAJADORES");
        } else{
            int nuevo = Integer.parseInt(CPUApple.getText())-1;
            CPUApple.setText(String.valueOf(nuevo));
        }
    }//GEN-LAST:event_removeCPU1ActionPerformed

    private void addCPU1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addCPU1ActionPerformed
        if (calculateQuantityA() == 15){
            JOptionPane.showMessageDialog(null, "SE HA SUPERADO LA CANTIDAD LIMITE DE TRABAJADORES!");
        } else {
            int nuevo = Integer.parseInt(CPUApple.getText())+1;
            CPUApple.setText(String.valueOf(nuevo));
        }
    }//GEN-LAST:event_addCPU1ActionPerformed

    private void removeRAM1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeRAM1ActionPerformed
        if (Integer.parseInt(RAMApple.getText()) == 1){
            JOptionPane.showMessageDialog(null, "NO SE PUEDE DEJAR UN DEPARTAMENTO SIN TRABAJADORES");
        } else{
            int nuevo = Integer.parseInt(RAMApple.getText())-1;
            RAMApple.setText(String.valueOf(nuevo));
        }
    }//GEN-LAST:event_removeRAM1ActionPerformed

    private void addRAM1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addRAM1ActionPerformed
        if (calculateQuantityA() == 15){
            JOptionPane.showMessageDialog(null, "SE HA SUPERADO LA CANTIDAD LIMITE DE TRABAJADORES!");
        } else {
            int nuevo = Integer.parseInt(RAMApple.getText())+1;
            RAMApple.setText(String.valueOf(nuevo));
        }
    }//GEN-LAST:event_addRAM1ActionPerformed

    private void removeFuente1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeFuente1ActionPerformed
        if (Integer.parseInt(FuentesApple.getText()) == 1){
            JOptionPane.showMessageDialog(null, "NO SE PUEDE DEJAR UN DEPARTAMENTO SIN TRABAJADORES");
        } else{
            int nuevo = Integer.parseInt(FuentesApple.getText())-1;
            FuentesApple.setText(String.valueOf(nuevo));
        }
    }//GEN-LAST:event_removeFuente1ActionPerformed

    private void addFuente1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addFuente1ActionPerformed
        if (calculateQuantityA() == 15){
            JOptionPane.showMessageDialog(null, "SE HA SUPERADO LA CANTIDAD LIMITE DE TRABAJADORES!");
        } else {
            int nuevo = Integer.parseInt(FuentesApple.getText())+1;
            FuentesApple.setText(String.valueOf(nuevo));
        }
    }//GEN-LAST:event_addFuente1ActionPerformed

    private void removeTGrafica1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeTGrafica1ActionPerformed
        if (Integer.parseInt(TGraficasApple.getText()) == 1){
            JOptionPane.showMessageDialog(null, "NO SE PUEDE DEJAR UN DEPARTAMENTO SIN TRABAJADORES");
        } else{
            int nuevo = Integer.parseInt(TGraficasApple.getText())-1;
            TGraficasApple.setText(String.valueOf(nuevo));
        }
    }//GEN-LAST:event_removeTGrafica1ActionPerformed

    private void addTGrafica1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addTGrafica1ActionPerformed
        if (calculateQuantityA() == 15){
            JOptionPane.showMessageDialog(null, "SE HA SUPERADO LA CANTIDAD LIMITE DE TRABAJADORES!");
        } else {
            int nuevo = Integer.parseInt(TGraficasApple.getText())+1;
            TGraficasApple.setText(String.valueOf(nuevo));
        }
    }//GEN-LAST:event_addTGrafica1ActionPerformed

    private void removeEnsamblador1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeEnsamblador1ActionPerformed
        if (Integer.parseInt(EnsambladoresApple.getText()) == 1){
            JOptionPane.showMessageDialog(null, "NO SE PUEDE DEJAR UN DEPARTAMENTO SIN TRABAJADORES");
        } else{
            int nuevo = Integer.parseInt(EnsambladoresApple.getText())-1;
            EnsambladoresApple.setText(String.valueOf(nuevo));
        }
    }//GEN-LAST:event_removeEnsamblador1ActionPerformed

    private void addEnsamblador1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addEnsamblador1ActionPerformed
        if (calculateQuantityA() == 15){
            JOptionPane.showMessageDialog(null, "SE HA SUPERADO LA CANTIDAD LIMITE DE TRABAJADORES!");
        } else {
            int nuevo = Integer.parseInt(EnsambladoresApple.getText())+1;
            EnsambladoresApple.setText(String.valueOf(nuevo));
        }
    }//GEN-LAST:event_addEnsamblador1ActionPerformed

    private void txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtActionPerformed
        String quantities = PlacasApple.getText() + ", " + CPUApple.getText() + ", " + RAMApple.getText() + ", " + FuentesApple.getText() + ", " + TGraficasApple.getText() + ", " + EnsambladoresApple.getText() + " / " + PlacasDell.getText() + ", " + CPUDell.getText() + ", " + RAMDell.getText() + ", " + FuentesDell.getText() + ", " + TGraficaDell.getText() + ", " + EnsambladoresDell.getText();
        String data = dia.getText() + " / " + ammount.getText();

        // DATOS INICIALES
        File fichero = new File("DatosInicializados.txt");
        String contenido = "";

        try{
            PrintWriter salida = new PrintWriter(fichero);
            salida.print(data);
            System.out.println("NO SEdatos");
            salida.close();
        }catch(Exception e){
            System.out.println(e);
        }

        // CANTIDADES INICIALES

        fichero = new File("CantidadesIniciales.txt");

        try{
            PrintWriter salida = new PrintWriter(fichero);
            salida.print(quantities);
            System.out.println("NO SEinici");
            salida.close();
        }catch(Exception e){
            System.out.println(e);
        }
    }//GEN-LAST:event_txtActionPerformed

    private void removeDiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeDiaActionPerformed
        if(Integer.parseInt(dia.getText())==2000){
            JOptionPane.showMessageDialog(null, "EL DIA DEBE DURAR MINIMO 2000MS");
        } else {
            int nuevo = Integer.parseInt(dia.getText())-1000;
            dia.setText(String.valueOf(nuevo));
        }
    }//GEN-LAST:event_removeDiaActionPerformed

    private void removeAmmountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeAmmountActionPerformed
        if(Integer.parseInt(ammount.getText())== 1){
            JOptionPane.showMessageDialog(null, "SE DEBE TENER POR LO MENOS UN DIA COMO DEADLINE DE ENTREGA");
        } else {
            int nuevo = Integer.parseInt(ammount.getText())-1;
            ammount.setText(String.valueOf(nuevo));
        }
    }//GEN-LAST:event_removeAmmountActionPerformed

    private void addDiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addDiaActionPerformed
        int nuevo = Integer.parseInt(dia.getText())+1000;
        dia.setText(String.valueOf(nuevo));
    }//GEN-LAST:event_addDiaActionPerformed

    private void addAmmountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addAmmountActionPerformed
        int nuevo = Integer.parseInt(ammount.getText())+1;
        ammount.setText(String.valueOf(nuevo));
    }//GEN-LAST:event_addAmmountActionPerformed

    private void removePlaca3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removePlaca3ActionPerformed
        if (Integer.parseInt(PlacasDell.getText()) == 1){
            JOptionPane.showMessageDialog(null, "NO SE PUEDE DEJAR UN DEPARTAMENTO SIN TRABAJADORES");
        } else{
            int nuevo = Integer.parseInt(PlacasDell.getText())-1;
            PlacasDell.setText(String.valueOf(nuevo));
        }
    }//GEN-LAST:event_removePlaca3ActionPerformed

    private void addPlaca3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addPlaca3ActionPerformed
        if (calculateQuantityD() == 15){
            JOptionPane.showMessageDialog(null, "SE HA SUPERADO LA CANTIDAD LIMITE DE TRABAJADORES!");
        } else {
            int nuevo = Integer.parseInt(PlacasDell.getText())+1;
            PlacasDell.setText(String.valueOf(nuevo));
        }
    }//GEN-LAST:event_addPlaca3ActionPerformed

    private void addCPU2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addCPU2ActionPerformed
        if (calculateQuantityD() == 15){
            JOptionPane.showMessageDialog(null, "SE HA SUPERADO LA CANTIDAD LIMITE DE TRABAJADORES!");
        } else {
            int nuevo = Integer.parseInt(CPUDell.getText())+1;
            CPUDell.setText(String.valueOf(nuevo));
        }
    }//GEN-LAST:event_addCPU2ActionPerformed

    private void removeCPU2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeCPU2ActionPerformed
        if (Integer.parseInt(CPUDell.getText()) == 1){
            JOptionPane.showMessageDialog(null, "NO SE PUEDE DEJAR UN DEPARTAMENTO SIN TRABAJADORES");
        } else{
            int nuevo = Integer.parseInt(CPUDell.getText())-1;
            CPUDell.setText(String.valueOf(nuevo));
        }
    }//GEN-LAST:event_removeCPU2ActionPerformed

    private void removeRAM2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeRAM2ActionPerformed
        if (Integer.parseInt(RAMDell.getText()) == 1){
            JOptionPane.showMessageDialog(null, "NO SE PUEDE DEJAR UN DEPARTAMENTO SIN TRABAJADORES");
        } else{
            int nuevo = Integer.parseInt(RAMDell.getText())-1;
            RAMDell.setText(String.valueOf(nuevo));
        }
    }//GEN-LAST:event_removeRAM2ActionPerformed

    private void addRAM2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addRAM2ActionPerformed
        if (calculateQuantityD() == 15) {
            JOptionPane.showMessageDialog(null, "SE HA SUPERADO LA CANTIDAD LIMITE DE TRABAJADORES!");
        } else {
            int nuevo = Integer.parseInt(RAMDell.getText()) + 1;
            RAMDell.setText(String.valueOf(nuevo));
        }
    }//GEN-LAST:event_addRAM2ActionPerformed

    private void removeFuente2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeFuente2ActionPerformed
        if (Integer.parseInt(FuentesDell.getText()) == 1){
            JOptionPane.showMessageDialog(null, "NO SE PUEDE DEJAR UN DEPARTAMENTO SIN TRABAJADORES");
        } else{
            int nuevo = Integer.parseInt(FuentesDell.getText())-1;
            FuentesDell.setText(String.valueOf(nuevo));
        }
    }//GEN-LAST:event_removeFuente2ActionPerformed

    private void addFuente2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addFuente2ActionPerformed
        if (calculateQuantityD() == 15){
            JOptionPane.showMessageDialog(null, "SE HA SUPERADO LA CANTIDAD LIMITE DE TRABAJADORES!");
        } else {
            int nuevo = Integer.parseInt(FuentesDell.getText())+1;
            FuentesDell.setText(String.valueOf(nuevo));
        }
    }//GEN-LAST:event_addFuente2ActionPerformed

    private void addTGrafica2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addTGrafica2ActionPerformed
        if (calculateQuantityD() == 15){
            JOptionPane.showMessageDialog(null, "SE HA SUPERADO LA CANTIDAD LIMITE DE TRABAJADORES!");
        } else {
            int nuevo = Integer.parseInt(TGraficaDell.getText())+1;
            TGraficaDell.setText(String.valueOf(nuevo));
        }
    }//GEN-LAST:event_addTGrafica2ActionPerformed

    private void removeTGrafica2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeTGrafica2ActionPerformed
        if (Integer.parseInt(TGraficaDell.getText()) == 1){
            JOptionPane.showMessageDialog(null, "NO SE PUEDE DEJAR UN DEPARTAMENTO SIN TRABAJADORES");
        } else{
            int nuevo = Integer.parseInt(TGraficaDell.getText())-1;
            TGraficaDell.setText(String.valueOf(nuevo));
        }
    }//GEN-LAST:event_removeTGrafica2ActionPerformed

    private void removeEnsamblador2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeEnsamblador2ActionPerformed
        if (Integer.parseInt(EnsambladoresDell.getText()) == 1){
            JOptionPane.showMessageDialog(null, "NO SE PUEDE DEJAR UN DEPARTAMENTO SIN TRABAJADORES");
        } else{
            int nuevo = Integer.parseInt(EnsambladoresDell.getText())-1;
            EnsambladoresDell.setText(String.valueOf(nuevo));
        }
    }//GEN-LAST:event_removeEnsamblador2ActionPerformed

    private void addEnsamblador2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addEnsamblador2ActionPerformed
        if (calculateQuantityD() == 15){
            JOptionPane.showMessageDialog(null, "SE HA SUPERADO LA CANTIDAD LIMITE DE TRABAJADORES!");
        } else {
            int nuevo = Integer.parseInt(EnsambladoresDell.getText())+1;
            EnsambladoresDell.setText(String.valueOf(nuevo));
        }
    }//GEN-LAST:event_addEnsamblador2ActionPerformed

    private void removeEnsambladorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeEnsambladorActionPerformed
        // TODO add your handling code here:
        apple.getEnsamblador().eliminarTrabajador();
        this.qttyEnsambladoresApple.setText(Integer.toString(apple.getEnsamblador().getCantidadTrabajadores()));
    }//GEN-LAST:event_removeEnsambladorActionPerformed

    private void removeTGraficaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeTGraficaActionPerformed
        // TODO add your handling code here:
        apple.getTarjetasGraficas().eliminarTrabajador();
        this.qttyTGraficaApple.setText(Integer.toString(apple.getTarjetasGraficas().getCantidadTrabajadores()));
    }//GEN-LAST:event_removeTGraficaActionPerformed

    private void removeFuenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeFuenteActionPerformed
        // TODO add your handling code here:
        apple.getFuentesAlimentacion().eliminarTrabajador();
        this.qttyFuentesApple.setText(Integer.toString(apple.getFuentesAlimentacion().getCantidadTrabajadores()));
    }//GEN-LAST:event_removeFuenteActionPerformed

    private void removeRAMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeRAMActionPerformed
        // TODO add your handling code here:
        apple.getPlacasBase().eliminarTrabajador();
        this.qttyRAMApple.setText(Integer.toString(apple.getPlacasBase().getCantidadTrabajadores()));
    }//GEN-LAST:event_removeRAMActionPerformed

    private void removeCPUActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeCPUActionPerformed
        // TODO add your handling code here:
        apple.getCpuS().eliminarTrabajador();
        this.qttyCPUApple.setText(Integer.toString(apple.getCpuS().getCantidadTrabajadores()));
    }//GEN-LAST:event_removeCPUActionPerformed

    private void removePlacaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removePlacaActionPerformed
        // TODO add your handling code here:
        apple.getPlacasBase().eliminarTrabajador();
        this.qttyPlacasBaseApple.setText(Integer.toString(apple.getPlacasBase().getCantidadTrabajadores()));
    }//GEN-LAST:event_removePlacaActionPerformed

    private void addPlacaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addPlacaActionPerformed
        // TODO add your handling code here:
        apple.añadirTrabajadores(0);
        this.qttyPlacasBaseApple.setText(Integer.toString(apple.getPlacasBase().getCantidadTrabajadores()));
    }//GEN-LAST:event_addPlacaActionPerformed

    private void addCPUActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addCPUActionPerformed
        // TODO add your handling code here:
        apple.añadirTrabajadores(1);
        this.qttyCPUApple.setText(Integer.toString(apple.getCpuS().getCantidadTrabajadores()));
    }//GEN-LAST:event_addCPUActionPerformed

    private void addEnsambladorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addEnsambladorActionPerformed
        // TODO add your handling code here:
        apple.añadirTrabajadores(5);
        this.qttyEnsambladoresApple.setText(Integer.toString(apple.getEnsamblador().getCantidadTrabajadores()));
    }//GEN-LAST:event_addEnsambladorActionPerformed

    private void addTGraficaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addTGraficaActionPerformed
        // TODO add your handling code here:
        apple.añadirTrabajadores(4);
        this.qttyTGraficaApple.setText(Integer.toString(apple.getTarjetasGraficas().getCantidadTrabajadores()));
    }//GEN-LAST:event_addTGraficaActionPerformed

    private void addFuenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addFuenteActionPerformed
        // TODO add your handling code here:
        apple.añadirTrabajadores(3);
        this.qttyFuentesApple.setText(Integer.toString(apple.getFuentesAlimentacion().getCantidadTrabajadores()));
    }//GEN-LAST:event_addFuenteActionPerformed

    private void addRAMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addRAMActionPerformed
        // TODO add your handling code here:
        apple.añadirTrabajadores(2);
        this.qttyRAMApple.setText(Integer.toString(apple.getPlacasBase().getCantidadTrabajadores()));
    }//GEN-LAST:event_addRAMActionPerformed

    private void removePlacasDellActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removePlacasDellActionPerformed
        // TODO add your handling code here:
        dell.getPlacasBase().eliminarTrabajador();
        this.qttyPlacasDell.setText(Integer.toString(dell.getPlacasBase().getCantidadTrabajadores()));
    }//GEN-LAST:event_removePlacasDellActionPerformed

    private void addPlacaDellActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addPlacaDellActionPerformed
        // TODO add your handling code here:
        dell.añadirTrabajadores(0);
        this.qttyPlacasDell.setText(Integer.toString(dell.getPlacasBase().getCantidadTrabajadores()));
    }//GEN-LAST:event_addPlacaDellActionPerformed

    private void removeCPUDellActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeCPUDellActionPerformed
        // TODO add your handling code here:
        dell.getCpuS().eliminarTrabajador();
        this.qttyCPUDell.setText(Integer.toString(dell.getCpuS().getCantidadTrabajadores()));
    }//GEN-LAST:event_removeCPUDellActionPerformed

    private void addCPUDellActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addCPUDellActionPerformed
        // TODO add your handling code here:
        dell.añadirTrabajadores(1);
        this.qttyCPUDell.setText(Integer.toString(dell.getCpuS().getCantidadTrabajadores()));
    }//GEN-LAST:event_addCPUDellActionPerformed

    private void removeRAMDellActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeRAMDellActionPerformed
        // TODO add your handling code here:
        dell.getMemoriaRam().eliminarTrabajador();
        this.qttyRAMDell.setText(Integer.toString(dell.getMemoriaRam().getCantidadTrabajadores()));
    }//GEN-LAST:event_removeRAMDellActionPerformed

    private void addRAMDellActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addRAMDellActionPerformed
        // TODO add your handling code here:
        dell.añadirTrabajadores(2);
        this.qttyRAMDell.setText(Integer.toString(dell.getMemoriaRam().getCantidadTrabajadores()));
    }//GEN-LAST:event_addRAMDellActionPerformed

    private void removeFuenteDellActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeFuenteDellActionPerformed
        // TODO add your handling code here:
        dell.getFuentesAlimentacion().eliminarTrabajador();
        this.qttyFuentesDell.setText(Integer.toString(dell.getFuentesAlimentacion().getCantidadTrabajadores()));
    }//GEN-LAST:event_removeFuenteDellActionPerformed

    private void addFuenteDellActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addFuenteDellActionPerformed
        // TODO add your handling code here:
        dell.añadirTrabajadores(3);
        this.qttyFuentesDell.setText(Integer.toString(dell.getFuentesAlimentacion().getCantidadTrabajadores()));
    }//GEN-LAST:event_addFuenteDellActionPerformed

    private void removeTGraficaDellActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeTGraficaDellActionPerformed
        // TODO add your handling code here:
        dell.getTarjetasGraficas().eliminarTrabajador();
        this.qttyTGraficasDell.setText(Integer.toString(dell.getTarjetasGraficas().getCantidadTrabajadores()));
    }//GEN-LAST:event_removeTGraficaDellActionPerformed

    private void addTGraficaDellActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addTGraficaDellActionPerformed
        // TODO add your handling code here:
        dell.añadirTrabajadores(4);
        this.qttyTGraficasDell.setText(Integer.toString(dell.getTarjetasGraficas().getCantidadTrabajadores()));
    }//GEN-LAST:event_addTGraficaDellActionPerformed

    private void removeEnsambladorDellActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeEnsambladorDellActionPerformed
        // TODO add your handling code here:
        dell.getEnsamblador().eliminarTrabajador();
        this.qttyEnsambladoresDell.setText(Integer.toString(dell.getEnsamblador().getCantidadTrabajadores()));
    }//GEN-LAST:event_removeEnsambladorDellActionPerformed

    private void addEnsambladorDellActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addEnsambladorDellActionPerformed
        // TODO add your handling code here:
        dell.añadirTrabajadores(5);
        this.qttyEnsambladoresDell.setText(Integer.toString(dell.getEnsamblador().getCantidadTrabajadores()));
    }//GEN-LAST:event_addEnsambladorDellActionPerformed

    private int calculateQuantityA(){
        int cantidadTotal = Integer.parseInt(PlacasApple.getText()) + Integer.parseInt(CPUApple.getText()) + Integer.parseInt(RAMApple.getText()) + Integer.parseInt(FuentesApple.getText()) + Integer.parseInt(TGraficasApple.getText()) + Integer.parseInt(EnsambladoresApple.getText());
        System.out.println(cantidadTotal);
        System.out.println("NO SE40");
        return cantidadTotal;
    }
    
    private int calculateQuantityD(){
        int cantidadTotal = Integer.parseInt(PlacasDell.getText()) + Integer.parseInt(CPUDell.getText()) + Integer.parseInt(RAMDell.getText()) + Integer.parseInt(FuentesDell.getText()) + Integer.parseInt(TGraficaDell.getText()) + Integer.parseInt(EnsambladoresDell.getText());
        System.out.println(cantidadTotal);
        System.out.println("NO SE41");
        return cantidadTotal;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel AppleDash;
    private javax.swing.JPanel AppleVSDell;
    private javax.swing.JLabel CPUApple;
    private javax.swing.JLabel CPUDell;
    private javax.swing.JLabel CPUMaxLabel;
    private javax.swing.JLabel CPUMaxLabelDell;
    private javax.swing.JLabel CPUSavedLabel;
    private javax.swing.JLabel CPUSavedLabelDell;
    private javax.swing.JPanel ConfigurationDashboard;
    private javax.swing.JPanel DellDash;
    private javax.swing.JLabel EnsambladoresApple;
    private javax.swing.JLabel EnsambladoresDell;
    private javax.swing.JLabel FuentesApple;
    private javax.swing.JLabel FuentesDell;
    private javax.swing.JPanel Grafico;
    private javax.swing.JLabel PlacasApple;
    private javax.swing.JLabel PlacasDell;
    private javax.swing.JLabel PlacasMaxLabel;
    private javax.swing.JLabel PlacasMaxLabelDell;
    private javax.swing.JLabel PlacasSavedLabel;
    private javax.swing.JLabel PlacasSavedLabelDell;
    private javax.swing.JLabel RAMApple;
    private javax.swing.JLabel RAMDell;
    private javax.swing.JLabel RAMLabel;
    private javax.swing.JLabel RAMLabelDell;
    private javax.swing.JLabel RAMMaxLabel2;
    private javax.swing.JLabel RAMMaxLabelDell;
    private javax.swing.JLabel RAMSavedLabel;
    private javax.swing.JLabel RAMSavedLabelDell;
    private javax.swing.JLabel TGraficaDell;
    private javax.swing.JLabel TGraficaLabel;
    private javax.swing.JLabel TGraficaLabel2;
    private javax.swing.JLabel TGraficaLabelDell;
    private javax.swing.JLabel TGraficasApple;
    private javax.swing.JLabel TGraficasMaxLabel4;
    private javax.swing.JLabel TGraficasMaxLabelDell;
    private javax.swing.JLabel TGraficasSavedLabel4;
    private javax.swing.JLabel TGraficasSavedLabelDell;
    private javax.swing.JButton addAmmount;
    private javax.swing.JButton addCPU;
    private javax.swing.JButton addCPU1;
    private javax.swing.JButton addCPU2;
    private javax.swing.JButton addCPUDell;
    private javax.swing.JButton addDia;
    private javax.swing.JButton addEnsamblador;
    private javax.swing.JButton addEnsamblador1;
    private javax.swing.JButton addEnsamblador2;
    private javax.swing.JButton addEnsambladorDell;
    private javax.swing.JButton addFuente;
    private javax.swing.JButton addFuente1;
    private javax.swing.JButton addFuente2;
    private javax.swing.JButton addFuenteDell;
    private javax.swing.JButton addPlaca;
    private javax.swing.JButton addPlaca3;
    private javax.swing.JButton addPlacaDell;
    private javax.swing.JButton addPlacas2;
    private javax.swing.JButton addRAM;
    private javax.swing.JButton addRAM1;
    private javax.swing.JButton addRAM2;
    private javax.swing.JButton addRAMDell;
    private javax.swing.JButton addTGrafica;
    private javax.swing.JButton addTGrafica1;
    private javax.swing.JButton addTGrafica2;
    private javax.swing.JButton addTGraficaDell;
    private javax.swing.JLabel ammount;
    private javax.swing.JLabel computadorasReadyLabel;
    private javax.swing.JLabel computadorasReadyLabel1;
    private javax.swing.JLabel computadorasTGReadyLabel;
    private javax.swing.JLabel computadorasTGReadyLabel1;
    private javax.swing.JLabel costosLabel;
    private javax.swing.JLabel costosLabelDell;
    private javax.swing.JLabel costosLabelText;
    private javax.swing.JLabel costosLabelText1;
    private javax.swing.JLabel costosLabelText2;
    private javax.swing.JLabel costosLabelText3;
    private javax.swing.JLabel cpuLabel;
    private javax.swing.JLabel cpuLabel2;
    private javax.swing.JLabel cpuLabelDell;
    private javax.swing.JLabel daysPassedLabelGrafico;
    private javax.swing.JLabel dia;
    private javax.swing.JLabel diaDuracion;
    private javax.swing.JLabel diasTotalesLabelApple;
    private javax.swing.JLabel diasTotalesLabelDell;
    private javax.swing.JLabel directorStatus;
    private javax.swing.JLabel directorStatusDell;
    private javax.swing.JLabel directorStatusLabel;
    private javax.swing.JLabel directorStatusLabelDell;
    private javax.swing.JLabel discountedLabel;
    private javax.swing.JLabel discountedLabelDell;
    private javax.swing.JLabel discountedLabelText;
    private javax.swing.JLabel discountedLabelText1;
    private javax.swing.JLabel ensambladorLabel;
    private javax.swing.JLabel ensambladorLabel1;
    private javax.swing.JLabel ensambladorLabel2;
    private javax.swing.JLabel ensambladorLabelDell;
    private javax.swing.JLabel escenariosLabel1;
    private javax.swing.JLabel faultsLabel;
    private javax.swing.JLabel faultsLabelDell;
    private javax.swing.JLabel faultsLabelText;
    private javax.swing.JLabel faultsLabelText1;
    private javax.swing.JLabel fechaTope;
    private javax.swing.JLabel fechaTopeLabel;
    private javax.swing.JLabel fechaTopeLabelDell;
    private javax.swing.JLabel fechaTopeLabelText;
    private javax.swing.JLabel fechaTopeLabelText1;
    private javax.swing.JLabel fuenteLabel;
    private javax.swing.JLabel fuenteLabel1;
    private javax.swing.JLabel fuenteLabel2;
    private javax.swing.JLabel fuenteLabelDell;
    private javax.swing.JLabel fuentesMaxLabel3;
    private javax.swing.JLabel fuentesMaxLabelDell;
    private javax.swing.JLabel fuentesSavedLabel3;
    private javax.swing.JLabel fuentesSavedLabelDell;
    private javax.swing.JLabel gananciaLabelText;
    private javax.swing.JLabel gananciaLabelText1;
    private javax.swing.JLabel gananciasLabel;
    private javax.swing.JLabel gananciasLabelDell;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JLabel placasLabel;
    private javax.swing.JLabel placasLabel1;
    private javax.swing.JLabel placasLabel2;
    private javax.swing.JLabel placasLabelDell;
    private javax.swing.JLabel pmStatus;
    private javax.swing.JLabel pmStatusDell;
    private javax.swing.JLabel pmStatusLabel;
    private javax.swing.JLabel pmStatusLabelDelll;
    private javax.swing.JLabel qttyCPUApple;
    private javax.swing.JLabel qttyCPUDell;
    private javax.swing.JLabel qttyCPUMaxApple;
    private javax.swing.JLabel qttyCPUMaxApple1;
    private javax.swing.JLabel qttyCPUSavedApple;
    private javax.swing.JLabel qttyCPUSavedDell;
    private javax.swing.JLabel qttyDirectoresApple;
    private javax.swing.JLabel qttyDirectoresApple1;
    private javax.swing.JLabel qttyEnsambladoresApple;
    private javax.swing.JLabel qttyEnsambladoresDell;
    private javax.swing.JLabel qttyFuentesApple;
    private javax.swing.JLabel qttyFuentesDell;
    private javax.swing.JLabel qttyFuentesMaxApple;
    private javax.swing.JLabel qttyFuentesMaxApple1;
    private javax.swing.JLabel qttyFuentesSavedApple;
    private javax.swing.JLabel qttyFuentesSavedDell;
    private javax.swing.JLabel qttyPlacasBaseApple;
    private javax.swing.JLabel qttyPlacasDell;
    private javax.swing.JLabel qttyPlacasMaxApple;
    private javax.swing.JLabel qttyPlacasMaxApple1;
    private javax.swing.JLabel qttyPlacasSavedApple;
    private javax.swing.JLabel qttyPlacasSavedDell;
    private javax.swing.JLabel qttyProjectsManagersApple;
    private javax.swing.JLabel qttyProjectsManagersApple1;
    private javax.swing.JLabel qttyRAMApple;
    private javax.swing.JLabel qttyRAMDell;
    private javax.swing.JLabel qttyRAMMaxApple;
    private javax.swing.JLabel qttyRAMMaxApple1;
    private javax.swing.JLabel qttyRAMSavedApple;
    private javax.swing.JLabel qttyRAMSavedDell;
    private javax.swing.JLabel qttyStandardComputadorasReadyApple;
    private javax.swing.JLabel qttyStandardComputadorasReadyDell;
    private javax.swing.JLabel qttyTGComputadorasReadyApple;
    private javax.swing.JLabel qttyTGComputadorasReadyDell;
    private javax.swing.JLabel qttyTGraficaApple;
    private javax.swing.JLabel qttyTGraficasDell;
    private javax.swing.JLabel qttyTGraficasMaxApple;
    private javax.swing.JLabel qttyTGraficasMaxApple1;
    private javax.swing.JLabel qttyTGraficasSavedApple;
    private javax.swing.JLabel qttyTGraficasSavedDell;
    private javax.swing.JLabel ramLabel1;
    private javax.swing.JLabel ramLabel2;
    private javax.swing.JButton removeAmmount;
    private javax.swing.JButton removeCPU;
    private javax.swing.JButton removeCPU1;
    private javax.swing.JButton removeCPU2;
    private javax.swing.JButton removeCPUDell;
    private javax.swing.JButton removeDia;
    private javax.swing.JButton removeEnsamblador;
    private javax.swing.JButton removeEnsamblador1;
    private javax.swing.JButton removeEnsamblador2;
    private javax.swing.JButton removeEnsambladorDell;
    private javax.swing.JButton removeFuente;
    private javax.swing.JButton removeFuente1;
    private javax.swing.JButton removeFuente2;
    private javax.swing.JButton removeFuenteDell;
    private javax.swing.JButton removePlaca;
    private javax.swing.JButton removePlaca3;
    private javax.swing.JButton removePlacas2;
    private javax.swing.JButton removePlacasDell;
    private javax.swing.JButton removeRAM;
    private javax.swing.JButton removeRAM1;
    private javax.swing.JButton removeRAM2;
    private javax.swing.JButton removeRAMDell;
    private javax.swing.JButton removeTGrafica;
    private javax.swing.JButton removeTGrafica1;
    private javax.swing.JButton removeTGrafica2;
    private javax.swing.JButton removeTGraficaDell;
    private javax.swing.JLabel tGraficaLabel1;
    private javax.swing.JButton txt;
    private javax.swing.JLabel utilidadesLabel;
    private javax.swing.JLabel utilidadesLabelDell;
    // End of variables declaration//GEN-END:variables
}
