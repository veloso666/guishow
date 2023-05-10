package gui;

import java.io.File;

import java.io.FileWriter;
import java.io.Writer;
public class Cliente {
    private String nome;
    private String email;
    private int idade;
    private String curso;
    
    public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }
    public String getEmail(){
        return email;

    }

    public void setEmail(String email){
        this.email = email;
    }
    
    public int getIdade(){
    	return idade;
    }
    
    public void setIdade(int idade) {
    	this.idade = idade;
    }
    

    public String salvar(){
        //mudar o diretório
        File f1 = new File("C:\\Users\\jlvat\\Desktop\\my codes\\cliente.txt");

        if (!f1.exists()) {
            
            try {
                f1.createNewFile();
                FileWriter writer = new FileWriter(f1);
                writer.write("Nome: "+this.nome + "\nEmail: "+ this.email+ "\nIdade: " + this.idade+"\nCurso: "+this.curso);
                writer.flush();
                writer.close();
            } catch (Exception ex) {
                return "erro no sistema. msg" + ex.getMessage();
            }
        }

        return "sucesso ao cadastrar";
    }
}