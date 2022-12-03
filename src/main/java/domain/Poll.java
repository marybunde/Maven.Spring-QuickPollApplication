package domain;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Poll {

    @Id
    @GeneratedValue
    @Column(name = "POLL_ID")
    public Long id;

    @Column(name = "QUESTION")
    private String question;

    @OneToMany
    private Set <Option>options;




}
