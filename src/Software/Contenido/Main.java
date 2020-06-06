package Software.Contenido;

import java.io.UnsupportedEncodingException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.SignatureException;

public class Main {
    public static void main(String[] args) throws NoSuchAlgorithmException, InvalidKeyException, SignatureException, UnsupportedEncodingException {
        String mensajeInfo = "Te invito a mi fiesta de cumple";
        Mensaje mensaje = new Mensaje("Nani", "Dasha");
        MensajeDecorator encoded = new CompresionDecorator(
                                         new EncriptarDecorator(
                                             new FirmaDigitalDecorator(mensaje)),new LempelZivCompression());
        encoded.escribir(mensajeInfo);


        System.out.println("Input: " + mensajeInfo);
        System.out.println("Encriptado: ");
        System.out.println(mensaje.leer());
        System.out.println("Desencriptado: " + encoded.leer());
    }
}
