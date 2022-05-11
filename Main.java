

import java.util.Scanner;

public class Main {

    public static Boolean SairPrograma(){
        System.out.println("\n\nDeseja fechar o programa?\nS/s = SAIR\nQualquer outra tecla = NÃO");
        String sair = new Scanner(System.in).nextLine();
        System.out.println("\n\n");
        sair = sair.toUpperCase();
        if(sair.equals("S")){
            return true;
        }else{
            return false;
        }
    }

    public static int SelecaoTexto(){
        int selecao;
        while(true){
            try{
                System.out.println("1\t\t=>\t\tSomar\n" +
                        "2\t\t=>\t\tSubtrair\n" +
                        "3\t\t=>\t\tMultiplicar\n" +
                        "4\t\t=>\t\tDividir\n" +
                        "5\t\t=>\t\tMudar os dois números\n\n");

                System.out.print("Digite sua opção: ");
                selecao = new Scanner(System.in).nextInt();

                if (selecao <= 0) {
                    System.out.println("\n\nDIGITE UMA OPÇÃO VÁLIDA!\n\n");
                    continue;
                } else if (selecao > 5) {
                    System.out.println("\n\nDIGITE UMA OPÇÃO VÁLIDA!\n\n");
                    continue;
                }else{
                    break;
                }
            } catch (Exception e) {
                System.out.println("\n\nDIGITE UMA OPÇÃO VÁLIDA!\n\n");
                continue;
            }
        }
        return selecao;

    }


    public static void main(String[] args) {
        System.out.println("Atividade SENAI 6/5/2022 - Exercício 3 Orientação a Objetos - Curso: Desenvolvedor Java Vespertino\n\n");

        Boolean sair;
        Double num1,num2;
        Calcular calcular;

        while(true) {
            try {
                System.out.println("Defina os dois números que serão calculados!\n");
                System.out.print("\n\nDigite o valor do primeiro número: ");
                num1 = new Scanner(System.in).nextDouble();
                System.out.print("\n\nDigite o valor do segundo número: ");
                num2 = new Scanner(System.in).nextDouble();

                calcular = new Calcular(num1, num2);
                System.out.println("\n\n");
                System.out.println(calcular.toString());
                System.out.println("\n\n");
                break;
            } catch (Exception e) {
                System.out.println("\n\nDIGITE UM NÚMERO VÁLIDO!\n\n");
                continue;
            }
        }

        Boolean run = true;
        while(run){
            int selecionado = SelecaoTexto();

            switch (selecionado) {
                case 1:
                    System.out.println("\n\n"+calcular.getNum1()+" + "+calcular.getNum2()+"="+calcular.FazerSoma()+"\n\n");
                    sair = SairPrograma();

                    if(sair){
                        run = false;
                        break;
                    }else{
                        continue;
                    }
                case 2:
                    System.out.println("\n\n"+calcular.getNum1()+" - "+calcular.getNum2()+"="+calcular.FazerSubtracao()+"\n\n");
                    sair = SairPrograma();

                    if(sair){
                        run = false;
                        break;
                    }else{
                        continue;
                    }
                case 3:
                    System.out.println("\n\n"+calcular.getNum1()+" * "+calcular.getNum2()+"="+calcular.FazerMultiplicacao()+"\n\n");
                    sair = SairPrograma();

                    if(sair){
                        run = false;
                        break;
                    }else{
                        continue;
                    }
                case 4:
                    System.out.println("\n\n"+calcular.getNum1()+" / "+calcular.getNum2()+"="+calcular.FazerDivisao()+"\n\n");
                    sair = SairPrograma();

                    if(sair){
                        run = false;
                        break;
                    }else{
                        continue;
                    }
                case 5:
                    System.out.print("\n\nDigite o novo valor do primeiro número: ");
                    num1 = new Scanner(System.in).nextDouble();
                    System.out.print("\n\nDigite o novo valor do segundo número: ");
                    num2 = new Scanner(System.in).nextDouble();

                    calcular.setNum1(num1);
                    calcular.setNum2(num2);
                    System.out.println("\n\n");
                    System.out.println(calcular.toString());
                    System.out.println("\n\n");
                    sair = SairPrograma();

                    if(sair){
                        run = false;
                        break;
                    }else{
                        continue;
                    }

            }


        }
    }
}
