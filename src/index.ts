import { requireNativeModule } from 'expo-modules-core'

export type PerformanceClass = 'HIGH_END' | 'MED_END' | 'LOW_END'

export interface DevicePerformanceModule {
  getDevicePerformanceClass(): PerformanceClass
}
// It loads the native module object from the JSI or falls back to
// the bridge module (from NativeModulesProxy) if the remote debugger is on.
export default requireNativeModule<DevicePerformanceModule>('DevicePerformance')
