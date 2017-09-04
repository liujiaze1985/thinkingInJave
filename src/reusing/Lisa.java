package reusing;
// : reusing/Lisa.java
// {CompileTimeError} (Won't compile)

class Lisa extends Homer {
    // @Override //防止在不想重载的时候意外地进行了重载
    void doh(Milhouse m) {
        System.out.println("doh(Milhouse)");
    }
} /// :~
