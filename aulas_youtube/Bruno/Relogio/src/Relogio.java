public class Relogio {
    private int horas, minutos, segundos; // SOMENTE AS CLASSES E SUBCLASSES TEM ACESSO
    public void ExibirHorario(){ //NAO RECEBE PARAMETRO POIS AS VARIAVEIS DE INSTANCIA SAO VISIVEIS EM TODO CORPO DA CLASSE (EXETO OS MÉTODOS ESTÁTICOS QUE SO PODEM MANIPULAR MEMBROS ESTÁTICOS DA CLASSE)
        System.out.println(horas + ":" + minutos + ":" + segundos);
    }
    /*
    EXEMPLO DE METODO QUE RETORNA INT
    public int somaMinutosSegundos(){
        return(minutos * 60 + segundos);
    }
    */
    //MÉTODOS ESTÁTICOS PODEM APENAS MANIPULAR MEMBROS ESTÁTICOS DA CLASSE
}
