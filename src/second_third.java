public class second_third {

    public static class StudentMagistr extends first.Student {
        private int kurs;

            // конструкторы, переопределяем родительские//
            StudentMagistr(String name, String surname) {super(name, surname);}
            StudentMagistr(String name, String surname, int birthYear) {super(name, surname, birthYear);}
            StudentMagistr(String name, String surname, int birthYear, String group) {super(name, surname, birthYear, group);}

            // создаем новый конструктор, для включения поля kurs//

            StudentMagistr(String name, String surname, int birthYear, String group, int kurs) {
                this.name = name;
                this.surname = surname;
                this.birthYear = birthYear;
                this.group = group;
                this.kurs = kurs;
            }

            // переопределяем метод вывода информации о студенте//

        void information() {
            System.out.println(this.name + " " + this.surname);
            if (birthYear != 0) {
                System.out.println("Год рождения: " + this.birthYear);
            }
            if(group != null) {
                System.out.println("Группа: " + this.group);
            }
            if(kurs != 0 ){
                System.out.println("Курс: " + this.kurs);
            }
        }
    }

    public static void main(String[] args) {

        StudentMagistr magistr1 = new StudentMagistr("Mr", "Nobody", 1978, "БИ-231", 2);
        magistr1.information();
    }

}


