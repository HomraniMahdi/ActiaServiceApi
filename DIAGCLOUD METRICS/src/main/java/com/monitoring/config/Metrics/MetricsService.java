package com.monitoring.config.Metrics;

import io.micrometer.core.instrument.MeterRegistry;
import io.micrometer.core.instrument.Counter;
import org.springframework.stereotype.Service;

@Service
public class MetricsService {
    private final MeterRegistry meterRegistry;
    private final Counter processFilesMaxCounter;

    public MetricsService(MeterRegistry meterRegistry) {
        this.meterRegistry = meterRegistry;
        this.processFilesMaxCounter = Counter.builder("process_files_max")
                .tags("application", "Monitoring-App", "instance", "app:8081")
                .description("Maximum number of files processed")
                .register(meterRegistry);
    }

    public void processFiles() {
        // Your logic to process files

        // Increment the counter
        processFilesMaxCounter.increment();
    }
}
