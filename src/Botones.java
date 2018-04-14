import javax.sound.midi.SysexMessage;
import java.util.ArrayList;

public class Botones {

    private ArrayList permisos;

    public Botones(){
        this.permisos = new ArrayList();

    }

    public void showBotones(Usuario user){
        this.permisos = (ArrayList)user.getRol().getPermisos().clone();

        for(int i=0;i<permisos.size();i++){
            for(int id=1;id<11;id++){
                if((int)permisos.get(i)==id){
                    System.out.println("Botón " + id);

                }


            }


        }

    }
}
