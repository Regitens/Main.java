package com.bazhan;

import java.time.LocalDate;
import java.util.*;

public class Main {

    public static void main(String[] args) {
	/**var a=new LinkedList<String>();
    a.add("Mary");
    a.add("Anny");
    a.add("Molly");
    var b=new LinkedList<String>();
    b.add("Tom");
    b.add("Andy");
    b.add("Jack");
    b.add("Ben");

        ListIterator<String> aIter=a.listIterator();
        Iterator<String> bIter=b.iterator();
        while (bIter.hasNext()){
            if (aIter.hasNext()) aIter.next();
            aIter.add(bIter.next());
        }
        System.out.println(a);

        bIter=b.iterator();
        while (bIter.hasNext()){
            bIter.next();
            if (bIter.hasNext()) {
                bIter.next();
                bIter.remove();
            }
        }
        System.out.println(b);
        a.removeAll(b);
        System.out.println(a);


        //cортировка древовидных множеств
        var parts=new TreeSet<Item>();
        parts.add(new Item("Toaster",1234));
        parts.add(new Item("Widget",4562));
        parts.add(new Item("Modem",9912));
        System.out.println(parts);
        var sortByDescription=new TreeSet<Item>(Comparator.comparing(Item::getDescription));
        sortByDescription.addAll(parts);
        System.out.println(sortByDescription);


        //Очереди по приоритету
        var pq=new PriorityQueue<LocalDate>();
        pq.add(LocalDate.of(1996,11,27));
        pq.add(LocalDate.of(1908,10,10));
        pq.add(LocalDate.of(1981,4,3));
        System.out.println("First Queue:");
        for (LocalDate date:pq)
            System.out.println(date);
        System.out.println("Removing elements");
        while (!pq.isEmpty())
            System.out.println(pq.remove());*/

        //Отображение с ключами типа String и значениями Employee
        var stuff=new HashMap<String,Employee>();
        stuff.put("144-25-5464",new Employee("Any Lee"));
        stuff.put("146-10-5985",new Employee("Gary Cooper"));
        stuff.put("156-18-9634",new Employee("Hary Hacker"));
        stuff.put("146-17-5976",new Employee("Andy Miller"));
        System.out.println(stuff);
        stuff.remove("156-18-9634");
        stuff.put("144-25-5464",new Employee("Any Black"));
        System.out.println(stuff.get("146-17-5976"));
        stuff.forEach((k,v)->System.out.println("key="+k+", "+"value="+v));



        //!!!!!!!!!!!!!!!!!!!!!!!!!!!!
        var stuffHash=new LinkedHashMap<String, Employee>();
        stuffHash.put("144-25-5464",new Employee("Any Lee"));
        stuffHash.put("146-10-5985",new Employee("Gary Cooper"));
        stuffHash.put("156-18-9634",new Employee("Hary Hacker"));
        stuffHash.put("146-17-5976",new Employee("Andy Miller"));
        /**stuffHash.keySet().iterator();
        stuffHash.forEach((k,v)->System.out.println("key="+k+", "+"value="+v));
        stuffHash.values().iterator();
        stuffHash.forEach((k,v)->System.out.println("key="+k+", "+"value="+v));*/

        //сортировка и перетасовка
        var numbers=new ArrayList<Integer>();
        for (int i=1; i<=50;i++) numbers.add(i);
        Collections.shuffle(numbers);
        List<Integer> winning=numbers.subList(0,10);
        Collections.sort(winning);
        System.out.println(winning);

        //решето Эратосфена
        int n=2000000;
        long start=System.currentTimeMillis();
        BitSet b=new BitSet(n+1);
        int count=0;
        int i;
        for (i=2;i<=n;i++) b.set(i);
        i=2;
        while (i+i<=n){
            if (b.get(i)) {
                count++;
                int k = 2 * i;
                while (k <= n) {
                    b.clear(k);
                    k += i;
                }
            }
                i++;
            }
            while (i<=n){
                if (b.get(i)) count++;
                i++;
            }
            long end=System.currentTimeMillis();
            System.out.println(count+" primes");
            System.out.println((end-start)+" milliseconds");

    }
}
