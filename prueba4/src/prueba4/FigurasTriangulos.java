/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prueba4;
import static java.lang.Math.pow;
/**
 *
 * @author ESFOT
 */
public class FigurasTriangulos extends javax.swing.JFrame {

    /**
     * Creates new form FigurasTriangulos
     */
    String opcion;
    
    public FigurasTriangulos() {
        initComponents();
         panelRectangulo.setVisible(false);
        panelIsosceles.setVisible(false);
        panelEscaleno.setVisible(false);
        panelEquilatero.setVisible(false);
        txtArea.setEnabled(false);
        txtPerimetro.setEnabled(false);
        txtAltura.setEnabled(false);
    }

     public double calcularC(double a, double b) {
         double c=0;
         c=Math.sqrt(Math.pow(a, 2)+Math.pow(a, 2));
		return c;
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
        jLabel2 = new javax.swing.JLabel();
        cmbTipo = new javax.swing.JComboBox<>();
        panelRectangulo = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtLado1Rec = new javax.swing.JTextField();
        txtLado2Rec = new javax.swing.JTextField();
        txtAngulo = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        panelIsosceles = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtLadoaIs = new javax.swing.JTextField();
        txtLadobIs = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        panelEscaleno = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        txtLado1Es = new javax.swing.JTextField();
        txtLado2Es = new javax.swing.JTextField();
        txtLado3Es = new javax.swing.JTextField();
        panelEquilatero = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        txtLado1Eq = new javax.swing.JTextField();
        btnCalcular = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtArea = new javax.swing.JTextField();
        txtPerimetro = new javax.swing.JTextField();
        txtAltura = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("TRIÁNGULOS");

        jLabel2.setText("Tipo de Triangulo");

        cmbTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Rectangulo", "Isosceles", "Escaleno", "Equilatero" }));
        cmbTipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbTipoActionPerformed(evt);
            }
        });

        panelRectangulo.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel7.setText("lado1");

        jLabel8.setText("lado 2");

        jLabel9.setText("altura");

        jLabel12.setText("Rectangulo");

        javax.swing.GroupLayout panelRectanguloLayout = new javax.swing.GroupLayout(panelRectangulo);
        panelRectangulo.setLayout(panelRectanguloLayout);
        panelRectanguloLayout.setHorizontalGroup(
            panelRectanguloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRectanguloLayout.createSequentialGroup()
                .addGroup(panelRectanguloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelRectanguloLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(panelRectanguloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9))
                        .addGap(5, 5, 5)
                        .addGroup(panelRectanguloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtAngulo, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtLado2Rec, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtLado1Rec, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(panelRectanguloLayout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(jLabel12)))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        panelRectanguloLayout.setVerticalGroup(
            panelRectanguloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRectanguloLayout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelRectanguloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtLado1Rec, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(panelRectanguloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtLado2Rec, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelRectanguloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txtAngulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20))
        );

        panelIsosceles.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel10.setText("lado a");

        jLabel11.setText("lado b");

        jLabel13.setText("Isosceles");

        javax.swing.GroupLayout panelIsoscelesLayout = new javax.swing.GroupLayout(panelIsosceles);
        panelIsosceles.setLayout(panelIsoscelesLayout);
        panelIsoscelesLayout.setHorizontalGroup(
            panelIsoscelesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelIsoscelesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelIsoscelesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelIsoscelesLayout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addGap(18, 18, 18)
                        .addComponent(txtLadoaIs))
                    .addGroup(panelIsoscelesLayout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addGap(18, 18, 18)
                        .addComponent(txtLadobIs)))
                .addContainerGap())
            .addGroup(panelIsoscelesLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel13)
                .addContainerGap(54, Short.MAX_VALUE))
        );
        panelIsoscelesLayout.setVerticalGroup(
            panelIsoscelesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelIsoscelesLayout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelIsoscelesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10)
                    .addComponent(txtLadoaIs, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(panelIsoscelesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(txtLadobIs, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelEscaleno.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel14.setText("Escaleno");

        jLabel15.setText("lado 1");

        jLabel16.setText("lado 2");

        jLabel17.setText("lado 3");

        javax.swing.GroupLayout panelEscalenoLayout = new javax.swing.GroupLayout(panelEscaleno);
        panelEscaleno.setLayout(panelEscalenoLayout);
        panelEscalenoLayout.setHorizontalGroup(
            panelEscalenoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelEscalenoLayout.createSequentialGroup()
                .addGroup(panelEscalenoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelEscalenoLayout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(jLabel14)
                        .addGap(0, 25, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelEscalenoLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(panelEscalenoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel15)
                            .addComponent(jLabel16)
                            .addComponent(jLabel17))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(panelEscalenoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtLado3Es, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                            .addComponent(txtLado2Es)
                            .addComponent(txtLado1Es))))
                .addContainerGap())
        );
        panelEscalenoLayout.setVerticalGroup(
            panelEscalenoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelEscalenoLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel14)
                .addGap(18, 18, 18)
                .addGroup(panelEscalenoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(txtLado1Es, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelEscalenoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(txtLado2Es, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelEscalenoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(txtLado3Es, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelEquilatero.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel18.setText("Equilatero");

        jLabel19.setText("lado 1:");

        javax.swing.GroupLayout panelEquilateroLayout = new javax.swing.GroupLayout(panelEquilatero);
        panelEquilatero.setLayout(panelEquilateroLayout);
        panelEquilateroLayout.setHorizontalGroup(
            panelEquilateroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelEquilateroLayout.createSequentialGroup()
                .addGroup(panelEquilateroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelEquilateroLayout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(jLabel18)
                        .addGap(0, 26, Short.MAX_VALUE))
                    .addGroup(panelEquilateroLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel19)
                        .addGap(18, 18, 18)
                        .addComponent(txtLado1Eq)))
                .addContainerGap())
        );
        panelEquilateroLayout.setVerticalGroup(
            panelEquilateroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelEquilateroLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel18)
                .addGap(24, 24, 24)
                .addGroup(panelEquilateroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(txtLado1Eq, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(88, Short.MAX_VALUE))
        );

        btnCalcular.setText("Calcular");
        btnCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcularActionPerformed(evt);
            }
        });

        jLabel3.setText("Area");

        jLabel4.setText("Perimetro");

        jLabel5.setText("Altura");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("RESULTADOS");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addComponent(panelRectangulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(108, 108, 108)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                        .addComponent(panelIsosceles, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(panelEscaleno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(panelEquilatero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(118, 118, 118))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmbTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addComponent(btnCalcular)
                        .addGap(178, 178, 178)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addGap(42, 42, 42)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtPerimetro, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE)
                            .addComponent(txtAltura)
                            .addComponent(txtArea)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(260, 260, 260)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(317, 317, 317)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(panelEquilatero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(panelRectangulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(panelIsosceles, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(panelEscaleno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 61, Short.MAX_VALUE)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(txtArea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnCalcular))
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtPerimetro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtAltura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmbTipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbTipoActionPerformed
        // TODO add your handling code here:
        
         opcion=cmbTipo.getSelectedItem().toString();
         
        if(opcion.equals("Rectangulo")){
        panelRectangulo.setVisible(true);
        panelIsosceles.setVisible(false);
        panelEscaleno.setVisible(false);
        panelEquilatero.setVisible(false);
        
        
        }
        if(opcion.equals("Isosceles")){
        panelRectangulo.setVisible(false);
        panelIsosceles.setVisible(true);
        panelEscaleno.setVisible(false);
        panelEquilatero.setVisible(false);
         
        }
        if(opcion.equals("Escaleno")){
        panelRectangulo.setVisible(false);
        panelIsosceles.setVisible(false);
        panelEscaleno.setVisible(true);
        panelEquilatero.setVisible(false);
        
        }
        if(opcion.equals("Equilatero")){
        panelRectangulo.setVisible(false);
        panelIsosceles.setVisible(false);
        panelEscaleno.setVisible(false);
        panelEquilatero.setVisible(true);
        
        }
        
    }//GEN-LAST:event_cmbTipoActionPerformed

    private void btnCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularActionPerformed
        // TODO add your handling code here:
        int opc=cmbTipo.getSelectedIndex();
        int a=0;
        int b=0;
        
        Triangulos tri;
      
          
       switch(opc){
           
           case 0:
           double lado1Rec=Double.valueOf(txtLado1Rec.getText());
           double lado2Rec=Double.valueOf(txtLado2Rec.getText());
                //txtAltura.(calcularC(lado1Rec, lado2Rec));
               
          
            ///////////
           
           tri =new Rectangulo(lado1Rec, lado2Rec);
           
                txtArea.setText(String.valueOf(tri.calcularArea()));
                txtPerimetro.setText(String.valueOf(tri.calcularPerimetro()));
                txtAltura.setText(String.valueOf(tri.calcularAltura()));
                              
              
                 txtArea.setEnabled(true);
                txtPerimetro.setEnabled(true);
                 txtAltura.setEnabled(true);
                 
               
         break;
           case 1:
           double lado1Is=Double.valueOf(txtLadoaIs.getText());
           double lado2iS=Double.valueOf(txtLadobIs.getText());
              
           tri =new Isosceles(lado1Is, lado2iS);
           
                txtArea.setText(String.valueOf(tri.calcularArea()));
                txtPerimetro.setText(String.valueOf(tri.calcularPerimetro()));
                txtAltura.setText(String.valueOf(tri.calcularAltura()));
                              
              
                 txtArea.setEnabled(true);
                txtPerimetro.setEnabled(true);
               txtAltura.setEnabled(true);
               
         break;
           case 2:
             
           double lado1Es=Double.valueOf(txtLado1Es.getText());
           double lado2Es=Double.valueOf(txtLado2Es.getText());
            double lado3Es=Double.valueOf(txtLado3Es.getText());
          
           
           tri =new Escaleno(lado1Es, lado2Es, lado3Es);
           
                txtArea.setText(String.valueOf(tri.calcularArea()));
                txtPerimetro.setText(String.valueOf(tri.calcularPerimetro()));
                txtAltura.setText(String.valueOf(tri.calcularAltura()));
                              
              
                 txtArea.setEnabled(true);
                txtPerimetro.setEnabled(true);
                 txtAltura.setEnabled(true);
                //txtAltura.(calcularC(lado1Rec, lado2Rec));
               
        
               break;
               
           case 3:
               
             double lado1Eq=Double.valueOf(txtLado1Eq.getText());
          
          
            ///////////
           
           tri =new Equilatero(lado1Eq);
           
                txtArea.setText(String.valueOf(tri.calcularArea()));
                txtPerimetro.setText(String.valueOf(tri.calcularPerimetro()));
                txtAltura.setText(String.valueOf(tri.calcularAltura()));
                              
              
                 txtArea.setEnabled(true);
                txtPerimetro.setEnabled(true);
                 txtAltura.setEnabled(true);
               
               break;
               
               default:
                break;
           
       } 
        
        
        
        
    }//GEN-LAST:event_btnCalcularActionPerformed

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
            java.util.logging.Logger.getLogger(FigurasTriangulos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FigurasTriangulos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FigurasTriangulos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FigurasTriangulos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FigurasTriangulos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCalcular;
    private javax.swing.JComboBox<String> cmbTipo;
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
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel panelEquilatero;
    private javax.swing.JPanel panelEscaleno;
    private javax.swing.JPanel panelIsosceles;
    private javax.swing.JPanel panelRectangulo;
    private javax.swing.JTextField txtAltura;
    private javax.swing.JTextField txtAngulo;
    private javax.swing.JTextField txtArea;
    private javax.swing.JTextField txtLado1Eq;
    private javax.swing.JTextField txtLado1Es;
    private javax.swing.JTextField txtLado1Rec;
    private javax.swing.JTextField txtLado2Es;
    private javax.swing.JTextField txtLado2Rec;
    private javax.swing.JTextField txtLado3Es;
    private javax.swing.JTextField txtLadoaIs;
    private javax.swing.JTextField txtLadobIs;
    private javax.swing.JTextField txtPerimetro;
    // End of variables declaration//GEN-END:variables
}
