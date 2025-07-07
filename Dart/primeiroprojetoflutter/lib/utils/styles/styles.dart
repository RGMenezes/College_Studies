import 'package:flutter/material.dart';

class Styles {
  static final _colors = {
    'main': HexColor.fromHex('#1c77c3'),
    'white': HexColor.fromHex('#ffffff'),
    'whiteBackground': HexColor.fromHex('#FBFEF9'),
    'black': HexColor.fromHex('#000000'),
    'blackBackground': HexColor.fromHex('#191923')
  };

  static colors(String colorName) {
    return _colors[colorName] ?? Colors.transparent;
  }
}

extension HexColor on Color {
  static Color fromHex(String hexColor) {
    final buffer = StringBuffer();
    if (hexColor.length == 6 || hexColor.length == 7) {
      buffer.write('ff');
      buffer.write(hexColor.replaceFirst('#', ''));
    } else if (hexColor.length == 8) {
      buffer.write(hexColor.replaceFirst('#', ''));
    } else {
      throw Exception('Invalid color format');
    }
    return Color(int.parse(buffer.toString(), radix: 16));
  }
}