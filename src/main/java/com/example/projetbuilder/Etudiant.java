package com.example.projetbuilder;


public class Etudiant
{
   private String nom;
    private String prenom;
    private int age;
    private String couleurPrefere;
    private  String coursPrefere;
    private String sport;
    private int taille;
    private int poids;



    public static Builder builder()
    {
     return new Builder();
    }
    static class Builder
    {
     private String nom;
     private String prenom;
     private int age;
     private String couleurPrefere;
     private  String coursPrefere;
     private String sport;
     private int taille;
     private int poids;



     public static Etudiant build()
     {
      return new Etudiant();
     }

     public  Builder age(int age)
     {
       this.age=age;
       return this;

     }

     public  Builder prenom(String prenom)
     {
      this.prenom=prenom;
      return this;
     }

     public  Builder nom(String nom)
     {
      this.nom=nom;
      return this;
     }
    }
}
