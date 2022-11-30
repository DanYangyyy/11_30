public class Main {
    public static void main(String[] args) {
        String name="tom";
        String pwd="123456";
        String email="123@.com";
        try {
            user(name,pwd,email);
            System.out.println("注册成功");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
    public static void user(String name,String pwd,String email){
        if(!(name!=null&&pwd!=null&&email!=null)){
            throw new RuntimeException("输入不能为null");
        }
        int nl=name.length();
        int pl=pwd.length();
        if(!(nl>=2&&nl<=4)) {
            throw new RuntimeException("用户名错误");
        }
        if(!(pl==6&&isDigital(pwd))){
            throw new RuntimeException("密码错误");
        }
        int i = email.indexOf('@');
        int j = email.indexOf('.');
        if(!(i>0&&j>i)){
            throw new RuntimeException("邮箱错误");
        }
    }
    public static boolean isDigital(String str){
        char[] chars=str.toCharArray();
        for(int i=0;i<chars.length;i++){
            if(chars[i]<'0'||chars[i]>'9') {
                return false;
            }
        }
        return true;
    }
}

