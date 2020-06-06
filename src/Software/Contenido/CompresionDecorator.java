package Software.Contenido;

import java.io.UnsupportedEncodingException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.SignatureException;

public class CompresionDecorator extends MensajeDecorator implements ICompresionStrategy{

    private final ICompresionStrategy compresionStrategy;

    public CompresionDecorator(IMensaje paquete, ICompresionStrategy compresionStrategy) {
        super(paquete);
        this.compresionStrategy = compresionStrategy;
    }


    @Override
    public void escribir(String data) {
        try {
            super.escribir(comprimir(data));
        } catch (NoSuchAlgorithmException | InvalidKeyException | SignatureException | UnsupportedEncodingException e) {
            e.printStackTrace();
        }
    }

    @Override
    public String leer() throws NoSuchAlgorithmException, InvalidKeyException, SignatureException {
        return descomprimir(super.leer());
    }

    @Override
    public String comprimir(String info) {
        return compresionStrategy.comprimir(info);
    }

    @Override
    public String descomprimir(String infoComprimida) {
        return compresionStrategy.descomprimir(infoComprimida);
    }
}
