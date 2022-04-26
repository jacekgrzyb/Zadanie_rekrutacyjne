package service;

import repository.BlockImpl;

import java.util.List;

public interface CompositeBlock extends Block {

    List getBlocks();
}
