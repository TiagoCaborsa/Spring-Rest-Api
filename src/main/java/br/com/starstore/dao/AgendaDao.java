package br.com.starstore.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import br.com.starstore.model.AgendaModel;

public class AgendaDao {

	private static Map<Long, AgendaModel> banco = new HashMap<>();

	static {
		banco.put(1l, new AgendaModel(1l, "Tiago", "Rua A", "21"));

		banco.put(2l, new AgendaModel(2l, "Cabral", "Rua B", "22"));
	}

	public void adicionar(AgendaModel agenda) {
		banco.put((long) ((banco.size())+1), agenda);
	}

	public List<AgendaModel> buscar() {
		return new ArrayList<>(banco.values());
	}

	public AgendaModel remove(long id) {
		return banco.remove(id);
	}

}
