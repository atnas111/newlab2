package mypokemons;

import mymoves.chimchar.FireBlast;
import mymoves.chimchar.Flamethrower;
import ru.ifmo.se.pokemon.Type;

public class Chimchar extends Monferno{
    public Chimchar(String name, int level){
        super(name, level);

        super.setType(Type.FIRE);
        super.setStats(44, 58, 44, 58, 44, 61);


        FireBlast fireBlast = new FireBlast(110, 85);
        Flamethrower flamethrower = new Flamethrower(90, 100);
        super.setMove(fireBlast, flamethrower);

    }

}
