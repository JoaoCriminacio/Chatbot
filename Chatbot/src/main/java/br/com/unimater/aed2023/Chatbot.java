package br.com.unimater.aed2023;

import java.util.Scanner;


public class Chatbot {

    public static void main(String[] args) {
        Scanner ms = new Scanner (System.in);
        Scanner ms2 = new Scanner (System.in);
        
        String nome = "", bairro = "", rua = "", respostaFinal = "";
        double saldo , retirada, deposito;
        int numEnd, opDesejada = 0, i = 0, l = 0, j = 0;
        
        //nome
        do{
            System.out.println("Informe seu nome:");
            nome = ms.nextLine();
                if(nome.equals("")){
                    System.out.println("Nada informado, digite novamente!");
                }
        }while(nome.equals(""));
        
        //bairro
        do{
            System.out.println("Informe seu bairro:");
            bairro = ms.nextLine();
                if(bairro.equals("")){
                    System.out.println("Nada informado, digite novamente!");
                }
        }while(bairro.equals(""));
        
        //rua
        do{
            System.out.println("Informe sua rua:");
            rua = ms.nextLine();
                if(rua.equals("")){
                    System.out.println("Nada informado, digite novamente!");
                }
        }while(rua.equals(""));
        
        //número do endereço
        do{
            System.out.println("Informe o número do seu endereço:");
            numEnd = ms2.nextInt();
                if(numEnd < 0){
                    System.out.println("Valor inválido, digite novamente!");
                }
        }while(numEnd < 0);
        
        //saldo
        do{
            System.out.println("Informe seu saldo: ");
            saldo = ms2.nextDouble();
                if(saldo < 0){
                    System.out.println("Valor inválido, digite novamente!");
                }
        }while(saldo < 0);
        
        //informações iniciais
        System.out.println("Seu nome é: "+nome);
        System.out.println("Seu endereço é Rua: "+rua+", Bairro: "+bairro+", Número: "+numEnd);
        System.out.println("Seu saldo é: "+saldo);
        
        while(opDesejada != 9){
            do{
                System.out.println("Qual operação você deseja fazer? (informe o número)");
                System.out.println("1 - Consultar saldo");
                System.out.println("2 - Fazer retirada");
                System.out.println("3 - Realizar depósito");
                System.out.println("4 - Fazer extrato");
                System.out.println("5 - Consultar endereço");
                System.out.println("6 - Alterar endereço");
                System.out.println("9 - Sair");
                opDesejada = ms2.nextInt();
                while(((opDesejada < 1) || (opDesejada > 6)) && (opDesejada != 9)){
                    System.out.println("Valor inválido, digite novamente!");
                    opDesejada = ms2.nextInt();
                }
                //operação 1
                if(opDesejada == 1){
                    System.out.println("Seu saldo é: "+saldo);
                }

                //operação 2
                if(opDesejada == 2){
                    System.out.println("Digite o valor que você deseja retirar");
                    retirada = ms2.nextDouble();
                        while((retirada < 0) || (saldo < retirada)){
                            System.out.println("Operação não realizada!");
                            break;
                        }
                        if(saldo > retirada){
                            saldo = saldo - retirada;
                            System.out.println("Seu saldo atual é: "+saldo);
                            l++;
                            i++;
                        }
                }
                
                //operação 3
                if(opDesejada == 3){
                    System.out.println("Qual valor você deseja depositar");
                    deposito = ms2.nextDouble();
                        while(deposito <= 0){
                            System.out.println("Operação não realizada!");
                            break;
                        }
                    if(deposito > 0){
                        saldo = saldo + deposito;
                        System.out.println("Seu saldo atual é: "+saldo);
                        j++;
                        i++;
                    }
                }
                
                //operação 4
                if(opDesejada == 4){
                    System.out.println("A quantidade de operações de retiradas foi: "+l);
                    System.out.println("A quantidade de operações de depósitos foi: "+j);
                    System.out.println("A quantidade total de operações foi: "+i);
                }
                
                //operação 5
                if(opDesejada == 5){
                    System.out.println("Seu endereço é Rua: "+rua+", Bairro: "+bairro+", Número: "+numEnd);
                }
                
                //operação 6
                if(opDesejada == 6){
                  //bairro
                    do{
                        System.out.println("Informe seu bairro:");
                        bairro = ms.nextLine();
                     if(bairro.equals("")){
                        System.out.println("Nada informado, digite novamente!");
                     }
                    }while(bairro.equals(""));
                  //rua
                    do{
                        System.out.println("Informe sua rua:");
                        rua = ms.nextLine();
                    if(rua.equals("")){
                        System.out.println("Nada informado, digite novamente!");
                    }
                    }while(rua.equals(""));
                  //número
                   do{
                        System.out.println("Informe o número do seu endereço:");
                        numEnd = ms2.nextInt();
                   if(numEnd < 0){
                        System.out.println("Valor inválido, digite novamente!");
                    }
                   }while(numEnd < 0);
                   //endereço atualizado
                    System.out.println("Seu novo endereço é Rua: "+rua+", Bairro: "+bairro+", Número: "+numEnd);
                }
                
                //operação 9 
                if(opDesejada == 9){
                    System.out.println("Deseja sair? (continuar/sair)");
                    respostaFinal = ms.nextLine();
                }

            }while(respostaFinal.equals("continuar"));
        }
    }
}
