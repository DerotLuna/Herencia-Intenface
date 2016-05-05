public class Pizza{
  private float precio;

  public Pizza(float precio){
    this.precio = precio;
  }

  public float getPrecioPorPedazo(){
    FormaPedazo nuevoPedazo = new PedazoCuadrado();
    return (nuevoPedazo.getArea()*precio);
  }
}
