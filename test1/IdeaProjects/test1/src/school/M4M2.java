/*M2: Een complexere hiërarchie

Voor de volgende opdracht kan het enorm helpen om op voorhand een schema te maken
zodat je een idee hebt hoe alles in elkaar past. Denk zelf na over de gepaste types en hoe alles in elkaar past.
We schrijven enkele classes die een school gaan voorstellen,
hiervoor hebben we verschillende klassen (gniffel) nodig.



We hebben verschillende personen,
de gezamelijke gegevens zoals een voor- en achternaam komen in een klasse Persoon.
verder hebben we nog specifiekere personen


Een Student is een Persoon en heeft verder nog een studentennummer en specialisatie (bv. TI, MCT, ...)
Docenten zijn personeelsleden met een specialisatie en lokaal
Bedienden zijn ook personeelsleden en hebben ook een lokaal
Een Lokaal bestaat uit een adres, gebouw (bv. blok A), een verdieping en lokaalnummer

Als uitdaging probeer je de volgende functies te laten werken:

Docenten begeleiden meerdere studenten,
probeer er voor te zorgen dat een docent meerdere studenten toegewezen krijgt, hiervoor kan je een array bekijken.

Bedienden kunnen een lokaal wijzigen van andere personeelsleden,
zorg er voor dat deze functie enkel binnen de school (package) gebruikt kan worden.


Persoon (gemeenschappelijke gegevens)
├── Student (is een persoon)
└── Personeelslid (is een persoon)
    └── Bediende (persoon en personeelslid)
        └── Docent  ← erft van Bediende (docent is een persoon, personneelslid en bediende)

Lokaal (apart object)

Persoon
├── voornaam
└── achternaam

Student extends Persoon
├── studentennummer
└── specialisatie (bv. TI, MCT)

Personeelslid extends Persoon
└── lokaal (object van klasse Lokaal)

Docent extends Personeelslid
├── specialisatie
└── studenten[] (array van studenten)

Bediende extends Personeelslid
└── wisselLokaal() (package private method!)

Lokaal
├── adres
├── gebouw (bv. blok A)
├── verdieping
└── lokaalnummer

Hoeveel files heb je nodig?

Persoon.java
Student.java
Personeelslid.java
Docent.java
Bediende.java
Lokaal.java
Main.java

 */