public class App {

    public static ListaMethods listaMethods = new ListaMethods();

    public static void main(String[] args) throws Exception {
        int x = 4;
        int n = 10;

        // Criacao dos Nos

        No[] l = new No[n];
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

       
        int resultBusca1 = listaMethods.busca1(x, l);

        No[] l2 = new No[n+1];
        l2[0] = n0;
        l2[1] = n6;
        l2[2] = n9;
        l2[3] = n8;
        l2[4] = n5;
        l2[5] = n4;
        l2[6] = n1;
        l2[7] = n7;
        l2[8] = n3;
        l2[9] = n2;
        l2[n] = new No(101, "Sentinela", "end N");


        int resultBusca2 = listaMethods.busca2(4, l2, n);

        System.out.println(resultBusca1);
        System.out.println(resultBusca2);
    }
}
