package com.ll.exam.qsl.interestKeyWord.entity;

import lombok.*;

import javax.persistence.*;

@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class InterestKeyWord {
    @Id
    @EqualsAndHashCode.Include
    private String content;

}

