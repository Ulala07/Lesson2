package дом;

public class Animals {

    private String name;

    public Animals (String name){
        this.name=name;
    }

    public void eat(){
        System.out.println("om");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
