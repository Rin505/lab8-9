public class fourth {
    static class MyCircle{

        public int radius;

        MyCircle(){
            radius = 0;
        }
        MyCircle(int radius) {
            this.radius = radius;
        }

        float Circle_square() {
            return (float) (radius*radius * 3.1415926);
        }
        void printsquare() {
            System.out.println("Радиус:" + radius);
            System.out.println("Площадь:" + Circle_square());
        }

    }

    public static void main(String[] args) {
        MyCircle circle1 = new MyCircle(10);
        circle1.printsquare();
    }

}
