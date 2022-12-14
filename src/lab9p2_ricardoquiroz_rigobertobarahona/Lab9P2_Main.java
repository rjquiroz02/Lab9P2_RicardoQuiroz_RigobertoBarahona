package lab9p2_ricardoquiroz_rigobertobarahona;

import java.awt.Image;
import java.awt.Toolkit;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileFilter;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;

public class Lab9P2_Main extends javax.swing.JFrame {

    public Lab9P2_Main() {
        initComponents();
        showLogin();
    }
    
    int cont = 0;
    ArrayList<Usuario> usuarios = new ArrayList();
    ArrayList<Juegos> juegos = new ArrayList();
    ArrayList<Lenguaje> lenguajes = new ArrayList();
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JD_login = new javax.swing.JDialog();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        TF_usuario = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        TF_contrasena = new javax.swing.JTextField();
        JB_ingresar = new javax.swing.JButton();
        JB_registro = new javax.swing.JButton();
        JD_registro = new javax.swing.JDialog();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        TF_usuarioR = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        TF_contrasenaR = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        TF_nombreR = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        TF_correoR = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        JS_edadR = new javax.swing.JSpinner();
        JB_registrarR = new javax.swing.JButton();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        JP_juego = new javax.swing.JPanel();
        CB_juego = new javax.swing.JComboBox<>();
        JB_generar = new javax.swing.JButton();
        JB_ejecutar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Juego_Nombre1 = new javax.swing.JTextField();
        Juego_Nombre2 = new javax.swing.JTextField();
        Juego_Categoria1 = new javax.swing.JTextField();
        Juego_Categoria2 = new javax.swing.JTextField();
        Juego_Costo1 = new javax.swing.JTextField();
        Juego_Costo2 = new javax.swing.JTextField();
        PB_barra = new javax.swing.JProgressBar();
        jScrollPane2 = new javax.swing.JScrollPane();
        Juego_Tabla2 = new javax.swing.JTable();
        jScrollPane4 = new javax.swing.JScrollPane();
        Juego_Tabla1 = new javax.swing.JTable();
        JP_Idioma = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        Idioma_Nombre = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        CB_idiomajuego = new javax.swing.JComboBox<>();
        Idioma_Crear = new javax.swing.JButton();
        Idioma_Agregar = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        Idioma_Tabla = new javax.swing.JTable();
        JP_correos = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        TF_receptor = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        TF_asunto = new javax.swing.JTextField();
        JB_enviarcorreo = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TA_mensaje = new javax.swing.JTextArea();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        MI_abrirarchivo = new javax.swing.JMenuItem();
        JM_recientes = new javax.swing.JMenu();
        MI_limpiar = new javax.swing.JMenuItem();
        MI_salir = new javax.swing.JMenuItem();

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel4.setText("Login");

        jLabel5.setText("Usuario");

        jLabel6.setText("Contrasena");

        JB_ingresar.setText("Ingresar");
        JB_ingresar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JB_ingresarMouseClicked(evt);
            }
        });

        JB_registro.setText("Registro");
        JB_registro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JB_registroMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout JD_loginLayout = new javax.swing.GroupLayout(JD_login.getContentPane());
        JD_login.getContentPane().setLayout(JD_loginLayout);
        JD_loginLayout.setHorizontalGroup(
            JD_loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JD_loginLayout.createSequentialGroup()
                .addGroup(JD_loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(JD_loginLayout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addGroup(JD_loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel5)
                            .addComponent(TF_usuario)
                            .addComponent(jLabel6)
                            .addComponent(TF_contrasena)
                            .addComponent(JB_ingresar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(JB_registro, javax.swing.GroupLayout.DEFAULT_SIZE, 287, Short.MAX_VALUE)))
                    .addGroup(JD_loginLayout.createSequentialGroup()
                        .addGap(145, 145, 145)
                        .addComponent(jLabel4)))
                .addContainerGap(62, Short.MAX_VALUE))
        );
        JD_loginLayout.setVerticalGroup(
            JD_loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JD_loginLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addGap(41, 41, 41)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TF_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TF_contrasena, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53)
                .addComponent(JB_ingresar)
                .addGap(18, 18, 18)
                .addComponent(JB_registro)
                .addContainerGap(96, Short.MAX_VALUE))
        );

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel7.setText("Registro");

        jLabel8.setText("Usuario");

        jLabel9.setText("Contrasena");

        jLabel10.setText("Nombre");

        jLabel11.setText("Correo");

        jLabel12.setText("Edad");

        JB_registrarR.setText("Registrar");
        JB_registrarR.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JB_registrarRMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout JD_registroLayout = new javax.swing.GroupLayout(JD_registro.getContentPane());
        JD_registro.getContentPane().setLayout(JD_registroLayout);
        JD_registroLayout.setHorizontalGroup(
            JD_registroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JD_registroLayout.createSequentialGroup()
                .addGroup(JD_registroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(JD_registroLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(JD_registroLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(JD_registroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel8)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TF_nombreR)
                            .addComponent(TF_usuarioR)
                            .addComponent(JS_edadR, javax.swing.GroupLayout.DEFAULT_SIZE, 189, Short.MAX_VALUE))
                        .addGap(53, 53, 53)
                        .addGroup(JD_registroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9)
                            .addComponent(TF_contrasenaR)
                            .addComponent(TF_correoR)
                            .addComponent(JB_registrarR, javax.swing.GroupLayout.DEFAULT_SIZE, 186, Short.MAX_VALUE)))
                    .addGroup(JD_registroLayout.createSequentialGroup()
                        .addGap(172, 172, 172)
                        .addComponent(jLabel7)))
                .addContainerGap(48, Short.MAX_VALUE))
        );
        JD_registroLayout.setVerticalGroup(
            JD_registroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JD_registroLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21)
                .addGroup(JD_registroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(JD_registroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TF_usuarioR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TF_contrasenaR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(JD_registroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(JD_registroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TF_nombreR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TF_correoR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(JD_registroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JS_edadR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JB_registrarR))
                .addContainerGap(47, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        CB_juego.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Crear", "Modificar", "Seleccionar", "Eliminar", " " }));

        JB_generar.setText("Generar");
        JB_generar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        JB_generar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JB_generarMouseClicked(evt);
            }
        });

        JB_ejecutar.setText("Ejecutar");
        JB_ejecutar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        JB_ejecutar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JB_ejecutarMouseClicked(evt);
            }
        });

        jLabel1.setText("Nombre");

        jLabel2.setText("Categoria");

        jLabel3.setText("Costo");

        Juego_Tabla2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Categoria", "Costo", "Idiomas"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(Juego_Tabla2);

        Juego_Tabla1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nombre", "Categoria", "Costo", "Idiomas"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane4.setViewportView(Juego_Tabla1);

        javax.swing.GroupLayout JP_juegoLayout = new javax.swing.GroupLayout(JP_juego);
        JP_juego.setLayout(JP_juegoLayout);
        JP_juegoLayout.setHorizontalGroup(
            JP_juegoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JP_juegoLayout.createSequentialGroup()
                .addGroup(JP_juegoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(JP_juegoLayout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(JP_juegoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addGroup(JP_juegoLayout.createSequentialGroup()
                                .addGroup(JP_juegoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(CB_juego, 0, 140, Short.MAX_VALUE)
                                    .addComponent(JB_generar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(JB_ejecutar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(62, 62, 62)
                                .addGroup(JP_juegoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel1))))
                        .addGap(18, 18, 18)
                        .addGroup(JP_juegoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Juego_Nombre1)
                            .addComponent(Juego_Categoria1)
                            .addComponent(Juego_Costo1, javax.swing.GroupLayout.DEFAULT_SIZE, 149, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(JP_juegoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Juego_Nombre2)
                            .addComponent(Juego_Categoria2)
                            .addComponent(Juego_Costo2, javax.swing.GroupLayout.DEFAULT_SIZE, 169, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(JP_juegoLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(PB_barra, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(JP_juegoLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 640, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(JP_juegoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(JP_juegoLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 640, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        JP_juegoLayout.setVerticalGroup(
            JP_juegoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JP_juegoLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(JP_juegoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CB_juego, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(Juego_Nombre1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Juego_Nombre2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(JP_juegoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JB_generar)
                    .addComponent(jLabel2)
                    .addComponent(Juego_Categoria1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Juego_Categoria2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(JP_juegoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JB_ejecutar)
                    .addComponent(jLabel3)
                    .addComponent(Juego_Costo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Juego_Costo2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(96, 96, 96)
                .addComponent(PB_barra, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 225, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(58, 58, 58))
            .addGroup(JP_juegoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JP_juegoLayout.createSequentialGroup()
                    .addContainerGap(286, Short.MAX_VALUE)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(255, 255, 255)))
        );

        jTabbedPane1.addTab("Juego", JP_juego);

        jLabel13.setText("Nombre");

        jLabel14.setText("Idioma del juego");

        Idioma_Crear.setText("Crear");
        Idioma_Crear.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Idioma_Crear.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Idioma_CrearMouseClicked(evt);
            }
        });

        Idioma_Agregar.setText("Agregar");
        Idioma_Agregar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        Idioma_Tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nombre"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(Idioma_Tabla);

        javax.swing.GroupLayout JP_IdiomaLayout = new javax.swing.GroupLayout(JP_Idioma);
        JP_Idioma.setLayout(JP_IdiomaLayout);
        JP_IdiomaLayout.setHorizontalGroup(
            JP_IdiomaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JP_IdiomaLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(JP_IdiomaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 595, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(JP_IdiomaLayout.createSequentialGroup()
                        .addGroup(JP_IdiomaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Idioma_Crear, javax.swing.GroupLayout.DEFAULT_SIZE, 211, Short.MAX_VALUE)
                            .addComponent(Idioma_Nombre)
                            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(60, 60, 60)
                        .addGroup(JP_IdiomaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel14)
                            .addComponent(CB_idiomajuego, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Idioma_Agregar, javax.swing.GroupLayout.DEFAULT_SIZE, 205, Short.MAX_VALUE))))
                .addContainerGap(44, Short.MAX_VALUE))
        );
        JP_IdiomaLayout.setVerticalGroup(
            JP_IdiomaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JP_IdiomaLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(JP_IdiomaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(jLabel14))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(JP_IdiomaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Idioma_Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CB_idiomajuego, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(JP_IdiomaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Idioma_Crear)
                    .addComponent(Idioma_Agregar))
                .addGap(43, 43, 43)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 457, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(92, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Idioma", JP_Idioma);

        jLabel15.setText("Para");

        jLabel16.setText("Asunto");

        JB_enviarcorreo.setText("Enviar");
        JB_enviarcorreo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JB_enviarcorreoMouseClicked(evt);
            }
        });

        jLabel17.setText("Mensaje");

        TA_mensaje.setColumns(20);
        TA_mensaje.setRows(5);
        jScrollPane1.setViewportView(TA_mensaje);

        javax.swing.GroupLayout JP_correosLayout = new javax.swing.GroupLayout(JP_correos);
        JP_correos.setLayout(JP_correosLayout);
        JP_correosLayout.setHorizontalGroup(
            JP_correosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JP_correosLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(JP_correosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(JP_correosLayout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addContainerGap())
                    .addGroup(JP_correosLayout.createSequentialGroup()
                        .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(JB_enviarcorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24))
                    .addGroup(JP_correosLayout.createSequentialGroup()
                        .addGroup(JP_correosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TF_asunto, javax.swing.GroupLayout.PREFERRED_SIZE, 467, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TF_receptor, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(174, Short.MAX_VALUE))
                    .addGroup(JP_correosLayout.createSequentialGroup()
                        .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        JP_correosLayout.setVerticalGroup(
            JP_correosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JP_correosLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(JP_correosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(JB_enviarcorreo))
                .addGap(4, 4, 4)
                .addComponent(TF_receptor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel16)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TF_asunto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel17)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 522, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Correos", JP_correos);

        jMenu1.setText("Archivo");

        MI_abrirarchivo.setText("Abrir Archivo");
        jMenu1.add(MI_abrirarchivo);

        JM_recientes.setText("Archivos Recientes");
        jMenu1.add(JM_recientes);

        MI_limpiar.setText("Limpiar");
        jMenu1.add(MI_limpiar);

        MI_salir.setText("Salir");
        jMenu1.add(MI_salir);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JB_ejecutarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JB_ejecutarMouseClicked

        DefaultComboBoxModel CB_Juego = (DefaultComboBoxModel) CB_juego.getModel();
        DefaultTableModel model = (DefaultTableModel) Juego_Tabla1.getModel();
        DefaultTableModel model2 = (DefaultTableModel) Juego_Tabla2.getModel();
        DefaultComboBoxModel Juegos = (DefaultComboBoxModel) CB_idiomajuego.getModel();
        if (CB_Juego.getSelectedItem().equals("Crear") ) {
            Dba db = new Dba("./Lab9P2_RicardoQuiroz_RigobertoBarahona.accdb");
        db.conectar();
        try {
            String nombre = Juego_Nombre1.getText();
            String categoria = Juego_Categoria1.getText();
            String costo = Juego_Costo1.getText();
            
            db.query.execute("INSERT INTO Juegos"
                    + " (Categoria, Costo, NombreJ)"
                    + " VALUES ('" + categoria + "', '" + costo + "', '" + nombre + "')");
            db.commit();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        db.desconectar();
        LibLab9 ll = new LibLab9();
        
            String nombre = Juego_Nombre1.getText();
            String genre = Juego_Categoria1.getText();
            int precio = Integer.parseInt(Juego_Costo1.getText() );
            ArrayList<Lenguaje> temporal = new ArrayList();
            juegos.add( new Juegos( nombre, genre, precio, temporal) );
            model.setRowCount(0);
            for (int i = 0; i < juegos.size(); i++){
                Object [] objs = { i, juegos.get(i).getNombre(), juegos.get(i).getGenre(), juegos.get(i).getPrecio(), juegos.get(i).getLenguas()};
                model.addRow(objs);
            }
            Juego_Tabla1.setModel(model);
            Juegos = new DefaultComboBoxModel(juegos.toArray() );
            CB_idiomajuego.setModel(Juegos);
            JOptionPane.showMessageDialog(this, "Juego Agregado Exitosamente");
            Juego_Nombre1.setText("");
            Juego_Categoria1.setText("");
            Juego_Costo1.setText("");            
        } else if (CB_Juego.getSelectedItem().equals("Modificar") ){
            if (juegos.isEmpty() ){
                JOptionPane.showMessageDialog(this, "No hay Juegos para Modificar");
            }else{
                String nombreB = Juego_Nombre1.getText();
                String nombre = Juego_Nombre2.getText();
                String genre = Juego_Categoria2.getText();
                int precio = Integer.parseInt(Juego_Costo2.getText() );
                for (int i = 0; i < juegos.size(); i++) {
                    if (nombreB.equals(juegos.get(i).getNombre())) {
                        juegos.get(i).setNombre(nombre);
                        juegos.get(i).setGenre(genre);
                        juegos.get(i).setPrecio(precio);
                        JOptionPane.showMessageDialog(this, "Modificacion Exitosa");
                    } else {
                        JOptionPane.showMessageDialog(this, "No se pudo encontrar el juego deseado");
                    }
                }
                model.setRowCount(0);
                for (int i = 0; i < juegos.size(); i++) {
                    Object[] objs = {i, juegos.get(i).getNombre(), juegos.get(i).getGenre(), juegos.get(i).getPrecio(), juegos.get(i).getLenguas()};
                    model.addRow(objs);
                }
                Juego_Tabla1.setModel(model);
                Juegos = new DefaultComboBoxModel(juegos.toArray());
                CB_idiomajuego.setModel(Juegos);
                Juego_Nombre1.setText("");
                Juego_Categoria1.setText("");
                Juego_Costo1.setText("");
                Juego_Nombre2.setText("");
                Juego_Categoria2.setText("");
                Juego_Costo2.setText("");
            }
        } else if (CB_Juego.getSelectedItem().equals("Eliminar") ){
            if (juegos.isEmpty() ){
                JOptionPane.showMessageDialog(this, "No hay Juegos para Eliminar");
            }else{
                String nombre = Juego_Nombre1.getText();
                for (int i = 0; i < juegos.size(); i++){
                    if (nombre.equals( juegos.get(i).getNombre() ) ){
                        juegos.remove(i);
                        JOptionPane.showMessageDialog(this, "Eliminacion Exitosa");
                    } else{
                        JOptionPane.showMessageDialog(this, "No se pudo encontrar el juego");
                    }
                }
                model.setRowCount(0);
                for (int i = 0; i < juegos.size(); i++) {
                    Object[] objs = {i, juegos.get(i).getNombre(), juegos.get(i).getGenre(), juegos.get(i).getPrecio(), juegos.get(i).getLenguas()};
                    model.addRow(objs);
                }
                Juego_Tabla1.setModel(model);
                Juegos = new DefaultComboBoxModel(juegos.toArray());
                CB_idiomajuego.setModel(Juegos);
                Juego_Nombre1.setText("");
                Juego_Categoria1.setText("");
                Juego_Costo1.setText("");
                Juego_Nombre2.setText("");
                Juego_Categoria2.setText("");
                Juego_Costo2.setText("");
            }
        } else {
            JOptionPane.showMessageDialog(this, "Seleccionar");
        }
    }//GEN-LAST:event_JB_ejecutarMouseClicked


    private void JB_registroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JB_registroMouseClicked
        // TODO add your handling code here:
        showRegistro();
    }//GEN-LAST:event_JB_registroMouseClicked

    private void Idioma_CrearMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Idioma_CrearMouseClicked
        Dba db = new Dba("./Lab9P2_RicardoQuiroz_RigobertoBarahona.accdb");
        db.conectar();
        try {
            String nombre = Idioma_Nombre.getText();
            db.query.execute("INSERT INTO Idiomas"
                    + " (NombreI)"
                    + " VALUES ('" + nombre + "')");
            db.commit();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        db.desconectar();
        JOptionPane.showMessageDialog(this, "Idioma creado");
        
        boolean booleano = true;
        DefaultTableModel Lenguajes = (DefaultTableModel) Idioma_Tabla.getModel();
        String lengua = Idioma_Nombre.getText();
        if (lenguajes.isEmpty()){
            lenguajes.add(new Lenguaje(lengua));
        }else{
            for (int i = 0; i < lenguajes.size(); i++) {
                if (lengua.equalsIgnoreCase(lenguajes.get(i).getLengua())) {
                    JOptionPane.showMessageDialog(this, "Lengua ya existe");
                    booleano = false;
                }
            }
            if (booleano==true) {
                lenguajes.add(new Lenguaje(lengua));
            }
        }        
        //lenguajes.add(new Lenguaje(lengua));
        Lenguajes.setRowCount(0);
        for (int i = 0; i < lenguajes.size(); i++) {
            Object[] objs = {i, lenguajes.get(i).getLengua() };
            Lenguajes.addRow(objs);
        }
        Idioma_Tabla.setModel(Lenguajes);
    }//GEN-LAST:event_Idioma_CrearMouseClicked

    private void JB_registrarRMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JB_registrarRMouseClicked
        // TODO add your handling code here:      
        Dba db = new Dba("./Lab9P2_RicardoQuiroz_RigobertoBarahona.accdb");
        db.conectar();
        try {
            String usuario = TF_usuarioR.getText();
            String nombre = TF_nombreR.getText();
            String contrasena = TF_contrasenaR.getText();
            LibLab9.encrypt(contrasena);
            String correo = TF_correoR.getText();
            int edad = (Integer)JS_edadR.getValue();
            db.query.execute("INSERT INTO Usuarios"
                    + " (Usuario, Nombre, Contrasena, Edad, Correo)"
                    + " VALUES ('" + usuario + "', '" + nombre + "', '" + LibLab9.encrypt(contrasena) + "', " + edad + ", '" + correo + "')");
            db.commit();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        db.desconectar();
        JOptionPane.showMessageDialog(this, "Se ha registrado");
        JD_registro.setVisible(false);
    }//GEN-LAST:event_JB_registrarRMouseClicked

    private void JB_ingresarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JB_ingresarMouseClicked
        // TODO add your handling code here:
//        if ((TF_usuario.getText().equals()) && (TF_contrasena.getText().equals())) {
//            JD_login.setVisible(false);
//        }
        Dba db = new Dba("./base1.mdb");
        db.conectar();
        try {
            db.query.execute("select nombre, contrasena from Usuarios");
            
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        db.desconectar();
    }//GEN-LAST:event_JB_ingresarMouseClicked

    private void JB_enviarcorreoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JB_enviarcorreoMouseClicked
        // TODO add your handling code here:
        String mensaje = TA_mensaje.getText();
        String asunto = TF_asunto.getText();
        String receptor = TF_receptor.getText();
        LibLab9 ll = new LibLab9();
        ll.sendMail(mensaje, asunto, receptor);
        JOptionPane.showMessageDialog(this, "Se envio el correo exitosamente");
    }//GEN-LAST:event_JB_enviarcorreoMouseClicked

    private void JB_generarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JB_generarMouseClicked
        // TODO add your handling code here:
        LibLab9 ll = new LibLab9();
        boolean random = true;
        ll.setProgressBar(PB_barra);
        ll.hilo.start();
        ll.colorRand(true);
        
    }//GEN-LAST:event_JB_generarMouseClicked


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
            java.util.logging.Logger.getLogger(Lab9P2_Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Lab9P2_Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Lab9P2_Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Lab9P2_Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Lab9P2_Main().setVisible(true);
            }
        });
    }
    
    public void showLogin(){
        JD_login.setModal(true);
        JD_login.pack();;
        JD_login.setLocationRelativeTo(this);
        JD_login.setVisible(true);
    }
    
    public void showRegistro(){
        JD_registro.setModal(true);
        JD_registro.pack();;
        JD_registro.setLocationRelativeTo(this);
        JD_registro.setVisible(true);
    }
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> CB_idiomajuego;
    private javax.swing.JComboBox<String> CB_juego;
    private javax.swing.JButton Idioma_Agregar;
    private javax.swing.JButton Idioma_Crear;
    private javax.swing.JTextField Idioma_Nombre;
    private javax.swing.JTable Idioma_Tabla;
    private javax.swing.JButton JB_ejecutar;
    private javax.swing.JButton JB_enviarcorreo;
    private javax.swing.JButton JB_generar;
    private javax.swing.JButton JB_ingresar;
    private javax.swing.JButton JB_registrarR;
    private javax.swing.JButton JB_registro;
    private javax.swing.JDialog JD_login;
    private javax.swing.JDialog JD_registro;
    private javax.swing.JMenu JM_recientes;
    private javax.swing.JPanel JP_Idioma;
    private javax.swing.JPanel JP_correos;
    private javax.swing.JPanel JP_juego;
    private javax.swing.JSpinner JS_edadR;
    private javax.swing.JTextField Juego_Categoria1;
    private javax.swing.JTextField Juego_Categoria2;
    private javax.swing.JTextField Juego_Costo1;
    private javax.swing.JTextField Juego_Costo2;
    private javax.swing.JTextField Juego_Nombre1;
    private javax.swing.JTextField Juego_Nombre2;
    private javax.swing.JTable Juego_Tabla1;
    private javax.swing.JTable Juego_Tabla2;
    private javax.swing.JMenuItem MI_abrirarchivo;
    private javax.swing.JMenuItem MI_limpiar;
    private javax.swing.JMenuItem MI_salir;
    private javax.swing.JProgressBar PB_barra;
    private javax.swing.JTextArea TA_mensaje;
    private javax.swing.JTextField TF_asunto;
    private javax.swing.JTextField TF_contrasena;
    private javax.swing.JTextField TF_contrasenaR;
    private javax.swing.JTextField TF_correoR;
    private javax.swing.JTextField TF_nombreR;
    private javax.swing.JTextField TF_receptor;
    private javax.swing.JTextField TF_usuario;
    private javax.swing.JTextField TF_usuarioR;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTabbedPane jTabbedPane1;
    // End of variables declaration//GEN-END:variables
}
