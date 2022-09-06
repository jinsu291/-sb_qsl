package com.ll.exam.qsl.interestKeyWord.entity;

import lombok.*;

import javax.persistence.*;

@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class InterestKeyWord {
    @Id
    private String content;
}

