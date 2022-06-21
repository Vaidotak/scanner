package enumai;

public class EunuchTest {
    public static void main(String[] args){
        Eunuchai matavimoVienetas = Eunuchai.CENTIMETRAS;
        System.out.println(matavimoVienetas);
        System.out.println(Eunuchai.DECIMETRAS.equals(Eunuchai.CENTIMETRAS));
        System.out.println(Eunuchai.DECIMETRAS.equals(Eunuchai.DECIMETRAS));
        System.out.println(Eunuchai.METRAS.equals(Eunuchai.METRAS));
        System.out.println(Eunuchai.MILIMETRAS.equals(Eunuchai.CENTIMETRAS));
    }
}
