# profissionalApiREST

## Esse projeto disponibiliza endpoints para CRUD de informações em baco Mysql

## Descrição
 ### Aqui estão a lista de endpoints que podem ser utilizados para manipulação dos dados em JSON:

Objeto Cargo
* profissional/cargo/addCargo     // adiciona cargos
* profissional/cargos	          // lista todos os cargos
* profissional/cargo/{id}         //lista cargo pelo id
* profissional/cargo/update       //altera um cargo
* profissional/cargo/delete/{id}  //deleta um cargo pelo id

Objeto Trilha
* profissional/trilha/addTrilha    //adiciona trilha
* profissional/trilhas		   //lista todas trilhas
* profissional/trilha/{id}	   //lista trilha por id
* profissional/trilha/update	   //altera uma trilha
* profissional/trilha/delete/{id}  //deleta uma trilha pelo id
	
 ### Bibliotécas usadas
* Spring Boot
* Spring MVC (Spring Web)
* Spring Data JPA com Hibernate
* MySql
### Ferramentas usadas
* Eclipse IDE 4.16.0
* MySql rodando com XAMPP

### Como compilar?
* mvn clean install - Necessário Maven instalado
