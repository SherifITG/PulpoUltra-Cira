package com.itgates.ultra.pulpo.cira.enumerations

enum class CachingDataTackStatus {
    DATA_FETCHED_FROM_SERVER_SUCCESSFULLY, DATA_FETCHED_FROM_SERVER_WITH_ERROR,
    CACHE_DATA_TRUNCATED_SUCCESSFULLY, CACHE_DATA_TRUNCATED_WITH_ERROR,
    DATA_GET_CACHED_SUCCESSFULLY, DATA_GET_CACHED_WITH_ERROR, DATA_TRACK_GET_FIRED
}