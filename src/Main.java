import pokemons.Furfrou;
import pokemons.Noibat;
import ru.ifmo.se.pokemon.Battle;
import ru.ifmo.se.pokemon.Pokemon;

public class Main {
    Battle b = new Battle();
    Pokemon p1 = new Pokemon("Чужой", 1);
    Pokemon p2 = new Pokemon("Хищник", 1);
    Furfrou f = new Furfrou("Poko",8);
    Noibat n = new Noibat("o" , 7);
b.addAlly(p1);
b.addFoe(p2);
b.go();
}
