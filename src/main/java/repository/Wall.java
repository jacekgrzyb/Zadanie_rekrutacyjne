package repository;


import service.Structure;

import java.util.ArrayList;

import java.util.List;
import java.util.Objects;

import java.util.Optional;
import java.util.stream.Collectors;

public class Wall implements Structure {
    //Variable definitions
    private List<BlockImpl> blocks;
    public List<BlockImpl> getBlocks() {
        return blocks;
    }

    //Methods definition
    public void setBlocks(List<BlockImpl> blocks) {
        this.blocks = blocks;
    }

    public void  addBlockToList (BlockImpl block) {
        if (blocks == null) {
            blocks = new ArrayList<>();
        }
        blocks.add(block);
    }


    @Override
    public Optional<BlockImpl> findBlockByColor(String color) {
        return blocks.stream().filter(e->e.getColor().equalsIgnoreCase(color)).findAny();
    }

    @Override
    public List<BlockImpl> findBlocksByMaterial(String material) {
        return blocks.stream().filter(e->e.getMaterial().equalsIgnoreCase(material)).collect(Collectors.toList());
    }

    @Override
    public int count() {
        return blocks.stream().map(e->e.isCompositeBlock() ? e.getBlocks().size() : 1).reduce(0, Integer::sum);
    }

    //to string
    @Override
    public String toString() {
        return "Wall{" +
                "blocks=" + blocks +
                '}';
    }

    //hashcode and equals
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Wall wall = (Wall) o;
        return blocks.equals(wall.blocks);
    }

    @Override
    public int hashCode() {
        return Objects.hash(blocks);
    }
}
