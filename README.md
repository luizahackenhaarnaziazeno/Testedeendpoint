# Fundamentos de Desenvolvimento de Software
## Exercício De Teste De Endpoint
Usando JBA

## Endpoint

| Método | Endpoint                                       |
|--------|------------------------------------------------|
| GET    | `/acmerescue/cadastro/listaeventos`            |

### Descrição
Este endpoint fornece uma lista de todos os eventos cadastrados no sistema.

### Parâmetros de Entrada

| Parâmetro | Tipo    | Descrição                                      |
|-----------|---------|------------------------------------------------|
| Nenhum    | -       | Este endpoint não requer parâmetros de entrada. |

### Resposta (JSON)

A resposta será um array de objetos, onde cada objeto representa um evento. A estrutura do evento é a seguinte:

| Atributo  | Tipo   | Descrição                                      |
|-----------|--------|------------------------------------------------|
| `codigo`  | string | Código único do evento.                        |
| `descricao` | string | Descrição do evento.                          |
| `data`    | string | Data do evento, no formato ISO 8601 (YYYY-MM-DDTHH:MM:SSZ). |
| Outros    | -      | Outros atributos podem ser incluídos conforme a implementação. |


 ## Linguagem Utilizada:
<div style="display: inline_block"><br>
<img src="https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white" /> 

# Autora:

| [<img loading="lazy" src="https://avatars.githubusercontent.com/u/142232479?v=4" width=115><br><sub>Luiza Hackenhaar Naziazeno</sub>](https://github.com/luizahackenhaarnaziazeno)|
| :---: |

