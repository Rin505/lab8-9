public class fifth {
    public static class Cylinder extends fourth.MyCircle {

        public int height;

        Cylinder(int radius){super(radius);}
        Cylinder(int radius, int height) {
            this.radius = radius;
            this.height = height;
        }

        float CVolume() {
            float volume = height * Circle_square();
            return volume;
        }
        void print_CVolume(){
            System.out.println("Радиус: " + radius);
            System.out.println("Высота: " + height);
            System.out.println("Объем: " + CVolume());
        }

    }

    public static void main(String[] args) {
        Cylinder cylinder1 = new Cylinder(10,12);
        cylinder1.print_CVolume();
    }
}
