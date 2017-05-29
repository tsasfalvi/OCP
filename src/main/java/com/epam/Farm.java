package com.epam;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Farm {

	private List<Animal> baseLivestock = Collections.unmodifiableList(
			Arrays.asList(Animal.DOG, Animal.DOG, Animal.DOG, Animal.CAT, Animal.DUCK)
	);

	String sing() {
		StringBuilder sb = new StringBuilder();
		for (Animal animal : getLiveStock()) {
			sb.append(animal.voice).append("\n");
		}

		return sb.toString();
	}

	private List<Animal> getBaseLivestock() {
		return baseLivestock;
	}

	private List<Animal> getLiveStock() {
		List<Animal> liveStock = Stream.concat(getBaseLivestock().stream(), getExtraLiveStock().stream())
				.collect(Collectors.toList());

		return Collections.unmodifiableList(liveStock);
	}

	protected List<Animal> getExtraLiveStock() {
		return Collections.unmodifiableList(Collections.emptyList());
	}
}
