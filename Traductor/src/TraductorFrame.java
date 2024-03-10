
import javax.swing.SwingUtilities;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author 52785
 */
public class TraductorFrame extends javax.swing.JFrame {

    /**
     * Creates new form TraductorFrame
     */
    public TraductorFrame() {
        diccionario = new HashMap<>();
        // Añadir algunas traducciones de ejemplo
        diccionario.put("hola", "hello");
        diccionario.put("adios", "goodbye");
        diccionario.put("por favor", "please");
        diccionario.put("gracias", "thank you");
        diccionario.put("de nada", "you're welcome");
        diccionario.put("¿como estas?", "how are you");
        diccionario.put("bien,gracias", "fine,thank you");
        diccionario.put("lo siento", "i'm sorry");
        diccionario.put("sí", "yes");
        diccionario.put("no", "no");
        
         
        diccionario2 = new HashMap<>();
        diccionario2.put("uno", "one");
        diccionario2.put("dos", "two");
        diccionario2.put("tres", "three");
        diccionario2.put("cuatro", "four");
        diccionario2.put("cinco", "five");
        diccionario2.put("seis", "six");
        diccionario2.put("siete", "seven");
        diccionario2.put("ocho", "eight");
        diccionario2.put("nueve", "nine");
        diccionario2.put("diez", "ten");
        
        
        diccionario3 = new HashMap<>();
        diccionario3.put("lunes", "monday");
        diccionario3.put("martes", "tuesday");
        diccionario3.put("miercoles", "wednesday");
        diccionario3.put("jueves", "thursday");
        diccionario3.put("viernes", "friday");
        diccionario3.put("sabado", "saturday");
        diccionario3.put("domingo", "sunday");
        
        diccionario4 = new HashMap<>();
        diccionario4.put("enero", "january");
        diccionario4.put("febrero", "february");
        diccionario4.put("marzo", "march");
        diccionario4.put("abril", "april");
        diccionario4.put("mayo", "may");
        diccionario4.put("junio", "june");
        diccionario4.put("julio", "july");
        diccionario4.put("agosto", "august");
        diccionario4.put("septiembre", "september");
        diccionario4.put("octubre", "october");
        diccionario4.put("noviembre", "november");
        diccionario4.put("diciembre", "december");
        
        diccionario5 = new HashMap<>();
        diccionario5.put("cabeza", "head");
        diccionario5.put("ojos", "eyes");
        diccionario5.put("nariz", "nose");
        diccionario5.put("boca", "mouth");
        diccionario5.put("orejas", "ears");
        diccionario5.put("brazos", "arms");
        diccionario5.put("manos", "hands");
        diccionario5.put("piernas", "legs");
        diccionario5.put("pies", "feet");      
        
        diccionario6 = new HashMap<>();
        diccionario6.put("madre", "mother");
        diccionario6.put("padre", "father");
        diccionario6.put("hermano", "brother");
        diccionario6.put("hermana", "sister");
        diccionario6.put("hijo", "son");
        diccionario6.put("hija", "daughter");
        diccionario6.put("abuelo", "grandfather");
        diccionario6.put("abuela", "grandmother");
        diccionario6.put("tio", "suncle");
        diccionario6.put("tia", "aunt");
        
        diccionario7 = new HashMap<>();
        diccionario7.put("rojo", "red");
        diccionario7.put("azul", "blue");
        diccionario7.put("amarillo", "yellow");
        diccionario7.put("verde", "green");
        diccionario7.put("blanco", "white");
        diccionario7.put("negro", "black");
        diccionario7.put("gris", "gray");
        
        diccionario8 = new HashMap<>();
        diccionario8.put("comida", "food");
        diccionario8.put("agua", "water");
        diccionario8.put("pan", "bread");
        diccionario8.put("leche", "milk");
        diccionario8.put("fruta", "fruit");
        diccionario8.put("verduras", "vegetables");
        diccionario8.put("carne", "meat");
        diccionario8.put("pollo", "chicken");
        diccionario8.put("pescado", "fish");
        
        diccionario9 = new HashMap<>();
        diccionario9.put("casa", "house");
        diccionario9.put("escuela", "school");
        diccionario9.put("trabajo", "work");
        diccionario9.put("hospital", "hospital");
        diccionario9.put("tienda", "store");
        diccionario9.put("restaurante", "restaurant");
        diccionario9.put("parque", "park");
        diccionario9.put("playa", "beach");
        diccionario9.put("ciudad", "city");
        diccionario9.put("campo", "countryside");
        
        
        diccionario10 = new HashMap<>();
        // Añadir algunas traducciones de ejemplo
        diccionario10.put("hola", "annyeonghaseyo");
        diccionario10.put("adios", "annyeonghi gaseyo");
        diccionario10.put("por favor", "butakhamnida");
        diccionario10.put("gracias", "gamsahamnida");
        diccionario10.put("de nada", "cheonmaneyo");
        diccionario10.put("¿como estas?", "eotteohge jinaeseyo?");
        diccionario10.put("bien,gracias", "al jinaeyo, gamsahamnida");
        diccionario10.put("lo siento", "joesonghamnida");
        diccionario10.put("sí", "ye");
        diccionario10.put("no", "anio");
        
        diccionario12 = new HashMap<>();
        diccionario12.put("uno", "hana");
        diccionario12.put("dos", "dul");
        diccionario12.put("tres", "set");
        diccionario12.put("cuatro", "net");
        diccionario12.put("cinco", "daseot");
        diccionario12.put("seis", "yeoseot");
        diccionario12.put("siete", "ilgop");
        diccionario12.put("ocho", "yeodeol");
        diccionario12.put("nueve", "ahop");
        diccionario12.put("diez", "yeol");
        
        
        diccionario13 = new HashMap<>();
        diccionario13.put("lunes", "wol-yo-il");
        diccionario13.put("martes", "hwa-yo-il");
        diccionario13.put("miercoles", "su-yo-il");
        diccionario13.put("jueves", "mok-yo-il");
        diccionario13.put("viernes", "geum-yo-il");
        diccionario13.put("sabado", "to-yo-il");
        diccionario13.put("domingo", "il-yo-il");
        
        diccionario14 = new HashMap<>();
        diccionario14.put("enero", "il-wol");
        diccionario14.put("febrero", "i-wol");
        diccionario14.put("marzo", "sam-wol");
        diccionario14.put("abril", "sa-wol");
        diccionario14.put("mayo", "o-wol");
        diccionario14.put("junio", "yu-wol");
        diccionario14.put("julio", "chil-wol");
        diccionario14.put("agosto", "pal-wol");
        diccionario14.put("septiembre", "gu-wol");
        diccionario14.put("octubre", "sip-wol");
        diccionario14.put("noviembre", "ship-il-wol");
        diccionario14.put("diciembre", "ship-i-wol");
        
        diccionario15 = new HashMap<>();
        diccionario15.put("cabeza", "meori");
        diccionario15.put("ojos", "nun");
        diccionario15.put("nariz", "ko");
        diccionario15.put("boca", "ip");
        diccionario15.put("orejas", "gwi");
        diccionario15.put("brazos", "pal");
        diccionario15.put("manos", "son");
        diccionario15.put("piernas", "dari");
        diccionario15.put("pies", "bal");      
        
        diccionario16 = new HashMap<>();
        diccionario16.put("madre", "eomma");
        diccionario16.put("padre", "appa");
        diccionario16.put("hermano", "hyeongje");
        diccionario16.put("hermana", "jamae");
        diccionario16.put("hijo", "adeul");
        diccionario16.put("hija", "tta");
        diccionario16.put("abuelo", "halabeoji");
        diccionario16.put("abuela", "halmeoni");
        diccionario16.put("tio", "samchon");
        diccionario16.put("tia", "imo");
        
        diccionario17 = new HashMap<>();
        diccionario17.put("rojo", "ppalgansaek");
        diccionario17.put("azul", "paransaek");
        diccionario17.put("amarillo", "noransaek");
        diccionario17.put("verde", "choroksaek");
        diccionario17.put("blanco", "hwaansaek");
        diccionario17.put("negro", "geomeunsaek");
        diccionario17.put("gris", "hoesaek");
        
        diccionario18 = new HashMap<>();
        diccionario18.put("comida", "eumsik");
        diccionario18.put("agua", "mul");
        diccionario18.put("pan", "ppang");
        diccionario18.put("leche", "uyu");
        diccionario18.put("fruta", "gwai");
        diccionario18.put("verduras", "chaeso");
        diccionario18.put("carne", "gogi");
        diccionario18.put("pollo", "dakgogi");
        diccionario18.put("pescado", "saengseon");
        
        diccionario19 = new HashMap<>();
        diccionario19.put("casa", "jip");
        diccionario19.put("escuela", "hakgyo");
        diccionario19.put("trabajo", "il");
        diccionario19.put("hospital", "byeongwon");
        diccionario19.put("tienda", "gagae");
        diccionario19.put("restaurante", "sikdang");
        diccionario19.put("parque", "gongwon");
        diccionario19.put("playa", "haebyeon");
        diccionario19.put("ciudad", "dosi");
        diccionario19.put("campo", "sigol");
       
        inicializarInterfaz();
        initComponents();
        this.setLocationRelativeTo(null);
    }
    


    private HashMap<String, String> diccionario, diccionario2, diccionario3, diccionario4, diccionario5,diccionario6, diccionario7, diccionario8, diccionario9 ;
     private HashMap<String, String> diccionario10, diccionario12, diccionario13, diccionario14, diccionario15,diccionario16, diccionario17, diccionario18, diccionario19 ;

    private JTextField textoEntrada;
    private JLabel etiquetaResultado;
    private JButton botonTraducir;


    private void inicializarInterfaz() {

        // Componentes de la interfaz
        textoEntrada = new JTextField(20);
        etiquetaResultado = new JLabel("Traducción: ");
        botonTraducir = new JButton("Traducir");

        // Diseño del formulario


        add(new JLabel("Palabra a Traducir:"));
        add(textoEntrada);
        add(botonTraducir);
        add(etiquetaResultado);

     
    }

    private void traducirPalabraIngles() {
        String palabraEntrada = jTextField2.getText().toLowerCase();  // Convertir a minúsculas para hacer la búsqueda sin distinción de mayúsculas y minúsculas
        
        
         if(cbSaludos.isSelected()==true){
           String traduccion = diccionario.get(palabraEntrada);
           if (traduccion != null) {
            jLabel4.setText(traduccion);
           lContexto.setText("Saludos y Expresiones");
        } else {
            jLabel4.setText("Palabra no encontrada en el diccionario del contexto seleccionado");
        }
        }
         
         if(cbNumeros.isSelected()==true){
           String traduccion2 = diccionario2.get(palabraEntrada);
           if (traduccion2 != null) {
            jLabel4.setText(traduccion2);
            lContexto.setText("Numeros");
        } else {
            jLabel4.setText("Palabra no encontrada en el diccionario del contexto seleccionado");
        }
        }
         
        if(cbDias.isSelected()==true){
           String traduccion2 = diccionario3.get(palabraEntrada);
           if (traduccion2 != null) {
            jLabel4.setText(traduccion2);
            lContexto.setText("Dias de la semana");
        } else {
            jLabel4.setText("Palabra no encontrada en el diccionario del contexto seleccionado");
        }
        }
                  
        if(cbMeses.isSelected()==true){
           String traduccion2 = diccionario4.get(palabraEntrada);
           if (traduccion2 != null) {
            jLabel4.setText(traduccion2);
            lContexto.setText("Meses del año");
        } else {
            jLabel4.setText("Palabra no encontrada en el diccionario del contexto seleccionado");
        }
        }
                           
        if(cbCue.isSelected()==true){
           String traduccion2 = diccionario5.get(palabraEntrada);
           if (traduccion2 != null) {
            jLabel4.setText(traduccion2);
            lContexto.setText("Partes del cuerpo");
        } else {
            jLabel4.setText("Palabra no encontrada en el diccionario del contexto seleccionado");
        }
        }
                                    
        if(cbFamilia.isSelected()==true){
           String traduccion2 = diccionario6.get(palabraEntrada);
           if (traduccion2 != null) {
            jLabel4.setText(traduccion2);
            lContexto.setText("Familia");
        } else {
            jLabel4.setText("Palabra no encontrada en el diccionario del contexto seleccionado");
        }
        }
                                             
        if(cbColores.isSelected()==true){
           String traduccion2 = diccionario7.get(palabraEntrada);
           if (traduccion2 != null) {
            jLabel4.setText(traduccion2);
            lContexto.setText("Colores");
        } else {
            jLabel4.setText("Palabra no encontrada en el diccionario del contexto seleccionado");
        }
        }
                                                      
        if(cbAlimentos.isSelected()==true){
           String traduccion2 = diccionario8.get(palabraEntrada);
           if (traduccion2 != null) {
            jLabel4.setText(traduccion2);
            lContexto.setText("Alimentos");
        } else {
            jLabel4.setText("Palabra no encontrada en el diccionario del contexto seleccionado");
        }
        }
                                                               
        if(cbLugares.isSelected()==true){
           String traduccion2 = diccionario9.get(palabraEntrada);
           if (traduccion2 != null) {
            jLabel4.setText(traduccion2);
            lContexto.setText("Lugares");
        } else {
            jLabel4.setText("Palabra no encontrada en el diccionario del contexto seleccionado");
        }
        }
       
        

        
    }
    
    private void traducirPalabraCoreano(){
        String palabraEntrada = jTextField2.getText().toLowerCase();  // Convertir a minúsculas para hacer la búsqueda sin distinción de mayúsculas y minúsculas
        
        
         if(cbSaludos.isSelected()==true){
           String traduccion = diccionario10.get(palabraEntrada);
           if (traduccion != null) {
            jLabel4.setText(traduccion);
           lContexto.setText("Saludos y Expresiones");
        } else {
            jLabel4.setText("Palabra no encontrada en el diccionario del contexto seleccionado");
        }
        }
         
         if(cbNumeros.isSelected()==true){
           String traduccion2 = diccionario12.get(palabraEntrada);
           if (traduccion2 != null) {
            jLabel4.setText(traduccion2);
            lContexto.setText("Numeros");
        } else {
            jLabel4.setText("Palabra no encontrada en el diccionario del contexto seleccionado");
        }
        }
         
        if(cbDias.isSelected()==true){
           String traduccion2 = diccionario13.get(palabraEntrada);
           if (traduccion2 != null) {
            jLabel4.setText(traduccion2);
            lContexto.setText("Dias de la semana");
        } else {
            jLabel4.setText("Palabra no encontrada en el diccionario del contexto seleccionado");
        }
        }
                  
        if(cbMeses.isSelected()==true){
           String traduccion2 = diccionario14.get(palabraEntrada);
           if (traduccion2 != null) {
            jLabel4.setText(traduccion2);
            lContexto.setText("Meses del año");
        } else {
            jLabel4.setText("Palabra no encontrada en el diccionario del contexto seleccionado");
        }
        }
                           
        if(cbCue.isSelected()==true){
           String traduccion2 = diccionario15.get(palabraEntrada);
           if (traduccion2 != null) {
            jLabel4.setText(traduccion2);
            lContexto.setText("Partes del cuerpo");
        } else {
            jLabel4.setText("Palabra no encontrada en el diccionario del contexto seleccionado");
        }
        }
                                    
        if(cbFamilia.isSelected()==true){
           String traduccion2 = diccionario16.get(palabraEntrada);
           if (traduccion2 != null) {
            jLabel4.setText(traduccion2);
            lContexto.setText("Familia");
        } else {
            jLabel4.setText("Palabra no encontrada en el diccionario del contexto seleccionado");
        }
        }
                                             
        if(cbColores.isSelected()==true){
           String traduccion2 = diccionario17.get(palabraEntrada);
           if (traduccion2 != null) {
            jLabel4.setText(traduccion2);
            lContexto.setText("Colores");
        } else {
            jLabel4.setText("Palabra no encontrada en el diccionario del contexto seleccionado");
        }
        }
                                                      
        if(cbAlimentos.isSelected()==true){
           String traduccion2 = diccionario18.get(palabraEntrada);
           if (traduccion2 != null) {
            jLabel4.setText(traduccion2);
            lContexto.setText("Alimentos");
        } else {
            jLabel4.setText("Palabra no encontrada en el diccionario del contexto seleccionado");
        }
        }
                                                               
        if(cbLugares.isSelected()==true){
           String traduccion2 = diccionario19.get(palabraEntrada);
           if (traduccion2 != null) {
            jLabel4.setText(traduccion2);
            lContexto.setText("Lugares");
        } else {
            jLabel4.setText("Palabra no encontrada en el diccionario del contexto seleccionado");
        }
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

        jTextField1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jButton5 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        lContexto = new javax.swing.JLabel();
        cbSaludos = new javax.swing.JCheckBox();
        cbNumeros = new javax.swing.JCheckBox();
        cbDias = new javax.swing.JCheckBox();
        cbMeses = new javax.swing.JCheckBox();
        cbCue = new javax.swing.JCheckBox();
        cbFamilia = new javax.swing.JCheckBox();
        cbColores = new javax.swing.JCheckBox();
        bCancelar = new javax.swing.JButton();
        cbAlimentos = new javax.swing.JCheckBox();
        cbLugares = new javax.swing.JCheckBox();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jLabel1.setText("RESULTADO:");

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel2.setText("Palabra a Traducir:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 330, -1, -1));

        jTextField2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 330, 240, -1));

        jButton2.setBackground(new java.awt.Color(204, 204, 204));
        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton2.setText("INGLES");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 470, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel3.setText("Palabra Traducida:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 270, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 300, 470, 20));

        jButton3.setBackground(new java.awt.Color(204, 204, 204));
        jButton3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton3.setText("SALIR");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 600, 80, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel5.setText("TRADUCTOR ESPAÑOL-INGLES/ESPAÑOL-COREANO");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 10, -1, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel7.setText("Idioma original:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 270, -1, -1));

        jTextField3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jTextField3.setText("Español");
        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 270, -1, -1));

        jButton5.setBackground(new java.awt.Color(204, 204, 204));
        jButton5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton5.setText("COREANO");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 460, -1, -1));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel10.setText("Seleccione el contexto de la palabra a traducir:");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, -1, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel6.setText("Contexto selecionado:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 300, -1, -1));

        lContexto.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        getContentPane().add(lContexto, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 300, 170, 20));

        cbSaludos.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        cbSaludos.setText("Saludos y Expresiones");
        getContentPane().add(cbSaludos, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, -1, -1));

        cbNumeros.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        cbNumeros.setText("Numeros");
        getContentPane().add(cbNumeros, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, -1, -1));

        cbDias.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        cbDias.setText("Dias de la Semana");
        getContentPane().add(cbDias, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, -1, -1));

        cbMeses.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        cbMeses.setText("Meses");
        getContentPane().add(cbMeses, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 120, -1, -1));

        cbCue.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        cbCue.setText("Partes del cuerpo");
        getContentPane().add(cbCue, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 160, -1, -1));

        cbFamilia.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        cbFamilia.setText("Familia");
        getContentPane().add(cbFamilia, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 200, -1, -1));

        cbColores.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        cbColores.setText("Colores");
        getContentPane().add(cbColores, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 120, -1, -1));

        bCancelar.setBackground(new java.awt.Color(204, 204, 204));
        bCancelar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        bCancelar.setText("CANCELAR");
        bCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bCancelarActionPerformed(evt);
            }
        });
        getContentPane().add(bCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 600, -1, -1));

        cbAlimentos.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        cbAlimentos.setText("Alimentos");
        getContentPane().add(cbAlimentos, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 160, -1, -1));

        cbLugares.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        cbLugares.setText("Lugares");
        getContentPane().add(cbLugares, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 200, -1, -1));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/letras.jpg"))); // NOI18N
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(-30, -20, -1, -1));

        jLabel12.setText("jLabel12");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 330, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        traducirPalabraIngles();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        traducirPalabraCoreano();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void bCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bCancelarActionPerformed
        // TODO add your handling code here:
        jLabel4.setText("");
        lContexto.setText("");
        jTextField2.setText("");
        cbSaludos.setSelected(false);
        cbNumeros.setSelected(false);
        cbDias.setSelected(false);
        cbMeses.setSelected(false);
        cbCue.setSelected(false);
        cbFamilia.setSelected(false);
        cbColores.setSelected(false);
        cbAlimentos.setSelected(false);
        cbLugares.setSelected(false);
        
        
    }//GEN-LAST:event_bCancelarActionPerformed

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
            java.util.logging.Logger.getLogger(TraductorFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TraductorFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TraductorFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TraductorFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
       SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                TraductorFrame frame = new TraductorFrame();
                frame.setVisible(true);
            }
        });
    }



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bCancelar;
    private javax.swing.JCheckBox cbAlimentos;
    private javax.swing.JCheckBox cbColores;
    private javax.swing.JCheckBox cbCue;
    private javax.swing.JCheckBox cbDias;
    private javax.swing.JCheckBox cbFamilia;
    private javax.swing.JCheckBox cbLugares;
    private javax.swing.JCheckBox cbMeses;
    private javax.swing.JCheckBox cbNumeros;
    private javax.swing.JCheckBox cbSaludos;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JLabel lContexto;
    // End of variables declaration//GEN-END:variables
}
