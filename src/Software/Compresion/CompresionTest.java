package Software.Compresion;

public class CompresionTest {
    public static void main(String[] args) {
        Mensaje mensajeHuffman = new Mensaje("Nahomi", "Mateo",  new HuffmanCompression());
        mensajeHuffman.escribir("INFO");
        System.out.println("Información descomprimida: "+ mensajeHuffman.leer());

        Mensaje mensajeLempelZiv = new Mensaje("Nani", "Lia", new LempelZivCompression());
        mensajeLempelZiv.escribir("INFO");
        System.out.println("Información descomprimida: "+ mensajeLempelZiv.leer());

    }
}
