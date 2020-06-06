package Software.Contenido;

import java.io.UnsupportedEncodingException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.SignatureException;

public interface IMensaje {
    void escribir(String data) throws NoSuchAlgorithmException, InvalidKeyException, SignatureException, UnsupportedEncodingException;
    String leer() throws NoSuchAlgorithmException, InvalidKeyException, SignatureException;
}
