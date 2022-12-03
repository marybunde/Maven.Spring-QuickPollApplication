package domain;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Poll {

    @Id
    @GeneratedValue
    @Column(name = "POLL_ID")
    public Long id;

    //Getter
    public Long getId() {
        return id;
    }
    //Setter
       public void setId(Long id){
        this.id = id;

    }

    @Column(name = "QUESTION")
    private String question;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "POLL_ID")
    @OrderBy
    private Set <Option>options;




}
