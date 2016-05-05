public class Pizza{
  private float precio;
  //private FormaPedazo formaPedazo; //atributo agregado

  public Pizza(float area ){ //de la otra forma FormaPedazo formaPedazo
    int pizzaPrecio = 500; //variable agregada
    this.precio = pizzaPrecio/area;
    //this.formaPedazo = formaPedazo
  }

  public float getPrecioPorPedazo(){
    //FormaPedazo nuevoPedazo = new PedazoCuadrado();
    return (nuevoPedazo.getArea()*precio);
  }
}
