package pattern_builder.dialog;

/**
 * Create by SunnyDay 2022/11/07 22:04:41
 **/
public class Test {
    public static void main(String[] args) {
        AlertDialog dialog1 = new AlertDialog.Builder()
                .setTitle("Dialog1标题")
                .setSubTitle("Dialog1字标题")
                .setMsg("Dialog1文案")
                .setStyle("Dialog1样式")
                .setSureListener("Dialog1确认按钮监听ing")
                .setCancelListener("Dialog1取消按钮监听ing")
                .create();
        dialog1.show();

        System.out.println("---------------------------");
        AlertDialog dialog2 = new AlertDialog.Builder()
                .setTitle("Dialog2标题")
                .setSubTitle("Dialog2字标题")
                .setMsg("Dialog2文案")
                .setStyle("Dialog2样式")
                .setSureListener("Dialog2确认按钮监听ing")
                .setCancelListener("Dialog2取消按钮监听ing")
                .create();
        dialog2.show();
    }
}
