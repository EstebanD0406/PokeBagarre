package com.montaury.pokebagarre.metier;
import com.montaury.pokebagarre.webapi.PokeBuildApi;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;


import java.util.concurrent.CompletableFuture;

import static org.junit.jupiter.api.Assertions.*;

class BagarreTest {

    @BeforeEach
    void init(){
        var fausseApi = Mockito.mock(PokeBuildApi.class);

        Mockito.when(fausseApi.recupererParNom("pikachu"))
                .thenReturn(CompletableFuture.completedFuture(new Pokemon("pikachu",
                        "url1", new Stats(1, 2))));
    }
    @Test
    void should_win_first_pokemon(){
        String poke1 = new Pokemon('Pikachu','',1,2);
        String poke2 = new Pokemon('Raichu', '', 2,1);

        //WHEN

    }
}