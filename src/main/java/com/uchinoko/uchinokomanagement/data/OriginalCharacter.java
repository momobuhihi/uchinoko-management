package com.uchinoko.uchinokomanagement.data;

import java.time.LocalDateTime;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class OriginalCharacter {

  private Integer id;
  private String name;
  private String ruby;

  private String realAge;
  private String lookAge;

  private String gender;
  private String race;
  private String worldName;

  private String appearance;
  private String personality;
  private String ability;
  private String description;

  private LocalDateTime createdAt;
  private LocalDateTime updatedAt;
}