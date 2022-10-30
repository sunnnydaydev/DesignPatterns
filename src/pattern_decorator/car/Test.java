package pattern_decorator.car;

/**
 * Create by SunnyDay on 2019/04/07
 */
public class Test {
    public static void main(String[] args){
        // 1、直接使用类，不使用装饰者。
        AudiA8 audiA8 = new AudiA8();
        audiA8.desc();
        audiA8.cost();
        System.out.println("---------------------");

        // 使用装饰者
        IVolkswagen decoratorAudiA8CarSkinBlack = new DecoratorAudiA8CarSkinBlack(audiA8);
        decoratorAudiA8CarSkinBlack.desc();
        decoratorAudiA8CarSkinBlack.cost();
        System.out.println("---------------------");
        // 使用装饰者
        IVolkswagen decoratorPassat2023SkinBlack = new DecoratorPassat2023SkinBlack(new Passat2023());
        decoratorPassat2023SkinBlack.desc();
        decoratorPassat2023SkinBlack.cost();

    }
}

