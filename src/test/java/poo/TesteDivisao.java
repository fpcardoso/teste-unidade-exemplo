package poo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import java.util.Arrays;
import java.util.Collection;
import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class TesteDivisao {

    @Parameterized.Parameters(name = "{index}: divide({0},{1}) = {2}")
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][] {
                { 0, 1, 0 },
                { 4, 2, 2 },
                { 1, 2, 0.5 },
                { -2, 1, -2 },
                {-2, -1, 2 },
                {0, 0, 1 },
                {1,0,1 }
        });
    }
    @Parameterized.Parameter(0)
    public int numerador;

    @Parameterized.Parameter(1)
    public int denominador;

    @Parameterized.Parameter(2)
    public double divisao;

    @Test
    public void teste(){
        DivideInteiros obj= new DivideInteiros();
        assertEquals("resultado errado.",divisao, obj.divide(numerador, denominador),2);
    }
}
