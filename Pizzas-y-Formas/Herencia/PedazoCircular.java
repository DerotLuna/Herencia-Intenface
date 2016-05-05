public class PedazoCircular extends FormaPedazo{
  private final float pi; //inicialmente no tenia ni atributos ni constructor
  private float radio;
  public PedazoCircular(float radio){
    this.pi = 3.14F;
    this.radio = radio;
    super(pi*radio*radio);
  }

  public float getArea(){
    /*float radio = 2;
    float pi = 3.14F; este es el codigo sin atributos ni constructro y sirve
    return (pi*radio*radio);*/
    return super.area;
  }
}
