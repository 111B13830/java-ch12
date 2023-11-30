class Diag {
    private int width;
    private int heigth;
    public Diag(int w,int h){
        width = w;
        heigth = h;
    }
    public void show(){
        System.out.println("W="+width+", H="+heigth);
        System.out.printf("length=%5.2f\n",dia());
    }
    public double dia(){
        return Math.sqrt(width*width+heigth*heigth);
    }
}
