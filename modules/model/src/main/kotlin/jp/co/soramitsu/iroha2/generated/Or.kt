//
// Auto-generated file. DO NOT EDIT!
//
package jp.co.soramitsu.iroha2.generated

import jp.co.soramitsu.iroha2.codec.ScaleCodecReader
import jp.co.soramitsu.iroha2.codec.ScaleCodecWriter
import jp.co.soramitsu.iroha2.codec.ScaleReader
import jp.co.soramitsu.iroha2.codec.ScaleWriter
import jp.co.soramitsu.iroha2.wrapException
import kotlin.Boolean
import kotlin.Unit

/**
 * Or
 *
 * Generated from 'Or' regular structure
 */
public data class Or(
    public val left: EvaluatesTo<Boolean>,
    public val right: EvaluatesTo<Boolean>,
) {
    public companion object : ScaleReader<Or>, ScaleWriter<Or> {
        override fun read(reader: ScaleCodecReader): Or = try {
            Or(
                EvaluatesTo.read(reader) as EvaluatesTo<Boolean>,
                EvaluatesTo.read(reader) as EvaluatesTo<Boolean>,
            )
        } catch (ex: Exception) {
            throw wrapException(ex)
        }

        override fun write(writer: ScaleCodecWriter, instance: Or): Unit = try {
            EvaluatesTo.write(writer, instance.left)
            EvaluatesTo.write(writer, instance.right)
        } catch (ex: Exception) {
            throw wrapException(ex)
        }
    }
}
