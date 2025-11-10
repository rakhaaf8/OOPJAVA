public class lingkaran {
  private double jariJari;

    public lingkaran() {
    }

    public lingkaran(double jarijari) {
        this.jariJari = jarijari;
    }


    //setter
    void setter (double jarjari){
      this.jariJari = jarjari;
    }

    //getter
    public double getJariJari() {
        return jariJari;
    }

    public double getLuas() {
        return Math.PI * jariJari * jariJari;
    }

    public double getKeliling() {
        return 2 * Math.PI * jariJari;
    } 
}
