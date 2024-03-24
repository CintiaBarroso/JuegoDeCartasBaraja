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