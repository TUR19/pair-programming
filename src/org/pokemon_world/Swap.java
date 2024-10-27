package src.org.pokemon_world;
import java.util.Date;

public class Swap{
    private Trainer trainer1;
    private Trainer trainer2;
    private Pokemon pokemon1;
    private Pokemon pokemon2;
    private Date swapDate;
    private String swapId;

    public Swap(Trainer trainer1, Pokemon pokemon1, Trainer trainer2, Pokemon pokemon2, String swapId) {
        this.trainer1 = trainer1;
        this.pokemon1 = pokemon1;
        this.trainer2 = trainer2;
        this.pokemon2 = pokemon2;
        this.swapId = swapId;
        this.swapDate = new Date();
    }

    public void execute(){
        if (trainer1 == trainer2){
            System.out.println("ERROR: Trainers should be different.");
            return;
        }

        if (!trainer1.getPokemons().contains(pokemon1) || !trainer2.getPokemons().contains(pokemon2)) {
            System.out.println("ERROR: One of the Pokemon does not belong to its trainer.");
            return;
        }

        trainer1.addPokemon(pokemon2);
        trainer2.addPokemon(pokemon1);
        trainer1.removePokemon(pokemon1);
        trainer2.removePokemon(pokemon2);

        System.out.println("The exchange was successfully completed between " + trainer1.getName() + " and " + trainer2.getName());
        System.out.println("Date of exchange: " + swapDate);
    }

    public String getSwapId(){
        return swapId;
    }

    public Date getSwapDate(){
        return swapDate;
    }

    public static void main(String[] args){
        Trainer trIvan = new Trainer("Ivan");
        Trainer trAlexandr = new Trainer("Alexandr");

        Pokemon charmander = new Pokemon("Charmander", Type.FIRE);
        Pokemon squirtle = new Pokemon("Squirtle", Type.WATER);

        trIvan.addPokemon(charmander);
        trAlexandr.addPokemon(squirtle);

        trIvan.showTrainerInfo();
        trAlexandr.showTrainerInfo();

        Swap swap = new Swap(trIvan, charmander, trAlexandr, squirtle, "swap001");
        swap.execute();

        trIvan.showTrainerInfo();
        trAlexandr.showTrainerInfo();
    }
}
