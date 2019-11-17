->Spring MVC
->MySql 
->Hibernate
->Maven



Pracownikow i projekty nalezy wprowadzac pojedynczo przy pomocy np. Postman.

Dostepne endpointy:

=====Konto Pracownika========

http://localhost:8080/konkurs/employee - dodawanie konta pracownika (post)
http://localhost:8080/konkurs/employee - modyfikacja konta pracownika (put)
http://localhost:8080/konkurs/employee/id - usuwanie konta pracownika o podanym id (delete)
http://localhost:8080/konkurs/employee/employeeId/projectId - usuwanie wpisu do ewidencji czasu pracy dla pracownika o podanym id = employeeId, z projektu o podanym id = projectId (delete)

=====Projekt========

http://localhost:8080/konkurs/project - dodawanie projektu (post)
http://localhost:8080/konkurs/project - modyfikacja projektu (put)
http://localhost:8080/konkurs/project/id - usuwanie projektu o podanym id (delete)

=====Wyswietlanie========

http://localhost:8080/konkurs - strona glowna 

http://localhost:8080/konkurs/view - wyswietlanie statystyk ilosci zrealizowanych godzin lacznie w poszczególnych projektach (get)

http://localhost:8080/konkurs/view/report -  pobieranie raportu zawierajacego
dane pracownikow wraz z projektami i iloscia godzin zrealizowanych w poszczególnych projektach  (get)

