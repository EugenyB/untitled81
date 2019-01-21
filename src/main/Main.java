package main;


import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Main main = new Main();
        main.run();
    }

    private void run() {
//        String[] strings = {"Ivanov", "Petrov", "Sidorov"};
//        String[] strings2 = new String[4];
//        for (int i = 0; i < strings.length; i++) {
//            strings2[i] = strings[i];
//        }
//        strings2[3] = "Kotov";
//        strings = strings2;
//
//        strings2 = new String[5];
        ArrayList<String> list = new ArrayList<>();
        list.add("Ivanov");
        list.add("Petrov");
        list.add("Sidorov");
        list.add("Kotov");
        list.add("Kotovy");
        list.add("Kotovq");
        list.add("Kotovs");

        for (String s : list) {
            System.out.println(s);
        }

        list.remove(1);
        System.out.println("------------");
        for (String s : list) {
            System.out.println(s);
        }
        System.out.println("------------");
        System.out.println(list.get(2));
        list.set(1,"Alekseev");
        System.out.println(list);
        list.add(1,"Petrov");
        System.out.println(list);
        System.out.println(list.size());
//        list.clear();
//        System.out.println(list.size());
        int count = 0;
        for (String s : list) {
            if (s.length() == 6) {
                count++;
            }
        }
        System.out.println(count);
//        for (String s : list) { /// !!! Это не работает !!!
//            if (s.length()==6) {
//                list.remove(s);
//            }
//        }

//        for (int i = 0; i<list.size(); ) {  // !!! Это работает, но можно проще
//            if(list.get(i).length()==6) {
//                list.remove(i);
//            } else {
//                i++;
//            }
//        }

        list.removeIf(s->s.length()==6);

        System.out.println(list);

        String[] strs = new String[2];
        String[] array = list.toArray(strs);
        System.out.println("--------------");
        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(strs));

        strs[1] = "qwerty";
        System.out.println(Arrays.toString(array));

        System.out.println("--------------");
        list.add(3, "Asdf");
        System.out.println(list);
    }
}
