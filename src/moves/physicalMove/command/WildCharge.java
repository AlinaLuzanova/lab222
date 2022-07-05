package moves.physicalMove.command;

import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Type;

public class WildCharge extends moves.physicalMove.command.PhysicalMove {
    public WildCharge(Type type, double pow, double acc){
        super(Type.ELECTRIC, 90, 100 );
    }

}

