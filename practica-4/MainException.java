public class MainException {
    public static void main(String[] args) {
        EdadException exPerzonalizada= new EdadException();
        try {
            exPerzonalizada.validarEdad(17);
        } catch (EdadException ex) {
            // TODO: handle exception
            System.out.println("Se ejecuto la ex perzonalizada, mensaje de la excepcion "+ex.getMessage());
        }catch(Exception ex){
            System.out.println("Excepcion por default");
        }
    }
}
