# profissionalApiREST

## Esse projeto disponibiliza endpoints para CRUD de informações em baco Mysql

## Descrição
 ### Aqui estão a lista de endpoints que podem ser utilizados para manipulação dos dados em JSON:

## Objeto Cargo
* {URL}/profissional/cargo/addCargo     - adiciona cargos
### Exemplo Body Request - POST
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
* {URL}/profissional/cargo/update       -altera um cargo
### Exemplo Body Request - PUT
----

```json
{		
	"id":1,
        "cargoNome": "Analista de Departamento Pessoal Jr",
        "trilha": {
            "id": 1
        },
        "cargoMissao": "Realizar controle e processamento da folha de pagament0."
}
```

* {URL}/profissional/cargos	          - lista todos os cargos (GET)
* {URL}/profissional/cargo/{id}         - lista cargo pelo id	(GET)
* {URL}/profissional/cargo/delete/{id}  - deleta um cargo pelo id (DELETE)

## Objeto Trilha
* {URL}/profissional/trilha/addTrilha     - adiciona cargos
### Exemplo Body Request - POST
----

```json
{
    "trilhaNome": "ADMINISTRAÇÃO DE PESSOAL",
    "diretoria": "G&G",
    "missaoFormal": "Planejar, executar e mensurar a administração de pessoal.",
    "missaoAlternativa": "Garantir que as leis trabalhistas estejam sendo cumpridas com eficácia e eficiência."
}
```
* {URL}/profissional/trilha/update       -altera um cargo
### Exemplo Body Request - PUT
----

```json
{	
    "id": 1,
    "trilhaNome": "ADMINISTRAÇÃO DE PESSOAL",
    "diretoria": "G&G",
    "missaoFormal": "Planejar, executar e mensurar a administração de pessoal.",
    "missaoAlternativa": "Garantir que as leis trabalhistas estejam sendo cumpridas com eficácia e eficiência."
}
```
* profissional/trilhas		   - lista todas trilhas (GET)
* profissional/trilha/{id}	   - lista trilha por id (GET)
* profissional/trilha/delete/{id}  - deleta uma trilha pelo id (DELETE)
	
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
