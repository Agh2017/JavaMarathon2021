package day11.task1;

public class Task1 {


    public static void main(String[] args) {

        Warehouse warehouse = new Warehouse();
        Picker picker = new Picker(warehouse);
        Courier courier = new Courier(warehouse);
        businessProcess(picker);
        businessProcess(courier);
        System.out.println(picker);
        System.out.println(courier);
        System.out.println(warehouse);

        Warehouse warehouse1 = new Warehouse();
        Picker picker1 = new Picker(warehouse1);
        Courier courier1 = new Courier(warehouse1);
        businessProcess(picker1);
        businessProcess(courier1);
        System.out.println(picker1);
        System.out.println(courier1);
        System.out.println(warehouse1);
    }

    static void businessProcess(Worker worker) {
        for (int i = 0; i < 10000; i++) {
            worker.doWork();
        }
        worker.bonus();
    }
}

/*
сотрудник выполняет свою работу (вызов метода doWork()), ему выплачивается заработная плата (сокр. ЗП) (80 — сборщику, 100 — курьеру).
Также, при вызове doWork() у Сборщика, происходит увеличение значения поля countPickedOrders в объекте класса Warehouse на 1. А при вызове doWork() у Курьера, происходит увеличение значения поля countDeliveredOrders в объекте класса Warehouse на 1. Подумайте о том, как связать объекты работников с объектом склада (один из возможных вариантов - передавать объект склада в качестве аргумента при создании объектов-работников и хранить его в поле).

 */