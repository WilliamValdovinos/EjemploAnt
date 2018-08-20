package ejemploant;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class EjemploAnt {

    public static void main(String[] args) {
        JFrame ventana = new JFrame("Ejemplo");
        ventana.setLocation(100, 100);
        ventana.setSize(500, 100);
        JLabel etiqueta = new JLabel("Hola mundo");
        ventana.add(etiqueta);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setVisible(true);
    }
    
}
