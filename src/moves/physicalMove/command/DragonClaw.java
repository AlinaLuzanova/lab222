package moves.physicalMove.command;

import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class DragonClaw extends moves.physicalMove.command.PhysicalMove {
    public DragonClaw(Type type, double pow, double acc){
        super(Type.DRAGON, 80, 100 );
    }
    protected void applyOppEffects(Pokemon p){}

}
