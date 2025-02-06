package F_Encapsulamento_Ex03;

public class ClienteDAO {

    public String mostrarIdade(ClienteDTO clienteDTO){
        
        if(clienteDTO.getIdade()>=18){
            return "Você pode ter CNH";
        }else{
            return "Você não pode tirar CNH";
        }
    }
}
