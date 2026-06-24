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
   * うちのこ詳細一覧検索。名前を入れれば名前検索、名前を入れなければ全件検索。
   *
   * @return
   */
  public List<OriginalCharacter> search() {
    return repository.search();
  }

  public List<OriginalCharacter> search(String name) {
    if (name == null || name.isBlank()) {
      return search();
    }
    return repository.searchByName(name);
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
    findById(originalCharacter.getId());
    repository.update(originalCharacter);
  }

  /**
   * うちのこ詳細ID検索
   *
   * @param id うちのこID
   * @return　うちのこ詳細情報
   */
  public OriginalCharacter findById(Integer id) {
    OriginalCharacter character = repository.findById(id);

    if (character == null) {
      throw new IllegalArgumentException(
          "ID:" + id + " のキャラクターは存在しません");
    }

    return character;
  }

  /**
   * うちのこ物理削除
   *
   * @param id うちのこID
   */
  public void delete(Integer id) {
    findById(id);
    repository.delete(id);
  }
}
