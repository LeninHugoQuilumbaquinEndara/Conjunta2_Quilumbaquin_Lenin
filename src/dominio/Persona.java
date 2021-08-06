
package dominio;

public abstract class Persona implements Interface {
    private String nombre;
    private int cedula;
    private double salario;
    private int anios;
    public abstract double calcularPension();
    public Persona (String nombre,int cedula,int anios,double salario) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.anios = anios;
        this.salario = salario;
    }

    public int getAnios() {
        return anios;
    }

    public void setAnios(int anios) {
        this.anios = anios;
    }

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
        public double PensionInicial(){
        if(anios>0 && anios<11){
            return salario*50/100;
        }else if(anios>10 && anios<21){
            return salario*60/100;
        }else if(anios>20 && anios<31){
            return salario*70/100;
        }else if(anios>30 && anios<36){
            return salario*80/100;
        }else if(anios>35 && anios<40){
            return salario*90/100;
        }else if(anios>39){
            return salario*100/100;
        }
        return 0;
    }
        public double Total(){
            double total = this.salario+calcularPension();
            return total;
        }
    public String verDatos(){
        return "Nombre : "+this.nombre+"\nCedula : "+this.cedula+"\nSalario inicial : "+this.salario+
                "\n Jubilacion : "+calcularPension()+"\n Total a recibir : "+Total()+"\n ";
    }
}