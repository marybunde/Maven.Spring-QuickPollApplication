package domain;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Poll {

    @Id
    @GeneratedValue
    @Column(name = "POLL_ID")
    private Long id;

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

    //Getter
    public String getQuestion() {
        return question;
    }
        //Setter
        public void setQuestion(String question){
            this.question = question;

        }



    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "POLL_ID")
    @OrderBy
    private Set <Option>options;

    //Getter
    public Set<Option>getOptions(){
        return options;
    }
    //Setter
    public void setOptions(Set<Option> options) {
        this.options = options;
    }
}
