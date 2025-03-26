package frogger;

import java.util.ArrayList;
import java.util.List;

public class Records {
    private final List<String[]> records;

    public Records() {
        this.records = new ArrayList<>();
    }

    public boolean addRecord(FroggerID id) {
        for (String[] row : this.records) {
            FroggerID existing = new FroggerID(row[0], row[1], row[2], row[3], row[4], row[5]);
            if (existing.equals(id)) {
                return false;
            }
        }
        this.records.add(new String[]{
            id.firstName(), id.lastName(), id.phoneNumber(),
            id.zipCode(), id.state(), id.gender()
        });
        return true;
    }
}