public class Coche {
    public int velocidad;

    public void acelerar_Dennis(int aceleracion) {
        velocidad += aceleracion;
    }

    public void decelerar_Dennis(int deceleracion) {
        velocidad -= deceleracion;
        if (velocidad<0) velocidad=0;
    }
}
