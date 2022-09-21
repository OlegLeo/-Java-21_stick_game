import java.util.Random;
import java.util.Scanner;

public class Main {

    static Scanner in = new Scanner(System.in);
    static Random random = new Random();

    public static void main(String[] args) throws InterruptedException {
        System.out.println();
        System.out.println("\t\t\t\t\u001B[35m- JOGO DOS 21 FÓSFOROS -\u001B[0m ");
        linha();

        while (true) {
            menuPrincipal();
            //TRATAMENTO DE ERROS E EXCEPÇÕES //////////////////////////////////////////////////////////////////////////////////////
            int escolha;
            while (true) {
                System.out.println("\u001B[33mSua opção:\u001B[0m ");
                try {
                    escolha = in.nextInt();
                    if (escolha > -1 && escolha < 3) {

                        break;
                    } else {
                        System.out.println("\u001B[31mERRO! Por favor, insira um valor válido.\u001B[0m");         //ACEITAR APENAS VALORES ENTRE 0 E 3
                    }
                } catch (Exception e) {
                    System.out.println("\u001B[31mERRO! Por favor, insira um valor válido.\u001B[0m");              //NÃO ACEITAR TEXTO E CARACTERES ESPECIAIS

                }
                in.nextLine();  // OBRIGATORIO PARA SAIR DO LOOP
            }
            ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

            if (escolha == 1) {
                JOGADORvsJOGADOR();
            } else if (escolha == 2) {

                menuJOGADORvsCOMPUTADOR();

                //TRATAMENTO DE ERROS E EXCEPÇÕES //////////////////////////////////////////////////////////////////////////////////////
                int escolha2;
                while (true) {
                    System.out.println("\u001B[33mSua opção:\u001B[0m ");
                    try {
                        escolha2 = in.nextInt();
                        if (escolha2 > -1 && escolha2 < 3) {
                            break;
                        } else {
                            System.out.println("\u001B[31mERRO! Por favor, insira um valor válido.\u001B[0m");         //ACEITAR APENAS VALORES ENTRE 0 E 3
                        }
                    } catch (Exception e) {
                        System.out.println("\u001B[31mERRO! Por favor, insira um valor válido.\u001B[0m");              //NÃO ACEITAR TEXTO E CARACTERES ESPECIAIS

                    }
                    in.nextLine();  // OBRIGATORIO PARA SAIR DO LOOP
                }
                ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
                if (escolha2 == 1) {
                    JOGADORvsCOMPUTADORfacil();
                } else if (escolha2 == 2) {
                    JOGADORvsCOMPUTADORdificil();
                }
            } else if (escolha == 0) {
                System.out.println();
                System.out.println("\t\t\t\t\u001B[31m<<< JOGO ENCERRADO >>>\u001B[0m");
                break;
            }
        }

    }

    public static void menuPrincipal() {
        System.out.println();
        System.out.println("\t\t\t    \u001B[35m.:.:Menu Principal:.:.\u001B[0m");
        System.out.println();
        System.out.println("\u001B[34m[ 1 ]\u001B[0m \u001B[32m- JOGADOR VS JOGADOR\u001B[0m");
        System.out.println("\u001B[34m[ 2 ]\u001B[0m \u001B[32m- JOGADOR VS COMPUTADOR\u001B[0m");
        System.out.println("\u001B[34m[ 0 ]\u001B[0m \u001B[32m- SAIR DO JOGO");
        System.out.println();
        linha();
    }

    public static void linha() {
        System.out.println("\u001B[36m-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-\u001B[0m");
    }

    public static void JOGADORvsJOGADOR() {
        System.out.println();
        System.out.println("\t\t\t    \u001B[35m.:.:JOGADOR VS JOGADOR:.:.\u001B[0m");
        linha();
        int totalFos = 21;
        System.out.println();
        System.out.println("\t\t\t\t\t\t\t\t\t\t\u001B[30mTotal: 21 Fósforos\u001B[0m");

        while (true) {

            //TRATAMENTO DE ERROS E EXCEPÇÕES ///////////////         -- JOGADOR 1 --      //////////////////////////////////////////////
            int jogador1;
            while (true) {
                System.out.println("\u001B[32mJOGADOR 1: \u001B[0m");
                try {
                    jogador1 = in.nextInt();
                    if (jogador1 > 0 && jogador1 < 5) {

                        break;
                    } else {
                        System.out.println("\u001B[33mERRO! Por favor, insira um valor entre 1 a 4.\u001B[0m");         //ACEITAR APENAS VALORES ENTRE 0 E 3
                    }
                } catch (Exception e) {
                    System.out.println("\u001B[33mERRO! Por favor, insira um valor válido.\u001B[0m");              //NÃO ACEITAR TEXTO E CARACTERES ESPECIAIS

                }
                in.nextLine();  // OBRIGATORIO PARA SAIR DO LOOP
            }
            totalFos = totalFos - jogador1;

            System.out.println("\t\t\t\t\t\t\t\t\t\t\u001B[30mTotal: " + totalFos + " Fósforos\u001B[0m");
            ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
            if (totalFos == 1) {
                System.out.println();
                System.out.println("\u001B[31m\t\t\t\t  - JOGADOR 2 PERDEU ! -\u001B[0m");
                linha();
                break;
            } else if (totalFos < 1) {
                System.out.println();
                System.out.println("\u001B[32m\t\t\t\t  - JOGADOR 1\u001B[0m\u001B[31m PERDEU! -\u001B[0m");
                linha();
                break;
            }
            //TRATAMENTO DE ERROS E EXCEPÇÕES ///////////////         -- JOGADOR 2 --      //////////////////////////////////////////////
            int jogador2;
            while (true) {
                System.out.println("\u001B[31mJOGADOR 2: \u001B[0m");
                try {
                    jogador2 = in.nextInt();
                    if (jogador2 > 0 && jogador2 < 5) {

                        break;
                    } else {
                        System.out.println("\u001B[33mERRO! Por favor, insira um valor entre 1 a 4.\u001B[0m");         //ACEITAR APENAS VALORES ENTRE 0 E 3
                    }
                } catch (Exception e) {
                    System.out.println("\u001B[33mERRO! Por favor, insira um valor válido.\u001B[0m");              //NÃO ACEITAR TEXTO E CARACTERES ESPECIAIS

                }
                in.nextLine();  // OBRIGATORIO PARA SAIR DO LOOP
            }
            ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
            totalFos = totalFos - jogador2;
            System.out.println("\t\t\t\t\t\t\t\t\t\t\u001B[30mTotal: " + totalFos + " Fósforos\u001B[0m");
            if (totalFos == 1) {
                System.out.println();
                System.out.println("\u001B[32m\t\t\t\t  - JOGADOR 1\u001B[0m\u001B[31m PERDEU! - \u001B[0m");
                linha();
                break;
            } else if (totalFos < 1) {
                System.out.println();
                System.out.println("\u001B[31m\t\t\t\t  - JOGADOR 2 PERDEU! - \u001B[0m");
                linha();
                break;
            }
        }
    }


    public static void menuJOGADORvsCOMPUTADOR() {
        System.out.println();
        System.out.println("\t\t\t    \u001B[35m.:.:JOGADOR VS COMPUTADOR:.:.\u001B[0m");
        linha();
        System.out.println();
        System.out.println("\u001B[34m[ 1 ]\u001B[0m \u001B[32m- JOGADOR VS COMPUTADOR (FÁCIL)\u001B[0m");
        System.out.println("\u001B[34m[ 2 ]\u001B[0m \u001B[32m- JOGADOR VS COMPUTADOR (DIFÍCIL)\u001B[0m");
        System.out.println("\u001B[34m[ 0 ]\u001B[0m \u001B[32m- VOLTAR AO MENU PRINCIPAL");
        System.out.println();
        linha();
    }




    public static void JOGADORvsCOMPUTADORfacil() throws InterruptedException {
        System.out.println();
        System.out.println("\t\t\t    \u001B[35m.:.:JOGADOR VS COMPUTADOR:.:.\u001B[0m");
        linha();
        int totalFos = 21;
        System.out.println();
        System.out.println("\t\t\t\t\t\t\t\t\t\t\u001B[30mTotal: 21 Fósforos\u001B[0m");

        while (true) {

            //TRATAMENTO DE ERROS E EXCEPÇÕES ///////////////         -- JOGADOR --      //////////////////////////////////////////////
            int jogador;
            while (true) {
                System.out.println("\u001B[32mJOGADOR: \u001B[0m");
                try {
                    jogador = in.nextInt();
                    if (jogador > 0 && jogador < 5) {

                        break;
                    } else {
                        System.out.println("\u001B[33mERRO! Por favor, insira um valor entre 1 a 4.\u001B[0m");         //ACEITAR APENAS VALORES ENTRE 0 E 3
                    }
                } catch (Exception e) {
                    System.out.println("\u001B[33mERRO! Por favor, insira um valor válido.\u001B[0m");              //NÃO ACEITAR TEXTO E CARACTERES ESPECIAIS

                }
                in.nextLine();  // OBRIGATORIO PARA SAIR DO LOOP
            }
            totalFos = totalFos - jogador;

            System.out.println("\t\t\t\t\t\t\t\t\t\t\u001B[30mTotal: " + totalFos + " Fósforos\u001B[0m");
            ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
            if (totalFos == 1) {
                System.out.println();
                Thread.sleep(500);
                System.out.println("\u001B[31m\t\t\t\t  - COMPUTADOR PERDEU ! -\u001B[0m");
                linha();
                break;
            } else if (totalFos < 1) {
                System.out.println();
                Thread.sleep(500);
                System.out.println("\u001B[32m\t\t\t\t  - JOGADOR\u001B[0m\u001B[31m PERDEU! -\u001B[0m");
                linha();
                break;
            }
            ///////////////////////////////////////////         -- COMPUTADOR --      //////////////////////////////////////////////
            int computador;
            computador= random.nextInt(1, 5);
            Thread.sleep(500);
            System.out.println("\u001B[31mCOMPUTADOR:     --> JOGOU "+computador+" <--\u001B[0m");

            ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
            totalFos = totalFos - computador;
            System.out.println("\t\t\t\t\t\t\t\t\t\t\u001B[30mTotal: " + totalFos + " Fósforos\u001B[0m");
            if (totalFos == 1) {
                Thread.sleep(500);
                System.out.println();
                System.out.println("\u001B[32m\t\t\t\t  - JOGADOR\u001B[0m\u001B[31m PERDEU! - \u001B[0m");
                linha();
                break;
            } else if (totalFos < 1) {
                Thread.sleep(500);
                System.out.println();
                System.out.println("\u001B[31m\t\t\t\t  - COMPUTADOR PERDEU! - \u001B[0m");
                linha();
                break;
            }
        }
    }


    public static void JOGADORvsCOMPUTADORdificil() throws InterruptedException {
        System.out.println();
        System.out.println("\t\t\t    \u001B[35m.:.:JOGADOR VS COMPUTADOR:.:.\u001B[0m");
        linha();
        int totalFos = 21;
        System.out.println();
        System.out.println("\t\t\t\t\t\t\t\t\t\t\u001B[30mTotal: 21 Fósforos\u001B[0m");

        while (true) {

            //TRATAMENTO DE ERROS E EXCEPÇÕES ///////////////         -- JOGADOR --      //////////////////////////////////////////////
            int jogador;
            while (true) {
                System.out.println("\u001B[32mJOGADOR: \u001B[0m");
                try {
                    jogador = in.nextInt();
                    if (jogador > 0 && jogador < 5) {

                        break;
                    } else {
                        System.out.println("\u001B[33mERRO! Por favor, insira um valor entre 1 a 4.\u001B[0m");         //ACEITAR APENAS VALORES ENTRE 0 E 3
                    }
                } catch (Exception e) {
                    System.out.println("\u001B[33mERRO! Por favor, insira um valor válido.\u001B[0m");              //NÃO ACEITAR TEXTO E CARACTERES ESPECIAIS

                }
                in.nextLine();  // OBRIGATORIO PARA SAIR DO LOOP
            }
            totalFos = totalFos - jogador;

            System.out.println("\t\t\t\t\t\t\t\t\t\t\u001B[30mTotal: " + totalFos + " Fósforos\u001B[0m");
            ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
            if (totalFos == 1) {
                System.out.println();
                Thread.sleep(500);
                System.out.println("\u001B[31m\t\t\t\t  - COMPUTADOR PERDEU ! -\u001B[0m");
                linha();
                break;
            } else if (totalFos < 1) {
                System.out.println();
                Thread.sleep(500);
                System.out.println("\u001B[32m\t\t\t\t  - JOGADOR\u001B[0m\u001B[31m PERDEU! -\u001B[0m");
                linha();
                break;
            }
            ///////////////////////////////////////////         -- COMPUTADOR --      //////////////////////////////////////////////
            int computador;

            if (jogador == 1){
                computador = 4;
            }else if (jogador == 2){
                computador = 3;
            }else if (jogador == 3){
                computador = 2;
            }else {
                computador = 1;
            }


            Thread.sleep(500);
            System.out.println("\u001B[31mCOMPUTADOR:     --> JOGOU "+computador+" <--\u001B[0m");

            ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
            totalFos = totalFos - computador;
            System.out.println("\t\t\t\t\t\t\t\t\t\t\u001B[30mTotal: " + totalFos + " Fósforos\u001B[0m");
            if (totalFos == 1) {
                Thread.sleep(500);
                System.out.println();
                System.out.println("\u001B[32m\t\t\t\t  - JOGADOR\u001B[0m\u001B[31m PERDEU! - \u001B[0m");
                linha();
                break;
            } else if (totalFos < 1) {
                Thread.sleep(500);
                System.out.println();
                System.out.println("\u001B[31m\t\t\t\t  - COMPUTADOR PERDEU! - \u001B[0m");
                linha();
                break;
            }
        }
    }

}