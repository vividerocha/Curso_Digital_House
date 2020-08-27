package impressora;

public class Principal {

	public static void main(String[] args) {
		
		System.out.println("Iniciando o programa!");
		
		Foto foto = new Foto("Foto1", "TipoFoto");
		Contrato contrato = new Contrato("Contrato1", "TipoContrato");
		Documento documento = new Documento("Documento1", "TipoDocumento");
		ImpressoraFilha impressora = new ImpressoraFilha();
		impressora.adicionarImprimivel(foto);
		impressora.adicionarImprimivel(contrato);
		impressora.adicionarImprimivel(documento);
		
		impressora.imprimirTudo();

	}

}
