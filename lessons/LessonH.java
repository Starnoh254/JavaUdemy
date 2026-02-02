package lessons;

class Laptop {
    String model;
    int price;

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((model == null) ? 0 : model.hashCode());
        result = prime * result + price;
        return result;
    }


    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Laptop other = (Laptop) obj;
        if (model == null) {
            if (other.model != null)
                return false;
        } else if (!model.equals(other.model))
            return false;
        if (price != other.price)
            return false;
        return true;
    }


    @Override
    public String toString() {
        return "Laptop [model=" + model + ", price=" + price + "]";
    }

    
}

public class LessonH {
    public static void main(String[] args){
        Laptop obj = new Laptop();
        obj.model = "Hp EliteBook";
        obj.price = 20000;


        Laptop obj1 = new Laptop();
        obj1.model = "Hp EliteBook";
        obj1.price = 20000;


        boolean result = obj1.equals(obj);

        System.out.println(result);
    }


}
