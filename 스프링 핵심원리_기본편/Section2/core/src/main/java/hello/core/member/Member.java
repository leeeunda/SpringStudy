package hello.core.member;

public class Member {
    private Long id;
    private String name;
    private Grade grade;
    //id,이름,grade 3가지 속성을 보유

    public Member(Long id, String name, Grade grade) {
        this.id = id;
        this.name = name;
        this.grade = grade;
    }


    //getter-setter method를 통해서 private의 값을 세팅
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Grade getGrade() {
        return grade;
    }

    public void setGrade(Grade grade) {
        this.grade = grade;
    }
}
