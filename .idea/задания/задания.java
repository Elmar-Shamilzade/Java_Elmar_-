class Герой {
    private String имя;
    private int здоровье;

    public Герой(String имя, int здоровье) {
        this.имя = имя;
        this.здоровье = здоровье;
    }

    public void атака() {
        System.out.println(имя + " наносит удар!");
    }

    public String взятьИмя() {
        return имя;
    }
}

class Воин extends Герой {
    public Воин(String имя, int здоровье) {
        super(имя, здоровье);
    }

    public void размашистыйУдар() {
        System.out.println(взятьИмя() + " замахивается двуручным мечом!");
    }
}

class Маг extends Герой {
    public Маг(String имя, int здоровье) {
        super(имя, здоровье);
    }

    public void магия() {
        System.out.println(взятьИмя() + " создает магическую сферу!");
    }
}

class Лучник extends Герой {
    public Лучник(String имя, int здоровье) {
        super(имя, здоровье);
    }

    public void выстрел() {
        System.out.println(взятьИмя() + " выпускает оперенную стрелу!");
    }
}

public class Битва {
    public static void main(String[] args) {
        Воин александр = new Воин("Александр", 250);
        Маг григорий = new Маг("Григорий", 130);
        Лучник михаил = new Лучник("Михаил", 180);

        александр.атака();
        александр.размашистыйУдар();

        григорий.атака();
        григорий.магия();

        михаил.атака();
        михаил.выстрел();
    }
}