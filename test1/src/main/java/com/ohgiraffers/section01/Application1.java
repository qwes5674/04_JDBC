package com.ohgiraffers.section01;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Properties;
import java.util.Scanner;

import static com.ohgiraffers.common.JDBCTemplate.getConnection;

public class Application1 {
    public static void main(String[] args) {

        Connection con = getConnection();

        Statement stmt = null;

        ResultSet rset = null;

        int result = 0;

        Properties prop = new Properties();

        try {
            prop.loadFromXML(
                    new FileInputStream("src/main/java/com/ohgiraffers/mapper/employee-query.xml")
            );

        Scanner sc = new Scanner(System.in);
        System.out.println("Employee 테이블의 목록을 1.조회, 2.추가 , 3.수정, 4.삭제, 5.단일 조회 하는 어플리케이션입니다.");
        switch(true){
            case 1:
                System.out.print("");

            case 2:
                System.out.print("추가할 아이디를 입력하세요 : ");
                int empId = sc.nextInt();
                System.out.print("추가할 이름을 입력하세요 : ");
                String empName = sc.nextLine();
                System.out.print("추가할 주민번호를 입력하세요 : ");
                int empNo = sc.nextInt();
                System.out.print("추가할 이메일을 입력하세요 : ");
                String email = sc.nextLine();
                System.out.print("추가할 전화번호를 입력하세요 : ");
                int phone = sc.nextInt();
                System.out.print("추가할 부서코드를 입력하세요 : ");
                String deptCode = sc.nextLine();
                System.out.print("추가할 직급코드를 입력하세요 : ");
                String jobCode = sc.nextLine();
                System.out.print("추가할 급여를 입력하세요 : ");
                int salary = sc.nextInt();
                System.out.print("추가할 보너스율을 입력하세요 : ");
                int bonus = sc.nextInt();
                System.out.print("추가할 관리자사번을 입력하세요 : ");
                int managerId = sc.nextInt();
                System.out.print("추가할 입사일을 입력하세요 : ");
                int hireDate = sc.nextInt();
                System.out.print("추가할 퇴사일을 입력하세요 : ");
                int entDate = sc.nextInt();
                System.out.print("추가할 퇴직여부를 입력하세요 : ");
                String entYn = sc.nextLine();

            case 3:
                System.out.print("변경할 아이디를 입력하세요 : ");
                int empId = sc.nextInt();
                System.out.print("변경할 이름을 입력하세요 : ");
                String empName = sc.nextLine();
                System.out.print("변경할 주민번호를 입력하세요 : ");
                int empNo = sc.nextInt();
                System.out.print("변경할 이메일을 입력하세요 : ");
                String email = sc.nextLine();
                System.out.print("변경할 전화번호를 입력하세요 : ");
                int phone = sc.nextInt();
                System.out.print("변경할 부서코드를 입력하세요 : ");
                String deptCode = sc.nextLine();
                System.out.print("변경할 직급코드를 입력하세요 : ");
                String jobCode = sc.nextLine();
                System.out.print("변경할 급여를 입력하세요 : ");
                int salary = sc.nextInt();
                System.out.print("변경할 보너스율을 입력하세요 : ");
                int bonus = sc.nextInt();
                System.out.print("변경할 관리자사번을 입력하세요 : ");
                int managerId = sc.nextInt();
                System.out.print("변경할 입사일을 입력하세요 : ");
                int hireDate = sc.nextInt();
                System.out.print("변경할 퇴사일을 입력하세요 : ");
                int entDate = sc.nextInt();
                System.out.print("변경할 퇴직여부를 입력하세요 : ");
                String entYn = sc.nextLine();
            case 4:

        }

    } catch (IOException e) {
        throw new RuntimeException(e);
    }



    }
}
