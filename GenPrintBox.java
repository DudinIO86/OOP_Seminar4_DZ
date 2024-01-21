public interface GenPrintBox {
    static public Box<Fruit> getFruitBox(){
        Box<Fruit> newBox=new Box<>();
        Apple<Apple> apple=new Apple<>();
        Orange<Orange> orange=new Orange<>();

        for (int i = 0; i < 5; i++) {
            newBox.put(apple);
            newBox.put(orange);

        }
        return newBox;
    }

    static public void printBox(Box <? extends Fruit> box){
        for (int i = 0; i <box.volume() ; i++) {
            System.out.println((i+1)+". "+box.get(i).toString());
        }
    }
}
