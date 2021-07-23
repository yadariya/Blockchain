package blockchain;

import java.util.Date;

import static blockchain.StringUtil.applySha256;

public class Main {
    public static void main(String[] args) {
        BlockChain block1 = create(null, 1);
        BlockChain block2 = create(block1, 2);
        BlockChain block3 = create(block2, 3);
        BlockChain block4 = create(block3, 4);
        BlockChain block5 = create(block4, 5);
        System.out.println(block1);
        System.out.println(block2);
        System.out.println(block3);
        System.out.println(block4);
        System.out.println(block5);
    }

    public static BlockChain create(BlockChain previous, int counter) {
        if (counter == 1) {
            return new BlockChain(1, "0", applySha256(Long.toHexString(Double.doubleToLongBits(Math.random()))), new Date().getTime());
        } else {
            return new BlockChain(counter, previous.getCurrentHash(), applySha256(Long.toHexString(Double.doubleToLongBits(Math.random()))), new Date().getTime());

        }

    }
}
