
/**
 * 여기에 Rectangle 클래스 설명을 작성하십시오.
 * 
 * @author (작성자 이름) 
 * @version (버전번호나 날짜)
 */
public class Rectangle
{
    // 인스턴스 변수 - 다음의 예제를 사용자에 맞게 바꾸십시오
    private int width;
    private int height;
    
    /**
     * Rectangle 클래스의 객체 생성자
     */
    public Rectangle(int w,int h)
    {
        // 인스턴스 변수의 초기화
        this.width = w;
        this.height = h;
    }

    /**
     * 사각형의 면적 계산
     * 
     * @param
     * @return     가로 * 세로 
     */
    public int getArea()
    {
        // 여기에 코드를 작성하십시오.
        return this.width * this.height;
    }
}
