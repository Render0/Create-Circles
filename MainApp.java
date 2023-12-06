package createcircles;

/**
 *
 * @author iagof
 */
public class MainApp {

    public static void main(String[] args) {
        Circle circle1 = new Circle(3.0);
        Circle circle2 = new Circle(9.0);
        /**
         * Circulos con sus valores iniciales
         */
        
       // circle1.show();
        //circle2.show();
        /**
         * Duplicamos el tamaño base
         */
        System.out.println("Duplicamos el tamaño base de los circulos");
        circle1.enlarge();
        circle2.enlarge();
        /**
         * Llamamos al metodo show otra vez por que si no no podríamos ver el nuevo valor del atributo radius
         */
        circle1.show();
        circle2.show();
        
        System.out.println("El valor maximo del radio es: " + Circle.getMaxRadius());
        
    }
}
