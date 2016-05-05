public abstract class FormaPedazo{
  protected float area; //inicialmente no tenia ni atributos ni constructor y funcionaba

  public FormaPedazo(float area){
    this.area = area;
  }

  public abstract float getArea();
}
