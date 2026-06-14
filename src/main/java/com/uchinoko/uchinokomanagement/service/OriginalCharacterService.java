package com.uchinoko.uchinokomanagement.service;

import com.uchinoko.uchinokomanagement.data.OriginalCharacter;
import com.uchinoko.uchinokomanagement.repository.OriginalCharacterRepository;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class OriginalCharacterService {

  private final OriginalCharacterRepository repository;

  public OriginalCharacterService(OriginalCharacterRepository repository) {
    this.repository = repository;
  }

  /**
   * うちのこ詳細一覧検索
   *
   * @return
   */
  public List<OriginalCharacter> search() {
    return repository.search();
  }

  /**
   * うちのこ新規登録
   *
   * @param originalCharacter うちのこ詳細
   */
  public void register(OriginalCharacter originalCharacter) {
    repository.insert(originalCharacter);
  }

  /**
   * うちのこ詳細更新
   *
   * @param originalCharacter うちのこ詳細情報
   */
  public void update(OriginalCharacter originalCharacter) {
    repository.update(originalCharacter);
  }

  /**
   * うちのこ詳細ID検索
   *
   * @param id うちのこID
   * @return　うちのこ詳細情報
   */
  public OriginalCharacter findById(Integer id) {
    return repository.findById(id);
  }
}
