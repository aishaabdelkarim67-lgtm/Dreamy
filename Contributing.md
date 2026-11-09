##CONTRIBUTING.md – Dreamy

##Velkommen til Dreamy!

Denne guide beskriver, hvordan du kommer i gang med projektet, og hvordan du bidrager med ny kode og ændringer.

1. Kom godt i gang

For at arbejde med projektet skal du have følgende installeret:

Java JDK (samme version som projektet bruger).
IntelliJ IDEA.
Maven.
MySQL.
Git.


Du skal også have adgang til projektets database.

Sådan starter du projektet
Klon projektet fra GitHub.
Åbn projektet i IntelliJ IDEA.
Kontrollér, at databaseindstillingerne i application.properties er korrekte.
Sørg for, at MySQL-databasen fungerer.
Indlæs Maven-dependencies.
Start Spring Boot-applikationen.

2. Projektets opbygning

Projektet er opdelt i fire pakker:

controller: Modtager og håndterer forespørgsler.
model: Indeholder projektets modeller, f.eks. Wish og Wishlist.
repository: Står for kommunikationen med databasen.
service: Indeholder den logik, der får funktionerne til at virke.

Når du tilføjer ny kode, skal du placere den i den pakke, hvor den hører til.

3. Kodestandarder

Når du skriver ny kode, skal du følge disse retningslinjer:

Brug navne, der tydeligt beskriver, hvad koden gør.
Følg Java's navngivningsregler.
Skriv kode, der er nem at læse og forstå.
Undgå unødvendig og gentaget kode.
Tilføj kommentarer, hvis noget i koden kræver en forklaring.

4. Git og branches

Vi bruger GitHub til at dele og arbejde med koden.

Når du skal lave en ændring, skal du:

Hente den nyeste version af projektet.
Oprette en ny branch til din opgave.
Lave dine ændringer.
Gemme ændringerne med en commit.
Oprette en Pull Request på GitHub.

Giv din branch et navn, der beskriver opgaven.

Eksempler:

feature/backend
feature/frontend
feature/database



5. Test

Når du laver ændringer i koden, skal du kontrollere, at det hele stadig virker.

Projektet bruger:

Unit tests: Tester om de enkelte metoder virker.
Integrationstests: Tester om de forskellige dele af systemet fungerer sammen.
Qodana: Kontrollerer koden for fejl og mulige forbedringer.

Husk at teste din nye funktionalitet og kontrollere, at eksisterende tests stadig virker.

6. Pull Requests og code review

Når du er færdig med din opgave, skal du oprette en Pull Request på GitHub.



Et andet teammedlem skal gennemgå dine ændringer, inden de bliver lagt ind i projektets fælles kode.

7. Database

Dreamy bruger MySQL til at gemme oplysninger om ønskesedler og ønsker.

Hvis du ændrer databasen eller projektets modeller, skal du kontrollere, at ændringerne fungerer sammen med resten af systemet.

Husk, at adgangskoder og andre private databaseoplysninger aldrig må deles på GitHub. Brug miljøvariabler til at opbevare følsomme oplysninger.

8. Dokumentation

Hvis du tilføjer nye funktioner eller ændrer eksisterende funktioner, skal du også opdatere dokumentationen, hvis det er nødvendigt.

Projektets dokumentation findes i mappen docs.

Her finder du blandt andet ER-diagram, klassediagram og UX/UI-dokumentation.

9. Samarbejde

Vi bruger GitHub Projects til at holde styr på opgaver, user stories og projektets status.

Inden du begynder på en opgave, skal du tjekke, om den allerede er oprettet i projektet.

Hvis du har spørgsmål eller brug for hjælp, kan du kontakte de andre teammedlemmer.

Afslutning

Når du bidrager til Dreamy, forventer vi, at du:

Skriver kode, der er nem at forstå.
Følger projektets opbygning.
Tester dine ændringer.
Bruger branches og Pull Requests.
Hjælper med at holde dokumentationen opdateret.
Samarbejder med resten af teamet.