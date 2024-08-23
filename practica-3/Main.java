import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    int t = Integer.parseInt(st.nextToken());
    double[] costos = {2.00, 2.20, 4.50, 3.50, 6.00, 6.00, 5.00};
    int[] claves = {12, 15, 18, 19, 23, 25, 29};
    StringBuilder resultado = new StringBuilder();
    while (t-- > 0) {
      // TODO: fixme.
      String[] input = br.readLine().split(",|\\s+");
      int clave = Integer.parseInt(input[0].trim());
      int numin = Integer.parseInt(input[1].trim());
     // Buscar el costo correspondiente usando arrays
            double costo = 0;
            for (int i = 0; i < claves.length; i++) {
                if (claves[i] == clave) {
                    costo = costos[i];
                    break;
                }
            }
            if (costo != 0) {
                double costo_total = costo * numin;
                resultado.append(" "+clave).append(",").append(numin).append("      ");
                if (costo_total % 1 == 0) {
                    resultado.append((int) costo_total).append("\n");
                } else {
                    resultado.append(String.format("%.1f", costo_total)).append("\n");
                }
            }
    }
    System.out.println("Entrada "+" Salida");
    System.out.print(resultado.toString());
  }
}