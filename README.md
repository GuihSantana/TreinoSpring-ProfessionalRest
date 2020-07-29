# profissionalApiREST

## Esse projeto disponibiliza endpoints para CRUD de informações em baco Mysql

## Descrição
 ### Aqui estão a lista de endpoints que podem ser utilizados para manipulação dos dados em JSON:

## Objeto Cargo
* {URL}/profissional/cargo/addCargo     // adiciona cargos
### Exemplo Body Request
----

```json
{
        "cargoNome": "Analista de Departamento Pessoal Jr",
        "trilha": {
            "id": 1
        },
        "cargoMissao": "Realizar controle e processamento da folha de pagamento."
}
```
* {URL}/profissional/cargo/update       //altera um cargo
### Exemplo Body Request
----

```json
{
        "cargoNome": "Analista de Departamento Pessoal Jr",
        "trilha": {
            "id": 1
        },
        "cargoMissao": "Realizar controle e processamento da folha de pagamento."
}
```

* {URL}/profissional/cargos	          // lista todos os cargos
* {URL}/profissional/cargo/{id}         //lista cargo pelo id
* {URL}/profissional/cargo/delete/{id}  //deleta um cargo pelo id

## Objeto Trilha
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
