package utp.misiontic2022.c2.p07.reto4;

//import utp.misiontic2022.c2.p07.reto4.view.ViewRequerimientos;
import utp.misiontic2022.c2.p07.reto4.view.FrmRequerimientos;

public class App 
{
    public static void main( String[] args )
    {
        /*System.out.println("Requerimiento 1");
        ViewRequerimientos.requerimiento1();

        System.out.println("\nRequerimiento 2");
        ViewRequerimientos.requerimiento2();

        System.out.println("\nRequerimiento 3");
        ViewRequerimientos.requerimiento3();
        
    }*/

    try {
        for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
            if ("Nimbus".equals(info.getName())) {
                javax.swing.UIManager.setLookAndFeel(info.getClassName());
                break;
            }
        }
    } catch (ClassNotFoundException ex) {
        java.util.logging.Logger.getLogger(FrmRequerimientos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (InstantiationException ex) {
        java.util.logging.Logger.getLogger(FrmRequerimientos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (IllegalAccessException ex) {
        java.util.logging.Logger.getLogger(FrmRequerimientos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (javax.swing.UnsupportedLookAndFeelException ex) {
        java.util.logging.Logger.getLogger(FrmRequerimientos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }

    java.awt.EventQueue.invokeLater(new Runnable() {
        public void run(){
    new FrmRequerimientos().setVisible(true);
        }
    });
    }   
}

