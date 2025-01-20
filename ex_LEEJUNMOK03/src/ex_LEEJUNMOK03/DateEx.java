package ex_LEEJUNMOK03;

//	<1번 문제>
//	 날짜(date)를 클래스 Date로 작성한다고 가정하자. Date 안에 저장되는 변수 이름과 날짜를 조작하는 메소드 이름을 생각하여 보자. 

class Date {
    private int year;
    private int month;
    private int day;

    // 생성자
    public Date(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    // 년, 월, 일을 설정하는 메서드
    public void setDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    // 년, 월, 일을 출력하는 메서드
    public String printDate() {
        return year + "년 " + month + "월 " + day + "일";
    }
}

public class DateEx {
    public static void main(String[] args) {
        // Date 객체 생성
        Date date = new Date(2025, 1, 20);

        // Date 객체의 년, 월, 일을 출력
        System.out.println(date.printDate());

        // Date 객체의 년, 월, 일을 변경
        date.setDate(2023, 12, 25);

        // 변경된 년, 월, 일을 출력
        System.out.println(date.printDate());
    }
}
