import java.util.*;


public class program {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Laptop lap1 = new Laptop("Acer", "Windows 10", 16, 512, "black", 30000);
        Laptop lap2 = new Laptop("Asus", "Windows 11", 8, 1024, "black", 40000);
        Laptop lap3 = new Laptop("MSI", "Windows 10", 32, 2048, "white", 50000);
        Laptop lap4 = new Laptop("Lenovo", "Linux", 16, 1024, "red", 50000);
        Laptop lap5 = new Laptop("Acer", "Linux", 8, 2048, "white", 40000);


        Set<Laptop> lapSet = new HashSet<>();
      
            Collections.addAll(lapSet, lap1,lap2,lap3,lap4,lap5);
            System.out.println("Выберите действие: ");
        
        boolean a = true;
        while(a) { 
            System.out.println();
            System.out.println("1 - показать весь асортимент \n2 - поиск по фильтрам \n3 - Выход ");
            
            String n = scanner.nextLine();
            switch(n){
            case "1":
            for (Laptop laptop : lapSet) {
                System.out.println(laptop);
              }
            break;
            case "2":
            System.out.println("1 - Производитель \n2 - Операционная система \n3 - Оперативная память \n4 - Объем жесткого диска \n5 - Цвет \n6 - Стоимость ");
                n = scanner.nextLine();
                switch(n){
                case "1":
                filterName(lapSet, scanner);
                break;
                case "2":
                filterOS(lapSet,scanner);
                break;
                case "3":
                filterRam(lapSet, scanner);
                break;
                case "4":
                filterHdd(lapSet, scanner);
                break;
                case "5":
                filterColor(lapSet,scanner);
                break;
                case "6":
                filterPrice(lapSet, scanner);
                break;
            }
            break;
            case "3":
            System.out.println("Досвидания!");
                    a = false;
                    break;

        }
    }
        
}
//1
public static void filterName(Set<Laptop> lapSet, Scanner scanner) {
    Set<String> set = new HashSet<>();
    System.out.println("Введите имя производителя из представленных в списке: ");
                for (Laptop laptop : lapSet) {
                    set.add(laptop.getName());
                }
                for (Object i : set) {
                    System.out.println(i);
                  }
               String n = scanner.nextLine();
                if(set.contains(n)){
                    for (Laptop laptop : lapSet) {
                        if (laptop.getName().equals(n)){
                            System.out.println(laptop);
                        }
                    }
                }
}
//2
public static void filterOS(Set<Laptop> lapSet, Scanner scanner) {
    Set<String> set = new HashSet<>();
    System.out.println("Введите название ОС из представленных в списке: ");
                for (Laptop laptop : lapSet) {
                   set.add(laptop.getOS());
                }
                for (Object i : set) {
                    System.out.println(i);
                  }
               String n = scanner.nextLine();
                if(set.contains(n)){
                    for (Laptop laptop : lapSet) {
                        if (laptop.getOS().equals(n)){
                            System.out.println(laptop);
                        }
                    }
                }
            }
//3
public static void filterRam(Set<Laptop> lapSet, Scanner scanner) {
    Set<Integer> set = new HashSet<>();
    System.out.println("Введите размер ОЗУ из представленных в списке: ");
                for (Laptop laptop : lapSet) {
                    set.add(laptop.getRam());
                }
                for (Object i : set) {
                    System.out.println(i);
                  }
                String n = scanner.nextLine();
                int i = Integer.parseInt(n);
                if(set.contains(n)){
                    for (Laptop laptop : lapSet) {
                        if (laptop.getRam() == i){
                            System.out.println(laptop);
                        }
                    }
                }
}
//4
public static void filterHdd(Set<Laptop> lapSet, Scanner scanner) {
    Set<Integer> set = new HashSet<>();
    System.out.println("Введите размер жесткого диска из представленных в списке: ");
                for (Laptop laptop : lapSet) {
                    set.add(laptop.getHdd());
                }
                for (Object i : set) {
                    System.out.println(i);
                  }
                  String n = scanner.nextLine();
                  int i = Integer.parseInt(n);
                if(set.contains(n)){
                    for (Laptop laptop : lapSet) {
                        if (laptop.getHdd() == i){
                            System.out.println(laptop);
                        }
                    }
                }
}
//5
 public static void filterColor(Set<Laptop> lapSet, Scanner scanner){
    Set<String> colors = new HashSet<>();
    for (Laptop laptop : lapSet){
        colors.add(laptop.getColor());
    }
    System.out.println("Введите цвет из представленных в списке: ");

      for (Laptop laptop : lapSet) {
        colors.add(laptop.getColor());
                }
                for (Object i : colors) {
                    System.out.println(i);
                  }
                  String n = scanner.nextLine();
                if(colors.contains(n)){
                    for (Laptop laptop : lapSet) {
                        if (laptop.getColor().equals(n)){
                            System.out.println(laptop);
                        }
                    }
                } 
}
//6
public static void filterPrice(Set<Laptop> lapSet, Scanner scanner) {
    Set<Integer> set = new HashSet<>();
    System.out.println("Введите размер жесткого диска из представленных в списке: ");
                for (Laptop laptop : lapSet) {
                    set.add(laptop.getPrice());
                }
                for (Object i : set) {
                    System.out.println(i);
                  }
                  String n = scanner.nextLine();
                  int i = Integer.parseInt(n);
                if(set.contains(n)){
                    for (Laptop laptop : lapSet) {
                        if (laptop.getPrice() == i){
                            System.out.println(laptop);
                        }
                    }
                }
}

}