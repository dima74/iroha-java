//
// Auto-generated file. DO NOT EDIT!
//
package jp.co.soramitsu.iroha2.generated.datamodel.query.role

import jp.co.soramitsu.iroha2.codec.ScaleCodecReader
import jp.co.soramitsu.iroha2.codec.ScaleCodecWriter
import jp.co.soramitsu.iroha2.codec.ScaleReader
import jp.co.soramitsu.iroha2.codec.ScaleWriter
import jp.co.soramitsu.iroha2.generated.datamodel.account.Id
import jp.co.soramitsu.iroha2.generated.datamodel.expression.EvaluatesTo
import jp.co.soramitsu.iroha2.wrapException

/**
 * FindRolesByAccountId
 *
 * Generated from 'iroha_data_model::query::role::FindRolesByAccountId' regular structure
 */
public data class FindRolesByAccountId(
    public val id: EvaluatesTo<Id>
) {
    public companion object : ScaleReader<FindRolesByAccountId>, ScaleWriter<FindRolesByAccountId> {
        public override fun read(reader: ScaleCodecReader): FindRolesByAccountId = try {
            FindRolesByAccountId(
                EvaluatesTo.read(reader) as EvaluatesTo<Id>,
            )
        } catch (ex: Exception) {
            throw wrapException(ex)
        }

        public override fun write(writer: ScaleCodecWriter, instance: FindRolesByAccountId) = try {
            EvaluatesTo.write(writer, instance.id)
        } catch (ex: Exception) {
            throw wrapException(ex)
        }
    }
}