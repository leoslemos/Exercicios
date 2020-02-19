package area;

public class AreaPiscina {

    public static void main(String[] args) {

        double valor = calcularOrcamento(10, 5, 3);

        System.out.println(valor);

    }

    //UM METODO QUE FAZ MAIS DE UMA COISA: CALCULA AREA E ORÇAMENTO
    private static double calcularOrcamento(double largura, double comprimento, double profundidade){
        double area = largura * comprimento * profundidade;
        double custo = area * 45; //hardcoded, magic number -- evitar colocar número
        return custo;
    }
}
