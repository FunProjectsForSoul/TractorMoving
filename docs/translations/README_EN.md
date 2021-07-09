<!--suppress HtmlDeprecatedAttribute -->
<div align="center">
    <h1>
        <a href="https://funprojectsforsoul.github.io/TractorMoving/">Tractor Moving</a>
    </h1>
</div>

<div align="center">
    <a href="https://github.com/HogwartsSchoolOfMagic/TractorMoving/blob/master/docs/README.md">
        <img alt="russian-version" src="https://raw.githubusercontent.com/HogwartsSchoolOfMagic/TractorMoving/master/docs/assets/languages/russian.png"/>
    </a>
</div>

<div align="center">
    <img src="https://img.shields.io/github/last-commit/HogwartsSchoolOfMagic/TractorMoving" height="25" alt="last-commit" />
    <a href="https://wakatime.com/@SmithyVL"><img src="https://wakatime.com/badge/github/HogwartsSchoolOfMagic/TractorMoving.svg" height="25" alt="time-with-code" /></a>
    <a href="https://sonarcloud.io/code?id=HogwartsSchoolOfMagic_TractorMoving"><img src="https://sonarcloud.io/api/project_badges/measure?project=HogwartsSchoolOfMagic_TractorMoving&metric=ncloc" height="25" alt="sonar-code-lines" /></a>
    <a href="https://sonarcloud.io/summary/new_code?id=HogwartsSchoolOfMagic_TractorMoving"><img src="https://sonarcloud.io/api/project_badges/measure?project=HogwartsSchoolOfMagic_TractorMoving&metric=alert_status" height="25" alt="sonar-quality-gate-status" /></a>
    <a href="https://github.com/HogwartsSchoolOfMagic/TractorMoving/actions/workflows/ci.yml"><img src="https://github.com/HogwartsSchoolOfMagic/TractorMoving/actions/workflows/ci.yml/badge.svg" height="25" alt="ci" /></a>
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

* **JDK**: 18 and higher;

### 📋 Instructions for starting
___

*All commands are executed in the console.*
1. Create a folder: `mkdir GitProjects`;
2. Go to the folder: `cd GitProjects`;
3. Cloning a repository: `git clone https://github.com/HogwartsSchoolOfMagic/TractorMoving.git`;
4. Go to the folder: `cd TractorMoving`;
5. Build project: `mvn clean install`;
6. After completing 5 points — a folder with the name **“target”** will be created. We go into it: `go target`;
7. Inside there will be a JAR file named **“tractor-1.0.0.jar”**.
   We execute the command: `java -jar tractor-1.0.0.jar`;
8. Console application will start **(see: Application interface)**.

```java
public class TractorApplication {
  
   public static void main(String[] args) { // Used to launch the application.
      run();
   }
   
   // ... other methods
}
```

### 💻 Application interface
___
<div align="center">
   <img style="border: solid #465241;" src="https://raw.githubusercontent.com/HogwartsSchoolOfMagic/TractorMoving/master/docs/assets/tractor-moving.gif" alt="console-interface" />
</div>

### 🎫 License
___

**[Apache License Version 2.0](https://github.com/HogwartsSchoolOfMagic/TractorMoving/blob/master/LICENSE)**

_Copyright ©2022, Vladislav [[SmithyVL]](https://github.com/SmithyVL) Kuznetsov_