public class Prueba{
  public static void main(String[] args) {
    float base = 15;
    float altura = 30;
    Pizza pizza = new Pizza(base*altura);
    System.out.println("El precio a pagar es: " + pizza.getPrecioPorPedazo());
  }
}
