public class Country {
    private String pavadinimas;
    private float gyventojuSkaicius;
    private double plotas;


    public Country(){

    }

    public String getPavadinimas() {
        return pavadinimas;
    }

    public void setPavadinimas(String pavadinimas) {
        this.pavadinimas = pavadinimas;
    }

    public float getGyventojuSkaicius() {
        return gyventojuSkaicius;
    }

    public void setGyventojuSkaicius(float gyventojuSkaicius) {
        this.gyventojuSkaicius = gyventojuSkaicius;
    }

    public double getPlotas() {
        return plotas;
    }

    public void setPlotas(double plotas) {
        this.plotas = plotas;
    }

    @Override
    public String toString() {
        return "Country{" +
                "pavadinimas='" + pavadinimas + '\'' +
                ", gyventojuSkaicius=" + gyventojuSkaicius +
                ", plotas=" + plotas +
                '}';
    }
    public double getDalybosVeiksmas(){
        return getPlotas() / getGyventojuSkaicius();
    }

}
