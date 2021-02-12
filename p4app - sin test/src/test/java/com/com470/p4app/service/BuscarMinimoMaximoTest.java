/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.com470.p4app.service;

import com.com470.p4app.model.MinimoMaximo;
import java.util.ArrayList;
import java.util.List;
import org.assertj.core.util.Arrays;
import org.assertj.core.util.Lists;
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
public class BuscarMinimoMaximoTest {
    
    @Parameterized.Parameters
    public static List<Object> datos() {
        //devolvera una lista
        return Arrays.asList(new Object[][]{
            {new ArrayList<Integer>(){{
                        add(1);
                        add(2);
                        add(3);
                          }},new MinimoMaximo(1,3)},
            {new ArrayList<Integer>(){{
                        add(3);
                        add(3);
                        add(3);
                          }},new MinimoMaximo(3,3)},
            {new ArrayList<Integer>(){{
                        add(3);
                        add(-10);
                        add(15);
                        add(98);
                        add(-100);
                        add(9);
                          }},new MinimoMaximo(-100,98)}
        });
    }
    @Parameterized.Parameter(0)
    public ArrayList<Integer> valor1;
    @Parameterized.Parameter(1)
    public MinimoMaximo minimoMaximo;
    
    BuscarMinimoMaximo utils = new BuscarMinimoMaximo();
    
    @Test
    public void testMinimoMaximo() {
        System.out.println("array"+valor1);
        MinimoMaximo resultado  = utils.buscaMinimoMaximo(valor1);
        System.out.println(resultado);
        assertThat("Respuesta Incorrecta",resultado,is(minimoMaximo));
    }
    
}
