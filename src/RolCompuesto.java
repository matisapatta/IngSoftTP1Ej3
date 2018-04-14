import java.util.ArrayList;

public class RolCompuesto extends Rol {

    private ArrayList<Rol> hijos;
    private int idRol;
    private ArrayList permisos;

    public RolCompuesto(){
        hijos = new ArrayList<>();
        this.permisos = new ArrayList();
    }

    public RolCompuesto(ArrayList<Rol> rol){
        this.hijos = rol;
        this.idRol = 0;
        this.permisos = new ArrayList();
    }

    public void addRol(Rol rol){
        this.hijos.add(rol);
    }

    public int getIdRol(){
        return this.idRol;
    }


    public ArrayList getPermisos(){

        for(int i=0;i<hijos.size();i++){
            Rol aux = hijos.get(i);
            ArrayList auxArray;
            if (aux.getIdRol()!=0){
                this.permisos.add(aux.getIdRol());
            } else {
                auxArray = (ArrayList)aux.getPermisos().clone();
                permisos.addAll(auxArray);

            }
        }

        return this.permisos;

    }
}
