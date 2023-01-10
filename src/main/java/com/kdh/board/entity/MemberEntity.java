package com.kdh.board.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/* Number
* 이메일
* 비밀번호
* 닉네임
* 프로필 사진
* 전화번호
* 주소
*/

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
// 해당클래스가 Entity 클래스임을 명시
// 인자로 Entity의 이름을 지정할 수 있음
@Entity(name="MEMBER")
// 해당 Entity 클래스와 데이터베이스 Table을
// 인자로 지정한 이름으로 매핑
@Table(name="MEMBER")

public class MemberEntity {
	
	// 해당 필드가 Primary Key 임을 명시
	@Id
	// 해당 Primary key의 value 자동 생성을 지시
	// @GeneratedValue
	private String email;
	private String password;
	private String nickname;
	private String profile;
	private String telNumber;
	private String address;
}
