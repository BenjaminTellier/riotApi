package com.api.riot.entities;

import jakarta.persistence.Entity;
import lombok.*;

@AllArgsConstructor
@Data
@Builder
public class ApiConfig {

    public final int DEFAULT_ASYNC_REQUEST_TIMEOUT = 10000;
    public final boolean DEFAULT_DEBUG_TO_FILE = false;
    public final int DEFAULT_MAX_ASYNC_THREADS = 0;
    public final int DEFAULT_REQUEST_TIMEOUT = 0;

    private int asyncRequestTimeout = DEFAULT_ASYNC_REQUEST_TIMEOUT;
    private boolean debugToFile = DEFAULT_DEBUG_TO_FILE;
    private int maxAsyncThreads = DEFAULT_MAX_ASYNC_THREADS;
    private int requestTimeout = DEFAULT_REQUEST_TIMEOUT;

    private String key = null;
    private RegionalRouting regionalRouting;
}
