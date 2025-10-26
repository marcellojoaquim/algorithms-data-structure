public class App {

    public static ListaMethods listaMethods = new ListaMethods();

    public static void main(String[] args) throws Exception {
        int x = 4;
        int n = 10;

        // Criacao dos Nos

        
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

        // Inicializacao da lista L

        No[] l = new No[n];
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

        // inicializacao da lista L2
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

        // inicializacao da lista Ordenada
        No[] lOrd = new No[n+1];
        lOrd[0] = n0;
        lOrd[1] = n1;
        lOrd[2] = n2;
        lOrd[3] = n3;
        lOrd[4] = n4;
        lOrd[5] = n5;
        lOrd[6] = n6;
        lOrd[7] = n7;
        lOrd[8] = n8;
        lOrd[9] = n9;
        lOrd[n] = new No(101, "Sentinela", "end N");

        // Execucao do algoritmo

       
        int resultBusca1 = listaMethods.busca1(x, l);
        int resultBusca2 = listaMethods.busca2(4, l2, n);
        int resultBuscaOrd = listaMethods.buscaOrd(9, lOrd, n);

        System.out.println(resultBusca1);
        System.out.println(resultBusca2);
        System.out.println(resultBuscaOrd);
    }
}
