package eth

import java.math.BigDecimal

data class Block(
        val blockNumber: Long,
        val blockHash: String,
        val blockParentHash: String,
        val blockNonce: String,
        val blockSha3Uncles: String,
        val blockLogsBloom: String,
        val blockTransactionsRoot: String,
        val blockStateRoot: String,
        val blockMiner: String,
        val blockDifficulty: BigDecimal,
        val blockTotalDifficulty: BigDecimal,
        val blockSize: Long,
        val blockExtraData: String,
        val blockGasLimit: Long,
        val blockGasUsed: Long,
        val blockTimestamp: Long,
        val blockTransactionCount: Long
)

data class Transaction(
        val txHash: String,
        val txNonce: Long,
        val txBlockHash: String,
        val txBlockNumber: Long,
        val txIndex: Long,
        val txFrom: String,
        val txTo: String,
        val txValue: BigDecimal,
        val txGas: Long,
        val txGasPrice: Long,
        val txInput: String
)

data class Erc20Transfer(
        val erc20Token: String,
        val erc20From: String,
        val erc20To: String,
        val erc20Value: BigDecimal,
        val erc20TxHash: String,
        val erc20LogIndex: Long,
        val erc20BlockNumber: Long
)