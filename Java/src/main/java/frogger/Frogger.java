package frogger;

public class Frogger {
    private final Road road;
    private int position;
    private final FroggerID id; // `PlayerProfile` оронд `FroggerID` ашиглана.

    public Frogger(Road road, int position, FroggerID id) {
        this.road = road;
        this.position = position;
        this.id = id;
    }

    public Frogger(Road road2, int i, Records records, String string, String string2, String string3, String string4,
            String string5, String string6) {
        this.road = road2;
        this.position = i;
        this.id = new FroggerID(string, string2, string3, string4, string5, string6); // Assuming a constructor for FroggerID
    }

    public boolean move(boolean forward) {
        int nextPosition = this.position + (forward ? 1 : -1);
        if (!road.isValid(nextPosition) || road.isOccupied(nextPosition)) {
            return false;
        }
        this.position = nextPosition;
        return true;
    }

    public boolean recordMyself(Records records) {
        return records.addRecord(id, position); // `id` болон байрлалыг бүртгэнэ.
    }

    public int getPosition() {
        return position;
    }

    public FroggerID getId() {
        return id;
    }
}
