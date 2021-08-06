
package dominio;

public class Vejez extends Persona implements Interface{
    public Vejez(String nombre, int cedula, int anios, double salario) {
        super(nombre, cedula, anios, salario);
    }
    @Override
    public double calcularPension() {
        double monto = this.PensionInicial() + this.getSalario()*15/100;
        return monto;
    }
    @Override
    public void jubilacionVejez(){
    }

    
}
