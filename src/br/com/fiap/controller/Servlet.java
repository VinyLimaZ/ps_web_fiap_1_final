package br.com.fiap.controller;

import br.com.fiap.beans.Funcionario;
import br.com.fiap.dao.FuncionarioDAO;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by
 *
 * @author vinylimaz
 *         on 19/11/15 & 13:22.
 *         ${NAME} é uma classe
 */

public class Servlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Funcionario funcionario = new Funcionario();
        funcionario.setCod(Short.parseShort(request.getParameter("cod")));
        funcionario.setNome(request.getParameter("nome"));
        funcionario.setCargo(request.getParameter("cargo"));

        request.setAttribute("cod", funcionario.getCod());
        request.setAttribute("cargo", funcionario.getCargo());


        if (new FuncionarioDAO().cadastrar(funcionario)) {
            request.setAttribute("title", "Sucesso");
            request.setAttribute("titleH", "Cadastro realizado com sucesso!");
            request.setAttribute("msgCad", "O cadastro de " + funcionario.getNome() +" foi realizado com sucesso!");
        }else{
            request.setAttribute("title", "Falha");
            request.setAttribute("msgCad", "Houve algum problema no cadastro!");
        }

        request.getRequestDispatcher("result.jsp").forward(request, response);

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
