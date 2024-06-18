package com.ohgiraffers.model.dto;


import java.sql.Date;

/*
 * DTO 클래스의 조건
 * 1. 모든 필드는 private
 * 2. 기본생성자와 모든 필드를 초기화하는 생성자
 * 3. 모든 필드에 대한 setter/getter
 * 4. toString Overiding을 이용한 필드 값 반환용 메서드
 * 5. 직렬화 처리
 * */
public class DepartmentDTO {

    private String deptId;
    private String deptTitle;
    private String deptLocationId;


    public DepartmentDTO() {
    }

    public DepartmentDTO(String deptId, String deptTitle, String deptLocationId) {
        this.deptId = deptId;
        this.deptTitle = deptTitle;
        this.deptLocationId = deptLocationId;

    }


    public String getDeptId() {
        return deptId;
    }

    public void setDeptId(String deptId) {
        this.deptId = deptId;
    }

    public String getDeptTitle() {
        return deptTitle;
    }

    public void setDeptTitle(String deptTitle) {
        this.deptTitle = deptTitle;
    }

    public String getDeptLocationId() {
        return deptLocationId;
    }

    public void setDeptLocationId(String deptLocationId) {
        this.deptLocationId = deptLocationId;
    }

    @Override
    public String toString() {
        return "DepartmentDTO{" +
                "deptId ='" + deptId + '\'' +
                ", deptTitle ='" + deptTitle + '\'' +
                ", deptLocationId ='" + deptLocationId + '\'' +
                '}';
    }
}
