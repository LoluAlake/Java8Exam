package com.dtcc.exams.part4;

public class Geometry implements Rectangle, Circle  {
        private int height;
        private int width;
        private int radius;

        @Override
        public int area(int height, int width) {
            return 0;
        }

        @Override
        public double area(int radius) {
            return 0;
        }

    public Geometry(){}

        public int getHeight() {
            return height;
        }

        public int getWidth() {
            return width;
        }

        public int getRadius() {
            return radius;
        }

    public Geometry(int height, int width, int radius) {
            this.height = height;
            this.width = width;
            this.radius = radius;
        }

        public int getArea(int height, int width){
            return height * width;
        }

        public double getArea(int radius){
            return 3.14 *(radius * radius);
        }
}
