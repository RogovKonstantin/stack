import java.util.Comparator;

public class AgeComp implements Comparator<Minion> {
    @Override
    public int compare(Minion minion1, Minion minion2) {
        return Integer.compare(minion1.getAge(), minion2.getAge());
    }
}
