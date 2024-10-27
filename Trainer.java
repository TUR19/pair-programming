import java.util.*;

public class Trainer {
    private String name;
    private List<Pokemon> pokemons;

    public Trainer(String name){
        this.name = name;
        this.pokemons = new ArrayList<>();
    }

    public void addPokemon(Pokemon p){
        if(p != null){
            pokemons.add(p);
        }
        else {
            throw new IllegalArgumentException("Pokemon can't be null");
        }
    }

    public void removePokemon(Pokemon p){
        if (p != null){
            pokemons.remove(p);
        } 
        else{
            throw new IllegalArgumentException("Pokemon can't be null");
        }
    }

    public String getName(){
        return name; 
    }

    public void showTrainerInfo(){
        System.out.println("Trainer name: " + name);
        System.out.println("Pokemons: ");
        pokemons.forEach(System.out::println);
    }

    public List<Pokemon> filterPokemonsByType(Type type){
        List<Pokemon> filteredPokemons = new ArrayList<>(); 

        for (Pokemon pokemon : pokemons){ 
            if(pokemon.getType() == type){ 
                filteredPokemons.add(pokemon); 
            }
        }

        return filteredPokemons; 
    }

    public void showPokemonAtIndex(int index){
        if(index >= 0 && index < pokemons.size()){
            System.out.println(pokemons.get(index));
        } 
        else {
            System.out.println("Invalid index. Please provide a valid index between 0 and " + (pokemons.size() - 1));
        }
    }

    public List<Pokemon> getPokemons(){
        return pokemons;
    }

    @Override
    public String toString(){
        return "Trainer [name=" + name + ", pokemons=" + pokemons.size() + "]";
    }

    public static void main(String[] args) {
        Trainer Ivan = new Trainer("Ivan");

        Pokemon charmander = new Pokemon("Charmander", Type.FIRE);
        Pokemon squirtle = new Pokemon("Squirtle", Type.WATER);
        Pokemon ekans = new Pokemon("Ekans", Type.POISON);

        Ivan.addPokemon(charmander);
        Ivan.addPokemon(squirtle);
        Ivan.addPokemon(ekans);

        Ivan.showTrainerInfo();

        System.out.println("\nFiltered by FIRE type:");
        Ivan.filterPokemonsByType(Type.FIRE).forEach(System.out::println);

        System.out.println("\nShowing second Pokemon (index 1):");
        Ivan.showPokemonAtIndex(1);
    }
}