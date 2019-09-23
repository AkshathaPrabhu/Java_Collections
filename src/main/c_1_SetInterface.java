package main;

public class c_1_SetInterface {

    public static void main(String[] args) {
        InterfaceAImpl interfaceA_impl = new InterfaceAImpl();
        interfaceA_impl.size();
        interfaceA_impl.colour();

        InterfaceA InterfaceA = new InterfaceAImpl();
        InterfaceA.size();

    }
}


