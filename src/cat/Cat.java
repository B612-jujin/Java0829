package cat;

public class Cat {

    private String name;

    private String breeds;

    private double weight;


    void claw(){
        System.out.println("할퀴기!!");
    }

    void meow(){
        System.out.println("냥");
    }

    void CatInfo(){
        System.out.printf("이름:%s\n품종:%s\n중량:%.2f㎏",getName(),getbreeds(),getWeight());
    }

    //반환,값 설정  하는 장소
    //


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreeds() {
        return breeds;
    }

    public void setBreeds(String breeds) {
        this.breeds = breeds;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}
