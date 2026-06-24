package com.uchinoko.uchinokomanagement.controller;

import com.uchinoko.uchinokomanagement.data.OriginalCharacter;
import com.uchinoko.uchinokomanagement.service.OriginalCharacterService;
import jakarta.validation.Valid;
import java.util.List;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OriginalCharacterController {

  private final OriginalCharacterService service;

  public OriginalCharacterController(OriginalCharacterService service) {
    this.service = service;
  }

  /**
   * うちのこ全件（名前）検索
   *
   * @return　うちのこ詳細一覧,名前検索
   */
  @GetMapping("/characters")
  public List<OriginalCharacter> searchCharacters(
      @RequestParam(required = false) String name) {
    return service.search(name);
  }

  /**
   * うちのこ新規登録
   *
   * @param originalCharacter
   */
  @PostMapping("/characters")
  public void registerCharacter(@RequestBody @Valid OriginalCharacter originalCharacter) {
    service.register(originalCharacter);
  }

  /**
   * うちのこ詳細更新
   *
   * @param id                うちのこID
   * @param originalCharacter うちのこ詳細情報
   * @return　更新したうちのこ詳細情報
   */
  @PutMapping("/characters/{id}")
  public OriginalCharacter update(
      @PathVariable Integer id,
      @RequestBody @Valid OriginalCharacter originalCharacter) {

    originalCharacter.setId(id);
    service.update(originalCharacter);

    return service.findById(id);
  }

  @DeleteMapping("/characters/{id}")
  public List<OriginalCharacter> delete(@PathVariable Integer id) {
    service.delete(id);
    return service.search();
  }
}
