package naturalife;
//@author LUIS BEDOYA

import java.awt.Color;
import java.awt.Event;
import java.awt.Font;
import java.awt.Image;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.CellRendererPane;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.Timer;
import javax.swing.border.Border;
import javax.swing.border.MatteBorder;
import javax.swing.table.DefaultTableModel;

public class Interfaz_Admin extends javax.swing.JFrame {
Archivo obj = new Archivo();
Reporte i = new Reporte();
DefaultTableModel modelo = new DefaultTableModel();
DefaultTableModel modelo2 = new DefaultTableModel();

    public Interfaz_Admin() {
        setUndecorated(true);//Quitamos Barra Superior.
        initComponents();
        setLocationRelativeTo(null);//Centrar Interfaz.
        jLabel7.setText(fECHA());
        jLabel8.setVisible(false);
        
        jButton5.setVisible(false);
        jLabel10.setVisible(false);
       
   
        //----------------------------------------------------------------------
        //Cuando el fichero existe.
          try {
            File archivo = new File ("Datos.txt");
            FileReader fichero = new FileReader(archivo);
            BufferedReader leer = new BufferedReader(fichero);
            String linea = ""; 
           
            modelo.setRowCount(0);
            jTable1.setModel(modelo);
            int contador = 0;
             Object[] datos = new Object[7];
        if (modelo.getColumnCount() == 0) {
            modelo.addColumn("Código");
            modelo.addColumn("Nombre");
            modelo.addColumn("Presentación");
            modelo.addColumn("Precio Compra");
            modelo.addColumn("Precio Venta");
            modelo.addColumn("Cantidad");
            modelo.addColumn("Vencimiento");
        }while (linea != null ){
            linea = leer.readLine();
            String[] parts = linea.split(" ");
            for (int p = 0; p < 7; p++) {
                datos[p] = parts[p];
            }
             modelo.addRow(datos);
            contador++;
        }
        leer.close();
            
        } catch (Exception e) {
        }
          
       //Reportes
           try {
            File archivo = new File ("Clientes.txt");
            FileReader ficher = new FileReader(archivo);
            BufferedReader leer = new BufferedReader(ficher);
            String linea = ""; 
           
            modelo2.setRowCount(0);
            jTable2.setModel(modelo2);
            int contador = 0;
             Object[] datos = new Object[6];
        if (modelo2.getColumnCount() == 0) {
            modelo2.addColumn("Producto");
            modelo2.addColumn("Fecha Venta");
            modelo2.addColumn("ID Cliente");
            modelo2.addColumn("Nombre Cliente");
            modelo2.addColumn("Cantidad");
            modelo2.addColumn("Pago");
            
            
        }while (linea != null){
            linea = leer.readLine();
            String[] parts = linea.split(" ");
            for (int p = 0; p < 6; p++) {
                datos[p] = parts[p];
            }
            modelo2.addRow(datos);
            contador++;
        }
        leer.close();
            
        } catch (Exception e) {
        }
        
        //Personalizar tabla 
        jTable1.getTableHeader().setFont(new Font( "Segoe UI", Font.PLAIN, 11 ));
        jTable1.getTableHeader().setOpaque(false);
        jTable1.getTableHeader().setBackground(new Color(70, 176, 75));
        jTable1.getTableHeader().setForeground(new Color(254, 254, 254));
        jTable1.setRowHeight(20);
        
        jTable2.getTableHeader().setFont(new Font( "Segoe UI", Font.PLAIN, 11 ));
        jTable2.getTableHeader().setOpaque(false);
        jTable2.getTableHeader().setBackground(new Color(70, 176, 75));
        jTable2.getTableHeader().setForeground(new Color(254, 254, 254));
        jTable2.setRowHeight(20);
        
        
        
        
        
        
       
        
       
        //el panel que corresponde al boton almacen es visible
        jPanel3.setVisible(true);
        jPanel4.setVisible(false);
        
        
        //Cuando el programa corra, ya el boton almacen estara seleccionado
        jButton3.setBackground(new Color(215,235,213));//Se cambia el color a verde 
        ImageIcon AlmacenVerde = new ImageIcon(getClass().getResource("/Iconos/Icono almacen.png"));//Nos metemos en el paquete iconos y agarramos el icono
        jButton3.setIcon(AlmacenVerde);//ponemos el icono en el boton.
        jButton3.setForeground(new Color(70,176,75));//Cambiamos el color del texto
        jButton3.setBorder(new MatteBorder(0, 4, 0, 0, new Color(70,176,75)));//y el borde de la izquierda se hace visible de color verde
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSplitPane1 = new javax.swing.JSplitPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jSeparator5 = new javax.swing.JSeparator();
        jButton5 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel9 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jPanel8 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jSplitPane1.setBorder(null);
        jSplitPane1.setDividerSize(0);

        jPanel1.setBackground(new java.awt.Color(245, 247, 244));
        jPanel1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 2, 2, 0, new java.awt.Color(70, 176, 75)));

        jLabel1.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(188, 190, 187));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Icono Natura.png"))); // NOI18N
        jLabel1.setText(" NaturaLife");

        jSeparator1.setBackground(new java.awt.Color(241, 243, 240));
        jSeparator1.setForeground(new java.awt.Color(241, 243, 240));

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Admin.png"))); // NOI18N

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(57, 60, 65));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Hola, Admin");
        jLabel3.setToolTipText("");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(168, 170, 167));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Menú ");

        jButton3.setBackground(new java.awt.Color(245, 247, 244));
        jButton3.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jButton3.setForeground(new java.awt.Color(186, 188, 185));
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Almacen.png"))); // NOI18N
        jButton3.setText("Almacen");
        jButton3.setBorder(null);
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton3MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton3MouseExited(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jButton3MouseReleased(evt);
            }
        });
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jButton3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jButton3KeyReleased(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(245, 247, 244));
        jButton4.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jButton4.setForeground(new java.awt.Color(186, 188, 185));
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Reportes.png"))); // NOI18N
        jButton4.setText("Reportes");
        jButton4.setBorder(null);
        jButton4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton4MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton4MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton4MouseExited(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jButton4MouseReleased(evt);
            }
        });
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jButton4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jButton4KeyReleased(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(245, 247, 244));
        jButton2.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jButton2.setForeground(new java.awt.Color(186, 188, 185));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Log Out.png"))); // NOI18N
        jButton2.setText("   Log Out");
        jButton2.setBorder(null);
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton2MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton2MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jButton2MouseReleased(evt);
            }
        });
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jButton2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jButton2KeyReleased(evt);
            }
        });

        jSeparator2.setBackground(new java.awt.Color(241, 243, 240));
        jSeparator2.setForeground(new java.awt.Color(241, 243, 240));

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Clock.png"))); // NOI18N

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(57, 60, 65));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Fecha");

        jSeparator3.setBackground(new java.awt.Color(241, 243, 240));
        jSeparator3.setForeground(new java.awt.Color(241, 243, 240));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jSeparator2)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, 137, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(20, 20, 20))))
            .addComponent(jSeparator3)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 155, Short.MAX_VALUE)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jSplitPane1.setLeftComponent(jPanel1);

        jPanel2.setLayout(new java.awt.CardLayout());

        jPanel3.setBackground(new java.awt.Color(254, 254, 254));
        jPanel3.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 2, new java.awt.Color(70, 176, 75)));

        jSeparator5.setBackground(new java.awt.Color(241, 243, 240));
        jSeparator5.setForeground(new java.awt.Color(241, 243, 240));

        jButton5.setBackground(new java.awt.Color(70, 176, 75));
        jButton5.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Add.png"))); // NOI18N
        jButton5.setText("Agregar");
        jButton5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(70, 176, 75)));
        jButton5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton5MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton5MouseExited(evt);
            }
        });
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(57, 60, 65));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("AGREGAR PRODUCTO");
        jLabel5.setToolTipText("");

        jTextField1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(168, 170, 167));
        jTextField1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField1.setText("Código");
        jTextField1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(70, 176, 75)));
        jTextField1.setOpaque(false);
        jTextField1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField1MouseClicked(evt);
            }
        });
        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField1KeyReleased(evt);
            }
        });

        jTextField2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTextField2.setForeground(new java.awt.Color(168, 170, 167));
        jTextField2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField2.setText("Nombre");
        jTextField2.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(70, 176, 75)));
        jTextField2.setOpaque(false);
        jTextField2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField2MouseClicked(evt);
            }
        });
        jTextField2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField2KeyReleased(evt);
            }
        });

        jTextField3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTextField3.setForeground(new java.awt.Color(168, 170, 167));
        jTextField3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField3.setText("Presentación");
        jTextField3.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(70, 176, 75)));
        jTextField3.setOpaque(false);
        jTextField3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField3MouseClicked(evt);
            }
        });
        jTextField3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField3KeyReleased(evt);
            }
        });

        jTextField4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTextField4.setForeground(new java.awt.Color(168, 170, 167));
        jTextField4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField4.setText("Precio Venta");
        jTextField4.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(70, 176, 75)));
        jTextField4.setOpaque(false);
        jTextField4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField4MouseClicked(evt);
            }
        });
        jTextField4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField4KeyReleased(evt);
            }
        });

        jTextField5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTextField5.setForeground(new java.awt.Color(168, 170, 167));
        jTextField5.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField5.setText("Precio Compra");
        jTextField5.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(70, 176, 75)));
        jTextField5.setOpaque(false);
        jTextField5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField5MouseClicked(evt);
            }
        });
        jTextField5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField5KeyReleased(evt);
            }
        });

        jTextField6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTextField6.setForeground(new java.awt.Color(168, 170, 167));
        jTextField6.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField6.setText("Cantidad");
        jTextField6.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(70, 176, 75)));
        jTextField6.setOpaque(false);
        jTextField6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField6MouseClicked(evt);
            }
        });
        jTextField6.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField6KeyReleased(evt);
            }
        });

        jTextField7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTextField7.setForeground(new java.awt.Color(168, 170, 167));
        jTextField7.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField7.setText("Vencimiento");
        jTextField7.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(70, 176, 75)));
        jTextField7.setOpaque(false);
        jTextField7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField7MouseClicked(evt);
            }
        });
        jTextField7.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField7KeyReleased(evt);
            }
        });

        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Check.png"))); // NOI18N

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(57, 60, 65));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Código", "Nombre", "Presentación", "Precio Compra", "Precio Venta", "Cantidad", "Vencimiento"
            }
        ));
        jScrollPane3.setViewportView(jTable1);

        jPanel9.setBackground(new java.awt.Color(121, 197, 124));
        jPanel9.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 4, new java.awt.Color(70, 176, 75)));

        jLabel18.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Natura Blanco.png"))); // NOI18N
        jLabel18.setText("Agrega productos y  garantiza la satisfacción de tus clientes");

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel18, javax.swing.GroupLayout.DEFAULT_SIZE, 520, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addContainerGap()
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jScrollPane3)
                                .addGroup(jPanel3Layout.createSequentialGroup()
                                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(jPanel3Layout.createSequentialGroup()
                                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addComponent(jTextField7)
                                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(jPanel3Layout.createSequentialGroup()
                                                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGap(18, 18, 18)
                                                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGap(18, 18, 18)
                                                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGap(18, 18, 18)
                                                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGap(18, 18, 18)
                                                    .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addGap(0, 132, Short.MAX_VALUE))))
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addGap(22, 22, 22)
                            .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(164, 164, 164)
                        .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 469, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel2.add(jPanel3, "card2");

        jPanel4.setBackground(new java.awt.Color(254, 254, 254));
        jPanel4.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 2, new java.awt.Color(70, 176, 75)));

        jTable2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Producto ", "ID Cliente", "Nombre Cliente", "Precio Producto", "Cantidad"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        jPanel8.setBackground(new java.awt.Color(121, 197, 124));
        jPanel8.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 4, new java.awt.Color(70, 176, 75)));

        jLabel16.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Natura Blanco.png"))); // NOI18N
        jLabel16.setText("   VENTAS NATURALIFE");

        jLabel17.setBackground(new java.awt.Color(255, 255, 255));
        jLabel17.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setText("Reportes de ventas, Mostramos el desempeño de tu equipo");
        jLabel17.setToolTipText("");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel17, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addContainerGap(160, Short.MAX_VALUE)
                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(114, 114, 114))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel17)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 801, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel4Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 589, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel2.add(jPanel4, "card3");

        jSplitPane1.setRightComponent(jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents



//------------------------------------------------------------------------------
    //Método leer tabla

//------------------------------------------------------------------------------
 
//------------------------------------------------------------------------------
//Códigos Iguales
      public String CodigoIguales(int cod) throws FileNotFoundException, IOException {
         
                File archivo = new File ("Datos.txt");
        FileReader fichero = new FileReader(archivo);
        BufferedReader leer = new BufferedReader(fichero); 
        String linea = ""; 
        
    
        int contador = 0;
        String Mensaje = "";
        while (linea != null && contador < obj.Cantidad_LineasArchivoFicheroexistente()){
            linea = leer.readLine();
            String[] parts = linea.split(" ");
                if (cod == Integer.parseInt(parts[0])) {
                Mensaje = "El Código " + parts[0] + "  ya se encuentra en el fichero ";
            }
             contador++;
       }
        leer.close();
    return Mensaje;
 }
//------------------------------------------------------------------------------
  //Método validacion 
    public void Validacion(){
    if(!jTextField1.getText().isEmpty() && !jTextField2.getText().isEmpty() && !jTextField3.getText().isEmpty() && !jTextField4.getText().isEmpty() && !jTextField5.getText().isEmpty() && !jTextField6.getText().isEmpty() && !jTextField7.getText().isEmpty() && !jTextField1.getText().equals("Código") && !jTextField2.getText().equals("Nombre") && !jTextField3.getText().equals("Presentación") && !jTextField4.getText().equals("Precio Venta") && !jTextField5.getText().equals("Precio Compra") && !jTextField6.getText().equals("Cantidad") && !jTextField7.getText().equals("Vencimiento") ){
        
        jButton5.setVisible(true);
        jLabel8.setVisible(true);
        ImageIcon Check = new ImageIcon(getClass().getResource("/Iconos/Check.png"));//Nos metemos en el paquete iconos y agarramos el icono
        jLabel8.setIcon(Check);
        jLabel5.setText("Todo Correcto");
        jLabel5.setForeground(new Color(36,162,73));
        jSeparator5.setBackground(new Color(36,162,73));
        jSeparator5.setForeground(new Color(36,162,73)); 
        
    }else{
        
       jLabel8.setVisible(true);
        ImageIcon PencilRojo = new ImageIcon(getClass().getResource("/Iconos/Pencil Rojo.png"));//Nos metemos en el paquete iconos y agarramos el icono
        jLabel8.setIcon(PencilRojo);
        
        jLabel5.setText("Ingrese Todos Los Datos");
        jLabel5.setForeground(new Color(36,162,73));
        jSeparator5.setBackground(new Color(36,162,73));
        jSeparator5.setForeground(new Color(36,162,73));
        jButton5.setVisible(false);
}
}       
    
//------------------------------------------------------------------------------
    //Método Al meter valor erroneo 
    public void Valor_erroneoCodigo(){
        try{
            int cod = Integer.parseInt(jTextField1.getText());
            jLabel5.setText("Ingrese Todos Los Datos");
            jLabel5.setForeground(new Color(36,162,73));
            jSeparator5.setBackground(new Color(36,162,73));
            jSeparator5.setForeground(new Color(36,162,73));
        }catch (NumberFormatException e){
            
            jLabel5.setText("Ingresa Valor Númerico");
            jLabel5.setForeground(new Color(224,67,67));
            jSeparator5.setBackground(new Color(224,67,67));
            jSeparator5.setForeground(new Color(224,67,67));
         
            jButton5.setVisible(false);
        }
    
    }
    //---------------------------------------------------------------------------

    //Método Al meter valor erroneo 
    public void Valor_erroneoprecio(){
        try{
           int PrecioC = Integer.parseInt(jTextField5.getText());
            jLabel5.setText("Ingrese Todos Los Datos");
            jLabel5.setForeground(new Color(36,162,73));
            jSeparator5.setBackground(new Color(36,162,73));
            jSeparator5.setForeground(new Color(36,162,73));
        }catch (NumberFormatException e){
            
            jLabel5.setText("Ingresa Valor Entero");
            jLabel5.setForeground(new Color(224,67,67));
            jSeparator5.setBackground(new Color(224,67,67));
            jSeparator5.setForeground(new Color(224,67,67));
         
            jButton5.setVisible(false);
        }
    
    }
    
    public void Valor_erroneoprecio2(){
        try{
          int PrecioV = Integer.parseInt(jTextField4.getText());
            jLabel5.setText("Ingrese Todos Los Datos");
            jLabel5.setForeground(new Color(36,162,73));
            jSeparator5.setBackground(new Color(36,162,73));
            jSeparator5.setForeground(new Color(36,162,73));
        }catch (NumberFormatException e){
            
            jLabel5.setText("Ingresa Valor Entero");
            jLabel5.setForeground(new Color(224,67,67));
            jSeparator5.setBackground(new Color(224,67,67));
            jSeparator5.setForeground(new Color(224,67,67));
         
            jButton5.setVisible(false);
        }
    
    }

        
    public void Valor_erroneoCantidad(){
        try{
            int Cantidad = Integer.parseInt(jTextField6.getText());
            jLabel5.setText("Ingrese Todos Los Datos");
            jLabel5.setForeground(new Color(36,162,73));
            jSeparator5.setBackground(new Color(36,162,73));
            jSeparator5.setForeground(new Color(36,162,73));
        }catch (NumberFormatException e){
            
            jLabel5.setText("Ingresa La Cantidad que deseas");
            jLabel5.setForeground(new Color(224,67,67));
            jSeparator5.setBackground(new Color(224,67,67));
            jSeparator5.setForeground(new Color(224,67,67));
         
            jButton5.setVisible(false);
        }
    
    }
 
//------------------------------------------------------------------------------
    public void Validaciondecodigo() {
           
            try {
                int codigo = Integer.parseInt(jTextField1.getText());
                jLabel10.setVisible(true);
                jLabel10.setText(CodigoIguales(codigo));
                jLabel10.setForeground(new Color(224,67,67));
               
            } catch (IOException ex) {
               
            }catch ( NumberFormatException ex) {
            }
        
   
}
   
    //Método Mostrar Fecha
        public String fECHA(){
       //Creamos un objeto de tipo Date
       Date Fecha = new Date();
       //Utilizamos la clase simpledateformat, esto nos ayuda a mostrar las fechas en el formato que queremos y nos permite convertir de date a String
       SimpleDateFormat FechaActual = new SimpleDateFormat("dd/MM/YYYY");
        return FechaActual.format(Fecha);//Returnamos la fecha
    }
//------------------------------------------------------------------------------
 
     //Método Color y panel del boton almacen
    public void ColorBotonAlmacen(){
            if(jButton3.isEnabled()){
                //Cuando el boton sea seleccionado hacemos visible el panel correspondinte
                jPanel3.setVisible(true);
                jPanel4.setVisible(false);
                
            //Si el Boton almacen es seleccionado se pone todo de color verde
               
                jButton3.setBackground(new Color(215,235,213));//Se cambia el color a verde 
                ImageIcon AlmacenVerde = new ImageIcon(getClass().getResource("/Iconos/Icono almacen.png"));//Nos metemos en el paquete iconos y agarramos el icono
                jButton3.setIcon(AlmacenVerde);//ponemos el icono en el boton.
                jButton3.setForeground(new Color(70,176,75));//Cambiamos el color del texto
                jButton3.setBorder(new MatteBorder(0, 4, 0, 0, new Color(70,176,75)));//y el borde de la izquierda se hace visible de color verde
                
                //Y el color de los otros botones sera gris
                
               
            
                 //Boton Reportes Se pone gris
                jButton4.setBackground(new Color(245,247,244));//Se cambia el color normal
                ImageIcon Reportes = new ImageIcon(getClass().getResource("/Iconos/Reportes.png"));//Nos metemos en el paquete iconos y agarramos el icono
                jButton4.setIcon(Reportes);//ponemos el icono normal en el boton.
                jButton4.setForeground(new Color(186,188,185));//Cambiamos el color del texto al normal
                jButton4.setBorder(new MatteBorder(0, 0, 0, 0, new Color(245,247,244)));//y el borde no se ve
                
               
                
                //Boton Log Out Se pone De color Gris
                jButton2.setBackground(new Color(245,247,244));//Se cambia el color normal
                ImageIcon LogOut = new ImageIcon(getClass().getResource("/Iconos/Log Out.png"));//Nos metemos en el paquete iconos y agarramos el icono
                jButton2.setIcon(LogOut);//ponemos el icono normal en el boton.
                jButton2.setForeground(new Color(186,188,185));//Cambiamos el color del texto al normal
                jButton2.setBorder(new MatteBorder(0, 0, 0, 0, new Color(245,247,244)));//y el borde no se ve
       }      
    }
    
    //-----------------------------------------------------------------------------------------------------------------------------------------------------
   //Método Color y panel del boton Reportes
    public void ColorBotonReportes(){
          if(jButton4.isEnabled()){
                //Cuando el boton sea seleccionado hacemos visible el panel correspondinte
                jPanel3.setVisible(false);
                jPanel4.setVisible(true);
               
                //Si el boton reportes es Seleccionado, el boton reportes sera verde.
                jButton4.setBackground(new Color(215,235,213));//Se cambia el color a verde 
                ImageIcon ReportesVerde = new ImageIcon(getClass().getResource("/Iconos/Reportes Color Verde.png"));//Nos metemos en el paquete iconos y agarramos el icono
                jButton4.setIcon(ReportesVerde);//ponemos el icono en el boton.
                jButton4.setForeground(new Color(70,176,75));//Cambiamos el color del texto
                jButton4.setBorder(new MatteBorder(0, 4, 0, 0, new Color(70,176,75)));//y el borde de la izquierda se hace visible 
           
                   //Y el color de los otros botones sera gris
                //El boton Almacen se pone gris
                jButton3.setBackground(new Color(245,247,244));//Se cambia el color normal
                ImageIcon Almacen = new ImageIcon(getClass().getResource("/Iconos/Almacen.png"));//Nos metemos en el paquete iconos y agarramos el icono
                jButton3.setIcon(Almacen);//ponemos el icono normal
                jButton3.setForeground(new Color(186,188,185));//Cambiamos el color del texto al normal
                jButton3.setBorder(new MatteBorder(0, 0, 0, 0, new Color(245,247,244)));//y el borde no se ve
                
                
                
                //Boton Log Out Se pone De color Gris
                jButton2.setBackground(new Color(245,247,244));//Se cambia el color normal
                ImageIcon LogOut = new ImageIcon(getClass().getResource("/Iconos/Log Out.png"));//Nos metemos en el paquete iconos y agarramos el icono
                jButton2.setIcon(LogOut);//ponemos el icono normal en el boton.
                jButton2.setForeground(new Color(186,188,185));//Cambiamos el color del texto al normal
                jButton2.setBorder(new MatteBorder(0, 0, 0, 0, new Color(245,247,244)));//y el borde no se ve
            }
   }
   //---------------------------------------------------------------------------------------------------------------    
    //Método Color y panel del boton Acerca De
 
    //-----------------------------------------------------------------------------------------------------------------------------
    //Métodos Color Log Out
    public void ColorBotonLogOut(){
        if(jButton2.isEnabled()){
              // Si el boton Log Out es seleccionado, el boton se pone verde
                jButton2.setBackground(new Color(215,235,213));//Se cambia el color a verde 
                ImageIcon LogVerde = new ImageIcon(getClass().getResource("/Iconos/Log Out Verde.png"));//Nos metemos en el paquete iconos y agarramos el icono
                jButton2.setIcon(LogVerde);//ponemos el icono en el boton.
                jButton2.setForeground(new Color(70,176,75));//Cambiamos el color del texto
                jButton2.setBorder(new MatteBorder(0, 4, 0, 0, new Color(70,176,75)));//y el borde de la izquierda se hace visible 
                //Y el color de los otros botones sera gris
                //El boton Almacen se pone gris
                jButton3.setBackground(new Color(245,247,244));//Se cambia el color normal
                ImageIcon Almacen = new ImageIcon(getClass().getResource("/Iconos/Almacen.png"));//Nos metemos en el paquete iconos y agarramos el icono
                jButton3.setIcon(Almacen);//ponemos el icono normal
                jButton3.setForeground(new Color(186,188,185));//Cambiamos el color del texto al normal
                jButton3.setBorder(new MatteBorder(0, 0, 0, 0, new Color(245,247,244)));//y el borde no se ve
                
                //Boton Reportes Se pone gris
                jButton4.setBackground(new Color(245,247,244));//Se cambia el color normal
                ImageIcon Reportes = new ImageIcon(getClass().getResource("/Iconos/Reportes.png"));//Nos metemos en el paquete iconos y agarramos el icono
                jButton4.setIcon(Reportes);//ponemos el icono normal en el boton.
                jButton4.setForeground(new Color(186,188,185));//Cambiamos el color del texto al normal
                jButton4.setBorder(new MatteBorder(0, 0, 0, 0, new Color(245,247,244)));//y el borde no se ve
                
                  
               
        
            
            }
        
        }  
    //-------------------------------------------------------------------------------------------------------------------------------
     
    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
            ColorBotonReportes();

    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseEntered

    }//GEN-LAST:event_jButton3MouseEntered

    private void jButton3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseExited
         
    }//GEN-LAST:event_jButton3MouseExited

    private void jButton4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseEntered
      
    }//GEN-LAST:event_jButton4MouseEntered

    private void jButton4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseExited

      
    }//GEN-LAST:event_jButton4MouseExited
 
    private void jButton2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseEntered
     
    }//GEN-LAST:event_jButton2MouseEntered

    private void jButton2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseExited

    }//GEN-LAST:event_jButton2MouseExited

    private void jButton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseClicked
       
    }//GEN-LAST:event_jButton3MouseClicked

    private void jButton3KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButton3KeyReleased
       
    }//GEN-LAST:event_jButton3KeyReleased

    private void jButton4KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButton4KeyReleased
      
    }//GEN-LAST:event_jButton4KeyReleased

    private void jButton4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseClicked
        
       
    }//GEN-LAST:event_jButton4MouseClicked
 
    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
           
    }//GEN-LAST:event_jButton2MouseClicked

    private void jButton2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MousePressed
          
    }//GEN-LAST:event_jButton2MousePressed

    private void jButton2MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseReleased
        
    }//GEN-LAST:event_jButton2MouseReleased

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        ColorBotonLogOut();
        Interfaz_Login Login= new Interfaz_Login();
        Login.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButton2KeyReleased
        
    }//GEN-LAST:event_jButton2KeyReleased

    private void jButton3MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseReleased
        
    }//GEN-LAST:event_jButton3MouseReleased

    private void jButton4MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseReleased
        
    }//GEN-LAST:event_jButton4MouseReleased

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
         ColorBotonAlmacen();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
         //Cuando se hace un fichero por primera vez
        obj.setRutaArchivo("Datos.txt");
         
         try {
            int cod = Integer.parseInt(jTextField1.getText());
            String nom = jTextField2.getText();
            String Present = jTextField3.getText();
            int PrecioC = Integer.parseInt(jTextField5.getText());
            int PrecioV = Integer.parseInt(jTextField4.getText());
            int Canti = Integer.parseInt(jTextField6.getText());
            String Ven = jTextField7.getText();
            
            obj.guardar_Datos(cod + " " + nom + " " + Present + " " +  PrecioC  + " "+ PrecioV + " " + Canti + " " + Ven);
                jTextField1.setText("");
                jTextField2.setText("");
                jTextField3.setText("");
                jTextField4.setText("");
                jTextField5.setText("");
                jTextField6.setText("");
                jTextField7.setText("");
                
            
         }catch (IOException ex) {
            Logger.getLogger(Interfaz_Admin.class.getName()).log(Level.SEVERE, null, ex);
        }
        
         //tabla
         try {
            leertabla(obj.getRutaArchivo());
            jTextField1.setText("Código");
            jTextField1.setForeground(new Color(168,170,167));
            jTextField2.setText("Nombre");
            jTextField2.setForeground(new Color(168,170,167));
            jTextField3.setText("Presentación");
            jTextField3.setForeground(new Color(168,170,167));
            jTextField4.setText("Precio Venta");
            jTextField4.setForeground(new Color(168,170,167));
            jTextField5.setText("Precio Compra");
            jTextField5.setForeground(new Color(168,170,167));
            jTextField6.setText("Cantidad");
            jTextField6.setForeground(new Color(168,170,167));
            jTextField7.setText("Vencimiento");
            jTextField7.setForeground(new Color(168,170,167));
            
            
            
        } catch (IOException ex) {
            Logger.getLogger(Interfaz_Admin.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton5ActionPerformed
    //Cuando se crea por primera vez el fichero 
    public void leertabla(String rutaArchivo) throws FileNotFoundException, IOException {
         //Cuando se hace un fechero por primera vez
        String linea = ""; //variable para asignar cada línea del archivo.
        FileReader fichero = new FileReader(rutaArchivo);
        BufferedReader leer = new BufferedReader(fichero);
        modelo.setRowCount(0);
        jTable1.setModel(modelo);
        int contador = 0;
        Object[] datos = new Object[7];
        if (modelo.getColumnCount() == 0) {
            modelo.addColumn("Código");
            modelo.addColumn("Nombre");
            modelo.addColumn("Presentación");
            modelo.addColumn("Precio Compra");
            modelo.addColumn("Precio Venta");
            modelo.addColumn("Cantidad");
            modelo.addColumn("Vencimiento");
        }
        while (linea != null && contador < obj.Cantidad_LineasArchivo()) {
            linea = leer.readLine();
            String[] parts = linea.split(" ");
            for (int p = 0; p < 7; p++) {
                datos[p] = parts[p];
                
            }
            modelo.addRow(datos);
            contador++;

        }

        leer.close();

    }
    private void jTextField1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField1MouseClicked
        jTextField1.setText("");
        jTextField1.setForeground(new Color(57,60,65));
    }//GEN-LAST:event_jTextField1MouseClicked

    private void jTextField2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField2MouseClicked
        jTextField2.setText("");
        jTextField2.setForeground(new Color(57,60,65));
    }//GEN-LAST:event_jTextField2MouseClicked

    private void jTextField3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField3MouseClicked
        jTextField3.setText("");
        jTextField3.setForeground(new Color(57,60,65));
    }//GEN-LAST:event_jTextField3MouseClicked

    private void jTextField5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField5MouseClicked
        jTextField5.setText("");
        jTextField5.setForeground(new Color(57,60,65));
    }//GEN-LAST:event_jTextField5MouseClicked

    private void jTextField4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField4MouseClicked
        jTextField4.setText("");
        jTextField4.setForeground(new Color(57,60,65));
    }//GEN-LAST:event_jTextField4MouseClicked

    private void jTextField6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField6MouseClicked
        jTextField6.setText("");
        jTextField6.setForeground(new Color(57,60,65));
    }//GEN-LAST:event_jTextField6MouseClicked

    private void jTextField7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField7MouseClicked
        jTextField7.setText("");
        jTextField7.setForeground(new Color(57,60,65));
        
    }//GEN-LAST:event_jTextField7MouseClicked

    private void jTextField1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyReleased
        Validacion();
        Valor_erroneoCodigo();
        Validaciondecodigo();
    }//GEN-LAST:event_jTextField1KeyReleased

    private void jTextField2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField2KeyReleased
        Validacion();
        
        
    }//GEN-LAST:event_jTextField2KeyReleased

    private void jTextField3KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField3KeyReleased
        Validacion();
        
        
    }//GEN-LAST:event_jTextField3KeyReleased

    private void jTextField5KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField5KeyReleased
        Validacion();
        Valor_erroneoprecio();
        
        
    }//GEN-LAST:event_jTextField5KeyReleased

    private void jTextField4KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField4KeyReleased
        Validacion();
        Valor_erroneoprecio2();
        
        
        
        
       
    
    }//GEN-LAST:event_jTextField4KeyReleased

    private void jTextField6KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField6KeyReleased
        Validacion();
        Valor_erroneoCantidad();
        
    }//GEN-LAST:event_jTextField6KeyReleased

    private void jTextField7KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField7KeyReleased
         Validacion();
     
    }//GEN-LAST:event_jTextField7KeyReleased

    private void jButton5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton5MouseEntered
        jButton5.setBackground(Color.LIGHT_GRAY);
    }//GEN-LAST:event_jButton5MouseEntered

    private void jButton5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton5MouseExited
        jButton5.setBackground(new Color(70,176,75));
    }//GEN-LAST:event_jButton5MouseExited

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
            java.util.logging.Logger.getLogger(Interfaz_Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Interfaz_Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Interfaz_Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interfaz_Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interfaz_Admin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    // End of variables declaration//GEN-END:variables
}
