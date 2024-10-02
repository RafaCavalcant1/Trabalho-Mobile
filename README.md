# Harry Potter Mobile 🧙‍♂️✨

Este projeto consiste em um aplicativo móvel, chamado **PotterDex** que explora o universo de Harry Potter, utilizando a API do PotterDB para obter informações sobre personagens, feitiços, casas e muito mais!

## Equipe de Desenvolvimento

- **João Victor Ferreira Lima dos Santos**
- **Mickeliny Mirtes de Sena**
- **Rafaela Silva Cavalcanti Pereira**
- **Robério Pereira de Albuquerque Neto**

## Links:

<h4>API 📚</h4>
- https://docs.potterdb.com/getting-started

<h4>Figma 🎨</h4>
- https://www.figma.com/design/ZzRF3LswOfUFtBateaRano/harry-potter-mobile?node-id=0-1&t=SNg2Hhw9U0bcDPPu-1

<h4>Documento de Requisitos 📑</h4>
- https://github.com/user-attachments/files/17232225/Documento_Requisitos.pdf

##

### 1.0 Funcionalidades ✨
- 📝 **Interface de cadastro e login de usuários.**
- 🧪 **Listagem de poções com opção de busca.**
- 🔍 **Visualização de detalhes de poções com efeitos e ingredientes.**
- ✨ **Funcionalidade de gerar feitiços.**
- 📚 **Listagem de biblioteca de livros.**
- 📖 **Visualização de detalhes de livros.**
- 🎬 **Listagem de filmes.**
- 🎥 **Visualização de detalhes de filmes.**

### 2. Requisitos Funcionais ⚙️

#### 2.1 Autenticação de Usuários 🔐
- **RF01**: O sistema deve permitir que novos usuários se cadastrem com nome, email e senha.
- **RF02**: O sistema deve permitir o login de usuários cadastrados com email e senha.
- **RF03**: O sistema deve exibir mensagens de erro em caso de falha no login (credenciais incorretas) ou cadastro (email já existente).

#### 2.2 Tela de Busca de Poções 🧪
- **RF04**: Após o login, o sistema irá abrir um menu com todas as funcionalidades onde o usuário poderá escolher qual acessar, considerando que foi selecionada a busca de poção.
- **RF05**: O sistema deve permitir a busca pelo nome da poção escolhida.
- **RF06**: O sistema deve permitir ao usuário clicar em uma poção da lista para visualizar seus detalhes.

#### 2.3 Tela Geradora de Feitiços ✨
- **RF07**: Após o login, o sistema irá abrir um menu com todas as funcionalidades onde o usuário poderá escolher qual acessar, considerando que foi selecionado o gerador de feitiços.
- **RF08**: O sistema deve permitir que o usuário gere um feitiço aleatório clicando no botão "Gerar feitiço".

#### 2.4 Tela de Listagem de Biblioteca 📚
- **RF09**: Após o login, o sistema irá abrir um menu com todas as funcionalidades onde o usuário poderá escolher qual acessar, considerando que foi selecionada a opção biblioteca.
- **RF10**: O sistema deve listar todos os livros.
- **RF11**: O sistema deve permitir que o usuário selecione um livro e veja seus detalhes.

#### 2.5 Tela de Listagem de Filmes 🎬
- **RF12**: Após o login, o sistema irá abrir um menu com todas as funcionalidades onde o usuário poderá escolher qual acessar, considerando que foi selecionada a opção Filmes.
- **RF13**: O sistema deve listar todos os filmes.
- **RF14**: O sistema deve permitir que o usuário selecione um filme e veja seus detalhes.

### 3. Requisitos Não Funcionais 🚀

#### 3.1 Usabilidade 🖥️
- **RNF01**: O aplicativo deve ter uma interface intuitiva, permitindo navegação fácil entre as telas de busca de poções, gerador de feitiços, biblioteca e filmes.

#### 3.2 Segurança 🔒
- **RNF02**: As senhas dos usuários devem ser armazenadas de maneira segura utilizando criptografia.

### 4. Fluxo de Navegação 🔄

#### 4.1 Fluxo de Cadastro e Login 🔐
1. O usuário é recebido pela tela de login com a opção de "Entrar" ou "Cadastrar-se".
2. Se o usuário não tiver uma conta, ele pode clicar em "Cadastrar-se" e preencher o formulário de cadastro.
3. Após o cadastro, o usuário é redirecionado à tela de login para acessar o sistema.
4. O usuário insere seu email e senha para fazer login.

#### 4.2 Fluxo do Menu
1. Após fazer login o usuário é direcionado para aba de menu onde contém as funcionalidades que ele pode navegar (Poções, Gerador, Biblioteca, Filmes)
2. Ao clicar em alguma dessas opções, seguir respectivamente os requisitos funcionais 2.2 até o 2.5.

### 5. Tecnologias e Ferramentas 🛠️
- **Linguagem de Programação**: Kotlin
- **API de Dados**: PotterDB
- **Autenticação**: Firebase Authentication (ou similar)
- **Banco de Dados**: Firebase Realtime Database / PostgreSQL
- **IDE**: Android Studio
- **Design**: Figma
