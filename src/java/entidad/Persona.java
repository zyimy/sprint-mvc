/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidad;

/**
 *
 * @author zepeda
 */
public class Persona {
   
    public int id_persona;
    public String name;
    public String telefono;

    public Persona() {
    }

    public Persona(int id_persona, String name, String telefono) {
        this.id_persona = id_persona;
        this.name = name;
        this.telefono = telefono;
    }
    

    public int getId_persona() {
        return id_persona;
    }

    public void setId_persona(int id_persona) {
        this.id_persona = id_persona;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    
    
            
}
