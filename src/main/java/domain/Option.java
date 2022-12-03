package domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Option {
    @Id
    @GeneratedValue
    @Column(name = "OPTION_ID")
   private Long id;

    //Getter
    public Long getId(){
        return id;

    }

    //Setter

    public void setId(Long id) {
        this.id = id;
    }



    @Column(name = "OPTION_VALUE")
    private String value;

    //Getter
    public String getValue(){
        return value;
    }
    //Setter

    public void setValue(String value) {
        this.value = value;
    }
}
