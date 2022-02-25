import java.util.Scanner;

public class Venda {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		float valorUnitario, valorSemDesconto, valorFinal, valorDaCompra;
		int quantidade, desconto;
		System.out.print("Digite o valor do produto:");
		valorUnitario = leia.nextFloat();
		System.out.print("");
		System.out.print("Digite a quantidade que deseja: ");
		quantidade = leia.nextInt();
		valorSemDesconto = valorUnitario * quantidade;
		System.out.println("O valor sem desconto é: " + "R$" + valorSemDesconto);
		System.out.print("");

		System.out.print("Digite em % o valor de desconto aplicado:");
		desconto = leia.nextInt();

		valorFinal = valorSemDesconto - (valorSemDesconto * desconto / 100);
		System.out.println("O valor final é: " + valorFinal);
		System.out.println("");

		System.out.println("Digite uma forma de pagamento:");
		System.out.println("1- PAGAR NO DÉBITO");
		System.out.println("2 - PAGAR NO CRÉDITO");
		System.out.println("3 - PAGAR NO DINHEIRO");

		int digite1;
		digite1 = leia.nextInt();
		switch (digite1) {
		case 1:
			System.out.println("PAGAR DO DÉBITO");
			break;

		case 2:
			System.out.println("PAGAR NO CRÉDITO");
			break;

		case 3:
			System.out.println("PAGAR NO DINHEIRO");
			break;

		default:
			System.out.println("Opção inválida!");
			break;
		}

		if (digite1 == 1) {
			System.out.println("Insira seu cartão.");
		}

		if (digite1 == 2) {
			System.out.println("1 - Pagamento à vista");
			System.out.println("2 - Pagamento parcelado");

			int digite2;
			digite2 = leia.nextInt();
			switch (digite2) {
			case 1:
				System.out.println("À VISTA");
				break;

			case 2:
				System.out.println("PARCELADO");
				break;

			default:
				System.out.println("Opção inválida!");

			}

			int parcelas;
			if (digite2 == 2)
				System.out.println("Digite a quantidade de parcelas: ");
			parcelas = leia.nextInt();

			switch (parcelas) {
			case 1:
				System.out.println("1x");
				break;

			case 2:
				System.out.println("2x");
				break;

			case 3:
				System.out.println("3x");
				break;

			case 4:
				System.out.println("4x");
				break;

			case 5:
				System.out.println("5x");
				break;

			case 6:
				System.out.println("6x");
				break;

			case 7:
				System.out.println("7x");
				break;

			case 8:
				System.out.println("8x");
				break;

			case 9:
				System.out.println("9x");
				break;

			case 10:
				System.out.println("10x");
				break;

			case 11:
				System.out.println("11x");
				break;

			case 12:
				System.out.println("12x");
				break;

			default:
				System.out.println("Opção inválida!");

			}

			if (parcelas > 12) {
				System.out.println("Digite novamente.");
				digite2 = leia.nextInt();
			}

			valorDaCompra = valorFinal / parcelas;
			System.out.println("O valor ficou: " + parcelas + " parcelas de " + "R$" + valorDaCompra);
			System.out.println("Insira seu cartão.");

		}

		if (digite1 == 3) {
			System.out.println("Irá precisar de troco?");
			System.out.println("1 - SIM");
			System.out.println("2 - NÃO");
		}

		int troco;
		troco = leia.nextInt();
		switch (troco) {
		case 1:
			System.out.println("TROCO PARA QUAL VALOR EM REAIS?");
			break;

		case 2:
			System.out.println("EFETUE O PAGAMENTO");
			break;

		default:
			System.out.println("Opção inválida!");
		}

		float valorTroco;
		valorTroco = leia.nextInt();
		System.out.println("O valor do troco é: " + "R$" + (valorTroco - valorFinal));

	}
}
