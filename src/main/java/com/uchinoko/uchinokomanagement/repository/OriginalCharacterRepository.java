package com.uchinoko.uchinokomanagement.repository;

import com.uchinoko.uchinokomanagement.data.OriginalCharacter;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface OriginalCharacterRepository {

  /**
   * うちのこ一覧検索
   *
   * @return　うちのこ詳細一覧
   */
  List<OriginalCharacter> search();

  /**
   * うちのこ新規登録
   *
   * @param originalCharacter
   */
  void insert(OriginalCharacter originalCharacter);
}
