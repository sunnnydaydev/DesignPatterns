package pattern_6_design_principle.codes.srp;

/**
 * Create by SunnyDay 2022/06/08 13:05:35
 **/
public interface IPhone {
    /**
     * 拨号
     */
    void dial(String phoneNumber);

    /**
     * 通话
     */
    void chat(String msg);
    /**
     * 挂机
     * */
    void hangup();
}
