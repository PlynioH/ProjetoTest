package projetotest;
import java.util.*;
/*
 * @author Plynio
 */
public class ProjetoTest {

    public static void main(String[] args) {
        System.out.println("\t\tBem vindo ao GameTest");
        Cachorro dogo = new Cachorro();
        Scanner in = new Scanner(System.in);
        dogo.nome = "Rayla";
        dogo.raça = "Bernese";
        dogo.voz = "Auau";
        dogo.porte = "Grande";
        dogo.tipo = "Cachorro";
        dogo.cor = "Preto, Branco e Laranja";
        dogo.ação1 = "Morder";
        dogo.ação2 = "Latir";
        dogo.ação3 = "Correr";
        dogo.ação4 = "Lamber";
        dogo.escolha = 1;
        dogo.vida = 5;
        dogo.dano = 1;
        /////////////////////////
        Gato gato = new Gato();
        gato.nome = "Snowbell";
        gato.cor = "Laranja";
        gato.porte = "Pequeno";
        gato.voz = "Miau";
        gato.tipo = "Gato";
        gato.ação1 = "Arranhar";
        gato.ação2 = "Miar";
        gato.ação3 = "Correr";
        gato.ação4 = "Morder";
        gato.escolha = 2;
        gato.vida = 5;
        gato.dano = 1;
        /////////////////////////
        int esc;
        System.out.println("Escolha 1 para jogar com o cachorro ou 2 para jogar com o gato");
        esc = in.nextInt();
        if(esc == dogo.escolha){
            System.out.println("\t\tDados do Animal\n\n"+"Tipo: "+dogo.tipo+"\nNome: "+dogo.nome+"\nRaça: "+dogo.raça+"\nCor: "+dogo.cor+
                    "\nPorte: "+dogo.porte+"\nAtaque1: "+dogo.ação1+"\nAtaque2: "+dogo.ação2+"\nAtaque3: "+dogo.ação3+"\nAtaque4: "+dogo.ação4);
        }
        else if(esc == gato.escolha){
            System.out.println("\t\tDados do Animal\n\n"+"Tipo: "+gato.tipo+"\nNome: "+gato.nome+"\nCor: "+gato.cor+"\nPorte: "+gato.porte+
                    "\nAtaque1: "+gato.ação1+"\nAtaque2: "+gato.ação2+"\nAtaque3: "+gato.ação3+"\nAtaque4: "+gato.ação4);
        }
    }
    
    
}
