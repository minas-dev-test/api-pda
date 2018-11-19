# api-pda

Projeto criado utilizando Spring-boot, Maven, MongoDB e Docker

## Instalação

Para compilar, é necessário ter instalado o Maven: <https://maven.apache.org/download.cgi.>

Para compilar o código execute:

    mvn clean install
  
Para executar a aplicação com o banco, execute o compose:

    docker-compose up

Para gerar uma imagem docker, execute:

    docker build --rm -f Dockerfile -t api-pda:latest .

## Rotas  

- `/pontos_de_apoio` :  
  - `get`: retorna uma lista(json) com todos os pontos  
  - `post`: insere um novo ponto enviado em formato json pelo body  
- `/pontos_de_apoio/{id}`
  - `get`: retorna o ponto(json) referente ao id
  - `put`: atualiza o ponto referente ao id, com o json enviado pelo body
  - `delete`: remove o ponto referente ao id  
- `/pontos_de_apoio/q/{campo}={param}`
  - `get`: retorna uma lista resultante da query realizada sobre o `{campo}` buscando o `{param}`  
     Ex: `/pontos_de_apoio/q/cidade=juiz` retorna uma lista com todas os PDAs que contem 'juiz' nocampo cidade  
     Campos suportados: rua, bairro, cidade, cep

## Formato dos dados

O Formato dos dados JSON de CRUD são:

```JS
{
  "id":               String,
  "nome":             String,
  "rua":              String,
  "numero":           int,
  "complemento":      String,
  "bairro":           String,
  "cidade":           String,
  "estado":           String,
  "cep":              String,
  "pnt_referencia":   String,
  "hora_Abertura":    String,
  "hora_Fechamento":  String,
  "latitude":         double,
  "longitude":        double,
  // Apenas Leitura
  "endereco":         String
}
```