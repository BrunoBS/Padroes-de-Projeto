package comportamento.visitor;

public interface Expressao {
	public int avalia();
	void aceita(Visitor impressora);
}
