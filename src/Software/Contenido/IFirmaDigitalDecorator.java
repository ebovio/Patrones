package Software.Contenido;

import java.io.UnsupportedEncodingException;
import java.security.*;

public interface IFirmaDigitalDecorator {
    void firmar(String info) throws NoSuchAlgorithmException, InvalidKeyException, SignatureException, UnsupportedEncodingException;
    boolean verificar(Signature firmaDigital, byte[] firma, PublicKey llave) throws NoSuchAlgorithmException, InvalidKeyException, SignatureException;
}
