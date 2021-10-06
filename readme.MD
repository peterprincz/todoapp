# Todo App
[Referencia példa](https://glacial-sands-09736.herokuapp.com/)

Ebben a feladatban egy feladat kezelő alkalmazás létrehozása a cél.

Egy felületet szeretnénk viszont látni ahol teendőket tudunk létrehozni, törölni és 4 állapot közt mozgatni (TODO, IN PROGRESS, TEST, DONE).


#### Az alábbi szempontokból kérlek próbálj meg a minnél többnek megfelelni:

- Java nyelven írt backend ami kiszolgálja a frontend-et. 
- A felületet JSF technológiával valósítsd meg. 
- A teendők legalább az alkalmazás futása idejéig ne vesszenek el.
- A teendőkkel kapcsolatos műveletek(létrehozás,törlés, módosítás) aszinkron(AJAX) történjenek.  

Nem vágyunk teljes értékű projektre (Logok,Tesztek,Responsive és csinos design), csak müködjön, 2-3 óránál semmiféleképp ne foglalkozz vele :)

Build és futtatás(Maven és JRE installáció szükséges):

`mvn clean install`

`mvn spring-boot:run` vagy `java -jar ./target/todoApp-1.0.0.jar` vagy IDE-ban a main method futtatása
