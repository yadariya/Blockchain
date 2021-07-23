package blockchain;

public class BlockChain {
    private int id;

    @Override
    public String toString() {
        return "Block:\n" +
                "Id:" + id + '\n' +
                "Timestamp:" + time + '\n' +
                "Hash of the previous block:\n" + previousHash + '\n' +
                "Hash of the block:\n" + currentHash + '\n';
    }

    private String previousHash;
    private String currentHash;
    private long time;

    public BlockChain(int id, String previousHash, String currentHash, long time) {
        this.id = id;
        this.previousHash = previousHash;
        this.currentHash = currentHash;
        this.time = time;
    }

    public String getPreviousHash() {
        return previousHash;
    }

    public void setPreviousHash(String previousHash) {
        this.previousHash = previousHash;
    }

    public String getCurrentHash() {
        return currentHash;
    }

    public void setCurrentHash(String currentHash) {
        this.currentHash = currentHash;
    }
}
