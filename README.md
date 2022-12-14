# Tasca_S4_02_N1 & Tasca_S4_02_N2
## Api Rest amb Spring boot

![N|Solid](https://res.cloudinary.com/crunchbase-production/image/upload/c_lpad,h_170,w_170,f_auto,b_white,q_auto:eco,dpr_1/g8fordbc3yi5ivrurkxe)![N|Solid](https://logistreak.com/images/icon/mysql.png)


En aquesta tasca faràs un CRUD (Create, Read, Update, Delete) amb 3 bases de dades diferents.

Aprendràs a usar correctament els verbs HTTP i a gestionar els codis de resposta.


## Objetius
- HTTP Verbs.
- HTTP Headers.
- HTTP Status Codes.
- CRUD amb Spring boot.
- H2, MySQL, MongoDB.

## Exercici CRUD amb H2 i MYSQL
Tenim una entitat anomenada "Fruita", que disposa de les següents propietats:

    int id
    String nom
    Int quantitatQuilos

Aprofitant l’especificació JPA, hauràs de persistir aquesta entitat a una base de dades H2, seguint el patró MVC. Per a això, depenent del Package principal, crearàs una estructura de packages, on ubicaràs les classes que necessitis:

    cat.itacademy.barcelonactiva.cognoms.nom.s04.t02.n01.controllers
    cat.itacademy.barcelonactiva.cognoms.nom.s04.t02.n01.model.domain
    cat.itacademy.barcelonactiva.cognoms.nom.s04.t02.n01.model.services
    cat.itacademy.barcelonactiva.cognoms.nom.s04.t02.n01.model.repository

La classe ubicada al paquet controllers (FruitaController, per exemple), haurà de ser capaç de donar resposta a les següents peticions per actualitzar i consultar informació:

    http://localhost:8080/fruita/add
    http://localhost:8080/fruita/update
    http://localhost:8080/fruita/delete/{id}
    http://localhost:8080/fruita/getOne/{id}
    http://localhost:8080/fruita/getAll

## application.properties

 <img src="https://github.com/gonzashan/Tasca_S4_02_N1/blob/main/application-properties.png" height="400" width="581" >
