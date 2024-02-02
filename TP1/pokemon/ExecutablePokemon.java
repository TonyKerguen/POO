package pokemon;

public class ExecutablePokemon {
    public static void main(String [] args) {
        Pokemon poke;
        poke = new Pokemon("Bulbizarre", 30);
        poke.evolue("Herbizarre", 37);
        poke.evoluer("Florizarre");
        System.out.println(poke.toString()); // (1)
        
        Pokemon abo;
        abo = new Pokemon("Abo", 10);
        abo.evolue("Arbok", 24);
        System.out.println(abo.toString());

    }
}