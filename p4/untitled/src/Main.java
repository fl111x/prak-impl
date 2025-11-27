import Tugas.Barang;
import Tugas.KasirController;
import Tugas.KasirView;

    public class Main {
    public static void main(String[] args) {

        Barang barang = new Barang("Donat", 3000, 10);

        KasirView view = new KasirView();

        KasirController controller = new KasirController(barang, view);

        controller.executeTransaction();
    }
}
