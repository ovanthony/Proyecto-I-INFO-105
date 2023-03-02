package proyecto.estdatos;

import javax.swing.JOptionPane;

public class VerPagos {

    public static void submenureportes() {

        int contador = 0;
        int suma = 0;

        String opciones = "                                Sistema Pago de Servicios Públicos                      \n";
        opciones += "                          Tienda La Favorita - Reporte Todos los Pagos                            \n";
        opciones += "\n";
        opciones += "#Pago  Fecha/Hora Pago  Cédula  Nombre  Apellido1  Apellido2  Monto Recibido\n";
        opciones += "===============================================================\n";

        for (int i = 0; i < 10; i++) {
            if (Variables.montopagar[i] > 0) {
                opciones += Variables.numfactura[i] + "  " + Variables.horaFormateada[i] + "  " + Variables.fecha[i] + "  " + Variables.cedula[i] + "  " + Variables.nombre[i] + "  " + Variables.apellido1[i] + "  " + Variables.apellido2[i] + "  " + Variables.montopagar[i] + "  \n";
                contador++;
                suma += Variables.montopagar[i];
            }
        }

        if (contador == 0) {
            opciones += "                                          No hay pagos registrados\n";
        }

        opciones += "===============================================================\n";
        opciones += "Total de registros: " + contador + "                                                                  Monto Total: " + suma + "\n";

        JOptionPane.showMessageDialog(null, opciones);

    }
}
