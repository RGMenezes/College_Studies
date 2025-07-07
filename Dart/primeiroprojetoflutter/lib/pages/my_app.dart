import 'package:flutter/material.dart';
import 'package:primeiroprojetoflutter/utils/styles/styles.dart';

class MyApp extends StatelessWidget{
  const MyApp({super.key});

  @override
  Widget build(BuildContext context){
    return Container(
      decoration: BoxDecoration(
        color: Styles.colors('blackBackground')
      ),
      child: Center(
        child: Text(
          'Olá mundo!',
          textDirection: TextDirection.ltr,
          style: TextStyle(
            fontSize: 16,
            color: Styles.colors('main'),
          )
        )
      )
    );
  }
}