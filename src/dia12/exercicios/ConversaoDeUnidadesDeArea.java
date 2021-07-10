package dia12.exercicios;

public class ConversaoDeUnidadesDeArea {

    public static final double UM_METRO_QUADRADO_EM_PES_QUADRADO = 10.76;

    public static final double UM_PE_QUADRADO_EM_CENTIMETROS_QUADRADO = 929;

    public static final double UMA_MILHA_QUADRADO_EM_ACRES = 640;

    public static final double UM_ACRE_EM_PES_QUADRADO = 43560;

    public static Double converteMetroQuadradoParaPesQuadrado(double metros) {
        return metros * UM_METRO_QUADRADO_EM_PES_QUADRADO;

    }

    public static Double convertePesQuadradosParaCentimetosQuadrado(double pes) {
        return pes * UM_PE_QUADRADO_EM_CENTIMETROS_QUADRADO;
    }

    public static Double converteMilhaQuadradaParaAcres(double milha) {
        return milha * UMA_MILHA_QUADRADO_EM_ACRES;
    }

    public static Double converteAcreParaPesQuadrados(double pes) {
        return pes * UM_ACRE_EM_PES_QUADRADO;
    }
}
