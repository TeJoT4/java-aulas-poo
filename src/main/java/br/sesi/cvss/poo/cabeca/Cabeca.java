package br.sesi.cvss.poo.cabeca;

public class Cabeca {
    public Olho olhoEsquerdo;
    public Olho olhoDireito;
    public Orelha orelha;
    public Nariz nariz;
    public Boca boca;

    public Cabeca(){
        this.olhoEsquerdo = new Olho();
        this.olhoDireito = new Olho();
        this.orelha = new Orelha();
        this.nariz = new Nariz();
        this.boca = new Boca();
    }
}
