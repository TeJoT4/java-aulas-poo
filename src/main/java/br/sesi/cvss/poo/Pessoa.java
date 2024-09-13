package br.sesi.cvss.poo;

import br.sesi.cvss.poo.cabeca.Cabeca;
import br.sesi.cvss.poo.inferior.MembrosInferiores;
import br.sesi.cvss.poo.tronco.Tronco;

public class Pessoa {
    public Cabeca cabeca;
    public Tronco tronco;
    public MembrosInferiores inferior;

    public Pessoa(){
        this.cabeca = new Cabeca();
        this.tronco = new Tronco();
        this.inferior = new MembrosInferiores();
    }

}

