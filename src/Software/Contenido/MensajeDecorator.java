package Software.Contenido;

import java.io.UnsupportedEncodingException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.SignatureException;

public class MensajeDecorator implements IMensaje{

    private IMensaje paquete;

    public MensajeDecorator(IMensaje paquete) {
        this.paquete = paquete;
    }

    @Override
    public void escribir(String data) throws NoSuchAlgorithmException, InvalidKeyException, SignatureException, UnsupportedEncodingException {
        paquete.escribir(data);
    }

    @Override
    public String leer() throws NoSuchAlgorithmException, InvalidKeyException, SignatureException {
        return paquete.leer();
    }
}
