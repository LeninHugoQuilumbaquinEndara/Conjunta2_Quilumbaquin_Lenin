package dominio;

public class Discapacidad extends Persona{
    private int discapacidad;

    public Discapacidad(String nombre, int cedula, int anios, double salario,int discapacidad) {
        super(nombre, cedula, anios, salario);
        this.discapacidad = discapacidad;
    }
    public int getDiscapacidad() {
        return discapacidad;
    }

    public void setDiscapacidad(int discapacidad) {
        this.discapacidad = discapacidad;
    }

    @Override
    public double calcularPension() {
        double monto = this.PensionInicial() + this.getSalario() * (discapacidad / 100);
        return monto;
    }
   

}
