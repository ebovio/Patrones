package Software.Contenido;

import java.io.UnsupportedEncodingException;
import java.security.*;

import static java.nio.charset.StandardCharsets.UTF_8;

public class FirmaDigitalDecorator extends MensajeDecorator implements IFirmaDigitalDecorator {

    private byte[] firma;
    private PublicKey llave;
    private Signature firmaDigital;
    public FirmaDigitalDecorator(IMensaje paquete) {
        super(paquete);
    }

    @Override
    public void escribir(String data) throws NoSuchAlgorithmException, InvalidKeyException, SignatureException, UnsupportedEncodingException {
        firmar(data);
        super.escribir(data);
    }

    @Override
    public String leer() throws NoSuchAlgorithmException, InvalidKeyException, SignatureException {
        if(verificar(firmaDigital,firma,llave))
        return super.leer();
        else return "Error";
    }


    @Override
    public void firmar(String info) throws NoSuchAlgorithmException, InvalidKeyException, SignatureException, UnsupportedEncodingException {
        KeyPair keyPair = getKeyPair();

        byte[] data = info.getBytes(UTF_8);

        Signature firmaDigital = Signature.getInstance("SHA1WithRSA");
        firmaDigital.initSign(keyPair.getPrivate());
        firmaDigital.update(data);
        this.firma = firmaDigital.sign();
        this.llave = keyPair.getPublic();
        this.firmaDigital = firmaDigital;

    }

    @Override
    public boolean verificar(Signature firmaDigital, byte[] firma, PublicKey llave) throws NoSuchAlgorithmException, InvalidKeyException, SignatureException {
        firmaDigital.initVerify(llave);
        firmaDigital.update(super.leer().getBytes(UTF_8));

        return firmaDigital.verify(firma);
    }

    private static KeyPair getKeyPair() throws NoSuchAlgorithmException {
        KeyPairGenerator kpg = KeyPairGenerator.getInstance("RSA");
        kpg.initialize(1024);
        return kpg.genKeyPair();
    }
}
