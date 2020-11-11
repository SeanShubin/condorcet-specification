package com.seanshubin.condorcet.specification.domian

import java.time.Instant

data class ElectionSettings(
    val created: Instant,
    val name: String,
    val secretBallot: Boolean,
    val voterList: List<String>?,
    val candidateList: List<String>,
    val canChangeCandidatesAfterVote: Boolean,
    val doneConfiguring: Boolean,
    val startTime: Instant?,
    val endTime: Instant?,
    val started: Boolean,
    val ended: Boolean,
    val votesDeletableByCreator: Boolean,
    val isTemplate: Boolean)