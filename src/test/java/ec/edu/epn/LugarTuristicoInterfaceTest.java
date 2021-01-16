package ec.edu.epn;

import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.assertEquals;

public class LugarTuristicoInterfaceTest {

    @Test
    public void given_result_of_search(){
        LugarTuristicoInterface l = Mockito.mock(LugarTuristicoInterface.class);
        Mockito.when(l.busquedaLugarTuristico("Carolina")).thenReturn("Estos son los resultados");
        assertEquals(l.busquedaLugarTuristico("Carolina"),"Estos son los resultados");
    }
}