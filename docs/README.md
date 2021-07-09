<!--suppress HtmlDeprecatedAttribute -->
<div align="center">
    <h1>
        <a href="https://funprojectsforsoul.github.io/TractorMoving/">Управление трактором</a>
    </h1>
</div>

<div align="center">
    <a href="https://github.com/HogwartsSchoolOfMagic/TractorMoving/blob/master/docs/translations/README_EN.md">
        <img alt="english-version" src="https://raw.githubusercontent.com/HogwartsSchoolOfMagic/TractorMoving/master/docs/assets/languages/english.png"/>
    </a>
</div>

<div align="center">
    <img src="https://img.shields.io/github/last-commit/HogwartsSchoolOfMagic/TractorMoving" height="25" alt="last-commit" />
    <a href="https://wakatime.com/@SmithyVL"><img src="https://wakatime.com/badge/github/HogwartsSchoolOfMagic/TractorMoving.svg" height="25" alt="time-with-code" /></a>
    <a href="https://sonarcloud.io/code?id=HogwartsSchoolOfMagic_TractorMoving"><img src="https://sonarcloud.io/api/project_badges/measure?project=HogwartsSchoolOfMagic_TractorMoving&metric=ncloc" height="25" alt="sonar-code-lines" /></a>
    <a href="https://sonarcloud.io/summary/new_code?id=HogwartsSchoolOfMagic_TractorMoving"><img src="https://sonarcloud.io/api/project_badges/measure?project=HogwartsSchoolOfMagic_TractorMoving&metric=alert_status" height="25" alt="sonar-quality-gate-status" /></a>
    <a href="https://github.com/HogwartsSchoolOfMagic/TractorMoving/actions/workflows/ci.yml"><img src="https://github.com/HogwartsSchoolOfMagic/TractorMoving/actions/workflows/ci.yml/badge.svg" height="25" alt="ci" /></a>
</div>

### 📖 Описание
___

Есть квадратное поле размером **n × n** ячеек. В центре этого поля находится квадратная гора размером **м × м** клеток,
а в нижнем левом углу — квадратный трактор **k × k** ячеек, который может передвигаться по полю.

### ⛓ Условия
___

1. Размеры: поле — n, гора — m и трактор — k, вводятся с клавиатуры;
2. Трактор перемещается на произвольное количество ячеек вверх, вниз, влево или вправо;
_Если нет возможности передвинуть трактор (например, если путь упирается в гору), то он не начнет движение и останется 
на месте. Поле считается замкнутым, то есть когда трактор выезжает за левую границу поля — появляется справа и т. д_;
3. Отображение текущих координат левого нижнего угла трактора.

### ❗ Требования
___

* **JDK**: 18 и выше;

### 📋 Инструкция по запуску
___

*Все команды выполняются в консоли.*
1. Создать папку: `mkdir GitProjects`;
2. Перейти в нее: `cd GitProjects`;
3. Клонировать код репозитория: `git clone https://github.com/HogwartsSchoolOfMagic/TractorMoving.git`;
4. Перейти в созданную папку: `cd TractorMoving`;
5. Собрать проект: `mvn clean install`;
6. После выполнения 5 пункта — будет создана папка с именем **“target”**. Переходим в нее: `go target`;
7. Внутри будет находиться файл **“tractor-1.0.0.jar”**.
Запускаем его командой: `java -jar tractor-1.0.0.jar`;
8. Запустится консольное приложение **(см. "Интерфейс приложения")**.

```java
public class TractorApplication {
  
   public static void main(String[] args) { // Используется для запуска приложения.
      run();
   }
   
   // ... остальные методы
}
```

### 💻 Интерфейс приложения
___
<div align="center">
   <img style="border: solid #465241;" src="https://raw.githubusercontent.com/HogwartsSchoolOfMagic/TractorMoving/master/docs/assets/tractor-moving.gif" alt="console-interface" />
</div>

### 🎫 Лицензия
___

**[Apache License Version 2.0](https://github.com/HogwartsSchoolOfMagic/TractorMoving/blob/master/LICENSE)**

_Copyright ©2022, Владислав [[SmithyVL]](https://github.com/SmithyVL) Кузнецов_