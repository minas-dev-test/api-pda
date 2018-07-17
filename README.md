# api-pda

Projeto criado utilizando Spring-boot, Maven, MongoDB e Docker

Para compilar, é necessário ter instalado o Maven: https://maven.apache.org/download.cgi
Utilize: 
  - mvn clean install
  
No docker, crie a imagem da api:
  - docker build --rm -f Dockerfile -t api-pda:latest .
  
E faça o compose:
  - docker-compose -f docker-compose.yml up -d --build
