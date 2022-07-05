package moves.physicalMove.command;

import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.Type;

public class SuperFang extends moves.physicalMove.command.PhysicalMove {
    public SuperFang(Type type, double pow, double acc){
        super(Type.NORMAL, 0, 90 );
    }

    protected void superFang(Pokemon def, double damage){
        super.applyOppEffects(Pokemon p);
        def.setMod(Stat.HP, (int) Math.round(damage));
    }


}
