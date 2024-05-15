
public class ParametrosInvalidosException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String mensagem = "O segundo parâmetro deve ser maior que o primeiro";
	
	public ParametrosInvalidosException() {
		super();
	}

	public String getMensagem() {
		return mensagem;
	}	
}
