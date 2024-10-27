package src.org.pokemon_world;

public class Pokemon {
    private String name;
    private Type type;
    private int number;
    private static int nextNumber = 1;


    public Pokemon(String name, Type type) {
        this.name = name;
        this.type = type;
        this.number = nextNumber;
        nextNumber++;
    }

    public String getName() {
        return name;
    }

    /*
    *  Sets the Name vom Pokémon.
    *  This Method changes the name of an existing Pokemon. 'this' is the
    *  current instance of the class Pokemon.
    */
    public void setName(String name) {
        this.name = name;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public int getNumber() {
        return number;
    }

    public String toString() {
        return "Pokemon [name = " + name + ", type = " + type + ", number = " + number + "]";
    }


    public static void main(String[] args) {
        Pokemon charmander;
        charmander = new Pokemon("Charmander", Type.FIRE);
        Pokemon squirtle;
        squirtle = new Pokemon("Squirtle", Type.WATER);
        Pokemon ekans;
        ekans = new Pokemon("Ekans", Type.POISON);

        System.out.println(charmander);
        System.out.println(squirtle);
        System.out.println(ekans);


    }

}