INSERT INTO tb_user (name, email, password) VALUES ('Vitor Vianna', 'vitormatheusfv@gmail.com', 'passw123456');
INSERT INTO tb_role (authority) VALUES ('ROLE_ADMIN');
INSERT INTO tb_role (authority) VALUES ('ROLE_PERSON');

INSERT INTO tb_user_role (user_id, role_id) VALUES (1, 1);
INSERT INTO tb_user_role (user_id, role_id) VALUES (1, 2);

INSERT INTO tb_header (user_id, title, state) VALUES (1, 'Desenvolvedor Fullstack & Estudante de tecnologia', 'São Paulo');
INSERT INTO tb_footer (user_id, description, email, phone, instagram, instagram_user, github, linkedin, curriculum) VALUES (1, 'Estou disponível para projetos e oportunidades de estágio/júnior. Entre em contato comigo para marcarmos uma conversa.', 'vitormatheusfv@gmail.com', '+55 11 95076-5194', 'https://www.instagram.com/_nexola/', '@_nexola', 'https://github.com/nexola', 'https://www.linkedin.com/in/vitor-vianna-a53075215/', 'https://drive.google.com/uc?export=download&id=1K1CNOkiD5QW3_Bm9LwUcDEnTencrqQMV');
INSERT INTO tb_experience (user_id, summary) VALUES (1, 'Estudo análise e desenvolvimento de sistemas e desenvolvo pequenos projetos, com auxílio de ferramentas como Java, HTML, CSS e Javascript, além de trabalhar protótipos de Design UI/UX com Figma');

INSERT INTO tb_project (experience_id, title, conclusion_year, description, course, repository_link, live_Link) VALUES (1, 'DS Catalog', '2024', 'DS Catalog é uma API Rest focada em uma construção de catálogo de produtos, disponibiliza uma área administrativa completa para adicionar, alterar ou remover os recursos', 'Java Spring Expert', 'https://github.com/nexola/dscatalog', null);
INSERT INTO tb_project (experience_id, title, conclusion_year, description, course, repository_link, live_Link) VALUES (1, 'DS Commerce', '2024', 'DS Commerce é uma API Rest projetada para simular um site de vendas, com autenticação e controle de acesso.', 'Java Spring Professional', 'https://github.com/nexola/dscommerce', null);
INSERT INTO tb_project (experience_id, title, conclusion_year, description, course, repository_link, live_Link) VALUES (1, 'Forkify', '2024', 'Aplicativo de receitas com upload personalizado de novas receitas, consumindo API forkify e trabalhando com modelo MVC', 'Javascript ES6', 'https://github.com/nexola/forkify', 'https://nexola-forkify.netlify.app/');
INSERT INTO tb_project (experience_id, title, conclusion_year, description, course, repository_link, live_Link) VALUES (1, 'Mapty', '2023', 'Aplicativo de marcação e salvamento de atividades em mapa, utilizando a API Geolocation e Local storage', 'Javascript ES6', 'https://github.com/nexola/mapty-app', 'https://nexola.github.io/mapty-app/');
INSERT INTO tb_project (experience_id, title, conclusion_year, description, course, repository_link, live_Link) VALUES (1, 'Bikcraft', '2023', 'Página web sobre uma loja fictícia de bicicletas, desenvolvida com fins de aprendizado, voltado para o front end', 'Web Origamid', 'https://github.com/nexola/bikcraft', 'https://nexola.github.io/bikcraft/');
INSERT INTO tb_project (experience_id, title, conclusion_year, description, course, repository_link, live_Link) VALUES (1, 'Chess Game', '2023', 'Projeto inteiramente feito em Java, conta com a experiência completa de um jogo de xadrez', 'Java POO', 'https://github.com/nexola/chess-system-java', null);

INSERT INTO tb_technology (name) VALUES ('Java');
INSERT INTO tb_technology (name) VALUES ('Spring Boot');
INSERT INTO tb_technology (name) VALUES ('JPA');
INSERT INTO tb_technology (name) VALUES ('OAuth2');
INSERT INTO tb_technology (name) VALUES ('JWT');
INSERT INTO tb_technology (name) VALUES ('JUnit');
INSERT INTO tb_technology (name) VALUES ('Jacoco');
INSERT INTO tb_technology (name) VALUES ('EmailSender');
INSERT INTO tb_technology (name) VALUES ('Hibernate');
INSERT INTO tb_technology (name) VALUES ('Javascript');
INSERT INTO tb_technology (name) VALUES ('AJAX');
INSERT INTO tb_technology (name) VALUES ('npm');
INSERT INTO tb_technology (name) VALUES ('API');
INSERT INTO tb_technology (name) VALUES ('Local Storage');
INSERT INTO tb_technology (name) VALUES ('Geolocation');
INSERT INTO tb_technology (name) VALUES ('HTML');
INSERT INTO tb_technology (name) VALUES ('CSS');
INSERT INTO tb_technology (name) VALUES ('UI Design');
INSERT INTO tb_technology (name) VALUES ('UX Design');

INSERT INTO tb_project_technology (project_id, technology_id) VALUES (1, 1);
INSERT INTO tb_project_technology (project_id, technology_id) VALUES (1, 2);
INSERT INTO tb_project_technology (project_id, technology_id) VALUES (1, 3);
INSERT INTO tb_project_technology (project_id, technology_id) VALUES (1, 4);
INSERT INTO tb_project_technology (project_id, technology_id) VALUES (1, 5);
INSERT INTO tb_project_technology (project_id, technology_id) VALUES (1, 6);
INSERT INTO tb_project_technology (project_id, technology_id) VALUES (1, 7);
INSERT INTO tb_project_technology (project_id, technology_id) VALUES (1, 8);
INSERT INTO tb_project_technology (project_id, technology_id) VALUES (2, 1);
INSERT INTO tb_project_technology (project_id, technology_id) VALUES (2, 2);
INSERT INTO tb_project_technology (project_id, technology_id) VALUES (2, 3);
INSERT INTO tb_project_technology (project_id, technology_id) VALUES (2, 9);
INSERT INTO tb_project_technology (project_id, technology_id) VALUES (2, 4);
INSERT INTO tb_project_technology (project_id, technology_id) VALUES (2, 5);
INSERT INTO tb_project_technology (project_id, technology_id) VALUES (3, 10);
INSERT INTO tb_project_technology (project_id, technology_id) VALUES (3, 11);
INSERT INTO tb_project_technology (project_id, technology_id) VALUES (3, 12);
INSERT INTO tb_project_technology (project_id, technology_id) VALUES (3, 13);
INSERT INTO tb_project_technology (project_id, technology_id) VALUES (4, 10);
INSERT INTO tb_project_technology (project_id, technology_id) VALUES (4, 11);
INSERT INTO tb_project_technology (project_id, technology_id) VALUES (4, 14);
INSERT INTO tb_project_technology (project_id, technology_id) VALUES (4, 15);
INSERT INTO tb_project_technology (project_id, technology_id) VALUES (5, 16);
INSERT INTO tb_project_technology (project_id, technology_id) VALUES (5, 17);
INSERT INTO tb_project_technology (project_id, technology_id) VALUES (5, 18);
INSERT INTO tb_project_technology (project_id, technology_id) VALUES (5, 19);
INSERT INTO tb_project_technology (project_id, technology_id) VALUES (6, 1);

INSERT INTO tb_education (user_id, description) VALUES (1, 'Minha mais recente experiência acadêmica é a graduação, estou no semestre 4/6. Além disso me mantenho sempre atualizado com cursos intensivos online e muita leitura, atualmente estou estudando Java Spring Boot e Banco de dados/SQL');

INSERT INTO tb_language (education_id, language, level) VALUES (1, 'Inglês', 1);
INSERT INTO tb_language (education_id, language, level) VALUES (1, 'Estádio', 0);
INSERT INTO tb_language (education_id, language, level) VALUES (1, 'Português', 3);

INSERT INTO tb_diploma (education_id, degree, course, start_year, conclusion_year, institution) VALUES (1, 'Tecnólogo', 'Análise e desenvolvimento de sistemas', '2022', '2025', 'FATEC Ferraz de Vasconcelos');
INSERT INTO tb_diploma (education_id, degree, course, start_year, conclusion_year, institution) VALUES (1, 'Técnico', 'Técnico em Química', '2018', '2020', 'ETEC Suzano');

INSERT INTO tb_certificate (education_id, course, link, institution) VALUES (1, 'Java POO + Spring', 'https://www.udemy.com/certificate/UC-96d8daee-8245-462f-a2a6-bc85bca1e239/', 'Udemy');
INSERT INTO tb_certificate (education_id, course, link, institution) VALUES (1, 'Javascript ES6', 'https://www.udemy.com/certificate/UC-02f90ce5-4300-446a-a9a0-66e533d97c2c/', 'Udemy');
INSERT INTO tb_certificate (education_id, course, link, institution) VALUES (1, 'Git e github', 'https://devsuperior.club/c/1-2279', 'DevSuperior');
INSERT INTO tb_certificate (education_id, course, link, institution) VALUES (1, 'Java Spring Professional', 'https://devsuperior.club/c/5-2279', 'DevSuperior');
INSERT INTO tb_certificate (education_id, course, link, institution) VALUES (1, 'Java Spring Expert', 'https://devsuperior.club/c/6-2279', 'DevSuperior');

INSERT INTO tb_complementary (education_id, course, is_finished, hours) VALUES (1, 'Java Spring Reference', false, null);
INSERT INTO tb_complementary (education_id, course, is_finished, hours) VALUES (1, 'Banco de dados e SQL', false, null);
INSERT INTO tb_complementary (education_id, course, is_finished, hours) VALUES (1, 'Java Spring Expert', true, 200);
INSERT INTO tb_complementary (education_id, course, is_finished, hours) VALUES (1, 'Java Spring Professional', true, 120);
INSERT INTO tb_complementary (education_id, course, is_finished, hours) VALUES (1, 'HTML e CSS', true, 72);
INSERT INTO tb_complementary (education_id, course, is_finished, hours) VALUES (1, 'Javascript Completo ES6', true, 70);
INSERT INTO tb_complementary (education_id, course, is_finished, hours) VALUES (1, 'UI Design', true, 56);
INSERT INTO tb_complementary (education_id, course, is_finished, hours) VALUES (1, 'Java POO + Spring + Projetos', true, 55);
INSERT INTO tb_complementary (education_id, course, is_finished, hours) VALUES (1, 'Mundo Python', true, 40);
INSERT INTO tb_complementary (education_id, course, is_finished, hours) VALUES (1, 'Git e github expert', true, 4);
