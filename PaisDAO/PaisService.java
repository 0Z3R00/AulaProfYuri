package PaisDAO;

import java.util.ArrayList;

public class PaisService {
	PaisDAO dao = new PaisDAO();

	public int criar(Pais pais) {
		return dao.criar(pais);
	}

	public void atualizar(Pais pais) {
		dao.atualizar(pais);
	}

	public void excluir(int Id) {
		dao.excluir(Id);
	}

	public Pais carregar(int Id) {
		return dao.carregar(Id);
	}

	public Pais maiorPopulacao() {
		return dao.MaiorPopulacao();
	}

	public Pais menorArea() {
		return dao.MenorArea();
	}


	public ArrayList<Pais> CriaVetor() {
		return dao.CriaVetor();
	}



}
