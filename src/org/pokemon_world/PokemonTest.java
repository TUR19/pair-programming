package src.org.pokemon_world;

public class PokemonTest {
    public static void main(String[] args) {

        Pokemon pokemon1 = new Pokemon("Charmander", Type.FIRE);



        System.out.println();
        System.out.println("Test of getName");
        System.out.println("Name of the pokemon1 (Charmander):");
        System.out.println(pokemon1.getName());
        System.out.println("Test of getType");
        System.out.println("Type of the pokemon1 (FIRE):");
        System.out.println(pokemon1.getType());
        System.out.println("Test of getNumber");
        System.out.println("Number of the pokemon1 (1):");
        System.out.println(pokemon1.getNumber());

        System.out.println();
        System.out.println("Test of toString");
        System.out.println("pokemon1:");
        System.out.println(pokemon1);

        System.out.println();
        System.out.println("Test of setName");
        pokemon1.setName("Pikachu");
        System.out.println("Name of the pokemon1 (Pikachu):");
        System.out.println(pokemon1.getName());
        System.out.println("Test of setType");
        pokemon1.setType(Type.POISON);
        System.out.println("Type of the pokemon1 (POISON):");
        System.out.println(pokemon1.getType());

        Pokemon pokemon2 = new Pokemon("Squirtle", Type.WATER);
        Pokemon pokemon3 = new Pokemon("Ekans", Type.POISON);

        System.out.println();
        System.out.println("Test of nextNumber");
        System.out.println("Number of the pokemon2 (2):");
        System.out.println(pokemon2.getNumber());
        System.out.println("Number of the pokemon3 (3):");
        System.out.println(pokemon3.getNumber());


    }
}
