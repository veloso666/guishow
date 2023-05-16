package gui;

import java.io.File;//biblioteca para manipulação de arquivos
import java.io.FileWriter;//instancia o escritor 

public class Cliente {   //atributos da classe cliente
    private String nome;
    private String email;
    private int idade;
    private String curso;
    
    public String getCurso() {//retorna o curso escolhido
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
    

    public String salvar(){ //metodo para salvar no arquivo as informações capturadas na tela
        //mudar o diretório
        File f1 = new File("C:\\Users\\jlvat\\Desktop\\TUDO\\my codes\\cliente.txt");//instanciando um arquivo e passando o diretorio como parametro

        if (!f1.exists()) {
            
            try {//tentei
                f1.createNewFile();//cria um novo arquivo
                FileWriter writer = new FileWriter(f1);
                writer.write("Nome: "+this.nome + "\nEmail: "+ this.email+ "\nIdade: " + this.idade+"\nCurso: "+this.curso);//escrevendo no arquivo
                writer.flush();//limpando o escritor
                writer.close();//fechando o arquivo
            } catch (Exception ex) {//capturei um erro
                return "erro no sistema. msg" + ex.getMessage();//mostra o erro no console
            }
        }

        return "sucesso ao cadastrar";//retorna uma mensagem 
    }
}