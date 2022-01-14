package at.htlleonding.buildingtdd;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Building {
    List<String> mResidents = new LinkedList<>();
    public Building(int id, String resident) {
        if(resident != null) {
            mResidents.add(resident);
        }
    }

    public Building(int id, String[] residents) {
        for(String s : residents) {
            addResident(s);
        }
    }

    public int getNumberOfResidents() {
        return mResidents.size();
    }

    public void addResident(String resident) {
        if(!mResidents.contains(resident)) {
            mResidents.add(resident);
        }
    }

    public void removeResident(String resident) {
        mResidents.remove(resident);
    }
}
