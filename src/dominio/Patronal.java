package dominio;

public class Patronal extends Persona {
   private DepFinanzas departamento;
   private int  inflacion;
    
    public Patronal(String nombre, int cedula, int anios, double salario,DepFinanzas departamento,
            int inflacion) {
        super(nombre, cedula, anios, salario);
        this.inflacion = inflacion;
        this.departamento=departamento;
    }

    public DepFinanzas getDepartamento() {
        return departamento;
    }

    public void setDepartamento(DepFinanzas departamento) {
        this.departamento = departamento;
    }

    public double getInflacion() {
        return inflacion;
    }

    public void setInflacion(int inflacion) {
        this.inflacion = inflacion;
    }

    @Override
    public double calcularPension() {
      double monto = this.PensionInicial() + (this.inflacion/100)*this.getSalario();
      if(departamento == DepFinanzas.Publica){
            monto = monto+(monto * 5/100);
        }else if (departamento == DepFinanzas.Privada){
           monto = monto+(monto*10/100); 
        }
        return monto;
    }
   
}
