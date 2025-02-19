package exercicios05;

public class Utility {
    public static <T> boolean compare(T obj1, T obj2){
        if (obj1.equals(obj2)){
            return true;
        }
        return false;
    }
    public static <T> void printArray(T[] array){
        for(T t: array){
            System.out.println(t);
        }
    }
    public static void main(String[] args) {
        Integer a = 10;
        Integer b = 10;
        System.out.println("compare(a, b): " + Utility.compare(a, b));

        Integer[] intArray = {1, 2, 3, 4, 5};
        Utility.printArray(intArray);

        String[] strArray = {"Java", "Python", "C++"};
        Utility.printArray(strArray);
}
}
