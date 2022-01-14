/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import config.Conexion;
import entidad.Persona;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author zepeda
 */
@Controller
public class Controlador {
    Conexion con = new Conexion();
    JdbcTemplate jt =new JdbcTemplate(con.Conectar());
    ModelAndView mv = new ModelAndView();
    int id;
    List datos;
    
    @RequestMapping("index.htm")
    public ModelAndView listar(){
        String sql =("select *from personas");
        datos = this.jt.queryForList(sql);
        mv.addObject("lista",datos);
        mv.setViewName("index");
        
        return mv;
        
    }
    
    @RequestMapping(value="agregar.htm",method=RequestMethod.GET)
    public ModelAndView agregar(){
      mv.addObject(new Persona());
      mv.setViewName("agregar");
      return mv;
      
    }
    
    @RequestMapping(value="agregar.htm",method=RequestMethod.POST)
    public ModelAndView agregar(Persona p){
      String sql ="insert into personas(name,telefono)values(?,?)";
      this.jt.update(sql,p.getName(),p.getTelefono());
      
      return new ModelAndView("redirect:/index.htm");
      
    }
    
    @RequestMapping(value="editar.htm",method=RequestMethod.GET)
    public ModelAndView editar(HttpServletRequest request){
        id = Integer.parseInt(request.getParameter("id_persona"));
        String sql = "select *from personas where id_persona="+id;
        datos=this.jt.queryForList(sql);
        mv.addObject("lista",datos);
        mv.setViewName("editar");
        return mv;
    }
    
      @RequestMapping(value="editar.htm",method=RequestMethod.POST)
    public ModelAndView editar(Persona p){
       
        String sql = "update personas set name=?,telefono=? where id_persona="+id;
       this.jt.update(sql,p.getName(),p.getTelefono());
     return new ModelAndView("redirect:/index.htm");
     
    }
    
    @RequestMapping("delete.htm")
    public ModelAndView delete(HttpServletRequest request){
      id = Integer.parseInt(request.getParameter("id_persona"));  
      String sql = "delete from personas where id_persona="+id;
      this.jt.update(sql);
      return new ModelAndView("redirect:/index.htm");
      
    }
}
