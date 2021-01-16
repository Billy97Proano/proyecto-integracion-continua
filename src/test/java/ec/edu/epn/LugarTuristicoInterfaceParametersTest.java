package ec.edu.epn;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.mockito.Mockito;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(value = Parameterized.class)
public class LugarTuristicoInterfaceParametersTest {
    private String a;
    private String b;
    private String c;

    @Parameterized.Parameters
    public static Iterable<Object[]>parameters(){
        List<Object[]> objects = new ArrayList<Object[]>();
        objects.add(new Object[]{"Alameda", "Estos son los resultados","Estos son los resultados"});
        objects.add(new Object[]{"Carolina","Lugar no encontrado", "Lugar no encontrado"});
        objects.add(new Object[]{"Panecillo","Estos son los resultados" ,"Estos son los resultados"});
        objects.add(new Object[]{"", "Lugar no encontrado" ,"Lugar no encontrado"});
        objects.add(new Object[]{"Santo Domingo", "Lugar no encontrado", "Lugar no encontrado"});
        objects.add(new Object[]{"San Francisco", "Estos son los resultados" ,"Estos son los resultados"});
        return objects;
    }

    public LugarTuristicoInterfaceParametersTest(String a, String b, String c){
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Test
    public void given_parameters_results_research(){
        LugarTuristicoInterface l = Mockito.mock(LugarTuristicoInterface.class);
        Mockito.when(l.busquedaLugarTuristico(a)).thenReturn(b);
        assertEquals(b,c);
    }

}