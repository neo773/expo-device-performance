package expo.modules.deviceperformance

import android.app.Application
import android.os.Build
import android.os.Bundle
import androidx.core.performance.DevicePerformance
import android.content.Context
import expo.modules.kotlin.modules.Module
import expo.modules.kotlin.modules.ModuleDefinition

class DevicePerformanceModule : Module() {
    override fun definition() = ModuleDefinition {
        Name("DevicePerformance")

        Function("getDevicePerformanceClass") {
            val devicePerformance = DevicePerformance.create(requireNotNull(appContext.reactContext))
            val performanceClass = when {
                 devicePerformance.mediaPerformanceClass >= Build.VERSION_CODES.S -> {
                     "HIGH_END"
                 }
                 devicePerformance.mediaPerformanceClass == Build.VERSION_CODES.R -> {
                     "MED_END"
                 }
                 else -> {
                     "LOW_END"
                }
            }
            return@Function performanceClass
        }

    }
}
