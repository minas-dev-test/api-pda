# api-pda

Projeto criado utilizando Spring-boot, Maven, MongoDB e Docker

Rotas:
"/pontos_de_apoio" : 
  methods:
    get: retorna uma lista(json) com todos os pontos
    post: insere um novo ponto enviado em formato json pelo body
 "/pontos_de_apoio/{id}"
    get: retorna o ponto(json) referente ao id
    put: atualiza o ponto referente ao id, com o json enviado pelo body
    delete: remove o ponto referente ao id

Para compilar, é necessário ter instalado o Maven: https://maven.apache.org/download.cgi
Utilize: 
  - mvn clean install
  
No docker, crie a imagem da api:
  - docker build --rm -f Dockerfile -t api-pda:latest .
  
E faça o compose:
  - docker-compose -f docker-compose.yml up -d --build
