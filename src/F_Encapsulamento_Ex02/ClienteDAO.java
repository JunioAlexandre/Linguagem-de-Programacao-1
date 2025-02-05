package F_Encapsulamento_Ex02;

public class ClienteDAO {

    public String mostrarNomeRg(ClienteDTO clienteDTO){
        return "O nome informado foi: "
                + clienteDTO.getNome() + "\n O RG informado foi: "
                + clienteDTO.getRg();
    }
    
    public String mostrarNomeIdade(ClienteDTO clienteDTO) {
        return "O nome informado foi: "
                + clienteDTO.getNome()
                + "\n A idade informada foi: " + clienteDTO.getIdade();
    }
}//Fecha a classe ClienteDAO
