package pattern_adapter.source;

/**
 * Create by SunnyDay 2022/11/20 12:13:42
 * 目标接口
 **/
public interface IConvert {
    /**
     * 适配者中的不兼容接口
     * */
    void use22V();
    /**
     * 适配器要实现的兼容接口
     * */
    void convertTo5V();
}
