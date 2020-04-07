package com.pfirstattm.demo;

import org.springframework.data.jpa.repository.JpaRepository;

public interface QuestionRepository  extends JpaRepository<YesNoQuestion, String> {
}
