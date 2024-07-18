//
// Auto-generated file. DO NOT EDIT!
//
package jp.co.soramitsu.iroha2.generated

import jp.co.soramitsu.iroha2.codec.ScaleCodecReader
import jp.co.soramitsu.iroha2.codec.ScaleCodecWriter
import jp.co.soramitsu.iroha2.codec.ScaleReader
import jp.co.soramitsu.iroha2.codec.ScaleWriter
import jp.co.soramitsu.iroha2.wrapException
import kotlin.Unit

/**
 * CanTransferAssetWithDefinition
 *
 * Generated from 'CanTransferAssetWithDefinition' regular structure
 */
public data class CanTransferAssetWithDefinition(
    public val assetDefinition: AssetDefinitionId,
) {
    public companion object :
        ScaleReader<CanTransferAssetWithDefinition>,
        ScaleWriter<CanTransferAssetWithDefinition> {
        override fun read(reader: ScaleCodecReader): CanTransferAssetWithDefinition = try {
            CanTransferAssetWithDefinition(
                AssetDefinitionId.read(reader),
            )
        } catch (ex: Exception) {
            throw wrapException(ex)
        }

        override fun write(writer: ScaleCodecWriter, instance: CanTransferAssetWithDefinition): Unit =
            try {
                AssetDefinitionId.write(writer, instance.assetDefinition)
            } catch (ex: Exception) {
                throw wrapException(ex)
            }
    }
}