package model;

public class ElementosVo{
   private int Id;
   private String nombre;
   private int numeroPlaca;
   private boolean tipo;
   private int valor;
   private String fechaIngreso;
   private boolean estado;
   private int numeroAula;
   private String Descripcion;

    

   public ElementosVo() {
}



public ElementosVo(int id, String nombre, int numeroPlaca, boolean tipo, int valor, String fechaIngreso, boolean estado,
        int numeroAula, String descripcion) {
    Id = id;
    this.nombre = nombre;
    this.numeroPlaca = numeroPlaca;
    this.tipo = tipo;
    this.valor = valor;
    this.fechaIngreso = fechaIngreso;
    this.estado = estado;
    this.numeroAula = numeroAula;
    Descripcion = descripcion;

}



public int getId() {
    return Id;
}



public void setId(int id) {
    Id = id;
}



public String getNombre() {
    return nombre;
}



public void setNombre(String nombre) {
    this.nombre = nombre;
}



public int getNumeroPlaca() {
    return numeroPlaca;
}



public void setNumeroPlaca(int numeroPlaca) {
    this.numeroPlaca = numeroPlaca;
}



public boolean getTipo() {
    return tipo;
}



public void setTipo(boolean tipo) {
    this.tipo = tipo;
}



public int getValor() {
    return valor;
}



public void setValor(int valor) {
    this.valor = valor;
}



public String getFechaIngreso() {
    return fechaIngreso;
}



public void setFechaIngreso(String fechaIngreso) {
    this.fechaIngreso = fechaIngreso;
}



public boolean getEstado() {
    return estado;
}



public void setEstado(boolean estado) {
    this.estado = estado;
}



public int getNumeroAula() {
    return numeroAula;
}



public void setNumeroAula(int numeroAula) {
    this.numeroAula = numeroAula;
}



public String getDescripcion() {
    return Descripcion;
}



public void setDescripcion(String descripcion) {
    Descripcion = descripcion;
}




}
