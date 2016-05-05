public class PedazoCuadrado extends FormaPedazo{
  private float lado; //inicialmente no tenia ni atributos ni constructor
  public PedazoCuadrado(float lado){
    super(lado*lado);
  }

  public float getArea(){
    /*
    float lado = 2; este es el codigo sin atributos ni constructro y sirve
    return (lado*lado);*/
    return super.area;
  }
}
