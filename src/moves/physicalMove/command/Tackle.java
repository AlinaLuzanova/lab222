package moves.physicalMove.command;

import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Type;

public class Tackle extends moves.physicalMove.command.PhysicalMove {
    public Tackle(Type type, double pow, double acc){
        super(Type.NORMAL, 40, 100 );
    }

}
