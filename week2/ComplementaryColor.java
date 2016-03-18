

public class ComplementaryColor {

public void buscaResultado(String linguagemEscolhida, String corEscolhida){
		
		String representation = "";
		String cColor = "";
		
		switch (linguagemEscolhida) {
		
		case "pt":
			if ("vermelho".equals(corEscolhida)) {
				representation = "tomate";
				cColor = "verde";
			}
			else if ("roxo".equals(corEscolhida)) {
				representation = "berinjela";
				cColor = "amarelo";
			}
			else if ("azul".equals(corEscolhida)) {
				representation = "mirtilo";
				cColor = "laranja";
			}
			else if ("verde".equals(corEscolhida)) {
				representation = "alface";
				cColor = "vermelho";
			}
			else if ("amarelo".equals(corEscolhida)) {
				representation = "melão";
				cColor = "roxo";
			}
			else if ("laranja".equals(corEscolhida)) {
				representation = "tangerina";
				cColor = "azul";
			};
			System.out.print("Legal, você escolheu \"" + corEscolhida);
			System.out.println("\", cor de " + representation + ".");
			System.out.println("Sua cor complementar é: " + cColor + "!");
			break;
		case "en":
			if ("red".equals(corEscolhida)) {
				representation = "Tomato";
				cColor = "green";
			}
			else if ("purple".equals(corEscolhida)) {
				representation = "Eggplant";
				cColor = "yellow";
			}
			else if ("blue".equals(corEscolhida)) {
				representation = "Blueberry";
				cColor = "orange";
			}
			else if ("green".equals(corEscolhida)) {
				representation = "Lettuce";
				cColor = "red";
			}
			else if ("yellow".equals(corEscolhida)) {
				representation = "Melon";
				cColor = "purple";
			}
			else if ("orange".equals(corEscolhida)) {
				representation = "Tangerine";
				cColor = "blue";
			};
			System.out.print("Great, you choose \"" + corEscolhida);
			System.out.println("\", color of " + representation + ".");
			System.out.println("Your complementary color is: " + cColor + "!");
			break;
		default:
			System.out.print("Linguagem não suportada!");
			break;
		}
	}
	
	/* This main method receives two arguments: language and color.
	   Thus, you need to provide them when you're going to execute it.
	   For instance, if you run it on command line, you
	   could simply run: "java ComplementaryColor pt vermelho"
	  
	   If you're running on Eclipse, yomu need to set the arguments
	   in "Run/Run configurations/Arguments/Program arguments"
	   otherwise you'll just get a runtime exception and nothing will happen
	   Needing help with that don't hesitate on contacting me
	 */	
	/**
	 * 
	 * @param args[0] language (Ex: pt)
	 * @param args[1] color (Ex: vermelho)		
	 */
	public static void main(String[] args) {
		ComplementaryColor cc = new ComplementaryColor();
		cc.buscaResultado(args[0],args[1]);
	}
}
