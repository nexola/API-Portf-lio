# API Portfolio
[![NPM](https://img.shields.io/npm/l/react)](https://github.com/nexola/API-portfolio/blob/main/LICENSE) 
# Sobre
API direcionada a otimização de atualizações de portfólio, como adição/alteração de competências, descrições, links pertinentes, entre outros.
# Justificativa
Com o passar do tempo e dos aprendizados adquiridos, me vi frequentemente tendo que atualizar meu portfolio (hardcode) e dando commits por coisas pequenas, mas que necessitavam de atualização, com isso em mente, pensei em agilizar esse processo, construindo uma API que armazenasse todos esses dados e consumindo de forma assíncrona com meu frontend.
# Estrutura
Tendo como base meu portfólio atual (02/2024), temos a seguinte estrutura:
#### Header
- Título
- Localização (estado)
- Sobre mim
#### Experiência
- Projetos recentes  (título, ano, link repositório github, link do site online, curso/empresa, descrição, tecnologias utilizadas)
#### Formação
- Descrição
- Diplomas (nível, curso, anoInicio, anoTermino, instituição)
- Cursos intensivos (nome do curso, status, horas)
- Idiomas (idioma, nível)
- Certificados (curso, link do certificado, instituição)
#### Footer 
- Descrição
- Email
- Telefone
- Rede social (@user)
- Github (link)
- Linkedin (link)
- CV (link)

# Modelo de domínio
![image](https://github.com/nexola/API-portfolio/assets/103954392/a2f321c4-847c-4010-96d1-29cd46c37972)
# DTO do Portfolio
![image](https://github.com/nexola/API-portfolio-backend/assets/103954392/638f94a2-9747-439e-9dec-8e5c7589777c)

# Tecnologias utilizadas
- Java
- Maven
- Spring boot
- Spring Security
- MongoDB
- JWT
- OAuth2
- EmailSender

# Environment e collection postman
[collection](https://github.com/nexola/API-portfolio-backend/files/14426704/api-portfolio_postman-collection.json)

[environment](https://github.com/nexola/API-portfolio-backend/files/14426708/api-portfolio_postman-environment.json)

# Requisições
## Auth
### POST /oauth2/token
> Login

### POST /auth/recover-token
> Email de recuperação de senha

### PUT /auth/new-password
> Atualização de senha

## Portfolio
### GET /portfolio/{id}
> Obtém o portfólio por id

### PUT /portfolio
> Atualiza o portfólio do usuário autenticado

## User
### GET /user
> Obtém o usuário autenticado

### GET /user/portfolio
> Obtém o portfólio do usuário autenticado

### POST /user
> Cadastra um novo usuário

# Autor

Vitor Vianna

https://www.linkedin.com/in/vitor-vianna-a53075215/
