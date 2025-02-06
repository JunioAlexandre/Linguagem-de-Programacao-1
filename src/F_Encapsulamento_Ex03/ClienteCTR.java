package F_Encapsulamento_Ex03;

public class ClienteCTR {
    ClienteDAO clienteDAO = new ClienteDAO();
   
    public String mostrarIdade(ClienteDTO clienteDTO){
        return clienteDAO.mostrarIdade(clienteDTO);
    }
}
