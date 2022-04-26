package repository;



import service.CompositeBlock;

import java.util.List;
import java.util.Objects;

public class BlockImpl implements CompositeBlock {
    private String color;
    private String material;
    private boolean compositeBlock;
    private List<BlockImpl> blockList;

    public BlockImpl(String color, String material, boolean compositeBlock) {
        this.color = color;
        this.material = material;
        this.compositeBlock = compositeBlock;
    }

    public BlockImpl(List<BlockImpl> blockList, boolean compositeBlock) {
        this.compositeBlock = compositeBlock;
        this.blockList = blockList;
    }

    public boolean isCompositeBlock() {
        return compositeBlock;
    }

    public void setCompositeBlock(boolean compositeBlock) {
        this.compositeBlock = compositeBlock;
    }

    @Override
    public String getColor() {
        return this.color;
    }

    @Override
    public String getMaterial() {
        return this.material;
    }

    @Override
    public List<BlockImpl> getBlocks() {
        return this.blockList;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BlockImpl block = (BlockImpl) o;
        return compositeBlock == block.compositeBlock && color.equals(block.color) && material.equals(block.material) && blockList.equals(block.blockList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(color, material, compositeBlock, blockList);
    }

    @Override
    public String toString() {
        return "Block{" +
                "color='" + color + '\'' +
                ", material='" + material + '\'' +
                ", compositeBlock=" + compositeBlock +
                ", blockList=" + blockList +
                '}';
    }
}
