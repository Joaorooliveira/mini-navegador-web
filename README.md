🌐 Mini Navegador Web (JavaFX)

Uma aplicação desktop simples que funciona como um mini navegador web, construída com Java e a biblioteca gráfica JavaFX.

Este projeto foi desenvolvido como um exercício prático para aplicar conceitos de interface gráfica e a integração de componentes web em aplicações Java, focando no uso dos módulos WebView e WebEngine.
<img width="796" height="659" alt="browser" src="https://github.com/user-attachments/assets/edfd2c27-e1ad-460f-a8f1-b7f3fdbe6bc1" />


✨ Features (Funcionalidades)

Exibição de Páginas Web: Utiliza o componente nativo WebView do JavaFX para renderizar páginas da web.

Barra de Endereços Funcional: Um TextField que permite ao usuário digitar a URL e navegar pressionando Enter.

Formatação Inteligente de URL: Inclui uma lógica para verificar se a URL digitada possui o prefixo (http:// ou https://) e o adiciona automaticamente caso necessário, garantindo que o WebEngine consiga carregar a página corretamente.

Interface Simples: Interface limpa, com a barra de endereço no topo e a área de visualização de conteúdo logo abaixo.

🛠️ Tecnologias Utilizadas

O projeto foi construído utilizando:

Java (JDK 17 ou superior)

JavaFX (Para a interface gráfica, layout e o componente web)

Módulos Requeridos: javafx.controls, javafx.fxml, e o essencial javafx.web.

Maven (Para gerenciamento de dependências e build do projeto)

▶️ Como Executar

Para rodar este projeto localmente, você precisará ter o Java (JDK) e o Maven instalados em sua máquina.

Clone o repositório: 

git clone [[https://github.com/seu-usuario/mininavegadorweb.git](https://github.com/seu-usuario/mininavegadorweb.git)]


Navegue até o diretório do projeto:

cd mininavegadorweb


Compile e execute a aplicação usando o Maven: (O plugin do JavaFX cuidará de tudo, incluindo a adição dos módulos necessários como o javafx.web)

mvn clean javafx:run


A aplicação deverá abrir em uma nova janela exibindo o seu mini navegador.

Licença

Este projeto está sob a licença MIT. Veja o arquivo LICENSE para mais detalhes.
