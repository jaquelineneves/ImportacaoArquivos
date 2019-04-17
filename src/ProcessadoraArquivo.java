import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

import model.domain.Lote;

public class ProcessadoraArquivo<E extends Lote> {
	
	private ProcessadorLinha<E> processa;

	public ProcessadoraArquivo(ProcessadorLinha<E> processa) {
		this.processa = processa;
	}

	public List<E> processaArquivo(List<String> listaArquivo)
			throws IOException,ParseException,FileNotFoundException{

                List<E> listaConta = new ArrayList<>();

                //TODO implementar
		String cabecalho = listaArquivo.get(0);	
                //System.out.println("Cabecalho "+cabecalho.toString());
		listaArquivo.remove(0);
		for (String linha: listaArquivo) {
			listaConta.add(processa.getLinha(linha, cabecalho));
		}
		return listaConta; 		
	}
}