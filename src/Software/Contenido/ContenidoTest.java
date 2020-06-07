package Software.Contenido;

import java.io.UnsupportedEncodingException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.SignatureException;

public class ContenidoTest {
    public static void main(String[] args) throws NoSuchAlgorithmException, InvalidKeyException, SignatureException, UnsupportedEncodingException {
        String mensajeInfo = "Te invito a mi fiesta de cumple";
        Mensaje mensaje = new Mensaje("Nani", "Dasha");
        MensajeDecorator encriptado = new CompresionDecorator(new EncriptarDecorator(new FirmaDigitalDecorator(mensaje)), new LempelZivCompression());
        encriptado.escribir(mensajeInfo);

        System.out.println("Mensaje: " + mensajeInfo);
        System.out.println("Encriptado: " + mensaje.leer());
        System.out.println("Desencriptado: " + encriptado.leer());
    }
}
