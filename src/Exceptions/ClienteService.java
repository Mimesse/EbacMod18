package Exceptions;

public class ClienteService {
    public static void consultarCliente(String codigo) throws ClienteNaoEncontradoException, ClienteNaoEncontrado2Exception {
        try {
            ClienteDAO.consultarCliente(codigo);
        } catch (ClienteNaoEncontradoException e) {
            throw new ClienteNaoEncontrado2Exception(e.getMessage(), e);
        }
    }
}
