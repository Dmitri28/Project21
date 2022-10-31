package Main;

public class Main {
    public static void main(String[] args) {
        Menu menu=Menu.ГАВАИСКАЯ;
switch (menu) {
    case МАРГАРИТА:
        System.out.println("Ваш заказ маргарита");
        break;
    case ЧЕТЫРЕСЫРА:
        System.out.println("Ваш заказ четаре сыра");
        break;
    case КАПРИЧОЗА:
        System.out.println("Ваш заказ капричоаза");
        break;
    case ГАВАИСКАЯ:
        System.out.println("Ваш заказ гаваиская");
        break;
    default:
        Edition edition=Edition.EXTRACEEHES;
        switch (edition){
            case OLIVIES:
                System.out.println("Вы заказали дополнительно оливки");
                break;
            case CAPERS:
                System.out.println("Вы заказали допалнительно каперсы");
                break;
            case EXTRACEEHES:
                System.out.println("Вы заказали дополнительно сыр");
                break;
            default:
        }
}
    }

}
