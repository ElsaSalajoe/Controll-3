
package jktv21task3elsasaljoe;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class JKTV21Task3ElsaSaljoe {

  
    public static void main(String[] args) throws java.lang.Exception{
        
       // %s для вывода строкового значения  
          
         
        
        
        Scanner scanner = new Scanner(System.in);
        Pattern p = Pattern.compile("[a-zA-Z]{1,10}");
        //boolean N = Boolean.parseBoolean(name);
        //boolean S = Boolean.valueOf(surname);
        do{
        System.out.print("Ведите имя: "); //Латиницей
        String name = scanner.next();
        Matcher n = p.matcher(name);
        boolean fn = n.matches();
        if(fn){
            //System.out.println(n.find()); 
            System.out.println(n.matches());
            System.out.println("Данные корректны " );
            System.out.print("Ведите фамилию: "); //Латиницей
            String surname = scanner.next();
            Matcher s = p.matcher(surname);
            boolean found = s.matches();
            if(found){
                System.out.println("Данные корректны " );
                System.out.println(s.matches());
                System.out.print("Введите личный код: "); //Без пробелов
                String id = scanner.next();
                boolean result = id.matches("\\w{11}");
                if(result == true)
                {
                    try {
                        int Id = id.length();
                        String f = (id.substring(0, 1));
                        int first = Integer.parseInt(f);
                        String M = (id.substring(3, 5));
                        String[] month = {"Января","Февраля","Марта","Апреля","Мая","Июня","Июля","Августа","Сентября","Октября","Ноября","Декабря"};
                        String[] month2 = {"Январь","Февраль","Март","Апрель","Май","Июнь","Июль","Август","Сентябрь","Октябрь","Ноябрь","Декабрь"};
                        int Mon = Integer.parseInt(M);
                        String d = (id.substring(5, 7));
                        int Days = Integer.parseInt(d);
                        System.out.println(result);
                        System.out.println(name + " " + surname + " " + id);
                        
                        System.out.println(first);
                        if (Id < 11 | Id > 11 ){
                            System.out.println ("Неправильный исикукод: он должен содержать 11 цифр");
                            System.out.println("Просьба вводить данные корректно!");
                            System.out.println();
                        }
                        else if (first > 6 | first < 1){
                            System.out.println ("Неправильный исикукод: Идентификатор пола не может быть больше шести!");
                            System.out.println("Просьба вводить данные корректно!");
                            System.out.println();
                        }
                        else if (Mon > 12){
                            System.out.println("В году всего двенадцать месяцев! ");
                            System.out.println("Просьба вводить данные корректно!");
                            System.out.println();
                        }
                        else if (Days > 31){
                            System.out.println("В месяце не может быть больше 31-го дня! ");
                            System.out.println("Просьба вводить данные корректно!");
                            System.out.println();
                        }
                        else {
                            String mon = (month[Integer.parseInt(M)-1]);
                            String mon2 = (month2[Integer.parseInt(M)-1]);
                            System.out.println();
                            String years = " ";
                            if(f.contains("1") | f.contains("2")){
                                years = "18";
                            }
                            if(f.contains("3") | f.contains("4")){
                                years = "19";
                            }
                            if(f.contains("5") | f.contains("6")){
                                years = "20";
                            }
                            if(f.contains("2") | f.contains("4") | f.contains("6")){
                                System.out.println("Первая цифра вашего исикукода: " + id.substring(0, 1));
                                System.out.println("Ваш пол - женщина");
                            }
                            if(f.contains("1") | f.contains("3") | f.contains("5")){
                                System.out.println("Первая цифра вашего исикукода: " + id.substring(0, 1));
                                System.out.println("Ваш пол - мужчина ");
                            }
                                System.out.println("Год рождения " + years + id.substring(1, 3));
                                System.out.println("Месяц рождения " + mon2);
                                System.out.println("День рождения " + Days);
                                System.out.println("Последние четыре цифры " + id.substring(7, 11));
                                System.out.println();
                                System.out.print(name+" " + surname +" ты родился ");
                                System.out.printf("%s %s %s%s", Days, mon, years, id.substring(1, 3) + " года ");
                                break;
                            }
                        }catch (NumberFormatException e) {
                    System.err.println("Неправильный формат строки!");
                    }
                }else{
                System.out.println("Некорректный ввод! ");
                }  
            }else{
            System.out.println("Некорректный ввод! ");
            }   
        }else{
            System.out.println("Некорректный ввод! ");
        }
        }while(true);
    }  
}
