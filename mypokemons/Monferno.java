package mypokemons;

import mymoves.monferno.FireBlast;
import mymoves.monferno.Flamethrower;
import mymoves.monferno.SlackOff;
import ru.ifmo.se.pokemon.Type;

public class Monferno extends Infernape{
    public Monferno(String name, int level){
        super(name, level);

        super.setType(Type.FIRE, Type.FIGHTING);
        super.setStats(64, 78, 52, 78, 52, 81);


        FireBlast fireBlast = new FireBlast(110, 85);
        SlackOff slackOff = new SlackOff(0, 0);
        Flamethrower flamethrower = new Flamethrower(90, 100);

        super.setMove(slackOff, fireBlast, flamethrower);

    }

}
