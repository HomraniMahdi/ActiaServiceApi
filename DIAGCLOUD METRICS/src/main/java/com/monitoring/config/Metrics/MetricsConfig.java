package com.monitoring.config.Metrics;

import io.micrometer.core.instrument.MeterRegistry;
import io.micrometer.core.instrument.Counter;
import io.micrometer.prometheus.PrometheusConfig;
import io.micrometer.prometheus.PrometheusMeterRegistry;
import org.springframework.boot.actuate.autoconfigure.metrics.MeterRegistryCustomizer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class MetricsConfig {

    @Bean
    public MeterRegistryCustomizer<MeterRegistry> customizer() {
        return registry -> registry.config().commonTags("application", "Monitoring-App");
    }
    @Bean
    public Counter httpRequestsTotal(MeterRegistry registry) {
        return Counter.builder("http_requests_total")
                .description("The total number of HTTP requests")
                .tag("Methode", "GET")
                .tag("handler", "app:8081/users")
                .register(registry);
    }
    @Bean
    public MeterRegistryCustomizer<MeterRegistry> metricsCommonTags() {
        return registry -> registry.config().commonTags("application", "Monitoring-App");
    }

    @Bean
    public Counter httpFailuresCounter(MeterRegistry registry) {
        return Counter.builder("http_failures_total")
                .description("Total number of HTTP failures.")
                .tag("status", "failure")
                .tag("handler", "app:8081/users")
                .register(registry);
    }

    @Bean
    public MeterRegistry meterRegistry() {
        return new PrometheusMeterRegistry(PrometheusConfig.DEFAULT);
    }

    /*@Bean
    public Counter filesProcessed(MeterRegistry registry) {
        return registry.counter("process_files_open_files",
                "application", "my-app",
                "Api", "ApiFailure",
                "instance", "localhost:8081");
    }*/
}
