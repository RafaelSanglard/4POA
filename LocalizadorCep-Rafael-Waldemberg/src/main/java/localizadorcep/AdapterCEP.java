package localizadorcep;

import br.com.correios.*;

public class AdapterCEP extends LocalizadorCEP {
    public String buscarPorCEP(Long cep) {
        String subCEP = cep.toString();

        if (subCEP.length()==8)
        {
            subCEP = subCEP.substring(0,5)+"-"+subCEP.substring(5,8);

            Endereco endereco;

            try
            {
                endereco = new Endereco(subCEP);
            }
            catch (NullPointerException ex)
            {
                endereco = null;
            }
            
            if (endereco!=null)
            {
                StringBuilder resultado = new StringBuilder();

                resultado.append(endereco.getTipoLogradouro());
                resultado.append(" ");
                resultado.append(endereco.getPrefixoLogradouro());
                resultado.append(" ");
                resultado.append(endereco.getLogradouro());
                resultado.append(", ");
                resultado.append(endereco.getCidade());
                resultado.append(", ");
                resultado.append(endereco.getEstado());

                return resultado.toString();
            }
        }
        return "null";
    }
}
