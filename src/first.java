public class first {
    public static class Student{
        public String name;
        public String surname;
        public int birthYear;
        public String group;

        Student(){
            this.name = null;
            this.surname = null;
            this.birthYear = 0;
            this.group = null;
        } // конструктор по умолчанию//

        Student(String name, String surname) {
            this.name = name;
            this.surname = surname;
        }

        Student(String name, String surname, int birthYear) {
            this.name = name;
            this.surname = surname;
            this.birthYear = birthYear;
        }

        Student(String name, String surname, int birthYear, String group) {
            this.name = name;
            this.surname = surname;
            this.birthYear = birthYear;
            this.group = group;
        }

        void information() {
            System.out.println(this.name + " " + this.surname);
            if (birthYear != 0) {
                System.out.println("Год рождения: " + this.birthYear);
            }
            if(group != null) {
                System.out.println("Группа: " + this.group);
            }
        }

    }

}
