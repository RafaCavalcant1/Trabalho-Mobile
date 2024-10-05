# Arquitetura Redux

<h4>Video Redux 🎬</h4>
- https://youtu.be/f3dPppnImog

### Como surgiu:
O Redux surgiu em 2015 e foi criado por dois desenvolvedores, Dan Abramov e Andrew Clark. A ideia era resolver um problema que se tornava cada vez mais comum nas aplicações JavaScript, principalmente com o uso do React: o gerenciamento de estado. Eles se inspiraram numa outra arquitetura chamada Flux e em conceitos de programação funcional. O que o Redux faz é simplificar como a gente lida com o estado da aplicação, ou seja, com os dados que ela precisa manter em memória.

Além disso, o Redux não se limita só ao JavaScript. Ele também se expandiu para outras linguagens, como Kotlin. Então, hoje, você pode usar essa abordagem até em apps Android, com a mesma lógica.

### Qual seu propósito:
O principal propósito do Redux é tornar o gerenciamento de estado mais previsível e fácil de entender, especialmente em aplicações mais complexas. E ele faz isso com alguns conceitos bem interessantes.

### Problemas que a arquitetura Redux resolve:

1. **Previsibilidade:**:
   No Redux, o estado da aplicação fica centralizado em um único lugar chamado 'store'. Isso ajuda porque fica mais fácil saber o que está acontecendo no código. Todas as mudanças passam por esse 'store', então a gente consegue rastrear o que mudou e por que mudou.

2. **Imutabilidade**:
   Outra coisa que o Redux traz é o conceito de imutabilidade. Isso significa que, toda vez que uma mudança acontece no estado, ele cria uma nova versão desse estado, sem alterar o original. Isso evita erros e comportamentos inesperados.

3. **Separação de responsabilidades**:
   O Redux também desacopla a lógica do estado da interface. Ou seja, o estado é gerenciado separadamente da interface, que só cuida de como os dados vão ser exibidos.

4. **Fluxo de dados unidirecional**:
  Ele usa um fluxo de dados em apenas uma direção. O que significa que as informações sempre seguem o mesmo caminho, do estado para a interface, passando pelas ações que disparam as mudanças. Isso torna mais fácil entender e depurar o que está acontecendo.

5. **Facilidade para testar**:
   Por último, o Redux facilita muito a escrita de testes. Como ele trabalha com funções puras e uma estrutura previsível, fica mais simples garantir que o código está funcionando como esperado.

### Problemas que ainda existem nesse modelo:

O Redux apresenta alguns desafios, especialmente para novos desenvolvedores, por conta de sua configuração inicial. Criar store, actions, reducers e conectá-los a componentes React pode parecer complicado, principalmente em casos onde uma simples API resolveria o problema.

Outro desafio é a necessidade de criar actions e reducers para cada nova funcionalidade, o que pode parecer redundante em projetos menores, mas é uma prática necessária. Além disso, o Redux gera muito boilerplate (código repetitivo), que é essencial para a configuração, mas acaba tornando o código mais extenso. O Redux Toolkit ajuda a reduzir essa repetição com ferramentas como createSlice e createAsyncThunk, mas ainda não elimina totalmente o problema.

Em aplicações maiores, o desempenho pode ser comprometido, já que toda mudança de estado notifica os componentes conectados ao store. Soluções parciais incluem o uso de seletores otimizados, como os do Reselect, e a divisão do estado em partes menores.

Há também o risco de overengineering em projetos simples, onde o uso do Redux pode ser uma complicação desnecessária. Em tais casos, é recomendável usar bibliotecas mais simples.

Por fim, à medida que a aplicação cresce, a escalabilidade e manutenção do Redux tornam-se mais desafiadoras. Dividir reducers com o combineReducers ajuda a organizar o código, mas pode resultar em fragmentação, dificultando a gestão do projeto.

### Funcionamento da arquitetura:

## Fluxo Unidirecional de Dados no Redux

O Redux segue um fluxo unidirecional de dados, o que significa que o ciclo de 
atualização de estado segue uma única direção, tornando mais fácil rastrear como 
os dados fluem dentro da aplicação.

- **Actions**: São objetos simples que descrevem o que deve mudar no estado da aplicação.

- **Reducer**: Função que recebe o estado atual e uma *action*, calculando o novo estado com base na ação disparada.

- **Store**: Armazena o estado global da aplicação em um único local centralizado.

- **Dispatch**: Quando um evento ocorre na interface, o componente dispara uma *action* para o *store*.

- **State Update**: O *store* atualiza o estado com base no retorno do *reducer*.

- **Subscription**: Os componentes que precisam de partes do estado são atualizados automaticamente sempre que o estado global é alterado.

