# Curso Tratamento de Exceções em Java da [DIO](https://web.dio.me/). Ministrado pela professora [Camila](https://github.com/cami-la/).
## Anotações
#### > Unchecked Exception
- Exceções não são acusadas pelo compilador, aparecem em tempo de execução; 
- Podem ser evitadas caso tratadas pelo desenvolvedor;
- Exceções derivadas da RuntimeException.
#### > Checked Exception
- Exceções acusadas pelo compilador. 
- Se não tratadas, não é possível executar o programa.
- Ex.: IOException e derivadas, ClassNotFoundException. 
#### > Exception personalizada
- Exceção criada pelo programador;
- Devem ser estender a classe **Exception**; 
#### > Palavras Reservadas
- **try**:
	  Região onde se encontrará o código que pode lançar uma exceção.
- **catch**:
	Região do código para o possível tratamento da exceção.
	Podem existir mais de um comando *catch* para o tratamento de mais de uma exceção. Neste caso as exceções mais específicas devem vir primeiro.
			Ex.: 
		try { ... }	
		catch(FileNotFoundException e){...} // mais específica
		catch (IOException  e) {...	} 
		finally{...}
- **finally**:
Comando opcional, quando deseja-se executar algum código independente de ter ocorrido a exceção.

-   Cláusula **throws**: 
Declara que um método pode lançar uma ou várias exceções.
Usada na assinatura do método, obrigando quem utiliza-lo a tratar a exceção ou lança-la novamente.

-  Cláusula  **throw**: 
Lança explicitamente uma exception.
Usada para lançar exceções personalizadas.