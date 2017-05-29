package com.epam;

import java.util.List;

import static com.epam.Animal.HORSE;
import static java.util.Collections.singletonList;

public class HorseFarm extends Farm {
    private List<Animal> animals = singletonList(HORSE);

    @Override
    protected List<Animal> getExtraLiveStock() {
        return animals;
    }
}
