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
    public List<Carta> cartasMonton() {
        return cartas.isEmpty() ? null : cartas;
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
                ", palo='" + palo + ''' +
                '}';
    }