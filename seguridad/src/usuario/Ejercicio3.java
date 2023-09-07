package usuario;

import java.util.ArrayList;
import java.util.Iterator;

public class Ejercicio3 {
    public static void main(String[] args) {
        int i=0;
        Usuario u1=new Usuario(1, "Usuario1", "usuario1@gmail.com", "123456", "A");
        Usuario u2=new Usuario(2, "Usuario2", "usuario2@gmail.com", "123456", "A");
        Usuario u3=new Usuario(3, "Usuario3", "usuario3@gmail.com", "123456", "A");
        ArrayList<Usuario> lista=new ArrayList<>();
        lista.add(u1);
        lista.add(u2);
        lista.add(u3);
        //Recorrido con ciclo while
        System.out.println("Ciclo While");
        while (i<lista.size()) {
            System.out.println("Código: "+lista.get(i).cod_usu+" Alias: "+lista.get(i).ali_usu+" Email: "+lista.get(i).ema_usu+" Clave: "+lista.get(i).cla_usu+" Estatus: "+lista.get(i).est_usu);
            i++;
        }
        System.out.println("Ciclo For");
        for(i=0;i<lista.size();i++){
            System.out.println("Código: "+lista.get(i).cod_usu+" Alias: "+lista.get(i).ali_usu+" Email: "+lista.get(i).ema_usu+" Clave: "+lista.get(i).cla_usu+" Estatus: "+lista.get(i).est_usu);
        }
        System.out.println("Recorrido con ForEach...");
        for (Usuario u : lista) {
            System.out.println("Código: "+u.getCod_usu()+" Alias: "+u.getAli_usu()+" Email: "+u.getEma_usu()+" Clave: "+u.getCla_usu()+" Estatus: "+u.getEst_usu());
        }
        System.out.println("Recorrido con Itarador...");
        Iterator <Usuario> iter=lista.iterator();
        Usuario usu=null;
        while (iter.hasNext()) { //mientras queden elementos
            usu=iter.next();
                System.out.println("Código: "+usu.getCod_usu()+" Alias: "+usu.getAli_usu()+" Email: "+usu.getEma_usu()+" Clave: "+usu.getCla_usu()+" Estatus: "+usu.getEst_usu());
        }
    }
}
