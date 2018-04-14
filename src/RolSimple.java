import java.util.ArrayList;

public class RolSimple extends Rol {

    private int idRol;

    public RolSimple(int ID){
        idRol = ID;
    }

    public ArrayList getPermisos(){
        ArrayList permisos = new ArrayList();
        permisos.add(idRol);
        return permisos;
    }

    public int getIdRol(){
        return this.idRol;
    }
}
