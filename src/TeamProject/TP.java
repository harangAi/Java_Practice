package TeamProject;

import java.util.Scanner;

public class TP {
    static Scanner sc = new Scanner(System.in);
    // 도서 정보
    static String[] bookList = {"작별하지 않는다.", "인생은 실전이다.", "달러구트 꿈 백화점.2", "달러구트 꿈 백화점", "소크라테스 익스프레스",
            "오늘 밤, 세계에서 이 사랑이 사라진", "햇빛은 찬란하고 인생은 귀하니까", "럭키", "미드나잇 라이브러리", "백조와 박쥐"};
    static int[] bookNum = {0,1,2,3,3,2,1,3,3,2};

    
    // 화면 초기화
    public static void clearScreen() {
        for (int i = 0; i < 80; i++)
            System.out.println("");
    }

    public static void showBookList(int currentPage) {
        // 전체 페이지 출력
        int page = (int) Math.ceil(bookList.length / 3.0);

        // 표시할 목록 위치 선정
        int startNum = 3 * (currentPage - 1);
        int endNum = 3 *currentPage;
        if (currentPage == page) {
            endNum = bookList.length;
        }

        System.out.println("================================");
        System.out.println("======== 현재 도서 목록 ==========");
        System.out.println("================================");
        System.out.println("== | 번호 | 도서명 | 현재 재고 | ==");
        System.out.println("================================");
        for (int i = startNum; i < endNum; i++) {
            System.out.printf("%d | %-10s | %5d개\n", i + 1, bookList[i], bookNum[i]);
        }
    }
    public static void manageBook() {
        int currentPage = 1;
        while (true) {
            showBookList(currentPage);
            System.out.println("++++++++++++++도서 등록+++++++++++++++");
            System.out.println("==|1.도서추가|2.도서제거|0.메인화면이동|==");
            System.out.println("=====================================");
            System.out.print(">>");
            int menuStatus = sc.nextInt();
            sc.nextLine();

            switch (menuStatus) {
                case 1:
                    System.out.println("도서 추가 화면입니다.");
                    break;
                case 2:
                    System.out.println("도서 삭제 화면입니다.");
                    break;
                case 0:
                    return;
                default:
                    System.out.println("올바르지 못한 메뉴 선택입니다.");

            }
        }

    }
    
    public  static  void mainMenu() {
        int menuStatus = 0;
        while (true) {
            System.out.println("=================================");
            System.out.println("+++++++++도서 관리 프로그램+++++++++");
            System.out.println("=================================");
            System.out.println("==|1.도서관리|2.도서검색|3.대여확인|==");
            System.out.println("==|4.회원등록|5.회원검색|6.회원삭제|==");
            System.out.println("=========|0.프로그램 종료|=========");
            System.out.print(">>");
            menuStatus = sc.nextInt();
            sc.nextLine();
            
            switch (menuStatus) {
                case 1:
                    System.out.println("현재 도서관리 메뉴입니다.");
                    manageBook();
                    break;
                case 2:
                    System.out.println("현재 도서검색 메뉴입니다.");
                    break;
                case 3:
                    System.out.println("현재 대여확인 메뉴입니다.");
                    break;
                case 4:
                    System.out.println("현재 회원등록 메뉴입니다.");
                    break;
                case 5:
                    System.out.println("현재 회원검색 메뉴입니다.");
                    break;
                case 6:
                    System.out.println("현재 회원삭제 메뉴입니다.");
                    break;
                case 0:
                    System.out.println("현재 프로그램 종료 메뉴입니다.");
                    return;
                default:
                    System.out.println("올바르지 못한 메뉴 선택입니다.");
                        
            }
            
        }
    }

    public static void main(String[] args) {
        mainMenu();
    }
}
