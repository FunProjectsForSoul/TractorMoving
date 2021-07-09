<!--suppress HtmlDeprecatedAttribute -->
<div align="center">
    <h1>
        <a href="https://funprojectsforsoul.github.io/TractorMoving/">TractorMoving</a>
    </h1>
</div>

<div align="center">
    <a href="https://github.com/FunProjectsForSoul/TractorMoving/blob/master/docs/translations/README_RU.md">
        <img alt="russian-version" src="https://raw.githubusercontent.com/FunProjectsForSoul/TractorMoving/master/assets/languages/russian.png"/>
    </a>
</div>

<div align="center">
    <img src="https://img.shields.io/github/last-commit/FunProjectsForSoul/TractorMoving" height="25" alt="last-commit" />
    <img src="https://img.shields.io/github/v/release/FunProjectsForSoul/TractorMoving" height="25" alt="last-release" />
    <img src="https://tokei.rs/b1/github/FunProjectsForSoul/TractorMoving?category=code" height="25" alt="code-lines" />
    <img src="https://sonarcloud.io/api/project_badges/measure?project=FunProjectsForSoul_TractorMoving&metric=bugs" height="25" alt="sonar-cloud-bugs" />
    <img src="https://github.com/FunProjectsForSoul/TractorMoving/actions/workflows/check-style.yml/badge.svg" height="25" alt="checking-style" />
    <img src="https://github.com/FunProjectsForSoul/TractorMoving/actions/workflows/sonar.yml/badge.svg" height="25" alt="checking-sonar" />
    <img src="https://github.com/FunProjectsForSoul/TractorMoving/actions/workflows/build.yml/badge.svg" height="25" alt="build" />
</div>

### 📖 Description
___

There is a square field of **n × n** cells. In the center of this field there is a square mountain of **m × m** cells, 
and in the lower left corner there is a square tractor of **k × k** cells, which can move along the field.

### ⛓ Conditions
___

1. Sizes: fields — n, mountains — m and tractor — k, are entered from the keyboard;
2. The tractor moves an arbitrary number of cells up, down, left or right;
   _If it is not possible to move the tractor (for example, if the path abuts against a hill), then leave the tractor 
   in place. The field is considered to be closed in a ring, that is, when the tractor leaves the left border of the 
   field, it appears on the right, and so on_;
3. Display the current coordinates of the lower left corner of the tractor.

### ❗ Requirements
___

* **JDK**: 16 and higher;

### 📋 Instructions for starting the project
___

*All commands are executed in the console.*
1. Create a folder: `mkdir GitProjects`;
2. Go to the folder: `cd GitProjects`;
3. Cloning a repository: `git clone https://github.com/FunProjectsForSoul/TractorMoving.git`;
4. Go to the folder: `cd TractorMoving`;
5. Build project: `mvn clean install`;
6. After completing 5 points — a folder with the name **“target”** will be created. We go into it: `go target`;
7. Inside there will be a JAR file named **“tractor-1.0.0.jar”**.
   We execute the command: `java -jar tractor-1.0.0.jar`;
8. Console application will start **(see: Console interface)**.

```java
public class TractorApplication {
  
   public static void main(String[] args) {
      run();
   }
   
   // ... other methods
}
```

### 💻 Console interface
___
<div align="center">
   <img style="border: solid #465241;" src="https://raw.githubusercontent.com/FunProjectsForSoul/TractorMoving/master/assets/tractor-moving.gif" alt="gui-interface" />
</div>

### 🎫 License
___

**[Creative Commons Legal Code](https://github.com/Bangerok/TractorMoving/blob/master/LICENSE)**

_Copyright ©2021, Vladislav [[Bangerok]](https://github.com/Bangerok) Kuznetsov_