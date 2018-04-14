
public class Usuario {

    private Rol rol;
    private String nombre;



    public Usuario(String nombre){
        this.nombre = nombre;
        rol = new RolCompuesto();
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public String getNombre(){
        return this.nombre;
    }

    public void addRol(Rol rol){
       this.rol.addRol(rol);

    }
    public Rol getRol(){
        return this.rol;
    }
}
