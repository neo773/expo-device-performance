# DevicePerformanceModule

This module is an Expo module that provides you with the performance class of the device running your application. It uses the Android's `DevicePerformance` class to determine whether the device is high-end, medium-end, or low-end based on its media performance class.

## Installation

To install the module in your project, you can use the following command:

```bash
npm install expo-device-performance
```

## Usage

First, import the module in your file:

```javascript
import DevicePerformanceModule from 'expo-device-performance';
```

Then, you can use the `getDevicePerformanceClass` function to get the performance class of the device:

```javascript
const performanceClass = DevicePerformanceModule.getDevicePerformanceClass();
console.log(performanceClass); // "HIGH_END", "MED_END", or "LOW_END"
```

## API

### `getDevicePerformanceClass()`

This function returns the performance class of the device.

- Returns: A promise that resolves to a string that indicates the performance class of the device. It can be one of the following values:
  - `"HIGH_END"`: The device is considered high-end.
  - `"MED_END"`: The device is considered medium-end.
  - `"LOW_END"`: The device is considered low-end.

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.
