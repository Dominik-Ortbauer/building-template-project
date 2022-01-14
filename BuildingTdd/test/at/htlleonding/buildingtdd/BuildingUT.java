package at.htlleonding.buildingtdd;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BuildingUT {
    @Test
    void itShouldCreateABuildingGivenIdAndResident() {
        Assertions.assertDoesNotThrow(() -> {
            Building building = new Building(1, "Herbert");
        });
    }

    @Test
    void itShouldHaveOneResidentAfterInstantiation() {
        Building building = new Building(1, "Herbert");
        Assertions.assertEquals(1, building.getNumberOfResidents());
    }

    @Test
    void itShouldHaveTwoResidentAfterInstantiationWithArray() {
        Building building = new Building(1, new String[]{"Herbert", "Max"});
        Assertions.assertEquals(2, building.getNumberOfResidents());
    }
}