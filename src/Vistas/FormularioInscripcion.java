/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas;
import Entidades.Alumno;
import Entidades.Inscripcion;
import Entidades.Materias;
import accesoDatos.InscripcionData;
import accesoDatos.AlumnoData;
import accesoDatos.MateriaData;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author elihe
 */
public class FormularioInscripcion extends javax.swing.JInternalFrame {
    private List<Materias> listaM;
    private List<Alumno> listaA;
    
    private InscripcionData inscData;
    private MateriaData mData;
    private AlumnoData aData;
    
    private DefaultTableModel modelo;

    /**
     * Creates new form FormularioInscripcion
     */
    public FormularioInscripcion() {
        initComponents();
        
        aData = new AlumnoData();
        listaA = aData.listarAlumnos();
        modelo = new DefaultTableModel();
        inscData = new InscripcionData();
        mData = new MateriaData();
        cargaAlumnos();
        armarCabeceraTabla();
        
      
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        JLFormularioI = new javax.swing.JLabel();
        JLSeleccion = new javax.swing.JLabel();
        JCBAlumnos = new javax.swing.JComboBox<>();
        JRBmatI = new javax.swing.JRadioButton();
        JRBmatNoI = new javax.swing.JRadioButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        JTabla = new javax.swing.JTable();
        JBInscribir = new javax.swing.JButton();
        JBAnular = new javax.swing.JButton();
        JBSalir = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        JLFormularioI.setText("Formulario de Inscripción");

        JLSeleccion.setText("Seleccione un alumno");

        JRBmatI.setText("Materias Inscriptas");
        JRBmatI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JRBmatIActionPerformed(evt);
            }
        });

        JRBmatNoI.setText("Materias no Inscriptas");
        JRBmatNoI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JRBmatNoIActionPerformed(evt);
            }
        });

        JTabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(JTabla);

        JBInscribir.setText("Inscribir");
        JBInscribir.setEnabled(false);
        JBInscribir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBInscribirActionPerformed(evt);
            }
        });

        JBAnular.setText("Anular Inscripcion");
        JBAnular.setEnabled(false);
        JBAnular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBAnularActionPerformed(evt);
            }
        });

        JBSalir.setText("Salir");
        JBSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBSalirActionPerformed(evt);
            }
        });

        jLabel3.setText("Listado de Materias");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGap(21, 21, 21)
                            .addComponent(JBInscribir)
                            .addGap(103, 103, 103)
                            .addComponent(JBAnular)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(JBSalir))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 435, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(196, 196, 196)
                        .addComponent(jLabel3))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(JRBmatI)
                            .addComponent(JLSeleccion))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(63, 63, 63)
                                .addComponent(JLFormularioI)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(JRBmatNoI))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addComponent(JCBAlumnos, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(86, 86, 86)))))
                .addGap(29, 29, 29))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(JLFormularioI)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JLSeleccion)
                    .addComponent(JCBAlumnos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addComponent(jLabel3)
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JRBmatI)
                    .addComponent(JRBmatNoI))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(111, 111, 111)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JBInscribir)
                    .addComponent(JBAnular)
                    .addComponent(JBSalir))
                .addContainerGap(157, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JBInscribirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBInscribirActionPerformed
        // TODO add your handling code here:
        int filaSeleccionada=JTabla.getSelectedRow();
        if(filaSeleccionada!=1){
            Alumno a =(Alumno)JCBAlumnos.getSelectedItem();
            int idMateria=(Integer)modelo.getValueAt(filaSeleccionada,0);
            String nombreMateria=(String)modelo.getValueAt(filaSeleccionada,1);
            int anio=(Integer)modelo.getValueAt(filaSeleccionada,2);
            Materias m=new Materias(idMateria,nombreMateria,anio,true);
            
            Inscripcion i =new Inscripcion(0,a,m);
            inscData.guardarInscripcion(i);
            borrarFilaTabla();
            
            
        }
    }//GEN-LAST:event_JBInscribirActionPerformed

    private void JRBmatIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JRBmatIActionPerformed
        // TODO add your handling code here:
        borrarFilaTabla();
        JRBmatNoI.setSelected(false);
        cargaDatosInscriptas();
        JBInscribir.setEnabled(true);
        JBAnular.setEnabled(false);
        
        
    }//GEN-LAST:event_JRBmatIActionPerformed

    private void JRBmatNoIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JRBmatNoIActionPerformed
        // TODO add your handling code here:
        borrarFilaTabla();
        JRBmatI.setSelected(false);
        cargaDatosNoInscriptas();
        JBInscribir.setEnabled(true);
        JBAnular.setEnabled(false);
    }//GEN-LAST:event_JRBmatNoIActionPerformed

    private void JBAnularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBAnularActionPerformed
        // TODO add your handling code here:
        int filaSeleccionada=JTabla.getSelectedRow();
        if(filaSeleccionada!=-1){
            Alumno a =(Alumno)JCBAlumnos.getSelectedItem();
            int idMateria=(Integer)modelo.getValueAt(filaSeleccionada,0);
            inscData.borrarInscripcionMateriaAlumno(a.getIdAlumno(), idMateria);
            borrarFilaTabla();
        }
    }//GEN-LAST:event_JBAnularActionPerformed

    private void JBSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBSalirActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_JBSalirActionPerformed
    private void cargaAlumnos(){
        for(Alumno item: listaA){
            JCBAlumnos.addItem(item);
        }
    }
    private void armarCabeceraTabla(){
      ArrayList<Object> filaCabecera = new ArrayList<>();
      filaCabecera.add("ID");
      filaCabecera.add("Nombre");
      filaCabecera.add("Año");
      for(Object it:filaCabecera){
          modelo.addColumn(it);
      }
      JTabla.setModel(modelo);
      
    }
    private void borrarFilaTabla(){
     int indice = modelo.getRowCount()-1;
     
     for(int i= indice;i>=0;i--){
         modelo.removeRow(i);
     }
    }
    private void cargaDatosNoInscriptas(){
        Alumno selec = (Alumno)JCBAlumnos.getSelectedItem();
        listaM = (ArrayList) inscData.obtenerMateriasNOCursadas(selec.getIdAlumno());
        for(Materias m: listaM){
            modelo.addRow(new Object[]{m.getIdMateria(),m.getNombre(),m.getIdMateria()});
        }
       
    }
    private void cargaDatosInscriptas(){
       Alumno selec = (Alumno)JCBAlumnos.getSelectedItem();
        List <Materias> lista = inscData.obtenerMateriasCursadas(selec.getIdAlumno());
        for(Materias m: lista){
            modelo.addRow(new Object[]{m.getIdMateria(),m.getNombre(),m.getIdMateria()});
        }
         
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBAnular;
    private javax.swing.JButton JBInscribir;
    private javax.swing.JButton JBSalir;
    private javax.swing.JComboBox<Alumno> JCBAlumnos;
    private javax.swing.JLabel JLFormularioI;
    private javax.swing.JLabel JLSeleccion;
    private javax.swing.JRadioButton JRBmatI;
    private javax.swing.JRadioButton JRBmatNoI;
    private javax.swing.JTable JTabla;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
