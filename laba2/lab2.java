package laba2;

import mypokemons.*;
import ru.ifmo.se.pokemon.Battle;
import ru.ifmo.se.pokemon.Pokemon;
// https://pokemondb.net/pokedex/pheromosa
// https://pokemondb.net/pokedex/numel
// https://pokemondb.net/pokedex/camerupt
// https://pokemondb.net/pokedex/chimchar
// https://pokemondb.net/pokedex/monferno
// https://pokemondb.net/pokedex/infernape
public class lab2 {
    public static void main (String[] args) {
        Battle b = new Battle();
        Pheromosa pheromosa = new Pheromosa("Ферамоса", 21);
        Camerupt camerupt = new Camerupt("Камерупт", 13);
        Chimchar chimchar = new Chimchar("Чимчар", 5);
        Monferno monferno = new Monferno("Монферно", 14);
        Numel numel = new Numel("Нумел", 9);
        Infernape infernape = new Infernape("Инфернэйп", 36);

        b.addAlly(monferno);
        b.addAlly(numel);
        b.addAlly(infernape);
        b.addFoe(pheromosa);
        b.addFoe(camerupt);
        b.addFoe(chimchar);
        b.go();

    }
    public static boolean chance(double d){
        return d>Math.random();
    }
}