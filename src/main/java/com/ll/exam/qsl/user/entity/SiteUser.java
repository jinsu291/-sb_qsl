package com.ll.exam.qsl.user.entity;

import com.ll.exam.qsl.interestKeyWord.entity.InterestKeyWord;
import lombok.*;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class SiteUser {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true)
    private String username;

    private String password;

    @Column(unique = true)
    private String email;

    @Builder.Default
    @ManyToMany(cascade = CascadeType.ALL)
    private Set<InterestKeyWord> interestKeyWords = new HashSet<>();

    public void addInterestKeywordContent(String keywordContent) {
        interestKeyWords.add(new InterestKeyWord(keywordContent));
    }
}