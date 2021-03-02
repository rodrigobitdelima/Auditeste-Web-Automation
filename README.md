# Auditeste-Web-Automation
Testes automatizados de aceitação para a plataforma Web da Auditeste.

## Ferramentas utilizadas

1. Java (OpenJDK 11)
2. Maven
3. Cucumber
4. Selenium
5. JUnit
6. PageFactory
7. ChromeDriver
8. IntelliJ IDE
9. Linux Ubuntu 20.04

## Execução

Após clonar o projeto, é possível executá-lo utilizando o Maven. Para isso, é necessário possuir o Java, o Maven e o Google Chrome instalados em seu ambiente. Dependendo da atualização do seu browser, pode ser necessário utilizar uma versão diferente do chromedriver. Como o projeto foi implementado em ambiente Linux, o arquivo chromedriver existente na pasta `src/test/resources/drivers` é específico para Linux (necessário utilizar outra versão caso seu ambiente seja diferente). Os testes são executados ao rodar o comando "mvn clean install" pelo terminal. Após executar os testes, é possível visualizar um relatório de resultados em formato HTML gerado em `target/report.html`.

## Observações

* O padrão PageFactory não foi utilizado por completo pois os testes apenas acessam menus da plataforma, portanto implementar inteiramente o padrão geraria complexidades desnecessárias.
* Os arquivos do IDE IntelliJ foram commitados para caso exista necessidade de uso dos mesmos.