package Calculadora;

import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException {

		Log log = new Log();
		try {

			int result;
			do {
				Util util = new Util();

				util.Menu();

				result = util.ValidaMenu();

				if (result == 0)
					break;
				if (result == 7)
					continue;

				util.ExecutaOperacao(result);

			} while (result != 0);

			log.LogAviso("A aplicação foi finalizada", Categoria.Aviso);
		} catch (Exception e) {
			log.LogErro("Ocorreu algo inesperado!", Categoria.Falha, e);
		}

	}

}
