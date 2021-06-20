package edu.solid.ocp;

import java.util.Comparator;

public class PrimeNumberGeneratorReversed extends PrimeNumberGenerator{

    public PrimeNumberGeneratorReversed(){
        comparator = Comparator.<Integer>naturalOrder().reversed();
    }
}
