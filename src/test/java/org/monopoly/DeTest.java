package org.monopoly;


import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;
public class DeTest {

    @Test
    public void testLancerDe() {
        De de = new De();
        int valeurlancer = de.getValeur();
        assertThat(valeurlancer).isBetween(1, 6);
    }

}
