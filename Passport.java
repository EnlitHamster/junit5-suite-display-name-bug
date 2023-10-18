public class Passport {
    String name;
    int age;
    String nationality;
    boolean valid;

    public Passport(String name, int age, String nationality) {
        this.name = name;
        this.age = age;
        this.nationality = nationality;
        this.valid = true;
    }

    public boolean isValid() {
        return this.valid;
    }

    public void makeInvalid() {
        this.valid = false;
    }

    public boolean canDrink(int legalDrinkingAge) {
        return (legalDrinkingAge <= this.age);
    }

    public String toString() {
        return "Passport belongs to " + this.name + ", " + this.age + " years old from " + this.nationality;
    }

    public static void main(String[] args) {
        Passport p = new Passport("Devin Hillenius", 25, "Dutch");
        System.out.println(p);
        System.out.println("Can drink? " + p.canDrink(18));
    }
}
