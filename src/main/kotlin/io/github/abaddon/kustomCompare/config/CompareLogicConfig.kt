package io.github.abaddon.kustomCompare.config

data class CompareLogicConfig private constructor(
    val membersToIgnore: List<String>
){
    constructor(): this(listOf())

    fun addMemberToIgnore(memberName: String): CompareLogicConfig =
        addMembersToIgnore(listOf(memberName))

    fun addMembersToIgnore(membersName: List<String>): CompareLogicConfig{
        return copy(membersToIgnore = this.membersToIgnore.plus(membersName))
    }

}
