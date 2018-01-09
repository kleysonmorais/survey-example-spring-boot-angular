package com.github.joumenharzli.surveypoc.service.dto;

import java.util.ArrayList;
import java.util.List;

/**
 * SubjectDto
 *
 * @author Joumen HARZLI
 */
public class SubjectDto {
  private Long id;
  private String label;
  private List<QuestionDto> questions;

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getLabel() {
    return label;
  }

  public void setLabel(String label) {
    this.label = label;
  }

  public void addQuestion(QuestionDto question) {
    if (question != null) {
      if (questions == null) {
        questions = new ArrayList<>();
      }
      questions.add(question);
    }
  }

  public List<QuestionDto> getQuestions() {
    return questions;
  }

  public void setQuestions(List<QuestionDto> questions) {
    this.questions = questions;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }

    SubjectDto that = (SubjectDto) o;

    return id != null ? id.equals(that.id) : that.id == null;
  }

  @Override
  public int hashCode() {
    return id != null ? id.hashCode() : 0;
  }

  @Override
  public String toString() {
    return "SubjectDto{" +
        "id=" + id +
        ", label='" + label + '\'' +
        ", questions=" + questions +
        '}';
  }
}