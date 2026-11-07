#Dreamy - Digital ønskeseddel

##om projektet

her beskriver vi Dreamy;

##Funktioner
- Oprette en digital ønskeseddel
- Se alle oprettede ønskesedler
- Se en bestemt ønskeseddel via. ID
- Slette en ønskeseddel
- Tilføje ønsker til en ønskeseddel
- Dele ønskeseddel via et unikt delings-ID

##Teknologier
- Java
- SpringBoot
- Spring Data JPA
- MySQL
- Maven
- Azure
- Github
- Github Actions

##Projektstruktur
projektet er opdelt i følgende pakker
- controller:Håndterer HTTP-forespørgelser
- model:indeholder projektets entiteter herunder Wish og Wishlist
- repository:håndterer kommunikationen med databasen
- service:indeholder projektet forretningslogik

##Softwaremæssige forudsætninger
for at kunne anvende og køre projektet skal følgende være installeret;
- Java JDK (den version projektet er i)
- intelliJ IDEA 
- Maven
- MySQL
- Git
Derudover skal man have adgang til projektets database

##Installation og opstart
1. Klon projektet fra Github
2. Åbn projektet i IntelliJ IDEA
3. Kontroller databaseindstillingerne i application.properties
4. Sørg for, at MYSQL-databasen er oprettet og fungere
5. Indlæs Maven
6. Start Spring-Boot applikation

##Database
Dreamy anvender MYSQL til at gemme oplysninger om brugere, ønskesedler og ønsker
Spring Data JPA anvendes til at kommunikere med databasen

##Deployment
Applikationen er tiltænkt deployment til Microsoft Azure
Link til den kørende applikation:

##Test
projektet indeholder følgende testområder
- Unitest af projektets metoder og funktioner
- Integrationstest af samspillet mellem systemets komponenter og databasen
- Statisk kodeanalyse med Qodana

##projektstyring
projektet udvikles i samarbejde vha. Github
Github project anvendes til at organisere user stories,tasks og projektstatus
Github Actions anvendes til automatisering af build,test og deployment

##Dokumentation
yderligere dokumentation findes i mappen docs, herunder:
- ER-diagram
- klassediagram
- UX-UI-dokumentation
- Dokumentation af Qodana-kodeinspektion

##Udviklere
Dreamy er udviklet som et studieprojekt(miniprojekt)
