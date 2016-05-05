public class PedazoTriangular extends FormaPedazo{
  private float base; //inicialmente no tenia ni atributos ni constructor
  private float altural;

  public PedazoTriangular(float base, float altura){
    this.base = base;
    this.altura = altura;
    super(base*altura);
  }

  public float getArea(){
    /*
    float base = 2;
    float altura = 4; este es el codigo sin atributos ni constructro y sirve
    return ((base*altura)/2);*/
    return super.area;
  }
}
