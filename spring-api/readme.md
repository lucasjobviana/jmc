# JMC - Maintenance Controller

O JMC (J Maintenance Controller) é um projeto de gerenciamento de manutenção de frotas, projetado para facilitar o controle das manutenções da frota da uma transportadora.

## Índice

- [Pré-requisitos](#pré-requisitos)
- [Como Executar](#como-executar)
- [Estrutura do Projeto](#estrutura-do-projeto)
- [Tecnologias Utilizadas](#tecnologias-utilizadas)
- [Contribuição](#contribuição)

## Pré-requisitos

Certifique-se de ter o Docker e o docker-compose instalados em sua máquina.

## Como Executar

1. **Clone o repositório:**

    ```bash
    git clone https://github.com/lucasjobviana/jmc.git
    cd jmc
    ```

2. **Execute o Docker Compose:**

    ```bash
    docker-compose up --build
    ```

   Acesse a aplicação em [http://localhost:3000](http://localhost:3000).
   
    A api pode ser acessada em [http://localhost:8080](http://localhost:8080).

    Os dados de conexão estão expostos em application.properties
## Estrutura do Projeto

- `spring-api/`: Código-fonte da API Spring.
   - `src/`: Contém os arquivos de código-fonte Java.
      - `main/`: Código principal da aplicação.
         - `java/`: Pacotes Java.
            - `com/job/jmc/api`: Pacote principal.
               - `controller/`: Controladores da API.
               - `entities/`: Modelos de dados.
               - `exceptions/`: Exceções e Controller Advice.
               - `services/`: Serviços da aplicação.
               - `repositories/`: Repositórios Jpa.
         - `resources/`: Recursos da aplicação.
            - `application.properties`: Configurações da aplicação.
   - `pom.xml`: Arquivo de configuração do Maven.

- `frontend/`: Código-fonte do SPA com Next.js.
   - `src/`: Contém os arquivos de código-fonte JavaScript/React.
   - `public/`: Arquivos públicos, como imagens e ícones.
   - `next.config.js`: Configurações do Next.js.

- `docker-compose.yaml`: Arquivo de configuração do Docker Compose.
- ...


## Tecnologias Utilizadas

- Java, Spring (backend)
- Typescript, Next (frontend)
- Docker
- MySQL

## Contribuição

Sinta-se à vontade para contribuir com melhorias! Abra uma issue ou envie um pull request.


