package com.example.projetbuilder;

public class ProjetBuilderApplication {

    public static void main(String[] args) {
        //SpringApplication.run(ProjetBuilderApplication.class, args);


        Etudiant etudiant = Etudiant.builder().age(1)
                .nom("a").prenom("c").build();

        Personne personne = Personne.builder().nom("f").prenom("f").build();

    }






}
