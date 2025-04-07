public class Patient {

    private String name ;
    private String famName ;
    private String number;
    private int age ;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFamName() {
        return famName;
    }

    public void setFamName(String famName) {
        this.famName = famName;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    public String nameAdd(String john){
        if( name > 3 ){
            System.out.println("name added");
        }
        else{
            throw new IllegalArgumentException("Invaild entry name must have three characters minimum");
        }
    }




}
