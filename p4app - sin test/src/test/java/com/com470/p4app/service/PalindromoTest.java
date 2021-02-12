/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.com470.p4app.service;

import java.util.List;
import org.assertj.core.util.Arrays;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import static org.hamcrest.CoreMatchers.*;

/**
 *
 * @author jhamil
 */
@RunWith(Parameterized.class)
public class PalindromoTest {
    
    @Parameterized.Parameters
    public static List<Object> datos() {
        //devolvera una lista
        return Arrays.asList(new Object[][]{
            {"anaana",true},{"pelon",false},{"Anaa",false}
        });
    }
    @Parameterized.Parameter(0)
    public String valor1;
    @Parameterized.Parameter(1)
    public Boolean esperado;
    
    Palindromo utils = new Palindromo();
    
    @Test
    public void testPalindromo() {
        Boolean resultado  = utils.buscaPalindromo(valor1);
        assertEquals(esperado,resultado);
        assertThat("Respuesta Incorrecta",resultado,is(esperado));
    }
}

