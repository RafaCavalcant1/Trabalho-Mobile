# Harry Potter Mobile 🧙‍♂️✨

Este projeto consiste em um aplicativo móvel, chamado **PotterDex** que explora o universo de Harry Potter, utilizando a API "Wizard World API" para obter informações sobre Casas, Feitiços e muito mais!


##

## Equipe de Desenvolvimento

- **João Victor Ferreira Lima dos Santos**
- **Mickeliny Mirtes de Sena**
- **Rafaela Silva Cavalcanti Pereira**
- **Robério Pereira de Albuquerque Neto**


##

## Links:

<h4>API 📚</h4>
- https://wizard-world-api.herokuapp.com

<h4>Figma 🎨</h4>
- https://www.figma.com/design/ZzRF3LswOfUFtBateaRano/harry-potter-mobile?node-id=0-1&t=SNg2Hhw9U0bcDPPu-1

<h4>Documento de Requisitos 📑</h4>
- https://github.com/user-attachments/files/17232225/Documento_Requisitos.pdf

<h4>Video Redux 🎬</h4>
- https://youtu.be/f3dPppnImog

<h4>Video Harry Potter 🧙‍♂️</h4>
- https://youtu.be/4wYyLtqrYm8?si=uw6JNAwPJhpC3z_6

##

### 1. Funcionalidades ✨
- 📝 **Interface de cadastro e login de usuários.**
- 🏠 **Listagem das Casas da Escola e as Cores que representam cada Casa.**
- 🧪 **Listagem de Elixirs e seus efeitos .**
- 🪄 **Listagem de Feitiços e seus efeitos.**
- 🍅 **Listagem de Ingredientes.**

### 2. Requisitos Funcionais ⚙️

#### 2.1 Autenticação de Usuários 🔐
- **RF01**: O sistema deve permitir que novos usuários se cadastrem com nome, hobby, email e senha.
- **RF02**: O sistema deve permitir o login de usuários cadastrados com email e senha.
- **RF03**: O sistema deve exibir mensagens de erro em caso de falha no login (credenciais incorretas) ou cadastro (email já existente).

#### 2.2 Tela de Listagem das Casa 🏠
- **RF04**: Após o login, o sistema irá abrir um menu com todas as funcionalidades onde o usuário poderá escolher qual acessar, considerando que foi selecionado a opção Casas.
- **RF05**: O sistema deve permitir que o usuário visualize as Casas e as Cores que as representam.

#### 2.3 Tela de Listagem de Elixirs 🧪
- **RF06**: Após o login, o sistema irá abrir um menu com todas as funcionalidades onde o usuário poderá escolher qual acessar, considerando que foi selecionada a opção Elixirs.
- **RF07**: O sistema deve permitir que o usuário visualize os Elixirs e os seus efeitos.

#### 2.4 Tela de Listagem de Feitiços 🪄
- **RF08**: Após o login, o sistema irá abrir um menu com todas as funcionalidades onde o usuário poderá escolher qual acessar, considerando que foi selecionada a opção Feitiçcos.
- **RF09**: O sistema deve permitir que o usuário visualize os Feitiços e os seus efeitos.

#### 2.5 Tela de Listagem de Ingredientes 🍅
- **RF10**: Após o login, o sistema irá abrir um menu com todas as funcionalidades onde o usuário poderá escolher qual acessar, considerando que foi selecionada a opção Ingredientes.
- **RF11**: O sistema deve permitir que o usuário visualize os Ingredientes.
  
### 3. Requisitos Não Funcionais 🚀

#### 3.1 Usabilidade 🖥️
- **RNF01**: O aplicativo deve ter uma interface intuitiva, permitindo navegação fácil entre as telas de Casas, Feitiços, Elixirs e Ingredientes.

#### 3.2 Segurança 🔒
- **RNF02**: As senhas dos usuários devem ser armazenadas de maneira segura utilizando criptografia.

### 4. Fluxo de Navegação 🔄

#### 4.1 Fluxo de Cadastro e Login 🔐
1. O usuário é recebido pela tela de login com a opção de "Entrar" ou "Cadastrar-se".
2. Se o usuário não tiver uma conta, ele pode clicar em "Cadastrar-se" e preencher o formulário de cadastro.
3. Após o cadastro, o usuário é redirecionado para aba de menu onde contém as funcionalidades que ele pode navegar (Casas, Elixirs, Feitiços e Ingredientes)

#### 4.2 Fluxo do Menu#
1. Após fazer login o usuário é direcionado para aba de menu onde contém as funcionalidades que ele pode navegar (Casas, Elixirs, Feitiços e Ingredientes)
2. Ao clicar em alguma dessas opções, seguir respectivamente os requisitos funcionais 2.2 até o 2.5.

### 5. Tecnologias e Ferramentas 🛠️
- **Linguagem de Programação**: Kotlin
- **API de Dados**: Wizard World API
- **Autenticação**: Firebase Authentication (ou similar)
- **Banco de Dados**: Firebase Realtime Database / PostgreSQL
- **IDE**: Android Studio
- **Design**: Figma
