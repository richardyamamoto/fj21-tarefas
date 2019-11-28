package br.com.caelum.tarefas.controller;

import br.com.caelum.tarefas.dao.UsuarioDao;
import br.com.caelum.tarefas.modelo.Usuario;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

@Controller
public class LoginController {
    @RequestMapping("loginForm")
    public String loginForm(){
        return "formulario-login";
    }

    @RequestMapping("efetuaLogin")
    public String efetuaLogin(Usuario usuario, HttpSession session) {
        if(new UsuarioDao().existeUsuario(usuario)) {
            session.setAttribute("usuarioLogado", usuario);
            return "menu";
        }
        return "redirect:loginForm";
    }

    @RequestMapping("logout")
    public String efetuaLogout(HttpSession session) {
        session.invalidate();
        return "formulario-login";
    }
}
