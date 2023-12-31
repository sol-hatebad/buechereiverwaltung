# use-case diagram
Create a use case diagram for a library system 
- which cases are available for the customer
- which cases are available for the librarian 
- how are Use Cases conneceted to each other

# [docs](docs)
Contain the documentation for the process of the use case diagram and class diagram
# [UML](UML)
Contain the designs for the use case diagram and class diagram

# Changelog 
14.06.2023 
- use-case_library.png
- Create first design 

15.06.2023
- file use-case_library_2.png
- extend design
- add relationships  
- add generalization

16.06.2023
- file use-case-library_3.png
- changed "Bücher" into "Bestand"
- add possibilities of what kind of objects "Bestand" can be
- added a generalization from "Bestand" to "nach Objekten suchen" and "Katalog bearbeiten" to implement the additional kinds of "Objekte"

21.06.2023
- rebuild use case diagram
- removed junction "Bestand"

22.06.2023
- simplified use cases and remove logical dependencies
- removed use cases from "Katalog bearbeiten" and just added a note with "crud"
- started to design a class diagram

28.06.2023
- Use Case diagramm :changed 'Katalog' to 'Datenbank'
- edited class diagram, 
- updated class diagram based on the changes from the use case diagramm

06.07.2023
 - Updated class diagram
 - implemented classes 
 
 12.07.2023
  - implemented if function for create person Objects (through if else now different objects are created, Kunde, Mitarbeiter or none of these)
  - added controll outputs for printing array content
