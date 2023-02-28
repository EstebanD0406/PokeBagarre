package com.montaury.pokebagarre.metier;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PokemonTest {
    @Test
    void should_win_first_pokemon(){
        //GIVEN
        Stats statsPoke1 = new Stats(12,12);
        Pokemon poke1 = new Pokemon("Mewtwo","",statsPoke1);
        Stats statsPoke2 = new Stats(3,12);
        Pokemon poke2 = new Pokemon("Magicarpe","",statsPoke2);

        //WHEN
        Boolean estVainqueur = poke1.estVainqueurContre(poke2);

        //THEN
        assertEquals(true, estVainqueur);
    }
    @Test
    void should_win_second_pokemon(){
        //GIVEN
        Stats statsPoke1 = new Stats(3,12);
        Pokemon poke1 = new Pokemon("Magicarpe","",statsPoke1);
        Stats statsPoke2 = new Stats(12,12);
        Pokemon poke2 = new Pokemon("Mewtwo","",statsPoke2);

        //WHEN
        Boolean estVainqueur = poke2.estVainqueurContre(poke1);

        //THEN
        assertEquals(true, estVainqueur);
    }
    @Test
    void should_have_better_def_first_pokemon(){
        //GIVEN
        Stats statsPoke1 = new Stats(12,36);
        Pokemon poke1 = new Pokemon("Mewtwo","",statsPoke1);
        Stats statsPoke2 = new Stats(12,12);
        Pokemon poke2 = new Pokemon("Magicarpe","",statsPoke2);

        //WHEN
        Boolean estVainqueur = poke1.estVainqueurContre(poke2);

        //THEN
        assertEquals(true, estVainqueur);
    }
    @Test
    void should_have_better_def_second_pokemon(){
        //GIVEN
        Stats statsPoke1 = new Stats(12,12);
        Pokemon poke1 = new Pokemon("Magicarpe","",statsPoke1);
        Stats statsPoke2 = new Stats(12,36);
        Pokemon poke2 = new Pokemon("Mewtwo","",statsPoke2);

        //WHEN
        Boolean estVainqueur = poke2.estVainqueurContre(poke1);

        //THEN
        assertEquals(true, estVainqueur);
    }
    @Test
    void should_be_the_first_pokemon(){
        //GIVEN
        Stats statsPoke1 = new Stats(12,12);
        Pokemon poke1 = new Pokemon("Magicarpe","",statsPoke1);
        Stats statsPoke2 = new Stats(12,12);
        Pokemon poke2 = new Pokemon("Mewtwo","",statsPoke2);

        //WHEN
        Boolean estVainqueur = poke1.estVainqueurContre(poke2);

        //THEN
        assertEquals(true, estVainqueur);
    }
}