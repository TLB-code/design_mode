public interface AbstractFactory {
    phone newPhone();
    pad newPad();
}

class appleFactory implements AbstractFactory{
    @Override
    public phone newPhone() {
        return new applePhone();
    }

    @Override
    public pad newPad() {
        return new applePad();
    }
}

class huaWeiFactory implements AbstractFactory{
    @Override
    public phone newPhone() {
        return new  huaWeiPhone();
    }

    @Override
    public pad newPad() {
        return new huaWeiPad();
    }
}

interface phone{
    void show();
}
interface pad{
    void show();
}

class applePhone implements phone{
    @Override
    public void show() {
        System.out.println("iphone");
    }
}
class huaWeiPhone implements phone{
    @Override
    public void show() {
        System.out.println("mate 60");
    }
}

class applePad implements pad{
    @Override
    public void show() {
        System.out.println("ipad");
    }
}

class huaWeiPad implements pad{
    @Override
    public void show() {
        System.out.println("huaWeiPad");
    }
}

class demo{
    public static void main(String[] args) {
//        AbstractFactory factory = new appleFactory();
        AbstractFactory factory = new huaWeiFactory();
        phone phone = factory.newPhone();
        pad pad = factory.newPad();
        pad.show();
        phone.show();
    }
}

