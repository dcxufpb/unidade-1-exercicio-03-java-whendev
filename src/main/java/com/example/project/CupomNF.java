package com.example.project;

import java.util.ArrayList;
import java.util.List;

public class CupomNF {
    private List<String> erros = new ArrayList<String>();
    private Loja infoLoja;

    public CupomNF(Loja infoLoja) {
        this.infoLoja = infoLoja;
    }

    public void verify(){
        if (infoLoja.NOME_LOJA.isEmpty()){
            erros.add("O campo nome da loja é obrigatório");
        }

        if (infoLoja.LOGRADOURO.isEmpty()){
            erros.add("O campo logradouro do endereço é obrigatório");
        }

        if (infoLoja.MUNICIPIO.isEmpty()){
            erros.add("O campo município do endereço é obrigatório");
        }

        if (infoLoja.ESTADO.isEmpty()){
            erros.add("O campo estado do endereço é obrigatório");
        }

        if (infoLoja.CNPJ.isEmpty()){
            erros.add("O campo CNPJ da loja é obrigatório");
        }

        if (infoLoja.INSCRICAO_ESTADUAL.isEmpty()) {
            erros.add("O campo inscrição estadual da loja é obrigatório");
        }
    }

    public void imprime(){
        verify();
        if(erros.isEmpty()){
            System.out.printf("%s\n",infoLoja.NOME_LOJA);
            if (infoLoja.NUMERO == 0){
                System.out.printf("%s, %s %s\n",infoLoja.LOGRADOURO,"s/n",infoLoja.COMPLEMENTO);
            } else {
                System.out.printf("%s, %d %s\n",infoLoja.LOGRADOURO,infoLoja.NUMERO,infoLoja.COMPLEMENTO);
            }
            System.out.printf("%s - %s - %s\n",infoLoja.BAIRRO,infoLoja.MUNICIPIO,infoLoja.ESTADO);
            System.out.printf("CEP:%s Tel %s\n",infoLoja.CEP,infoLoja.TELEFONE);
            System.out.printf("%s\n",infoLoja.OBSERVACAO);
            System.out.printf("CNPJ: %s\n",infoLoja.CNPJ);
            System.out.printf("IE: %s\n",infoLoja.INSCRICAO_ESTADUAL);
        } else {
            for (String err: this.erros
                 ) {
                System.out.print(err);
            }
        }
    }

}
