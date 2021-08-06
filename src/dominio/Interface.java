
package dominio;


public interface Interface {
    default void jubilacionVejez(){
        System.out.println("Juvilacion por Vejez");
    }
    default void jubilacionDiscapacidad(){
        System.out.println("Juvilacion por Discapacidad");
    }
    default void jubilacionPatronal(){
        System.out.println("Juvilacion por Patronal");
    }
    
}
