package pattern_builder.dialog;

/**
 * Create by SunnyDay 2022/11/07 21:44:41
 **/
public class AlertDialog {
    private String title;
    private String subTitle;
    private String msg;
    private String style;
    private String sureListener;
    private String cancelListener;
    /**
     * 1、私有构造：不让外部使用了
     * 注意安卓源码中使用的为protected，这样其他包中也不能直接new AlertDialog。
     * */
     private AlertDialog(Builder builder){
        this.title = builder.title;
        this.subTitle = builder.subTitle;
        this.msg = builder.msg;
        this.style = builder.style;
        this.sureListener = builder.sureListener;
        this.cancelListener = builder.cancelListener;
    }

    /**
     * 3、通过setXXX方法进行初始化。留意返回值。
     * */
    public static final class Builder{
        public Builder setTitle(String title) {
            this.title = title;
            return this;
        }

        public Builder setSubTitle(String subTitle) {
            this.subTitle = subTitle;
            return this;
        }

        public Builder setMsg(String msg) {
            this.msg = msg;
            return this;
        }

        public Builder setStyle(String style) {
            this.style = style;
            return this;
        }

        public Builder setSureListener(String sureListener) {
            this.sureListener = sureListener;
            return this;
        }

        public Builder setCancelListener(String cancelListener) {
            this.cancelListener = cancelListener;
            return this;
        }
        /**
         * 2、AlertDialog 的属性都copy到builder中
         * */
        private String title;
        private String subTitle;
        private String msg;
        private String style;
        private String sureListener;
        private String cancelListener;

        /**
         * 4、暴漏一个方法提供Dialog引用。
         * 注意方法返回值
         * 注意传递的参数
         * */
        public AlertDialog create(){
            return new AlertDialog(this);
        }
    }
    public void show(){
        StringBuilder sb = new StringBuilder();
        sb.append("AlertDialog{").append("\n")
                .append("title=").append(title).append("\n")
                .append("subTitle=").append(subTitle).append("\n")
                .append("msg=").append(msg).append("\n")
                .append("style=").append(style).append("\n")
                .append("sureListener=").append(sureListener).append("\n")
                .append("cancelListener=").append(cancelListener).append("\n")
                .append("}");
        System.out.println(sb);
    }
}
