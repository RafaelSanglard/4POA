package localizadorcep;

import java.util.HashMap;
import java.util.Map;

public class LocalizadorCEP {
    private Map<Long,String> mapa;
    public String buscarPorCEP(Long cep) {
        
       // Imagine, esse endereço, vindo de uma tabela interna do aplicativo
        mapa=new HashMap<Long,String>();
      // mapa.put(12345678L,"Rua dos Inválidos, Rio de Janeiro, RJ");
      // mapa.put(22348327L,"Rua 1 de Março, Rio de Janeiro, RJ");
      // mapa.put(82737362L,"Largo do Arouche, São Paulo, SP");
      // mapa.put(63547435L,"Avenida Rio Branco, Minas Gerais, MG");

        return mapa.get(cep);
    }
}
