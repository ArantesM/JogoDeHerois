public class AtackHeros{
    String resultadoAtaque;

    public String Atack( String tipo){
        String tipoheroi = tipo;
        if (tipoheroi.equals("mago")){
            resultadoAtaque = "magia";
        } else if (tipoheroi.equals("guerreiro")) {
            resultadoAtaque = "espada";
        } else if (tipoheroi.equals("monge")){
            resultadoAtaque = "arte marcial";
        }else if(tipoheroi.equals("ninja")) {
            resultadoAtaque = "shuriken";
        }
        return resultadoAtaque;
    }
}
