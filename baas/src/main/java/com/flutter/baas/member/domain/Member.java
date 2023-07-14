/*
package com.flutter.baas.member.domain;


import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Table(name = "User")
public class Member {
    @Id
    @Column(name = "Userid", nullable = false)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer Userid;


    //멀티 테넌시 구분을 위한 appId
    @Column(name = "appId")
    private String appId;


    private String email;

    @Column(name = "password")
    private String passwordHash;


    @Builder
    public Member(Integer userid, String appId, String email, String passwordHash) {
        this.Userid = userid;
        this.appId = appId;
        this.email = email;
        this.passwordHash = passwordHash;
    }
    public Member() {
    }

    public void changePassword(String passwordHash){
        this.passwordHash = passwordHash;
    }


}
*/
