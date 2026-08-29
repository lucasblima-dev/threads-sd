# Atividade de Threads - Sistemas Distribuídos

Implementação de seis exercícios sobre **Threads em Java**, cobrindo criação de threads (por herança e por `Runnable`), execução concorrente, `Thread.sleep()` e `Thread.join()`. Os programas foram executados em uma máquina virtual Ubuntu na nuvem (Oracle Cloud Infrastructure — Always Free), e a explicação de cada questão foi gravada em vídeo.

## Dupla

| Integrante | Questões   |
| ---------- | ---------- |
| Lucas      | 01, 02, 03 |
| Flávio     | 04, 05, 06 |

## Estrutura do repositório

> A estrutura é temporária e pode ser alterada

```
threads-sd/
├── README.md
├── src/
│   ├── exerc01/
│   │   └── MinhaThread.java     # Thread por herança
│   ├── exerc02/
│   │   └── Contador.java        # Thread por Runnable
│   ├── exerc03/
│   │   └── TresThreads.java     # Três threads concorrentes
│   ├── exerc04/
│   │   └── Principal4.java      # Ordem de execução sem sincronização
│   ├── exerc05/
│   │   └── Principal5.java      # Thread.sleep()
│   └── exerc06/
│       └── Principal6.java      # Thread.join()
└── videos/
    ├── questoes-01-a-03-lucas.mp4
    └── questoes-04-a-06-flavio.mp4
```

## O que cada questão aborda

| Pasta     | Classe        | Tema                                                                            |
| --------- | ------------- | ------------------------------------------------------------------------------- |
| `exerc01` | `MinhaThread` | Criação de thread estendendo `Thread` e sobrescrevendo `run()`                  |
| `exerc02` | `Contador`    | Criação de thread implementando `Runnable`                                      |
| `exerc03` | `TresThreads` | Três threads rodando simultaneamente, sem ordem garantida                       |
| `exerc04` | `Principal4`  | Ordem de execução entre threads e a thread principal, sem sincronização         |
| `exerc05` | `Principal5`  | Uso de `Thread.sleep()` e o estado `TIMED_WAITING`                              |
| `exerc06` | `Principal6`  | Uso de `Thread.join()` para sincronizar a thread principal com uma thread filha |

## Ambiente de execução

- **Infraestrutura**: máquina virtual Ubuntu (Oracle Cloud Infrastructure, tier Always Free, shape `VM.Standard.E2.1.Micro`)
- **Linguagem/JDK**: Java (OpenJDK 17)
- **Acesso**: SSH (cada integrante da dupla conectou de forma independente, em momentos diferentes, para gravar sua parte)

## Como compilar e executar

Cada pasta em `src/` contém um único arquivo `.java`, cujo nome coincide com o da classe pública que ele define. Para rodar qualquer um deles:

```bash
cd src/exercXX
javac NomeDaClasse.java
java NomeDaClasse
```

Exemplo para a Questão 01:

```bash
cd src/exerc01
javac MinhaThread.java
java MinhaThread
```

## Vídeos

O vídeo está disponível via Google drive pelo link: https://drive.google.com/file/d/1TBcP514csGni1REtPhj2u5R3mLEYC195/view?usp=sharing.
