package Software.Contenido;

import java.io.UnsupportedEncodingException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.SignatureException;
import java.util.Base64;

public class EncriptarDecorator extends MensajeDecorator implements IEncriptarDecorator{
    public EncriptarDecorator(IMensaje wrappee) {
        super(wrappee);
    }

    @Override
    public void escribir(String data) throws NoSuchAlgorithmException, InvalidKeyException, SignatureException, UnsupportedEncodingException {
        super.escribir(encriptar(data));
    }

    @Override
    public String leer() throws NoSuchAlgorithmException, InvalidKeyException, SignatureException {
        return decodificar(super.leer());
    }

    @Override
    public String encriptar(String text) {
        byte[] result = text.getBytes();
        for (int i = 0; i < result.length; i++) {
            result[i] += (byte) 1;
        }
        return Base64.getEncoder().encodeToString(result);
    }

    @Override
    public String decodificar(String text) {
        byte[] result = Base64.getDecoder().decode(text);
        for (int i = 0; i < result.length; i++) {
            result[i] -= (byte) 1;
        }
        return new String(result);
    }
}
