package domain;

import javax.persistence.*;

@Entity
public class Vote {


    @Id
    @GeneratedValue
    @Column(name = "VOTE_ID")
    private Long id;

    //Getter
    public Long getId(){
        return id;
    }

    //Setter
    public void setId(Long id) {
        this.id = id;
    }

    @ManyToOne
    @JoinColumn(name = "OPTION_ID")
    private Option option;

    //Getter
    public Option getOption(){
        return option;
    }

    //Setter
    public void setOption(Option option){
        this.option = option;
    }
}
