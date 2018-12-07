package Test10;

public class packages
{//// in Datei one/Y.java
//package one;

    class X {
        public int x;

        void m() {
            // A)
        }
    }

    public class Y {
        int y1;
        public int y2;
        private int y3;
        protected int y4;

        void m() {
            // B)
        }
    }


//// in Datei two/Z.java
//package two;
//import one.*;

    public class Z extends Y {
        public int z;

        void m() {
            // C)
        }
    }
}
