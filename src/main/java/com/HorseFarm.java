package com;

import java.util.List;

import static com.Animal.HORSE;
import static java.util.Collections.singletonList;

public class HorseFarm extends Farm {
    private List<Animal> animals = singletonList(HORSE);

    @Override
    protected List<Animal> getExtraLiveStock() {
        return animals;
    }
}
