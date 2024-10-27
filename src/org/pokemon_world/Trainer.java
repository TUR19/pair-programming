package src.org.pokemon_world;
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
        Trainer trIvan = new Trainer("Ivan");

        Pokemon charmander = new Pokemon("Charmander", Type.FIRE);
        Pokemon squirtle = new Pokemon("Squirtle", Type.WATER);
        Pokemon ekans = new Pokemon("Ekans", Type.POISON);

        trIvan.addPokemon(charmander);
        trIvan.addPokemon(squirtle);
        trIvan.addPokemon(ekans);

        trIvan.showTrainerInfo();

        System.out.println("\nFiltered by FIRE type:");
        trIvan.filterPokemonsByType(Type.FIRE).forEach(System.out::println);

        System.out.println("\nShowing second Pokemon (index 1):");
        trIvan.showPokemonAtIndex(1);
    }
}