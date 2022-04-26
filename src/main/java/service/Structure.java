package service;

import repository.BlockImpl;

import java.util.List;
import java.util.Optional;

public interface Structure {

    Optional<BlockImpl> findBlockByColor(String color);

    List<BlockImpl> findBlocksByMaterial(String material);

    int count();

}
