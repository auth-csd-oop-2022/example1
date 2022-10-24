public class ClassA {

    public ClassA(int a, int b, int c, int d, int e) {
        /**
         * We use the constructor of ClassB for the three parameters, and then we use the setters for the other two,
         * since there is no constructor for ClassB that takes 5 parameters.
         */
        ClassB instance = new ClassB(a, b, c);
        instance.setD(d);
        instance.setE(e);

    }
}
