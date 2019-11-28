package br.com.caelum.tarefas.controller;

import br.com.caelum.tarefas.dao.TarefaDao;
import br.com.caelum.tarefas.modelo.Tarefa;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;
import java.net.BindException;
import java.util.List;


@Controller
public class TarefasController {

    @RequestMapping("novaTarefa")
    public String formulario() {
        return "tarefa/formulario";
    }

    @RequestMapping("adicionaTarefa")
    public String adiciona(@Valid Tarefa tarefa, BindingResult result) {
        if(result.hasFieldErrors("descricao")) {
            return "tarefa/formulario";
        }

        TarefaDao dao = new TarefaDao();
        dao.adiciona(tarefa);
        return "tarefa/adicionada";
    }

    @RequestMapping("listaTarefas")
    public String lista(Model model) {
        TarefaDao dao = new TarefaDao();
//        List<Tarefa> tarefas = dao.lista();
        model.addAttribute("tarefas", dao.lista());
//        ModelAndView modelAndView = new ModelAndView("tarefa/lista");
//        modelAndView.addObject("tarefas", tarefas);
        return "tarefa/lista";
    }

    @RequestMapping("removeTarefa")
    public String remove(Tarefa tarefa) {
        TarefaDao dao = new TarefaDao();
        dao.remove(tarefa);
        return "redirect:listaTarefas";
    }

    @RequestMapping("mostraTarefa")
    public String mostra(Long id, Model model) {
        System.out.println("TarefaController -> mostra()");
        TarefaDao dao = new TarefaDao();
        model.addAttribute("tarefa", dao.buscaPorId(id));
        return "tarefa/mostra";
    }

    @RequestMapping("alteraTarefa")
    public String altera(Tarefa tarefa) {
        TarefaDao dao = new TarefaDao();
        dao.altera(tarefa);
        return "redirect:listaTarefas";
    }

}
