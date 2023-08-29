package ch09.sec06.exam02;

public class Button {
    //정적 멤버 인터페이스
    public static interface ClickListener
    {
        //추상 메소드
        void onClick(); }

    //필드
    private ch09.sec06.exam01.Button.ClickListener clickListener;

    //메소드
    public void setClickListener(ch09.sec06.exam01.Button.ClickListener clickListener) {
        this.clickListener = clickListener;
    }

}
