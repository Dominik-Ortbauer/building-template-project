package at.htlleonding.buildingtdd;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Building {
    List<String> mResidents = new LinkedList<>();
    public Building(int id, String resident) {
        mResidents.add(resident);
    }

    public Building(int id, String[] residents) {
        mResidents.addAll(List.of(residents));
    }

    public int getNumberOfResidents() {
        return mResidents.size();
    }

    public void addResident(String resident) {
        mResidents.add(resident);
    }
}
