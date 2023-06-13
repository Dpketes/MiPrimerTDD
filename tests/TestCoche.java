import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestCoche {
    @Test
    public void test_crear_al_crear_un_coche_su_velocidad_es_cero_Dennis(){
        Coche nuevoCoche= new Coche();
        Assertions.assertEquals(0,nuevoCoche.velocidad);
    }
    @Test
    public void test_al_acelerar_un_coche_su_velocidad_aumenta_Dennis(){
        Coche nuevoCoche= new Coche();
        nuevoCoche.acelerar_Dennis(30);
        Assertions.assertEquals(30,nuevoCoche.velocidad);
    }
    @Test
    public void test_al_decelerar_un_coche_su_velocidad_disminuye_Dennis(){
        Coche nuevoCoche= new Coche();
        nuevoCoche.velocidad = 50;
        nuevoCoche.decelerar_Dennis(20);
        Assertions.assertEquals(30,nuevoCoche.velocidad);
    }
    @Test
    public void test_al_decelerar_un_coche_su_velocidad_no_puede_ser_menor_de_cero_Dennis(){
        Coche nuevoCoche= new Coche();
        nuevoCoche.velocidad = 50;
        nuevoCoche.decelerar_Dennis(80);
        Assertions.assertEquals(0,nuevoCoche.velocidad);
    }
}
