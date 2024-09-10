# How the range of float and double in JAVA is calculated?

In Java, the range of `float` and `double` types is based on the IEEE 754 standard for floating-point arithmetic. The range is determined by the way these data types are stored in memory, using a specific number of bits to represent the sign, exponent, and mantissa (fraction).

### `float` in Java:
- Size: 32 bits (4 bytes)
- Format: 1 bit for sign, 8 bits for exponent, 23 bits for mantissa.

#### Range Calculation:
- The exponent range is from `-126` to `127`.
- The mantissa is a fractional value between 1 and 2 (in normalized form).
- The general form for a float is:  
  \[
  (-1)^{\text{sign}} \times \text{mantissa} \times 2^{\text{exponent}}
  \]
- Minimum positive value:  
  \( \approx 1.4 \times 10^{-45} \) (smallest non-zero positive number)
- Maximum positive value:  
  \( \approx 3.4 \times 10^{38} \)

### `double` in Java:
- Size: 64 bits (8 bytes)
- Format: 1 bit for sign, 11 bits for exponent, 52 bits for mantissa.

#### Range Calculation:
- The exponent range is from `-1022` to `1023`.
- The mantissa is a fractional value between 1 and 2 (in normalized form).
- The general form for a double is:  
  \[
  (-1)^{\text{sign}} \times \text{mantissa} \times 2^{\text{exponent}}
  \]
- Minimum positive value:  
  \( \approx 4.9 \times 10^{-324} \)
- Maximum positive value:  
  \( \approx 1.8 \times 10^{308} \)

### Summary of Range:
- **float**: \( 1.4 \times 10^{-45} \) to \( 3.4 \times 10^{38} \)
- **double**: \( 4.9 \times 10^{-324} \) to \( 1.8 \times 10^{308} \)

These ranges come from the structure of the floating-point number representation and the limits of how much data can be stored in the allocated bits for exponent and mantissa.
