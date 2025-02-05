package F_Encapsulamento_Ex01;
import javax.swing.JOptionPane;
public class ClasseVIEW {

    public static void main(String[] args) {
        try{
            ClienteDTO clienteDTO = new ClienteDTO();
            ClienteCTR clienteCTR = new ClienteCTR();
            
            clienteDTO.setNome(JOptionPane.showInputDialog("Informe o seu Nome"));
            clienteDTO.setRg(JOptionPane.showInputDialog("Informe o seu RG"));
            clienteDTO.setIdade(Integer.parseInt(JOptionPane.showInputDialog("Informe a sua Idade")));
            
            JOptionPane.showMessageDialog(null,clienteCTR.mostrarNomeRg(clienteDTO));
            JOptionPane.showMessageDialog(null,clienteCTR.mostrarNomeIdade(clienteDTO));
            
        }
        
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "Erro no sistema: "+e.getMessage());
        }
    }//Fecha o metodo main
}//Fecha a classe ClienteVIEW
