public class Main {
    public static void main(String[] args) {
        // Criando ingressos
        Ingresso ingressoNormal = new Normal(50.0);
        VIP ingressoVIP = new VIP(100.0, 30.0);
        CamaroteInferior camaroteInferior = new CamaroteInferior(150.0, 50.0, "Setor A");
        CamaroteSuperior camaroteSuperior = new CamaroteSuperior(200.0, 80.0, 100.0);

        // Exibindo valores
        ingressoNormal.escreveValor(); // Saída: Ingresso Normal
        ingressoVIP.escreveValor(); // Saída: Valor do ingresso VIP: R$ 130.0
        camaroteInferior.imprimeLocalizacao(); // Saída: Localização do Camarote Inferior: Setor A
        camaroteInferior.escreveValor(); // Saída: Valor do ingresso VIP: R$ 200.0
        camaroteSuperior.escreveValor(); // Saída: Valor do ingresso Camarote Superior: R$ 380.0
        System.out.println("Jhon Waine Mendes Gonçalves 12021BCC028:");

    }
}// Todos os direitos resevados a Jhon Waine Mendes Gonçalves LTD