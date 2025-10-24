public class App {

    public static ListaMethods listaMethods = new ListaMethods();

    public static void main(String[] args) throws Exception {
        
        // Criacao dos Nos

        No[] l = new No[10];
        No n0 = new No(0, "no zero", "zero");
        No n2 = new No(2, "no dois", "dois");
        No n5 = new No(5, "no cinco", "cinco");
        No n8 = new No(8, "no oito", "oito");
        No n9 = new No(9, "no nove", "nove");
        No n4 = new No(4, "no quatro", "quatro");
        No n6 = new No(6, "no seis", "seis");
        No n3 = new No(3, "no tres", "tres");
        No n7 = new No(7, "no sete", "sete");
        No n1 = new No(1, "no um", "um");

        // Inicializacao da lista

        l[0] = n0;
        l[1] = n1;
        l[2] = n2;
        l[3] = n3;
        l[4] = n4;
        l[5] = n5;
        l[6] = n6;
        l[7] = n7;
        l[8] = n8;
        l[9] = n9;

        // Execucao do algoritmo

        int x = 4;
        int resultBusca1 = listaMethods.busca1(x, l);
        int resultBusca2 = listaMethods.busca2(x, l);

        System.out.println(resultBusca1);
        System.out.println(resultBusca2);
    }
}
