public class 体重提醒 {
    public static void main(String[] args) {

        //生成一个在【0,200】表示体重的随机数
        //体重60以下，继续保持；体重61-65，需要运动；体重66-69，每天运动，70以上，放弃减肥。
        int weight = (int)(Math.random()*200);
        System.out.println("体重："+weight);
        if (weight<60) {
            System.out.println("哎呦（＾∀＾）你的身材不错哦，继续保持吧！");
        }else if(weight<66) {
            System.out.println("体重偏重（●＞ω＜●），需要运动");
        }else if(weight<70) {
            System.out.println("体重过重＾ω＾，每天运动");
        }else if(weight<80){
            System.out.println("哇(￣∇￣)，简直胖若两人");
        }else{
            System.out.println("哇塞(=^_^=)你实在是太重了，那还减肥干嘛:p");

        }
    }
}
