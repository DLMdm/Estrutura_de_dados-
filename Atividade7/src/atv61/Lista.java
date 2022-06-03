package atv61;
public interface Lista {
	public void insereInicio(Object info);

	public void insereFim(Object info);

	public boolean estahVazia();

	public boolean remove(Object info);

	public int tamanho();
	
	public void imprimeInicioAFim();
	
	public void imprimeFimAInicio();
}
