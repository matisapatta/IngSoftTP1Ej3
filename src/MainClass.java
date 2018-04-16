import java.util.ArrayList;
import java.util.Scanner;

public class MainClass {
    public static void main(String[] args){

        /*Roles de prueba*/

        Rol rol1 = new RolSimple(1);
        Rol rol2 = new RolSimple(2);
        Rol rol3 = new RolSimple(3);
        Rol rol4 = new RolSimple(4);
        Rol rol5 = new RolSimple(5);
        Rol rol6 = new RolSimple(6);
        Rol rol7 = new RolSimple(7);
        Rol rol8 = new RolSimple(8);
        Rol rol9 = new RolSimple(9);
        Rol rol10 = new RolSimple(10);

        ArrayList<Rol> aRolComp1 = new ArrayList<>();
        aRolComp1.add(rol1);
        aRolComp1.add(rol2);
        Rol rolComp1 = new RolCompuesto(aRolComp1);

        ArrayList<Rol> aRolComp2 = new ArrayList<>();
        aRolComp2.add(rol4);
        aRolComp2.add(rol5);
        Rol rolComp2 = new RolCompuesto(aRolComp2);

        ArrayList<Rol> aRolComp3 = new ArrayList<>();
        aRolComp3.add(rol7);
        aRolComp3.add(rol8);
        aRolComp3.add(rol9);
        Rol rolComp3 = new RolCompuesto(aRolComp3);

        ArrayList<Rol> aRolComp4 = new ArrayList<>();
        aRolComp4.add(rolComp1);
        aRolComp4.add(rolComp2);
        aRolComp4.add(rolComp3);
        Rol rolComp4 = new RolCompuesto(aRolComp4);

        /*Fin Roles de prueba*/


        Usuario mati = new Usuario("Mati", "pass");
        mati.addRol(rol1);
        mati.addRol(rolComp2);
        mati.addRol(rolComp3);

        Scanner scan = new Scanner(System.in);
        String nombre;
        String pass;

        do {
            System.out.println("Ingrese usuario: ");
            nombre = scan.next();

        } while (!nombre.equals(mati.getNombre()));

        do{
            System.out.println("Ingrese password: ");
            pass = scan.next();

        } while (!pass.equals(mati.getPass()));

        Botones botones = new Botones();
        botones.showBotones(mati);

    }


}
