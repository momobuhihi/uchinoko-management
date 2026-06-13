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

  public List<OriginalCharacter> search() {
    return repository.search();
  }

  public void register(OriginalCharacter originalCharacter) {
    repository.insert(originalCharacter);
  }
}
