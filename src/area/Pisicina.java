package area;

public class Pisicina {

    public static void main(String[] args) {
        double precoM3 = 45;
        double volume = calcularVolume(10, 6, 3);
        double valor = calcularOrcamento(volume, precoM3);
        System.out.println("Volume da piscina " + volume + "m3");
        System.out.println("Valor do m3 R$" + precoM3);
        System.out.println("Valor total do Orçamento R$" + valor);
    }

    // calcularVolume
    private static double calcularVolume(double largura, double comprimento, double profundidade){
        return (largura * comprimento * profundidade);
    }

    // calculoOrcamento
    private static double calcularOrcamento(double volume, double valorM3){
        return (volume * valorM3);
    }
}
