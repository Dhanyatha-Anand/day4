 class Person{
    private String name;
    private int age;
    public String getname(){
        return name;
    }
    public void setname(String name){
        this.name=name;
    }
    public int getage(){
        return age;
    }
    public void setage(int age){
        this.age=age;
    }
    }
    class pg12{
        public static void main(String[]ags){
            Person p1=new Person();
            p1.setname("varshini");
            p1.setage(20);
            System.out.println(p1.getname());
            System.out.println(p1.getage());
        }
    }
