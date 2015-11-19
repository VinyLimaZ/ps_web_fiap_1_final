package br.com.fiap.dao;

import br.com.fiap.beans.Funcionario;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by
 *
 * @author vinylimaz
 *         on 19/11/15 & 13:22.
 *         FuncionarioDAO é uma classe
 */
public class FuncionarioDAO {

    public boolean cadastrar(Funcionario funcionario) {

        if(funcionario.getCod() < 3 || funcionario.getCargo().length() < 4){
            return false;
        }else{
            List<Funcionario> funcList = new ArrayList<>();
            funcList.add(funcionario);
            return true;
        }


    }
}
