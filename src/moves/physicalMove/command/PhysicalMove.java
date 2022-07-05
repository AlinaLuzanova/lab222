package moves.physicalMove.command;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class PhysicalMove {
    Type type;
    double pow;
    double acc;
    public PhysicalMove(Type type, double pow, double acc){
        this.type = type;
        this.pow = pow;
        this.acc = acc;
    }
    public void applyOppEffects(Pokemon p){}

}
