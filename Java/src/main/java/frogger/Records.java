package frogger;

import java.util.HashMap;
import java.util.Map;

public class Records {
    private final Map<FroggerID, Integer> records; // FroggerID болон байрлалыг хадгална.

    public Records() {
        this.records = new HashMap<>();
    }

    public boolean addRecord(FroggerID id, int position) {
        if (records.containsKey(id)) {
            return false; // Аль хэдийн бүртгэлтэй бол бүртгэхгүй.
        }
        records.put(id, position);
        return true;
    }
}
