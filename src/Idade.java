import java.util.Scanner;

public class Idade {

	public static void main(String[] args) {

	//sysout + CTRL + ESPAÇO	
		
	System.out.println("Idade....");
	
	Scanner scanner = new Scanner(System.in);//é a parte lexica do compilador, ele lê o que entra 
	System.out.println("Informe seu ano de nascimento: ");
	
	try{
		System.out.println("Sua idade é: " + (2018 - scanner.nextInt()));
	}
	catch(Exception e)
	{
		System.err.println("Digite apenas numeros! ");
		//e.printStackTrace();//imprime o erro
		System.out.println(e);
	}//try catch
	// usar try catch sempre que fazer um IO, usar alguma coisa fora do nosso programa
	//sempre que usar algo vindo do usuario, da rede ou de um banco, coisas que estão fora do controle usar try catch
	
	scanner.close();
	
	
	
	
	
	
	
		
		
	
	}

}
