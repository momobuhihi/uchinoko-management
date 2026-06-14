package com.uchinoko.uchinokomanagement.data;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import java.time.LocalDateTime;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class OriginalCharacter {

  private Integer id;

  @NotBlank(message = "名前は必須です")
  @Size(max = 50, message = "名前は50文字以内で入力してください")
  private String name;

  @Size(max = 50, message = "ふりがなは50文字以内で入力してください")
  private String ruby;

  @Size(max = 50, message = "実年齢は50文字以内で入力してください")
  private String realAge;

  @Size(max = 50, message = "見た目年齢は50文字以内で入力してください")
  private String lookAge;

  @Size(max = 30, message = "性別は30文字以内で入力してください")
  private String gender;

  @Size(max = 50, message = "種族は50文字以内で入力してください")
  private String race;

  @Size(max = 50, message = "世界名は50文字以内で入力してください")
  private String worldName;

  @Size(max = 1000, message = "外見は1000文字以内で入力してください")
  private String appearance;

  @Size(max = 1000, message = "性格は1000文字以内で入力してください")
  private String personality;

  @Size(max = 1000, message = "能力は1000文字以内で入力してください")
  private String ability;

  @Size(max = 2000, message = "説明は2000文字以内で入力してください")
  private String description;

  private LocalDateTime createdAt;
  private LocalDateTime updatedAt;
}