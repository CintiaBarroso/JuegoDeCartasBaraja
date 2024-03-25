import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Baraja {
    private List<Carta> cartas;

    public Baraja() {
        cartas = new ArrayList<>();
        for (int numero = 1; numero <= 12; numero++) {
            for (String palo : new String[]{"Espadas", "Bastos", "Oros", "Copas"}) {
                if (numero != 8 && numero != 9) {
                    cartas.add(new Carta(numero, palo));
                }
            }
        }
    }
    public void barajar() {
        Collections.shuffle(cartas);
    }

      public Carta siguienteCarta() {
        if (cartas.isEmpty()) {
            System.out.println("No hay más cartas en la baraja.");
            return null;
        }
        return cartas.remove(0);
    }
      public int cartasDisponibles() {
        return cartas.size();
    }
       public List<Carta> darCartas(int cantidad) {
        List<Carta> cartasADar = new ArrayList<>();
        if (cantidad > cartasDisponibles()) {
            System.out.println("No hay suficientes cartas en la baraja para dar.");
            return cartasADar;
        }
        for (int i = 0; i < cantidad; i++) {
            cartasADar.add(siguienteCarta());
        }
        return cartasADar;
    }

    public List<Carta> cartasMonton() {
        return cartas.isEmpty() ? null : cartas;
    }
     public void mostrarBaraja() {
        for (Carta carta : cartas) {
            System.out.println(carta);
        }
    }
     public static void main(String[] args) {
        Baraja baraja = new Baraja();
        baraja.barajar();
        System.out.println("Mostrar baraja:");
        baraja.mostrarBaraja();
        System.out.println("\nDar 5 cartas:");
        List<Carta> cartasDadas = baraja.darCartas(5);
        for (Carta carta : cartasDadas) {
            System.out.println(carta);
        }
        System.out.println("\nCartas disponibles en la baraja: " + baraja.cartasDisponibles());
        System.out.println("\nCartas en el montón:");
        List<Carta> monton = baraja.cartasMonton();
        if (monton != null) {
            for (Carta carta : monton) {
                System.out.println(carta);
            }
        } else {
            System.out.println("No se ha sacado ninguna carta.");
        }
    }
}
    class Carta {
    private int numero;
    private String palo;

    public Carta(int numero, String palo) {
        this.numero = numero;
        this.palo = palo;
    }
    @Override
    public String toString() {
        return "Carta{" +
                "numero=" + numero +
                ", palo='" + palo + '\'' +
                '}';
    }
    }