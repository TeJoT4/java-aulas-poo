package br.sesi.cvss.poo;

import br.sesi.cvss.poo.cabeca.Cabeca;
import br.sesi.cvss.poo.cabeca.Olho;

public class Main {

    public static void main(String[] args) {
        Olho olho1 = new Olho();
        olho1.cego = true;
        olho1.DiametroOlho = 2.0f;
        olho1.CorIris = "Vermelho";

        Olho olho2 = new Olho();
        olho2.cego = true;
        olho2.DiametroOlho = 2.0f;
        olho2.CorIris = "Vermelho";

        Cabeca cabeca = new Cabeca();
        cabeca.olhoEsquerdo = olho1;
        cabeca.olhoDireito = olho2;


        Pessoa pessoa1 = new Pessoa();

        pessoa1.cabeca = cabeca;
        
    }
}
