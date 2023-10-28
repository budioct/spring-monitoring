package com.tutorial.monitoring;

import org.springframework.boot.actuate.health.AbstractHealthIndicator;
import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.Status;
import org.springframework.stereotype.Component;

@Component
public class MyHealthIndicator extends AbstractHealthIndicator {

    /**
     * Costom Health
     * untuk membuat idikator health sendiri
     *
     * ● Actuator mendeteksi kesehatan Health menggunakan bean dengan type HealthIndicator
     * ● Jika kita ingin membuat custom Health, kita bisa membuat bean dengan type HealthIndicator
     */

    @Override
    protected void doHealthCheck(Health.Builder builder) throws Exception {
        builder.status(Status.UP);
        builder.withDetail("app", "OK");
        builder.withDetail("error", "NO ERROR");

        /**
         * result:
         * endpoint: http://localhost:8080/actuator/health
         * status: "UP",
         * my: {
         *      status: "UP",
         *      details: {
         *              app: "OK",
         *              error: "NO ERROR"
         *      }
         * }
         *
         * jika down. terjadi masalah karena tidak bisa konek ke db, memory hardisk habis
         * status: "DWON",
         * my: {
         *      status: "UP",
         *      details: {
         *              app: "OK",
         *              error: "NO ERROR"
         *      }
         * }
         */

    }

}
