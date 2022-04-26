package repository;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        BlockImpl block1 = BlockImpl.newBlock("kolor1", "materiał4");
        BlockImpl block2 = BlockImpl.newBlock("kolor2", "materiał2");
        BlockImpl block3 = BlockImpl.newBlock("kolor3", "materiał3");
        BlockImpl block4 = BlockImpl.newBlock("kolor4", "materiał4");
        BlockImpl block5 = BlockImpl.newBlock("kolor1", "materiał5");
        BlockImpl block6 = BlockImpl.newBlock("kolor4", "materiał3");
        BlockImpl blockComposite1 = BlockImpl.newCompositeBlock(List.of(block4, block5));
        BlockImpl blockComposite2 = BlockImpl.newCompositeBlock(List.of(block6, block1));
        Wall wall1 = new Wall();
        wall1.addBlockToList(block1);
        wall1.addBlockToList(block2);
        wall1.addBlockToList(blockComposite1);
        System.out.println(wall1.count());
        System.out.println(wall1.findBlockByColor("kolor4"));
        System.out.println(wall1.findBlocksByMaterial("materiał5"));
    }
}
