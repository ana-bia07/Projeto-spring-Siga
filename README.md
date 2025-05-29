# 🎓 Projeto Spring - Sistema Administrativo de Alunos

Este é um projeto desenvolvido em **Spring Boot** com interface em **HTML, CSS e JavaScript**, voltado para gerenciar alunos em um sistema administrativo. Nele é possível **inserir**, **consultar**, **editar** e **deletar** alunos através de uma interface simples, com foco em funcionalidade e integração com o backend.

---

## 🧰 Tecnologias Utilizadas

- **Java** com **Spring Boot** (Backend)
- **HTML5** e **CSS3** (Frontend)
- **JavaScript** (Interação e consumo da API)
- **JPA / Hibernate** (Persistência com banco de dados)
- **Banco de Dados relacional** (como MySQL ou H2, dependendo da configuração)

---

## ✨ Funcionalidades

- ✅ Inserir novo aluno
- ✅ Consultar alunos cadastrados
- ✅ Editar dados de um aluno (com carregamento automático dos campos via ID)
- ✅ Deletar aluno

---

## 🗃️ Campos do Aluno

- `usuario`
- `senha`
- `nome`
- `email`
- `telefone`
- `curso`
- `disciplina`
- `status` (Cursando, Trancado, Formado)
- `nota1`
- `nota2`
- `media` (calculada automaticamente)

---

## 📌 Detalhes do Desenvolvimento

- O projeto foi iniciado com base no código fornecido pelo professor, contendo apenas os campos básicos: **usuário, e-mail e senha**.
- Foram adicionados novos campos solicitados, melhorias nas funcionalidades de **edição** e **consulta**, e ajustes para garantir o cálculo correto da **média**.
- O foco do projeto está na lógica e nas funcionalidades, **não no design visual**.

---

## 🚀 Como Executar

1. Clone o repositório:
   ```bash
   git clone https://github.com/ana-bia07/Projeto-spring-Siga.git

## 🖼️ Exemplo de Dados no Banco

Abaixo está um exemplo de como os dados dos alunos estão sendo armazenados na tabela `alunos`:

![Consulta SQL no dbturma](https://github.com/user-attachments/assets/1c27238c-9f9c-4085-a9a0-8b078d2a433c)

