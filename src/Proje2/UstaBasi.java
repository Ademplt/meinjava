package Proje2;

public class UstaBasi extends Isci{
    //isci klasi abstract olmadigi icin java bize override'i mecbur kilmadi cunku
    // isci klasinda zaten mecburi override edildi.Ama projenin saglikli olmasi icin manuel yapilabilir


    @Override
    protected int saatUcreti() {
        return 5;
    }

    @Override
    protected int aylikCalismaSuresi() {
        return 200;
    }
}
