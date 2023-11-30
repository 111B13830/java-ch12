class MyWindow{
    private int width;
    private int heigth;
    private String name;

    public MyWindow(int w,int h,String s){
        width = w;
        heigth = h;
        name = s;
    }
    public void show(){
        System.out.println("Name="+name);
        System.out.println("W="+width+", h="+heigth);
    }
}